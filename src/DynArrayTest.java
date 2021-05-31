import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {
    DynArray<Integer> emptyarray = new DynArray<>();
    final Integer a = 2;
    final Integer b = 4;
    final Integer c = 5;
    final Integer d = 8;


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
        emptyarray.addLast(a);
        assertEquals(1, emptyarray.size());
        assertEquals(1, emptyarray.capacity());
        emptyarray.addLast(b);
        assertEquals(2, emptyarray.size());
        assertEquals(2, emptyarray.capacity());
        emptyarray.addLast(c);
        assertEquals(3, emptyarray.size());
        assertEquals(4, emptyarray.capacity());

    }

    @org.junit.jupiter.api.Test
    void capacity() {
        assertEquals(0, emptyarray.size());
        assertEquals(1, emptyarray.capacity());
        emptyarray.addLast(a);
        assertEquals(1, emptyarray.size());
        assertEquals(1, emptyarray.capacity());
        emptyarray.addLast(b);
        assertEquals(2, emptyarray.size());
        assertEquals(2, emptyarray.capacity());
        emptyarray.addLast(c);
        assertEquals(3, emptyarray.size());
        assertEquals(4, emptyarray.capacity());
    }

    @org.junit.jupiter.api.Test
    void get() {
        emptyarray.addLast(a);
        assertEquals(a, emptyarray.get(0));
        emptyarray.addLast(b);
        assertEquals(a, emptyarray.get(0));
        assertEquals(b, emptyarray.get(1));
    }

    @org.junit.jupiter.api.Test
    void set() {
        emptyarray.addLast(a);
        emptyarray.addLast(b);
        emptyarray.addLast(c);
        emptyarray.set(1, d);
        assertEquals(d, emptyarray.get(1));
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