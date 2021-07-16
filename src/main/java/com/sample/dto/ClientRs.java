package com.sample.dto;

import lombok.Data;

@Data
public class ClientRs {
    private Client client;
    private Error error = new Error();
}