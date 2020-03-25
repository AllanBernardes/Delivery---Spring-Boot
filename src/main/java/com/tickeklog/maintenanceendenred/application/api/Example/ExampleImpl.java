package com.tickeklog.maintenanceendenred.application.api.Example;

import java.util.List;
import javax.annotation.security.PermitAll;
import com.tickeklog.maintenanceendenred.application.model.userModel;
import com.tickeklog.maintenanceendenred.core.services.example.IExampleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

/**
 * ExampleImpl
 */
@RestController
@PermitAll
@Api(tags = "REST - Resource de Usuarios")
public class ExampleImpl implements IExample {

    @Autowired
	private IExampleServices userService;

    @Override
    public ResponseEntity<List<userModel>> getById() {
        // TODO Auto-generated method stub
        return  ResponseEntity.ok(userService.GetUser());
    }

    

}