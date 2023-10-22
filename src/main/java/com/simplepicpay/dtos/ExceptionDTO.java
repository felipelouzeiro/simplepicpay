package com.simplepicpay.dtos;

import org.springframework.http.HttpStatus;

public record ExceptionDTO(String message, String statusCode) {
}
