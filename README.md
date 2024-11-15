# Modelo de Domínio de Produtos

Este repositório contém o modelo de domínio de produtos, útil para sistemas de gerenciamento de produtos, inventário, ou catálogos. O diagrama abaixo representa as entidades e seus relacionamentos:

<<<<<<< HEAD

(https://www.planttext.com/api/plantuml/png/dP9DJiCm48NtEOML9L4hs6RLAYqI4a955GSmzhIob7ZAUCm2n4NO8HOzI2x694qhDuKDAsl-FhzvzYom9evDdPbQXw1MX3OoglTCgOcpfLepER_jeWTi88qN40ovTjz-OvfU4RHxoIp0k4RNVQTcNP7JGw-4qANNh3c6q-n7DcYefBv5wV-lYXFf5ic30OlKeuepL3525HLwKPGkKoozXM6VCNiP65yY73G-HktPMMq5UET5Fj1nyVQpPZ5Ypb7NxctimJsQD3s-PFugrKFnDpEUGco_o9tvNtM3RkFCaPdegMHZpnSZdSpafa6TY3Z-XlmcLvE97DFfLPwyJwbsG0pUWD9_D2TFKAfD7pYBQeTqEP2VJ1KmXX3THSzr3qrjAHK9_ncoR0RUoa_-0G00)
>>>>>>> 63c6724c5efe973b3ac30a7a178822d7cc158acd

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
