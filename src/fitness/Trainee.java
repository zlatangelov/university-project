package fitness;

public class Trainee {

    private Boolean isLieDown;

    public void lieDown() {
        System.out.println("Trainee lies down!");
        this.isLieDown = true;
    }

    public void standUp(){
        System.out.println("Trainee stands up!");
        this.isLieDown = false;
    }
}
