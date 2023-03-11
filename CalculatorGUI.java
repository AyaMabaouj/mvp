import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class CalculatorGUI implements CalculatorView {

    private JFrame frame;
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JLabel resultLabel;

    public CalculatorGUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel firstNumberLabel = new JLabel("First number:");
        firstNumberField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second number:");
        secondNumberField = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        calculateButton.addActionListener(e -> {
            CalculatorPresenter presenter = new CalculatorPresenter(this);
            presenter.calculate();
        });

        frame.add(firstNumberLabel);
        frame.add(firstNumberField);
        frame.add(secondNumberLabel);
        frame.add(secondNumberField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    @Override
    public int getFirstNumber() {
        return Integer.parseInt(firstNumberField.getText());
    }

    @Override
    public int getSecondNumber() {
        return Integer.parseInt(secondNumberField.getText());
    }

    @Override
    public void setCalculationResult(int result) {
        resultLabel.setText("Result: " + result);
    }

    @Override
    public void showError(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
