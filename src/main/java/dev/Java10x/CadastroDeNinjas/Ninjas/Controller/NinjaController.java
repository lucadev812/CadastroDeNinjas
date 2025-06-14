package dev.Java10x.CadastroDeNinjas.Ninjas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

   @GetMapping("/boasvindas")
    public String boasVindas() {
        return "essa é minha primeira rota";
    }
}
