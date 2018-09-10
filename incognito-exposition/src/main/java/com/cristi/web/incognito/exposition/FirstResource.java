package com.cristi.web.incognito.exposition;

import org.springframework.web.bind.annotation.*;

import static java.lang.String.format;

@RestController("/api")
public class FirstResource {

    @PostMapping
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String getDto(@RequestBody Dto dto) {
        System.out.printf(format("Got the dto: value: %s , object: %s", dto.value, dto.object));
        return dto.value;
    }
}
