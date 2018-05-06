package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Billing implements Serializable {
    private Card card;

}
