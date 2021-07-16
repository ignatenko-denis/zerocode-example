package com.sample.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateRq {
    private Long id;
    private BigDecimal sum;
}