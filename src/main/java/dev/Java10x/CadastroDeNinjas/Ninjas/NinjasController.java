package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<NinjasDTO>> mostrarTodosNinjas() {
         List<NinjasDTO> ninjasDTOList = ninjaService.listarNinjas();
        return ResponseEntity.ok()
                .body(ninjasDTOList);
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "essa é minha primeira rota";
    }

    @PostMapping("/adicionar")
    public ResponseEntity adicionarNinja(@RequestBody NinjasDTO ninjasDTO) {

      NinjasDTO novoNinja = ninjaService.criarNinja(ninjasDTO);
      return ResponseEntity.status(HttpStatus.CREATED)
              .body("ninja criado com sucesso:" + novoNinja.getNome() + " id: "+ novoNinja.getId());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> mostrarTodosNinjasPorId(@PathVariable Long id) {
        NinjasDTO ninjasPorID = ninjaService.listarNinjasPorID(id);

        if (ninjasPorID != null) {
            return ResponseEntity.ok(ninjasPorID);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com id: " +id +" não existe em nosso registro");
        }

    }


    // deletar ninja por id
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaId(@PathVariable long id) {
        if (ninjaService.listarNinjasPorID(id) != null) {
            ninjaService.deletarNinjaPorID(id);
            return ResponseEntity.ok("Ninja deletado pelo id: "+ id);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com id:"+ id + " nao encontrado");
        }
    }

    // atualizar ninja
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> atualizarNinja ( @PathVariable long id, @RequestBody NinjasDTO ninjaAtualizado ){
        NinjasDTO ninja = ninjaService.atualizarNinja(id, ninjaAtualizado);
        if (ninja != null){
            return ResponseEntity.ok(ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ninja nao encontrado");
        }
    }
}
