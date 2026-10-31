package lastma.services;

import lastma.data.models.Driver;
import lastma.data.repositories.DriverRepository;
import lastma.dtos.requests.RegisterDriverRequest;
import lastma.dtos.responses.RegisterDriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static lastma.utils.DriverMappers.map;
import static lastma.utils.DriverMappers.mapRegistered;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public RegisterDriverResponse registerDriver(RegisterDriverRequest request) {
        Driver newDriver = map(request);

        Driver driver = driverRepository.save(newDriver);

        return mapRegistered(driver);
    }
}
