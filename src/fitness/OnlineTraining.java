package fitness;

import java.util.ArrayList;
import java.util.List;

public class OnlineTraining implements Observable {

    private Boolean areVisitorsDown;

    private List<Observer> onlineVisitors = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.onlineVisitors.add(observer);
        observer.setOnlineVisitor(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.onlineVisitors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.onlineVisitors) {
            observer.update();
        }
    }

    @Override
    public Boolean getUpdate() {
        return this.areVisitorsDown;
    }

    public void setCurrentStateOfOnlineVisitor(Boolean areVisitorsDown) {
        this.areVisitorsDown = areVisitorsDown;
        this.notifyObservers();
    }
}
