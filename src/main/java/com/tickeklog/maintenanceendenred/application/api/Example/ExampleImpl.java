package com.tickeklog.maintenanceendenred.application.api.Example;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleImpl
 */
@RestController
@RequestMapping("/teste")
@PermitAll
public class ExampleImpl implements IExample {

}