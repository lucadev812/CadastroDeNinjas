package dev.Java10x.CadastroDeNinjas.Missões;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesDTO {
    private Long id;
    private String nome;
    private String dificuldade;
}
