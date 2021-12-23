package br.com.elizabethcarrilho.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Costumer {
    @Id
    protected Long id;
    @Column
    protected String name;
    @Column
    protected String cnpj;
    @Column
    protected String email;
    @Column
    protected String phone;
    @OneToOne
    protected Address address;
}
