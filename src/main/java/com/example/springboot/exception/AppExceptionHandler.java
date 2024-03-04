/*
 * Copyright 2023 , All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential
 * @author  Mothusi Molorane
 * @since 1.0
 */

package com.example.springboot.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.NoSuchElementException;

@ControllerAdvice
public class AppExceptionHandler {

//    @ResponseBody
//    @ExceptionHandler(InputValidationException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public String inputValidationException(InputValidationException ex) {
//        return ex.getErrorMessage();
//    }

    @ResponseBody
    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String noSuchElementException(NoSuchElementException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentHandler() {}

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleFileUploadError(MaxUploadSizeExceededException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String dataError(DataIntegrityViolationException ex) {
        return ex.getMessage();
    }
}
