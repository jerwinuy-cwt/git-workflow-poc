package com.ph.juy.template.web.controller;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sample")
public class SampleController
{

    @GetMapping(produces = { MediaType.TEXT_PLAIN_VALUE })
    public String get()
    {
        return UUID.randomUUID().toString();
    }

}
