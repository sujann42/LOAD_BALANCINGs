package com.currency;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    @Value(("${server.port}"))
    private int port;

    @GetMapping("/")
    public String getExchangeRate(){
        return ("Current exchange rate from: "+port);
    }
}
