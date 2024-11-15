package com.meuprojetoparticular.projeto_produtos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuprojetoparticular.projeto_produtos.dto.ProdutoDTO;
import com.meuprojetoparticular.projeto_produtos.entity.Produto;
import com.meuprojetoparticular.projeto_produtos.exception.CategoriaNotFoundException;
import com.meuprojetoparticular.projeto_produtos.repositories.ProdutoRepository;

@Service
public class ProdutoService {


@Autowired
private ProdutoRepository produto;


public List<ProdutoDTO> findAll(){
    List<Produto> produtoLista = produto.findAll();
    return produtoLista.stream().map(x -> new ProdutoDTO(x)).toList();
}
public List<ProdutoDTO> findByCategoriaId(Long id){

    List<Produto> produtoLista = produto.findByCategoriaId(id);
    produtoLista.removeIf(produto -> "Ativo".equals(produto.getStatus()));
    if(produtoLista.isEmpty()){
            throw new CategoriaNotFoundException("Categoria com esse n°"  + id +" nao achada");
    }
    return produtoLista.stream().map(x-> new ProdutoDTO(x)).toList();
}
}


