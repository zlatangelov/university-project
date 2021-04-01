package fitness;

public class FitnessDemo {
    public static void main(String[] args) {
        FitnessInstructor trainer = new FitnessInstructor();
        Trainee trainee = new Trainee();

        Command lieDownCommand = new LieDownCommand(trainee);
        Command standUpCommand = new StandUpCommand(trainee);

        trainer.setCommand(lieDownCommand);
        trainer.lieDown();

        trainer.setCommand(standUpCommand);
        trainer.standUp();

        OnlineTraining onlineTraining = new OnlineTraining();
        Observer visitor1 = new OnlineVisitor("Zlato Angelov");
        Observer visitor2 = new OnlineVisitor("Stefan Stefanov");
        Observer visitor3 = new OnlineVisitor("Stefka Stefanova");

        onlineTraining.subscribe(visitor1);
        onlineTraining.subscribe(visitor2);
        onlineTraining.subscribe(visitor3);

        //go lie down
        onlineTraining.setCurrentStateOfOnlineVisitor(true);

        //stand up
        onlineTraining.setCurrentStateOfOnlineVisitor(false);



    }
}
