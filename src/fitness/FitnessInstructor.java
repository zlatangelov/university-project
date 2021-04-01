package fitness;

import java.util.ArrayList;
import java.util.List;

public class FitnessInstructor {

    private boolean isTrainerDown;

    private List<Observer> onlineVisitors = new ArrayList<>();

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void standUp() {
        System.out.println("FitnessInstructor stands up!");
        this.isTrainerDown = false;
        this.command.execute();
    }

    public void lieDown() {
        System.out.println("FitnessInstructor lies down!");
        this.isTrainerDown = true;
        this.command.execute();
    }

}
