package middle.enums.calculator;

public class Calculate {
    public static void main(String[] args) {
        String valueOfSum = CalculateOperation.ADDITION.calculate(5, 8).toString();
        String valueOfMultiple = CalculateOperation.MULTIPLICATION.calculate(1, 2).toString();
        String valueOfSub = CalculateOperation.SUBTRACTION.calculate(8,2).toString();
        String valueOfDiv = CalculateOperation.DIVISION.calculate(9, 8).toString();

        System.out.println(valueOfDiv  + "\n" + valueOfSub + "\n" + valueOfSum + "\n" + valueOfMultiple);
    }
}
