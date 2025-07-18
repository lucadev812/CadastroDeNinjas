package dev.Java10x.CadastroDeNinjas.Missões;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // listar todas as missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // CRIAR MISSAO
    public MissoesModel criarMissao(MissoesModel missoesModel){
        return missoesRepository.save(missoesModel);

    }
    // deletar missao
    public void deletarMissaoPorID(long id){
        missoesRepository.deleteById(id);
    }
}
