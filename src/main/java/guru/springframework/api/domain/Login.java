package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Login implements Serializable{
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
