package springboot.junitut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    @Test
    void getIndex() {
        //create the object of the class
        ArrayMethods arrayMethods = new ArrayMethods();

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
        ArrayMethods arrayMethods = new ArrayMethods();

        assertTrue(arrayMethods.numberExists(new int[] {1, 2, 3, 4, 5}, 3));
        assertFalse(arrayMethods.numberExists(new int[] {1, 2, 3, 4, 5}, 0));
    }

    @Test
    void reverseArray() {
        ArrayMethods arrayMethods = new ArrayMethods();

        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, arrayMethods.reverseArray(new int[] {1, 2, 3, 4, 5}));
    }

    //assertNull() and assertNotNull()
    //fail()

    @Test
    void printElement() {
        ArrayMethods arrayMethods = new ArrayMethods();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayMethods.printElement(new int[] {1, 2}, 3));
    }
}