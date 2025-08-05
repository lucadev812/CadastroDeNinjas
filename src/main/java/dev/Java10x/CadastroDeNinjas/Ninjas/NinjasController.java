package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.QuadCurve2D;
import java.util.List;
@RestController
@RequestMapping("/ninjas")
public class NinjasController {

    private  NinjaService ninjaService;

    public NinjasController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/listar")
    public List<NinjasDTO> mostrarTodosNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "essa é minha primeira rota";
    }

    @PostMapping("/adicionar")
    public NinjasDTO adicionarNinja(@RequestBody NinjasDTO ninjasDTO) {
        return ninjaService.criarNinja( ninjasDTO );
    }

    @GetMapping("/listar/{id}")
    public NinjasDTO mostrarTodosNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorID(id);
    }
    // deletar ninja por id
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaId(@PathVariable long id){
        ninjaService.deletarNinjaPorID(id);
    }

    // atualizar ninja
    @PutMapping("/atualizar/{id}")
    public NinjasDTO atualiarNinja(@PathVariable long id,@RequestBody NinjasDTO ninjaAtualizado ){
        return ninjaService.atualizarNinja(id,ninjaAtualizado);
    }
}
