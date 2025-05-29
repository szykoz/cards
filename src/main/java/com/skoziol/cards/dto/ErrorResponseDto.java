package com.skoziol.cards.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(
       String apiPath,

       HttpStatus errorCode,

       String errorMessage,

       LocalDateTime errorTime
) {
}
