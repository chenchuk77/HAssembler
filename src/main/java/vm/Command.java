package vm;

/**
 * Created by chenchuk on 10/14/17.
 */
public class Command {
    private CommandType commandType;
    private String operation;
    private String arg1;
    private Integer arg2;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public Integer getArg2() {
        return arg2;
    }

    public void setArg2(Integer arg2) {
        this.arg2 = arg2;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    @Override
    public String toString() {
        return "Command{" +
                "type='" + commandType + '\'' +
                '}';
    }
}
