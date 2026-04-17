package com.telecom.billing;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @GetMapping
    public String getBill() {
        return "Billing service working";
    }
}
