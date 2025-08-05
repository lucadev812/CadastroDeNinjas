package dev.Java10x.CadastroDeNinjas.Ninjas;

import dev.Java10x.CadastroDeNinjas.Missões.MissoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
   @Autowired
    private MissoesMapper missoesMapper;

    // DTO → Model
    public NinjaModel map(NinjasDTO ninjasDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjasDTO.getId());
        ninjaModel.setNome(ninjasDTO.getNome());
        ninjaModel.setEmail(ninjasDTO.getEmail());
        ninjaModel.setIdade(ninjasDTO.getIdade());
        ninjaModel.setRank(ninjasDTO.getRank());
        ninjaModel.setImgUrl(ninjasDTO.getImgUrl());
        ninjaModel.setFrases(ninjasDTO.getFrases());
        ninjaModel.setMissoes(missoesMapper.toModel(ninjasDTO.getMissoesDTO())); //
        return ninjaModel;
    }

    // Model → DTO
    public NinjasDTO map(NinjaModel ninjaModel){
        NinjasDTO ninjasDTO = new NinjasDTO();
        ninjasDTO.setId(ninjaModel.getId());
        ninjasDTO.setNome(ninjaModel.getNome());
        ninjasDTO.setEmail(ninjaModel.getEmail());
        ninjasDTO.setIdade(ninjaModel.getIdade());
        ninjasDTO.setRank(ninjaModel.getRank());
        ninjasDTO.setImgUrl(ninjaModel.getImgUrl());
        ninjasDTO.setFrases(ninjaModel.getFrases());
        ninjasDTO.setMissoesDTO(missoesMapper.toDTO(ninjaModel.getMissoes()));
        return ninjasDTO;
    }
}


