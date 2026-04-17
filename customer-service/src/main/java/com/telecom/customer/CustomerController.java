package com.telecom.customer;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<String> getCustomers() {
        return Arrays.asList("Natraj", "Rahul", "Amit");
    }
}
