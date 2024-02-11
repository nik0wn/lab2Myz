public class Operand {
    private OperandType type;
    private String value;

    public Operand(OperandType type, String value) {
        this.type = type;
        this.value = value;
    }

    public OperandType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        switch (type) {
            case REGISTER:
                return value;
            case MEMORY:
                return "[" + value + "]";
            case IMMEDIATE:
                return value;
            default:
                return "UNKNOWN";
        }
    }
}