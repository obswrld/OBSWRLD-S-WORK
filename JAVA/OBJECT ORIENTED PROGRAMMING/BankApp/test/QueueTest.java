import Queue.Queues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testQueueIsEmpty() {
        Queues queue = new Queues();
        assertTrue(queue.isEmpty());
    }
}
