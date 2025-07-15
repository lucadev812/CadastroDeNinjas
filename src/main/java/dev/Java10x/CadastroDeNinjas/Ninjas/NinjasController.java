package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/ninjas")
public class NinjasController {

    private  NinjaService ninjaService;

    public NinjasController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "essa é minha primeira rota";
    }

    @PostMapping("/adicionar")
    public String adicionarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/listarID")
    public String mostrarTodosNinjasPorId() {
        return "mostrar ninja por id";
    }
}
