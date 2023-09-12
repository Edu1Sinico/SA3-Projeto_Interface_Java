# SA3-Projeto_Interface_Java

 * Diante das três regiões foram criados três JPanels (todos são BorderLayout) para ocupá-las: "painelSuperior" (Norte), "painelLeste" (Leste) e "painelInferior" (Sul), que representam diferentes seções do "painelPrincipal".

 * Para ocupar as três novas seções foram criados mais três sub JPanels (BorderLayout) para que eu pudesse inserir e organizar os próximos componentes componentes: "painelResultado" (painelSuperior), "painelInfos" (painelLeste) e "painelCalcular" (painelInferior).


2. Componentes da Interface:
 * Diversos componentes foram criados, como rótulos (JLabel), campos de texto (JTextField) e um botão (JButton).

 * Os componentes foram organizados com a criação de mais três JPanels inseridos nos seguintes paineis: "painelImc" é GridLayout e foi inserido no centro do "painelResultado", "painelRecebimento" é GridLayout e foi inserido no centro do "painelInfos" e "painelEnviar" é FlowLayout e foi inserido no centro do "painelCalcular"

 * Utilizei GridLayout nos painéis "painelImc" e "painelRecebimento", pois é mais fácil e dinâmico inserir e organizar os meus componentes da forma que eu gostaria, que é uma "JLabel" em cima de um "JTextField". Para isso foi necessário que eu definisse o GridLayout com UMA coluna, a quantidade de linhas sería a minha quantidade de componentes que eu gostaria de inserir naquele local.


3. Configuração do Botão "Calcular":
 * O botão "Calcular" é configurado com cores, dimensões e um ouvinte de eventos (event listener) que define a ação a ser realizada quando o botão é clicado.
Quando o botão é clicado, ele lê os valores inseridos nos campos de altura e peso, realiza o cálculo do IMC e exibe o resultado em um "JTextField" localizado no "painelImc".


4. Comportamento do Botão:
 * Quando o botão "Calcular" é clicado, os valores de altura e peso são lidos dos campos de texto. Em seguida, a altura é elevada ao quadrado utilizando "Math.pow" e o cálculo do IMC é realizado, dividindo o peso pelo quadrado da altura (convertido de cm^2 para m^2).


5. Configuração dos Painéis:
 * Os componentes são inseridos nos painéis correspondentes utilizando os layouts "BorderLayout", "GridLayout", para controlar a disposição e o alinhamento dos elementos.
 * A janela "painelPrincipal" é configurada com várias propriedades, incluindo o fechamento padrão quando a janela é fechada (setDefaultCloseOperation), posição inicial na tela (setBounds), visibilidade (setVisible), tamanho automático de acordo com o conteúdo (pack), e a janela não pode ser redimensionada (setResizable).


No geral, esta calculadora de IMC é uma aplicação simples com uma interface gráfica que permite ao usuário inserir sua altura e peso, clicar no botão "Calcular" e obter o resultado do seu Índice de Massa Corporal (IMC) exibido na janela. 