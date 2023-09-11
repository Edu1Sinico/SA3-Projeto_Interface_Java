import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc_Programador extends JFrame{
    public Calc_Programador() {
        super("Calculadora Programador");

        // Criando a janela:
        JFrame janela = new JFrame();
        janela.setLayout(new BorderLayout());

        // criando as posições com borderLayout
        JPanel painelTop = new JPanel();
        janela.add(painelTop,BorderLayout.NORTH);
        JPanel painelCenter = new JPanel();
        janela.add(painelCenter,BorderLayout.CENTER);
        JPanel painelBottom = new JPanel();
        janela.add(painelBottom,BorderLayout.SOUTH);

        // Declarando um título para o top da calculadora:
        JPanel painelTitle = new JPanel();
        painelTop.add(painelTitle);
        painelTitle.add(new JLabel("Calculadora de Programador"));

        // Criando um painel para o centro
        JPanel painelMain = new JPanel();
        painelMain.setLayout(new BorderLayout());
        painelCenter.add(painelMain);

        // Criando um painel de resultados para o centro
        JPanel painelResults = new JPanel();
        painelMain.add(painelResults,BorderLayout.NORTH);
        painelResults.setLayout(new GridLayout(4,1));
        painelResults.add(new JTextField());
        painelResults.add(new JLabel("HEX: " + 0));
        painelResults.add(new JLabel("DEC: " + 0));
        painelResults.add(new JLabel("BIN: " + 0));

        // criando um painel da calculadora
        JPanel painelCalc = new JPanel();
        painelMain.add(painelCalc,BorderLayout.CENTER);
        painelCalc.setLayout(new GridLayout(6,5));
        String valoresCalc[] = {"A","<<",">>","C","[x]","B","(",")","%","/","C","7","8","9","X","D","4","5","6","-","E","3","2","1","+","F","+/-","0",",","="};

        for (int i = 0; i < valoresCalc.length; i++) {
            if(valoresCalc[i] == "=")
            {
                painelCalc.add(new JButton(valoresCalc[i])).setBackground(Color.BLUE);
            }
            else{
            painelCalc.add(new JButton(valoresCalc[i])).setBackground(Color.WHITE);
            }
        }

        // Setando o frame
        janela.setBounds(470,100,270,335);
        janela.setDefaultCloseOperation(2);
        janela.setVisible(true);
        janela.pack();
        janela.setResizable(false);

    }


}
