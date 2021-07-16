package com.sample.dto;

import lombok.Data;

@Data
public class Error {
    private String code = "OK";
    private String message;
}