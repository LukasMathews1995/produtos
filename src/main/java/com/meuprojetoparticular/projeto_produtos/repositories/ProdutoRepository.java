package com.meuprojetoparticular.projeto_produtos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojetoparticular.projeto_produtos.entity.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto,Long>{
    List<Produto> findByCategoriaId(Long categoriaId);
}
