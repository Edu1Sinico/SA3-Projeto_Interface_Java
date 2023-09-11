import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculadoraSimples {
    private JFrame frame;
    private JPanel panel;
    private JLabel titleLabel;
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
    };

    private double num1, num2, result;
    private String operator;

    public CalculadoraSimples() {

        frame = new JFrame("Calculadora Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        frame.setResizable(false);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());


        titleLabel = new JLabel("Calculadora");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        panel.add(textField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        buttons = new JButton[buttonLabels.length];
        Color buttonColor = new Color(200, 200, 200);

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            buttons[i].setBackground(buttonColor);
            buttons[i].addActionListener(new ButtonClickListener());
            buttonPanel.add(buttons[i]);
        }

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                textField.setText(textField.getText() + command);
            }
            else if (command.equals("C")) {
                textField.setText("");
                num1 = num2 = result = 0;
                operator = "";
            }
            else if (command.matches("[\\+\\-\\*/]")) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = command;
                    textField.setText("");
                }
            }
            else if (command.equals("=")) {
                if (!textField.getText().isEmpty()) {
                    num2 = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                textField.setText("Erro: Divisão por zero!");
                                return;
                            }
                            break;
                    }
                    String formattedResult = new DecimalFormat("#.######").format(result);
                    textField.setText(formattedResult);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraSimples();
            }
        });
    }
}
