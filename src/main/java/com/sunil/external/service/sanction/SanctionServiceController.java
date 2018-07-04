package com.sunil.external.service.sanction;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.*;
import io.swagger.annotations.Api;

@RestController
//@EnableAutoConfiguration
@Api(tags="Banker Services",produces = "application/json")
public class SanctionServiceController extends  SanctionServiceControllerBase{






}
