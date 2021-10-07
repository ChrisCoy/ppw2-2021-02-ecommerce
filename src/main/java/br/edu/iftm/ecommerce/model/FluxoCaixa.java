package br.edu.iftm.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class FluxoCaixa {
    
    private int id;
    private String descricao;
    private String tipoMovimento;
    private float valor;
    private String dataMovimento;
}
