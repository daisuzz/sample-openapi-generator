package com.daisuzz.sampleopenapigenerator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleHelloController {

    private final SampleHelloService sampleHelloService;

    @GetMapping
    public String hello() {
        return sampleHelloService.hello();
    }
}
