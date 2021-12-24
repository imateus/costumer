package br.com.elizabethcarrilho.costumer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Address {
    @Id
    private Long id;
    protected int number;
    protected String street;
    protected String city;
    protected String province;
    protected String zip;
    protected String country;
}
