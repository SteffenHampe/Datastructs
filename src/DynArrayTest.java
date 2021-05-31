import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {
    DynArray<Integer> emptyarray = new DynArray<>();


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emptyarray = new DynArray<>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verdoppeln() {
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0, emptyarray.size());
        assertEquals(1, emptyarray.capacity());

    }

    @org.junit.jupiter.api.Test
    void capacity() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }

    @org.junit.jupiter.api.Test
    void addFirst() {
    }

    @org.junit.jupiter.api.Test
    void addLast() {
    }

    @org.junit.jupiter.api.Test
    void removeFirst() {
    }

    @org.junit.jupiter.api.Test
    void removeLast() {
    }
}