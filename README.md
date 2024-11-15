Product Management System
Este repositório contém o modelo de domínio para um sistema de gerenciamento de produtos. Ele pode ser útil para sistemas de inventário, catálogos de produtos, ou qualquer aplicação que precise gerenciar um conjunto de produtos com suas respectivas categorias, preços, status, e outras características.

Diagrama de Entidades
O diagrama de entidades abaixo ilustra as principais tabelas do banco de dados, suas relações e atributos:
[![Diagrama de Entidades](https://www.planttext.com/api/plantuml/png/dP9DJiCm48NtEOML9L4hs6RLAYqI4a955GSmzhIob7ZAUCm2n4NO8HOzI2x694qhDuKDAsl-FhzvzYom9evDdPbQXw1MX3OoglTCgOcpfLepER_jeWTi88qN40ovTjz-OvfU4RHxoIp0k4RNVQTcNP7JGw-4qANNh3c6q-n7DcYefBv5wV-lYXFf5ic30OlKeuepL3525HLwKPGkKoozXM6VCNiP65yY73G-HktPMMq5UET5Fj1nyVQpPZ5Ypb7NxctimJsQD3s-PFugrKFnDpEUGco_o9tvNtM3RkFCaPdegMHZpnSZdSpafa6TY3Z-XlmcLvE97DFfLPwyJwbsG0pUWD9_D2TFKAfD7pYBQeTqEP2VJ1KmXX3THSzr3qrjAHK9_ncoR0RUoa_-0G00)](https://www.planttext.com/plantuml/uml/dP9DJiCm48NtEOML9L4hs6RLAYqI4a955GSmzhIob7ZAUCm2n4NO8HOzI2x694qhDuKDAsl-FhzvzYom9evDdPbQXw1MX3OoglTCgOcpfLepER_jeWTi88qN40ovTjz-OvfU4RHxoIp0k4RNVQTcNP7JGw-4qANNh3c6q-n7DcYefBv5wV-lYXFf5ic30OlKeuepL3525HLwKPGkKoozXM6VCNiP65yY73G-HktPMMq5UET5Fj1nyVQpPZ5Ypb7NxctimJsQD3s-PFugrKFnDpEUGco_o9tvNtM3RkFCaPdegMHZpnSZdSpafa6TY3Z-XlmcLvE97DFfLPwyJwbsG0pUWD9_D2TFKAfD7pYBQeTqEP2VJ1KmXX3THSzr3qrjAHK9_ncoR0RUoa_-0G00)



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



