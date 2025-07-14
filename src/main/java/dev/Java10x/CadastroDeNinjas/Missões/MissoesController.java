package dev.Java10x.CadastroDeNinjas.Missões;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {
    // POST-mandar uma requisição para criar uma missao
@PostMapping("/criar")
    public String criarMissao(){
    return "missao criada com sucesso";
}
// PUT-manda uma requisição para alterar as missoes
@PutMapping("/alterar")
    public String alterarMisaao(){
    return "missao alterada";
}
// DELETE-manda uma requisição para deletar missoes
@DeleteMapping("/deletar")
    public String deletarMissao(){
return "missao deletada";
}
//GET-manda uma requisição para listar as missoes
@GetMapping("/listar")
    public String listarMissoes(){
    return "misssoes listadas";
}
    }
