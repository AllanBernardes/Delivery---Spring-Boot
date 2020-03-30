package com.tickeklog.maintenanceendenred.api.controllersexample;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;

import com.tickeklog.maintenanceendenred.application.model.UserModel;
import com.tickeklog.maintenanceendenred.domain.entity.example.IUser;
import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * ExampleImpl
 */
@RestController
@PermitAll
@Api(tags = "Controller User")
public class UsercontrollerImpl implements IUserController {

  @Autowired
  private IUser userService;

  Logger logger = LogManager.getLogger(UsercontrollerImpl.class);
  
  @Override
  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> addUser(@Valid @RequestBody final UserModel usermodel) {
    logger.info("Create User - Controller");
    final UserImpl obj = userService.add(usermodel.fromModel(usermodel));
    return ResponseEntity.ok().body(obj);
  }
}