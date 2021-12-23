package br.com.elizabethcarrilho.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Address {
    @Id
    private Long id;
    @Column
    protected int number;
    @Column
    protected String street;
    @Column
    protected String city;
    @Column
    protected String province;
    @Column
    protected String zip;
    @Column
    protected String country;
}
