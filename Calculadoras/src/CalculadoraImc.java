import java.awt.*;
import javax.swing.*;

public class CalculadoraImc extends JFrame {
    public CalculadoraImc() {
        super("Calculadora de IMC");

        // Add JFrame principal
        JFrame painelPrincipal = new JFrame();
        painelPrincipal.setLayout(new BorderLayout());

        // Definindo as Posições no BorderLayout
        JPanel painelSuperior = new JPanel(); // Criando Painel Superior
        painelPrincipal.add(painelSuperior, BorderLayout.NORTH); // Inserindo o Painel Superior no NORTE do Painel Principal

        JPanel painelLeste = new JPanel(); // Criando Painel Leste
        painelPrincipal.add(painelLeste, BorderLayout.WEST); // Inserindo o Painel Central no LESTE do Painel Principal

        JPanel painelInferior = new JPanel(); // Criando Painel Inferior
        painelPrincipal.add(painelInferior, BorderLayout.SOUTH); // Inserindo o Painel Inferior no SUL do Painel Principal



        // Criando o Painel de Resultado e o Inserindo no painelSuperior
        JPanel painelResultado = new JPanel();
        painelResultado.setLayout(new BorderLayout());
        painelSuperior.add(painelResultado);


        // Criando o Painel de Informações e o Inserindo no painelLeste
        JPanel painelInfos = new JPanel();
        painelInfos.setLayout(new BorderLayout());
        painelLeste.add(painelInfos);


        // Criando o Painel de Calcular e o Inserindo no painelInferior
        JPanel painelCalcular = new JPanel();
        painelCalcular.setLayout(new BorderLayout());
        painelInferior.add(painelCalcular);



        // Criando os Componentes
        JLabel titulo = new JLabel("CALCULADORA DE IMC"); // Norte
        JTextField resultado = new JTextField(10); // Norte

        JLabel altura = new JLabel("Altura CM"); // Leste
        JTextField inserirAltura = new JTextField(5); // Leste
        JLabel peso = new JLabel("Peso KG"); // Leste
        JTextField inserirPeso = new JTextField(5); // Leste

        JButton enviar = new JButton("Calcular"); // Sul
        Dimension tamanhoBotao = new Dimension(150, 30); // Sul



        // Inserindo os Componentes no NORTE
        JPanel painelImc = new JPanel();
        painelResultado.add(painelImc, BorderLayout.CENTER);
        painelImc.setLayout(new GridLayout(2, 1));
        painelImc.add(titulo);
        painelImc.add(resultado);


        // Inserindo os Componentes no CENTRO
        JPanel painelRecebimento = new JPanel();
        painelInfos.add(painelRecebimento, BorderLayout.CENTER);
        painelRecebimento.setLayout(new GridLayout(4, 1));
        painelRecebimento.add(altura);
        painelRecebimento.add(inserirAltura);
        painelRecebimento.add(peso);
        painelRecebimento.add(inserirPeso);


        // Inserindo os Componentes no SUL
        JPanel painelEnviar = new JPanel();
        painelCalcular.add(painelEnviar, BorderLayout.CENTER);
        painelEnviar.add(enviar);

        // Formatando o Botão
        enviar.setBackground(Color.BLUE);
        enviar.setForeground(Color.WHITE);
        enviar.setPreferredSize(tamanhoBotao);



        // Inserindo Funcionalidade ao Botão e à Calculadora
        enviar.addActionListener(e -> {
            int valAltura = Integer.parseInt(inserirAltura.getText());
            int valPeso = Integer.parseInt(inserirPeso.getText());

            // Elevar valAltura ao quadrado
            double alturaAoQuadrado = Math.pow(valAltura, 2);

            // Realizar o cálculo do IMC
            double valCalculo = valPeso / (alturaAoQuadrado / 10000); // Dividir por 10000 para converter CM^2 em M^2

            resultado.setText(String.format("%.2f", valCalculo));
        });

        // Set Frame
        painelPrincipal.setDefaultCloseOperation(2);
        painelPrincipal.setVisible(true);
        painelPrincipal.setBounds(850, 350, WIDTH, HEIGHT);
        painelPrincipal.pack();
        painelPrincipal.setResizable(false);
    }
}
