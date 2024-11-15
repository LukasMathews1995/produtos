Product Management System
Este repositório contém o modelo de domínio para um sistema de gerenciamento de produtos. Ele pode ser útil para sistemas de inventário, catálogos de produtos, ou qualquer aplicação que precise gerenciar um conjunto de produtos com suas respectivas categorias, preços, status, e outras características.

Diagrama de Entidades
O diagrama de entidades abaixo ilustra as principais tabelas do banco de dados, suas relações e atributos:



Funcionalidades
Gerenciamento de Produtos: Adicionar, editar, listar e excluir produtos.
Gestão de Categorias: Produtos podem ser associados a uma ou mais categorias.
Controle de Status: Defina o status dos produtos como "Ativo", "Inativo", entre outros.
Data de Criação: Acompanhe a data de criação dos produtos no sistema.
Preço: Armazene informações de preço para cada produto.
Como Usar
Pré-requisitos
Java 21 ou superior
Banco de dados H2 (ou qualquer banco compatível com JPA/Hibernate)
Maven  para gerenciamento de dependências
Instalação
Clone este repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/seu-repositorio.git
Entre na pasta do projeto:

bash
Copiar código
cd seu-repositorio
Compile e execute o projeto:

Usando Maven:
bash
Copiar código
mvn clean install
mvn spring-boot:run


O sistema estará disponível na URL padrão configurada no application.properties.

Endpoints
Se o sistema incluir APIs REST, forneça exemplos de endpoints:

GET /produto/{categoria_id}/lista: Lista todos os produtos pela categoria.
GET /produto: Lista todos os produtos 
Exemplo de Request (para API REST)



