package day5_5_observer_pattern;

class Event {
    private final String fileName;

    public Event(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

class AddEvent extends Event {
    public AddEvent(String fileName) {
        super(fileName);
    }
}

class DelEvent extends Event {
    public DelEvent(String fileName) {
        super(fileName);
    }
}

public interface IWatcher<T extends Event> {
    abstract void onEvent(T event);
}
