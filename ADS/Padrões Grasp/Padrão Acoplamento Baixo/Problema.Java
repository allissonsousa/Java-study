///minima dependencia entre classes e modulos do sistemas
/// modificações em um modulo tem impacto minimo em outros
/// uma classe n precisa saber muito sobre a outra
/// melhor isolamento de componentes
/// facilita a manutenção e evolução do sistema
/// reutilização de componentes
/// facilidade para testar isoladamente partes do sistema
/// pode introduzir maior complexidade no  projeto

//Do mais alto para o mais baixo nivel

- Conteudo
- Global
- Externo
- Controle
- Estrutura
- Dados


IMPORTANTE

- priorizar o uso dos acoplamentos de mais baixo  nivel principalmente Dados
- dependencia das abstrações deve ser prioritaria
- minimizar o numero de dependencia entre os modulos sem comprometer a coesao