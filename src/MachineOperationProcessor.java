import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class MachineOperationProcessor {
    private List<BiConsumer<Operation, StringBuilder>> operations;

    public MachineOperationProcessor() {
        operations = new ArrayList<>();
        operations.add(this::processMov);
        operations.add(this::processCmp);
    }

    private void processMov(Operation operation, StringBuilder output) {
        if ("mov".equals(operation.getMnemonic())) {
            output.append(String.format("MOV %s, %s\n", operation.getOperand1(), operation.getOperand2()));
        }
    }

    private void processCmp(Operation operation, StringBuilder output) {
        if ("cmp".equals(operation.getMnemonic())) {
            output.append(String.format("CMP %s, %s\n", operation.getOperand1(), operation.getOperand2()));
        }
    }

    public String processCommands(List<Operation> commands) {
        StringBuilder output = new StringBuilder();
        for (Operation command : commands) {
            operations.forEach(op -> op.accept(command, output));
        }
        return output.toString();
    }
}
