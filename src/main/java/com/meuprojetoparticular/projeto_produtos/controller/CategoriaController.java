package com.meuprojetoparticular.projeto_produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojetoparticular.projeto_produtos.dto.CategoriaDTO;
import com.meuprojetoparticular.projeto_produtos.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {


    @Autowired
    private CategoriaService service;

@GetMapping("/{id}")
    public CategoriaDTO findById(@PathVariable  Long id){
        return service.findById(id);
    }
}
