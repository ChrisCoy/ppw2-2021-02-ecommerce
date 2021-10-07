package br.edu.iftm.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    private int id;
    private String nome;
    private Categoria categoriaId;
}
