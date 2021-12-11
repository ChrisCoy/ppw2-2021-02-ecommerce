package br.edu.iftm.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    private String nome;
    private String sobrenome;
    private String sexo;
    private String cpf;
    private String rg;
    
    @Column(name = "orgao_expedidor")
    private String orgaoExpedidor;
    private String email;
    private String senha;

    @Column(name = "data_nacimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNacimento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_desativacao")
    private Date dataDesativacao;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> endereco;
}
