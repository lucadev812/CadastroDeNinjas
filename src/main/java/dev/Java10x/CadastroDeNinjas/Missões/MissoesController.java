package dev.Java10x.CadastroDeNinjas.Missões;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // POST-mandar uma requisição para criar uma missao
@PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesModel){
    return missoesService.criarMissao(missoesModel);
}

// PUT-manda uma requisição para alterar as missoes
@PutMapping("/alterar")
    public String alterarMisaao(){
    return "missao alterada";
}

// DELETE-manda uma requisição para deletar missoes
@DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorID(@PathVariable long id){
        missoesService.deletarMissaoPorID(id);

}

//GET-manda uma requisição para listar as missoes
@GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
    return missoesService.listarMissoes();
}
    }
