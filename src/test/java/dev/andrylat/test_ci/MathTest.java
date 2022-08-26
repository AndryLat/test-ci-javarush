package dev.andrylat.test_ci;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void throw_exception_when_first_arg_is_null() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Math().add(null, 1));
    }

    @Test
    void calculate_correct() {
        int expected = 10;
        int actual = new Math().add(2,8);

        Assertions.assertEquals(expected, actual);
    }
}