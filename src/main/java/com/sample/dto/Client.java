package com.sample.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Client {
    private Long id;
    private String name;
    private LocalDate birthday;
    private BigDecimal sum;
    private boolean active;
}