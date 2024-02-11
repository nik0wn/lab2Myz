import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Operation> commands = new ArrayList<>();
        commands.add(new Operation("mov", new Operand(OperandType.REGISTER, "AX"), new Operand(OperandType.MEMORY, "BX")));
        commands.add(new Operation("cmp", new Operand(OperandType.REGISTER, "AX"), new Operand(OperandType.IMMEDIATE, "10")));

        MachineOperationProcessor processor = new MachineOperationProcessor();
        String result = processor.processCommands(commands);
        System.out.println(result);
    }
}
