package com.david.poiservice.exceptionhandler;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestControllerAdvice
public class ExceptionHandlerGeneral extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(
            HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        String messageUser = messageSource.getMessage("message.invalid", null, LocaleContextHolder.getLocale());
        String messageDeveloper = ex.getCause() != null ? ex.getCause().toString() : ex.toString();

        List<ErrorMessage> messagensErro = Arrays.asList(new ErrorMessage(messageUser, messageDeveloper));
        Error erro = this.createDetailError(messageUser, HttpStatus.BAD_REQUEST, messagensErro);

        return handleExceptionInternal(ex, erro, headers, HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        String messageUser = messageSource.getMessage("message.invalid", null, LocaleContextHolder.getLocale());
        String messageDeveloper = ex.getCause() != null ? ex.getCause().toString() : ex.toString();

        List<ErrorMessage> messagensErro = Arrays.asList(new ErrorMessage(messageUser, messageDeveloper));
        Error erro = this.createDetailError(messageUser, HttpStatus.BAD_REQUEST, messagensErro);

        return handleExceptionInternal(ex, erro, headers, HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({EmptyResultDataAccessException.class})
    public ResponseEntity<Object> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex,
                                                                       WebRequest request) {
        String messageUser = messageSource.getMessage("resource.not-found", null,
                LocaleContextHolder.getLocale());
        String messageDeveloper = ExceptionUtils.getRootCauseMessage(ex);

        List<ErrorMessage> messagensErro = Arrays.asList(new ErrorMessage(messageUser, messageDeveloper));

        Error error = this.createDetailError(messageUser, HttpStatus.NOT_FOUND, messagensErro);

        return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<Object> handleEmptyResultDataAccessException(ResourceNotFoundException ex,
                                                                       WebRequest request) {
        String messageUser = messageSource.getMessage("resource.not-found", null,
                LocaleContextHolder.getLocale());
        String messageDeveloper = ExceptionUtils.getRootCauseMessage(ex);

        List<ErrorMessage> messagensErro = Arrays.asList(new ErrorMessage(messageUser, messageDeveloper));

        Error error = this.createDetailError(messageUser, HttpStatus.NOT_FOUND, messagensErro);

        return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({DataIntegrityViolationException.class})
    public ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException ex, WebRequest request) {
        String messageUser = messageSource.getMessage("resource.operation-not-allowed", null, LocaleContextHolder.getLocale());
        String messageDeveloper = ExceptionUtils.getRootCauseMessage(ex);

        List<ErrorMessage> messagensErro = Arrays.asList(new ErrorMessage(messageUser, messageDeveloper));

        Error error = this.createDetailError(messageUser, HttpStatus.BAD_REQUEST, messagensErro);

        return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleUncaught(Exception ex, WebRequest request) {
        String messageUser = messageSource.getMessage("message.general", null, LocaleContextHolder.getLocale());
        String messageDeveloper = ExceptionUtils.getRootCauseMessage(ex);

        List<ErrorMessage> messagensErro = Arrays.asList(new ErrorMessage(messageUser, messageDeveloper));

        Error error = this.createDetailError(messageUser, HttpStatus.BAD_REQUEST, messagensErro);

        return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
    private List<ErrorMessage> createListError(BindingResult bindingResult) {
        List<ErrorMessage> erros = new ArrayList<>();

        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            String messageUser = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
            String messageDeveloper = fieldError.toString();
            erros.add(new ErrorMessage(messageUser, messageDeveloper));
        }

        return erros;
    }

    private Error createDetailError(String title, HttpStatus status, List<ErrorMessage> errorMessages) {
        return new Error(title, status.value(), new Date().getTime(), errorMessages);
    }
}