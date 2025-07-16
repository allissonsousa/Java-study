Muito utilizada para a reutilização de código, permitindo que o mesmo backend seja usado para mais de um estilo de apresentação de dados, como site, aplicativo etc

-----------Model (modelo) > nessa camada, temos as entidades e as classes para acesso ao banco de dados.

-Controla toda a persistência do sistema.
-Concentra as chamadas ao banco de dados.
-Encapsula o estado do sistema.
-Pode utilizar mapeamento objeto-relacional.
-Padrão DAO é aplicável.


-----------Controller (controlador) > aqui, concentramos os objetos de negócio.

-Implementa as regras de negócio do sistema.
-Solicita os dados à camada Model.
-Não pode ser direcionada para uma interface.
-Pode utilizar objetos distribuídos.
-Padrão Facade facilita a utilização da camada.


-----------View (visualização) > nessa camada, são definidas as interfaces do sistema com o usuário ou com outros sistemas

-Define a interface do sistema.
-Faz requisições para a camada Controller.
-Contém apenas regras de formatação.
-Podem ser definidas múltiplas interfaces.
-Não pode acessar a camada Model.