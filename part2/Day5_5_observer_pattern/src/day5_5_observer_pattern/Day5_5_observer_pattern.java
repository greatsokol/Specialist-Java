package day5_5_observer_pattern;

import java.io.FileNotFoundException;
import java.io.IOException;

class Watcher implements IWatcher<Event> {
    private int id;
    
    public Watcher(int id) {
        this.id = id;
    }

    @Override
    public void onEvent(Event event) {
        System.out.println(id+" "+event.getFileName());
    }
}

public class Day5_5_observer_pattern {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        Monitor mon = new Monitor(".");
        
        Watcher listener1 = new Watcher(1);
        Watcher listener2 = new Watcher(2);

        mon.addListener(null);
        mon.addListener(listener1);
        mon.addListener(listener1);
        mon.addListener(listener2);
        mon.addListener(listener2);
        
        mon.addListener(event -> System.out.println("LAMBDA: "+event.getFileName()));
        
        mon.work();
    }

}
