package com.meuprojetoparticular.projeto_produtos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojetoparticular.projeto_produtos.dto.ProdutoDTO;
import com.meuprojetoparticular.projeto_produtos.entity.Produto;
import com.meuprojetoparticular.projeto_produtos.exception.CategoriaNotFoundException;
import com.meuprojetoparticular.projeto_produtos.service.ProdutoService;

@RestController
@RequestMapping(value =  "/produto")
public class ProdutoController {



    @Autowired
    private ProdutoService produtoService;


    @GetMapping
    public List<ProdutoDTO> findAll(){
        List<ProdutoDTO> listaProduto = produtoService.findAll();
        return listaProduto;
}
@GetMapping("/{id}/lista")
public ResponseEntity<List<ProdutoDTO>> findAllList(@PathVariable Long id ){
    
    try {
            List<ProdutoDTO> produtos = produtoService.findByCategoriaId(id);
            return ResponseEntity.ok(produtos);
        } catch (CategoriaNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ArrayList<>());
        }

}
}