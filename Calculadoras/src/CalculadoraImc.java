package Calculadoras.src;

import javax.swing.*;
import java.awt.*;

public class CalculadoraImc extends JFrame {

    public CalculadoraImc() {

        //Criando o JFrame
        JFrame calculadora = new JFrame("Calculadora de IMC");


        // Configurando a Janela
        calculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculadora.setBounds(500, 130, 300, 400);
        calculadora.setResizable(false);

        // Modificando meu Frame para BorderLayout
        calculadora.setLayout(new BorderLayout());

        // Criando o meu Painel Superior
        JPanel painelSuperior = new JPanel(new BorderLayout());

        // Criando os Componentes
        JTextField resultado = new JTextField();
        JLabel altura = new JLabel("Informe sua altura em METROS");
        JTextField inserirAltura = new JTextField();
        JLabel peso = new JLabel("Insira seu peso em KG");
        JTextField inserirPeso = new JTextField();
        JButton enviar = new JButton("Calcular");


        // Adicionando os Componentes ao Painel Superior
        JPanel camposPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        camposPanel.add(altura);
        camposPanel.add(peso);
        camposPanel.add(inserirAltura);
        camposPanel.add(inserirPeso);
        painelSuperior.add(camposPanel, BorderLayout.NORTH);    


        calculadora.setVisible(true);

    }

}
