package com.meuprojetoparticular.projeto_produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojetoparticular.projeto_produtos.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
