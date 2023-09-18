import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JanelaTab extends JTabbedPane {
    public JanelaTab() {
        this.add("Calculadora", new CalculadoraSimples());
        this.add("Calculadora de IMC", new CalculadoraImc());
        this.add("Calculadora de Programador", new Calc_Programador());
    }
}
