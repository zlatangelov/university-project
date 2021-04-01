package fitness;

public class OnlineVisitor implements Observer {

    private String name;
    private Observable onlineVisitor;

    public OnlineVisitor(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Boolean currentStateOfTheOnlineVisitor = this.onlineVisitor.getUpdate();
        if(currentStateOfTheOnlineVisitor) {
            System.out.println(this.name + " lies down");
        } else {
            System.out.println(this.name + " stands up");
        }

    }

    @Override
    public void setOnlineVisitor(Observable onlineVisitor) {
        this.onlineVisitor = onlineVisitor;
    }
}
