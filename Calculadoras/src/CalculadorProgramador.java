import javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.*;

public class CalculadorProgramador extends JFrame{

    int result = 0;

    
    public CalculadorProgramador() {
       super();
       JFrame janela = new JFrame("Calculadora de Programador");
       janela.setLayout(new BorderLayout());

    //    Configuração de posicionamento da Interface do Programa 
       JPanel painelTop = new JPanel();
       janela.add(painelTop,BorderLayout.NORTH);
       JPanel painelBottom = new JPanel();
       janela.add(painelBottom,BorderLayout.SOUTH);
       JPanel painelCenter = new JPanel();
       janela.add(painelCenter,BorderLayout.CENTER);
       painelCenter.setLayout(new BoxLayout(painelCenter, BoxLayout.PAGE_AXIS));


    //    Criação do Painel de Título
        JPanel painelTitle = new JPanel();
       painelTop.add(painelTitle);
       painelTitle.add(new JLabel("Calculadora de Programador"));


    

    //    Criação do Painel de Resultado
       JPanel painelResult = new JPanel();
       painelCenter.add(painelResult);
       painelResult.add(new JLabel("" + result));
       painelResult.setLayout(new BoxLayout(painelResult, BoxLayout.PAGE_AXIS));

    

    //    Criação do painel de exibição dos resultados de (HEX, DEC e BIN)
        JPanel painelDisplay = new JPanel();
       painelCenter.add(painelDisplay);
       painelDisplay.add(new JLabel("HEX: " + 0));
       painelDisplay.add(new JLabel("DEC: " + 0));
       painelDisplay.add(new JLabel("BIN: " + 0));
       painelDisplay.setLayout(new BoxLayout(painelDisplay, BoxLayout.PAGE_AXIS));



    //    Criação do Painel de Buttons:
        JPanel painelBtn = new JPanel();
        painelCenter.add(painelBtn);
        painelBtn.setLayout(new BoxLayout(painelBtn, BoxLayout.PAGE_AXIS));
        JPanel painelBtn_Line1 = new JPanel();
        painelBtn.add(painelBtn_Line1);
        JPanel painelBtn_Line2 = new JPanel();
        painelBtn.add(painelBtn_Line2);
        JPanel painelBtn_Line3 = new JPanel();
        painelBtn.add(painelBtn_Line3);



        // Painel de botãos - linha 1
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");

        painelBtn_Line1.add(btn1);
        painelBtn_Line1.add(btn2);
        painelBtn_Line1.add(btn3);
        painelBtn_Line1.setLayout(new BoxLayout(painelBtn_Line1, BoxLayout.LINE_AXIS));

        // Painel de botãos - linha 2
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");

        painelBtn_Line2.add(btn4);
        painelBtn_Line2.add(btn5);
        painelBtn_Line2.add(btn6);
        painelBtn_Line2.setLayout(new BoxLayout(painelBtn_Line2, BoxLayout.LINE_AXIS));

        // Painel de botãos - linha 3
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

        painelBtn_Line3.add(btn7);
        painelBtn_Line3.add(btn8);
        painelBtn_Line3.add(btn9);
        painelBtn_Line3.setLayout(new BoxLayout(painelBtn_Line3, BoxLayout.LINE_AXIS));


       janela.setBounds(470,100,336,540);
       janela.setDefaultCloseOperation(2);
       janela.setVisible(true);
       janela.setResizable(false);



    }

}
