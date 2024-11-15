# Modelo de Domínio de Produtos

Este repositório contém o modelo de domínio de produtos, útil para sistemas de gerenciamento de produtos, inventário, ou catálogos. O diagrama abaixo representa as entidades e seus relacionamentos:

![Modelo de Domínio de Produtos](caminho/para/diagrama.png)

## Diagrama UML em PlantUML

```plantuml
@startuml
class Produto {
  +ID: String
  +Nome: String
  +Descrição: String
  +Preço: Decimal
  +DataCriação: Date
  +Status: String
}

class Categoria {
  +ID: String
  +Nome: String
  +Descrição: String
}

class Fornecedor {
  +ID: String
  +Nome: String
  +Contato: String
  +Endereço: String
}

class Estoque {
  +Quantidade: Integer
  +DataÚltimaAtualização: Date
  +Localização: String
}

class Avaliação {
  +ID: String
  +Usuário: String
  +Classificação: Integer
  +Comentário: String
  +DataAvaliação: Date
}

Produto "1" -- "1..*" Categoria : pertence a
Produto "1" -- "1..*" Fornecedor : fornecido por
Produto "1" -- "1" Estoque : possui
Produto "1" -- "0..*" Avaliação : recebe

@enduml
