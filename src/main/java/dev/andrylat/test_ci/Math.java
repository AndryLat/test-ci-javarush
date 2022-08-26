package dev.andrylat.test_ci;

public class Math {
    public Integer add(Integer a, Integer b) {
        if (a == null) {
            throw new IllegalArgumentException("first arg can't be null");
        }
        if (b == null) {
            throw new IllegalArgumentException("second arg can't be null");
        }
        if (((long) a + (long) b) > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("summ is so huge!");
        }

        return a + b;
    }
}
