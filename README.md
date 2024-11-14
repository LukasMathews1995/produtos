Produto
|-- ID
|-- Nome
|-- Descrição
|-- Preço
|-- Estoque
|-- Data de Criação
|-- Status
|
|   Categoria (1:N)
|   Fornecedor (N:M)
|   Avaliação (1:N)
|
Category
|-- ID
|-- Nome
|-- Descrição

Supplier
|-- ID
|-- Nome
|-- Contato
|-- Endereço

Inventory
|-- Produto
|-- Quantidade
|-- Data de Última Atualização
|-- Localização do Estoque

Review
|-- ID
|-- Produto
|-- Usuário
|-- Classificação
|-- Comentário
|-- Data da Avaliação
