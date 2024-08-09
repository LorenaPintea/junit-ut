package springboot.junitut;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    private ArrayMethods arrayMethods;

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is created just to test @BeforeAll Annotation");
    }

    @BeforeEach
    void setUp() {
        //Initialize object before the tests are run
        arrayMethods = new ArrayMethods();
    }

    @Test
    void getIndex() {
        //compare actual result with expected result
        assertEquals(3, arrayMethods.getIndex(new int[] {1, 2, 3, 4, 5}, 4));
        assertEquals(-1, arrayMethods.getIndex(new int[] {1, 2, 3, 4, 5}, 6));

        // using assertAll()
        assertAll(
                ()-> assertEquals(2, arrayMethods.getIndex(new int[] {1, 2, 3, 4, 5}, 3)),
                () -> assertEquals(-1, arrayMethods.getIndex(new int[] {1, 2, 3, 4, 5}, 0))
        );
    }

    @Test
    void numberExists() {
        assertTrue(arrayMethods.numberExists(new int[] {1, 2, 3, 4, 5}, 3));
        assertFalse(arrayMethods.numberExists(new int[] {1, 2, 3, 4, 5}, 0));
    }

    @Test
    void reverseArray() {
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, arrayMethods.reverseArray(new int[] {1, 2, 3, 4, 5}));
    }

    //assertNull() and assertNotNull()
    //fail()

    @Test
    void printElement() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayMethods.printElement(new int[] {1, 2}, 3));
    }

    @Test
    @Disabled
    void testDisabled() {
        fail("Not yet implemented");
    }

    @AfterEach
    void tearDown() {
        arrayMethods = null;
        System.out.println("Testing @AfterEach annotation");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This is created just to test @AfterAll Annotation");
    }

}