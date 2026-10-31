package lastma.utils;

import lastma.data.models.Driver;
import lastma.dtos.requests.RegisterDriverRequest;
import lastma.dtos.responses.RegisterDriverResponse;

public class DriverMappers {
    public static Driver map(RegisterDriverRequest driverRequest){
        Driver driver = new Driver();

        driver.setFullName(driverRequest.getFullName());
        driver.setEmail(driverRequest.getEmail());
        driver.setPassword(driverRequest.getPassword());
        driver.setPhoneNumber(driverRequest.getPhoneNumber());
        return driver;
    }

    public static RegisterDriverResponse mapRegistered(Driver driver) {
        RegisterDriverResponse response = new RegisterDriverResponse();
        response.setFullName(driver.getFullName());
        response.setId(driver.getId());
        return response;
    }
}
