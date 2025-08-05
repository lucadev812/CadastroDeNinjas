package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // listar todos os meu ninjas
    public List<NinjasDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
   }
    // listar ninja por id
    public NinjasDTO listarNinjasPorID(Long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.map(ninjaMapper::map).orElse(null);
    }

    // criar ninjas- utiliza DTO para tirar responsabilidade do model
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


    public NinjasDTO atualizarNinja(long id, NinjasDTO ninjasDTO){
       Optional<NinjaModel> NinjaExistente = ninjaRepository.findById(id);
       if(NinjaExistente.isPresent()){
           NinjaModel ninjaAtualizado= ninjaMapper.map(ninjasDTO);
           ninjaAtualizado.setId(id);
           NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
           return ninjaMapper.map(ninjaSalvo);
       }
            return null;
        }
    }



