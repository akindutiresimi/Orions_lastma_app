package lastma.dtos.requests;

import lombok.Data;

@Data
public class RegisterDriverRequest {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
}
