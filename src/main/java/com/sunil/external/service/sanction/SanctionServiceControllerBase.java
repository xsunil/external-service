package com.sunil.external.service.sanction;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/sanction")
public class SanctionServiceControllerBase {

    @RequestMapping(value="/version",  produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    public String getSanctionVersion() {
        return "0.5";
    }


}
