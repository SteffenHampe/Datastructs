import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {
    DynArray<Integer> emptyarray = new DynArray<>();
    final Integer a = 2;
    final Integer b = 4;
    final Integer c = 5;
    final Integer d = 8;
    final Integer e = 12;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emptyarray = new DynArray<>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void halbieren() {
        emptyarray.addLast(a);
        emptyarray.addLast(b);
        emptyarray.addLast(c);
        emptyarray.addLast(d);
        assertEquals(4, emptyarray.size());
        assertEquals(4, emptyarray.capacity());
        emptyarray.addLast(e);
        assertEquals(5, emptyarray.size());
        assertEquals(8, emptyarray.capacity());
        emptyarray.removeLast();
        emptyarray.removeLast();
        emptyarray.removeLast();
        emptyarray.removeLast();
        assertEquals(1, emptyarray.size());
        assertEquals(2, emptyarray.capacity());
    }

    @org.junit.jupiter.api.Test
    void verdoppeln() {
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
        emptyarray.addFirst(a);
        assertEquals(a, emptyarray.get(0));
        emptyarray.addFirst(b);
        assertEquals(2, emptyarray.capacity());
        assertEquals(2, emptyarray.size());
        assertEquals(b, emptyarray.get(0));
        assertEquals(a, emptyarray.get(1));
        emptyarray.addFirst(c);
        assertEquals(c, emptyarray.get(0));
        assertEquals(b, emptyarray.get(1));
        assertEquals(a, emptyarray.get(2));
    }

    @org.junit.jupiter.api.Test
    void addLast() {
        emptyarray.addLast(a);
        assertEquals(a, emptyarray.get(0));
        emptyarray.addLast(b);
        assertEquals(2, emptyarray.capacity());
        assertEquals(2, emptyarray.size());
        assertEquals(a, emptyarray.get(0));
        assertEquals(b, emptyarray.get(1));
        emptyarray.addLast(c);
        assertEquals(a, emptyarray.get(0));
        assertEquals(b, emptyarray.get(1));
        assertEquals(c, emptyarray.get(2));
    }

    @org.junit.jupiter.api.Test
    void removeFirst() {
    }

    @org.junit.jupiter.api.Test
    void removeLast() {
    }
}