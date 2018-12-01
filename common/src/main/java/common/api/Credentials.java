package common.api;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Credentials {
    private String username;
    private String token;
}
