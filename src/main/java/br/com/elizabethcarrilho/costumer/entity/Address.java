package br.com.elizabethcarrilho.costumer.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Address {

    protected int number;
    protected String street;
    protected String city;
    protected String province;
    protected String state;
    protected String zip;
    protected String country;
}
