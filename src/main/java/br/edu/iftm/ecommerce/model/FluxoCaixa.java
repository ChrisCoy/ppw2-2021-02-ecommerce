package br.edu.iftm.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FluxoCaixa {
    @EqualsAndHashCode.Include
    private int id;
    private String descricao;
    private String tipoMovimento;
    private float valor;
    private String dataMovimento;
}
