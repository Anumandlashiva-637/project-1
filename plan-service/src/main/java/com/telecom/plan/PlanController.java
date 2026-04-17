package com.telecom.plan;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/plans")
public class PlanController {

    @GetMapping
    public List<String> getPlans() {
        return Arrays.asList("5G Plan", "1GB/day", "Unlimited Plan");
    }
}
