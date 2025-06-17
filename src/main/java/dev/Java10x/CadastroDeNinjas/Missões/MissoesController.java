package dev.Java10x.CadastroDeNinjas.Missões;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class MissoesController {
    @RestController
    @RequestMapping
    public static class missoesController{
        @GetMapping("/missoes")
        public String missoes(){
            return "rota de missões";
        }
    }

}
