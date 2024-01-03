package lib;

import java.util.concurrent.atomic.AtomicInteger;

public class IdFactory {
    private final AtomicInteger currentId = new AtomicInteger(0);

    public int generateId() {
        return currentId.getAndIncrement();
    }
}
