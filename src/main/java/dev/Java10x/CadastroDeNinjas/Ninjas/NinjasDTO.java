package dev.Java10x.CadastroDeNinjas.Ninjas;

import dev.Java10x.CadastroDeNinjas.Missões.MissoesDTO;
import dev.Java10x.CadastroDeNinjas.Missões.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjasDTO {
    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private MissoesDTO missoesDTO; // ✅ Corrigido para DTO
    private String rank;
    private String frases;
}


