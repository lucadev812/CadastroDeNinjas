package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // listar todos os meu ninjas
    public List<NinjaModel> listarNinjas(){
    return ninjaRepository.findAll();

    }
    // listar ninja por id
    public NinjaModel listarNinjasPorID(Long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    // criar ninja
    public NinjasDTO criarNinja(NinjasDTO ninjasDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjasDTO);
        NinjaModel savedNinja = ninjaRepository.save(ninja);
        return ninjaMapper.map(savedNinja);
    }


    // deletar ninja- tem que ser um metodo void
    public void deletarNinjaPorID(long id){
         ninjaRepository.deleteById(id);
    }
    // atualizar meu ninja
    public NinjaModel atualizarNinja(long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
        }
    }



