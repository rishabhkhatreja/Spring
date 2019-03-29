package com.ttn.spring.rest.springrest.controller;

import com.ttn.spring.rest.springrest.versioning.Name;
import com.ttn.spring.rest.springrest.versioning.PersonV1;
import com.ttn.spring.rest.springrest.versioning.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    //URI Versioning

    @GetMapping("/person/V1")
    PersonV1 getPersonV1() {
        return new PersonV1("Peter Parker");
    }

    @GetMapping("/person/V2")
    PersonV2 getPersonV2() {
        return new PersonV2(new Name("Peter","Parker"));
    }

    //Parameter Versioning
    // /person/param?version=1
    @GetMapping(value = "/person/param",params = "version=1")
    PersonV1 getPersonParam1() {
        return new PersonV1("Peter Parker");
    }

    @GetMapping(value = "/person/param",params = "version=2")
    PersonV2 getPersonParam2() {
        return new PersonV2(new Name("Peter","Parker"));
    }


    //Header Versioning
    //API-VERSION 1 header required with request
    @GetMapping(value = "/person/header",headers = "API-VERSION=1")
    PersonV1 getPersonHeader1() {
        return new PersonV1("Peter Parker");
    }

    @GetMapping(value = "/person/header",headers = "API-VERSION=2")
    PersonV2 getPersonHeader2() {
        return new PersonV2(new Name("Peter","Parker"));
    }


}
