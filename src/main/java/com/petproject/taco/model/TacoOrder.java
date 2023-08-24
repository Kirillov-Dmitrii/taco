package com.petproject.taco.model;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    @NotBlank(message = "no name")
    private String deliveryName;

    @NotBlank(message = "no street")
    private String deliveryStreet;

    @NotBlank(message = "no city")
    private String deliveryCity;

    @NotBlank(message = "no state")
    private String deliveryState;

    @NotBlank(message = "no zip")
    private String deliveryZip;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message = "must be formed MM/YY")
    private String ccExpiration;

    @CreditCardNumber(message = "wrong number")
    private String ccNumber;

    @Digits(integer = 3, fraction = 0, message = "invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }


}
