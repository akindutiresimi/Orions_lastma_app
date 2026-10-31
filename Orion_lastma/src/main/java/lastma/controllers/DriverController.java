package lastma.controllers;

import lastma.dtos.requests.RegisterDriverRequest;
import lastma.dtos.responses.ApiResponse;
import lastma.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController{
    @Autowired
    private DriverService driverService;

    @PostMapping("")
    public ResponseEntity<?> registerDriver(RegisterDriverRequest request) {
        try{
            return new ResponseEntity<>(new ApiResponse(true, driverService.registerDriver(request)), HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(new ApiResponse(false, e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }
}
