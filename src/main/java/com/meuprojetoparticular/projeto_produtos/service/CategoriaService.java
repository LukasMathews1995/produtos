package com.meuprojetoparticular.projeto_produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuprojetoparticular.projeto_produtos.dto.CategoriaDTO;
import com.meuprojetoparticular.projeto_produtos.entity.Categoria;
import com.meuprojetoparticular.projeto_produtos.repositories.CategoriaRepository;

@Service
public class CategoriaService {


@Autowired
private CategoriaRepository repository;

   public CategoriaDTO findById(Long id){
    Categoria categoria = repository.findById(id).get();
CategoriaDTO categoriaDTO= new  CategoriaDTO(categoria);
    return  categoriaDTO;
   }


}
