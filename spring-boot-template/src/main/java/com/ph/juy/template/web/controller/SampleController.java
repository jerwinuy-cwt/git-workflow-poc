package com.ph.juy.template.web.controller;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sample")
public class SampleController
{

    @GetMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    public @ResponseBody Sample get()
    {
        final Sample sample = new Sample();
        sample.setId(UUID.randomUUID().toString());
        return sample;
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    public @ResponseBody String post(@RequestBody Sample sample)
    {
        return UUID.randomUUID().toString();
    }

}

class Sample
{

    private String id;
    private String message;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

}
