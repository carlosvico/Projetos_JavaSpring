package com.spring.apirest.controller;

import com.spring.apirest.controller.dto.TopicoDTO;
import com.spring.apirest.model.Curso;
import com.spring.apirest.model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
    @RequestMapping("/topicos")
    // Como quero devolveruma lista de Tópicos essa classe recebe List<>
    // O Spring trabalha com o conversor Jackson que pegra a resposta da requisição e tranforma em arquivo Json
    public List<TopicoDTO> lista(){
    Topico topico = new Topico("Duvida", "35544Duvida ffff com Spring", new Curso("Spring", "Programação"));
        return TopicoDTO.converter(Arrays.asList(topico));
    }
}
