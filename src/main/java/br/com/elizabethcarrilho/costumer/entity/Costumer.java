package br.com.elizabethcarrilho.costumer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Costumer {
    @Id
    protected Long id;
    protected String name;
    protected String cnpj;
    protected String email;
    protected String phone;
    protected Address address;
}
