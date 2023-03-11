public class CalculatorPresenter {

    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view) {
        this.view = view;
        this.model = new CalculatorModel();
    }

    public void calculate() {
        int firstNumber = view.getFirstNumber();
        int secondNumber = view.getSecondNumber();
    
        try {
            int result = model.addNumbers(firstNumber, secondNumber);
            view.setCalculationResult(result);
        } catch (Exception e) {
            view.showError("Invalid input");
        }
    }
    }
