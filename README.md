## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone
O desafio é modelar e diagramar uma representação UML do componente iPhone, ele deverá abranger as funcionalidades de reprodutor musica, aparelho telefonico e navegador na Internet.
O projeto foi extendido alem do mínimo, implementando as classes Internet Explorer, iPod e Pessoa 

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`
4. **Pessoa**
   - Atributos: `String nome`, `int idade`
   - Métodos: `comprariPhone()`, `comprariPod()`, `abrirInternetExplorer()`
5. **iPod**
   - Atributos: `String cor`, `int anoLancamento`, `String modelo`
6. **InternetExplorer**
   - Atributos: `String versao`
7. **iPhone**
   - Atributos: `String cor`,`String modelo`,`int anoLancamento`


## Diagrama feito atravez da ferramenta Plant UML
![Classes](docs/DiagramaClasses/Diagrama%20de%20classes.png)