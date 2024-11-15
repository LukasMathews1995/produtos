package com.meuprojetoparticular.projeto_produtos.dto;

import com.meuprojetoparticular.projeto_produtos.entity.Produto;

public class ProdutoDTO {

    private Long id;
    private String name;
    private String description;
    private String status;
    private Float price;


    public ProdutoDTO(){}
    public ProdutoDTO(Produto entity){
        id = entity.getId();
        name= entity.getName();
        description= entity.getDescription();
        status =entity.getStatus();
        price =entity.getPrice();
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public Float getPrice() {
        return price;
    }


    
}
