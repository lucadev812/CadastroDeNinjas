package dev.Java10x.CadastroDeNinjas.Ninjas;

import dev.Java10x.CadastroDeNinjas.Missões.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade do banco de dados

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(name ="img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @Column(name = "rank")
    private String rank;

    @Column (name ="frases")
    private String frases;

    //@ManyToOne =  um ninja tem uma  unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;



}
