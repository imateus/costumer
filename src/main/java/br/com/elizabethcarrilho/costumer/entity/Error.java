package br.com.elizabethcarrilho.costumer.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Error {
    private Integer id;
    private String descricao;
    private String detalhe;
}
