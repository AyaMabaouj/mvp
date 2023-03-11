public interface CalculatorView {
    int getFirstNumber();
    int getSecondNumber();
    void setCalculationResult(int result);
    void showError(String message);
}
