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

        JPanel painelCenter = new JPanel();
        calculadora.add(painelCenter, BorderLayout.CENTER);
        painelCenter.setLayout(new GridLayout(2, 2, 10, 10));

        // Criando os Componentes
        JTextField resultado = new JTextField();
        JLabel altura = new JLabel("Informe sua altura em METROS");
        JTextField inserirAltura = new JTextField();
        JLabel peso = new JLabel("Insira seu peso em KG");
        JTextField inserirPeso = new JTextField();
        JButton enviar = new JButton("Calcular");

        painelCenter.add(altura);
        painelCenter.add(peso);
        painelCenter.add(inserirAltura);
        painelCenter.add(inserirPeso);


        calculadora.setVisible(true);

    }

}
