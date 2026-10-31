package lastma.services;

import lastma.data.repositories.DriverRepository;
import lastma.dtos.requests.RegisterDriverRequest;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DriverServiceImplTest {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DriverService driverService;


    @Test
    public void testThatWhenIRegisterDriver_countIsOne() {
        driverRepository.deleteAll();
        assertEquals(driverRepository.count(),0);
        RegisterDriverRequest request = new RegisterDriverRequest();
        request.setFullName("John Thieve");
        request.setEmail("johnth@gmail.com");
        request.setPassword("12345");
        request.setPhoneNumber("071234567");
        driverService.registerDriver(request);
        assertEquals(driverRepository.count(), 1);
    }
}