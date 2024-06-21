package br.com.washiner.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("primeirarota")
//http//:localhost:8080/ ------
public class minhaPrimeiraController {

     // metodos de requisição HTTP
    /*
      - GET = buscar informaçao
      - POST = adicionar um dado/informaçao
      - PUT = alterar um dado informaçao
      - DELETE = remover um dado
      - PATCH = altera somente uma parte da informaçao ou dado
     */
     

     // metodo de uma classe uma funcionalidade de uma classe
     @GetMapping("/washiner")
     public String primeiraMenssagem(){
        return "Chamando minha primeira funcao SPRINGBOOT";
     }
    
}
