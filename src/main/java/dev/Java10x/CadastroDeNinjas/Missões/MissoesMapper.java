package dev.Java10x.CadastroDeNinjas.Missões;


import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {

    public MissoesDTO toDTO(MissoesModel model) {
        if (model == null) {
            return null;
        }
        MissoesDTO dto = new MissoesDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDificuldade(model.getDificuldade());
        return dto;
    }

    public MissoesModel toModel(MissoesDTO dto) {
        if (dto == null) {
            return null;
        }
        MissoesModel model = new MissoesModel();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDificuldade(dto.getDificuldade());
        return model;
    }
}


