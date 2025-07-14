package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

public class NinjasController {
    @RestController
    @RequestMapping
    public static class NinjaController {

        @GetMapping("/boasVindas")
        public String boasVindas() {

            return "essa é minha primeira rota";

            }

    // adicionar ninjas(create)
    @PostMapping("/adicionar")
    public String adicionarNinja(){
        return "Ninja criado";}

    // procurar ninja pelo id(create)

    // MOSTRAR TODOS OS NINJAS(READ)
         @GetMapping("/todos")
        public String mostrarTodosNinjas(){
            return "mostrar ninja ";

         }


    // MOSTRAR NINJA PRO ID(READ)
    @GetMapping("/todosID")
    public String mostrarTodosNinjasPorId(){
        return "mostrar ninja por id";

        }


        //alterar dados do ninja(UPDATE)
        @PutMapping("/alterarID")
        public String alterarNinjaPorId(){
            return "ninja aletrado por id";
        }

    //deletar ninja(DELETE)
        @DeleteMapping("/deletarID")
        public String deletarPorId(){
            return "ninja deletado por id";
        }



        }
    }

