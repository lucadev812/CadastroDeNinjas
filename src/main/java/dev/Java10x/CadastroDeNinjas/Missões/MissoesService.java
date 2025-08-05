package dev.Java10x.CadastroDeNinjas.Missões;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;
    private MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    // listar todas as missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // CRIAR MISSAO
    public MissoesDTO criarMissao(MissoesDTO missoesDTO) {
        MissoesModel missoesModel = missoesMapper.toModel(missoesDTO);
        MissoesModel saved = missoesRepository.save(missoesModel);
        return missoesMapper.toDTO(saved);}

    // deletar missao
    public void deletarMissaoPorID(long id){
        missoesRepository.deleteById(id);
    }
}
