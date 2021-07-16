package com.sample.controller;

import com.sample.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@Slf4j
public class ClientController {
    @RequestMapping(value = "/client")
    public ClientRs client(@RequestBody ClientRq rq) {
        log.info("get client by id: '{}'", rq.getId());

        ClientRs rs = new ClientRs();

        if (rq.getId() == null) {
            rs.getError().setCode("NOT_FOUND");
            rs.getError().setMessage("Client not found");

            return rs;
        }

        Client client = null;
        if (rq.getId() == 1) {
            // create Client for testing
            client = buildClient1();
        } else {
            rs.getError().setCode("NOT_FOUND");
            rs.getError().setMessage("Client not found");
        }

        rs.setClient(client);

        return rs;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public UpdateRs update(@RequestBody UpdateRq rq) {
        log.info("update client by id: '{}'", rq.getId());

        UpdateRs rs = new UpdateRs();

        if (rq.getId() == null) {
            rs.getError().setCode("NOT_FOUND");
            rs.getError().setMessage("Client not found");

            return rs;
        }
        if (rq.getSum() == null) {
            rs.getError().setCode("INCORRECT_SUM");
            rs.getError().setMessage("Incorrect sum");

            return rs;
        }

        // some update...

        return rs;
    }

    private Client buildClient1() {
        // create Client for testing
        Client client = new Client();

        client.setId(1L);
        client.setName("Boris");
        client.setBirthday(LocalDate.of(2000, 7, 31));
        client.setSum(new BigDecimal("12.34"));
        client.setActive(true);

        return client;
    }
}