package br.edu.iftm.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Imagem implements Serializable {
    @EqualsAndHashCode.Include
    private int id;
    private String nome;
    private String codigo;
    private Date data_criacao;
}
