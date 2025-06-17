package dev.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;

import dev.Java10x.CadastroDeNinjas.Missões.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade do banco de dados

@Entity
@Table(name = "tb_cadastro_de_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //@ManyToOne =  um ninja tem uma  unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;



}
