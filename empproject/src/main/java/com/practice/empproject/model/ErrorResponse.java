package com.practice.empproject.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class ErrorResponse {
    @Schema(name = "message" , defaultValue = "Failed to execute and has an error" )
    private String errorMessage;

}
