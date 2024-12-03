package day5_5_observer_pattern;

import java.nio.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;

import java.nio.file.WatchService;
import java.util.HashSet;
import java.util.Set;

public class Monitor {

    private final Set<IWatcher<Event>> watchers = new HashSet();

    private enum EventType {
        ADDED, DELETED
    }

    private String path;

    public Monitor(String path) throws FileNotFoundException {
        if (!(new File(path)).exists()) {
            throw new FileNotFoundException();
        }
        this.path = path;

    }

    public void addListener(IWatcher<Event> listener) {
        if (listener != null) {
            watchers.add(listener);
        }
    }

    public void removeListener(IWatcher<Event> listener) {
        if (listener != null) {
            watchers.remove(listener);
        }
    }

    void work() throws IOException, InterruptedException {
        WatchService watch = FileSystems.getDefault().newWatchService();
        Path pathh = Paths.get(this.path);
        pathh.register(watch,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE
        );

        WatchKey key = watch.take();
        while (true) {
            for (WatchEvent ev : key.pollEvents()) {
                if (ev.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    fireAdded(ev.context().toString());
                } else if (ev.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                    fireDeleted(ev.context().toString());
                }
            }
            key.reset();
        }
    }

    void fire(EventType eventType, String fileName) {
        Event ev = switch (eventType) {
            case EventType.ADDED ->
                new AddEvent("added " + fileName);
            case EventType.DELETED ->
                new DelEvent("deleted " + fileName);
        };
        watchers.stream().forEach(listener -> listener.onEvent(ev));
    }

    public void fireAdded(String fileName) {
        fire(EventType.ADDED, fileName);
    }

    public void fireDeleted(String fileName) {
        fire(EventType.DELETED, fileName);
    }
}
