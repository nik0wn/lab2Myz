public class Operation {
    private String mnemonic;
    private Operand operand1;
    private Operand operand2;

    public Operation(String mnemonic, Operand operand1, Operand operand2) {
        this.mnemonic = mnemonic;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public Operand getOperand1() {
        return operand1;
    }

    public Operand getOperand2() {
        return operand2;
    }
}