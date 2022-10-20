package middle.enums.calculator;

public enum CalculateOperation {
    ADDITION("+") {
        @Override
        CalculateOperation calculate(double a, double b) {
            this.value = a+b;
            return this;
        }
    },
    SUBTRACTION("-") {
        @Override
        CalculateOperation calculate(double a, double b) {
            this.value = a-b;
            return this;
        }
    },
    DIVISION("/") {
        @Override
        CalculateOperation calculate(double a, double b) {
            this.value = a/b;
            return this;
        }
    },
    MULTIPLICATION("*") {
        @Override
        CalculateOperation calculate(double a, double b) {
            this.value = a*b;
            return this;
        }
    };

    private final String operation;
    protected Double value;
    abstract CalculateOperation calculate(double a, double b);

    CalculateOperation(final String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "CalculateOperation{ " +
                    "operation='" + operation + '\'' +
                    "value= " + this.value + '\'' +
                " }";
    }
}
