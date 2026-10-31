package lastma.services;

import lastma.dtos.requests.RegisterDriverRequest;
import lastma.dtos.responses.RegisterDriverResponse;
import org.springframework.stereotype.Service;

@Service
public interface DriverService {

    RegisterDriverResponse registerDriver(RegisterDriverRequest request);

}

