package com.meuprojetoparticular.projeto_produtos.dto;

import com.meuprojetoparticular.projeto_produtos.entity.Categoria;

public class CategoriaDTO {

    private Long id;
    private String name;
    private String description;
        public CategoriaDTO(Categoria entity){
            id = entity.getId();
            name  =entity.getName();
            description = entity.getDescription();

        }
    public CategoriaDTO(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    

}
