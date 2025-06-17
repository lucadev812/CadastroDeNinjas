package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class NinjasController {
    @RestController
    @RequestMapping
    public static class NinjaController {

        @GetMapping("/boasvindas")
        public String boasVindas() {
            return "essa é minha primeira rota";
        }
    }
}
