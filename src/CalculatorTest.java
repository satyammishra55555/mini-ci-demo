public class CalculatorTest {

    public static void main(String[] args) {

        int result = Calculator.add(10, 20);

        if (result == 30) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}