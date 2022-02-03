package br.com.elizabethcarrilho.costumer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Costumer {

    @Transient
    public static final String SEQUENCE_NAME = "costumer_sequence";

    @Id
    protected Long id;
    protected String name;
    protected String cnpj;
    protected String email;
    protected String phone;
    protected Address address;
    @Transient
    protected Error error;
}
