public class OperationPower implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        // Implement power operation (num1^num2)
        return (int) Math.pow(num1, num2);
    }
}