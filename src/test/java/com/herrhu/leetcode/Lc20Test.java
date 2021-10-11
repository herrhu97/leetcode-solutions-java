package com.herrhu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lc20Test {

    @Test
    public void testWithExample1() {
        Lc20 lc20 = new Lc20();
        String s = "()";
        assertEquals(true, lc20.solution(s));
    }

    @Test
    public void testWithExample2() {
        Lc20 lc20 = new Lc20();
        String s = "()[]{}";
        assertEquals(true, lc20.solution(s));
    }

    @Test
    public void testWithExample3() {
        Lc20 lc20 = new Lc20();
        String s = "(]";
        assertEquals(false, lc20.solution(s));
    }

    @Test
    public void testWithExample4() {
        Lc20 lc20 = new Lc20();
        String s = "([)]";
        assertEquals(false, lc20.solution(s));
    }

    @Test
    public void testWithExample5() {
        Lc20 lc20 = new Lc20();
        String s = "{[]}";
        assertEquals(true, lc20.solution(s));
    }
}
