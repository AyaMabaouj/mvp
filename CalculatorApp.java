public class CalculatorApp {
public static void main(String[] args) {
    CalculatorView view = new CalculatorGUI();
    CalculatorPresenter presenter = new CalculatorPresenter(view);
}
}