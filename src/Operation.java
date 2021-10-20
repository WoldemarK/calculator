public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLICATION("*"),
    DIVIDE("/");


    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public static Operation getOperation(String s){
        switch (s){
            case "+": return PLUS;
            case "-": return MINUS;
            case "/": return DIVIDE;
            case "*": return MULTIPLICATION;
        }
        return null;
    }

}
