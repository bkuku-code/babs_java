package com.CaptainCook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void testThatMethodReturnsMaximumSum(){
        int[] array = {6,2,3,4,5,1};
        assertEquals(20, Kata.findMaxSum(array));
    }

    @Test
    void testThatMethodReturnsMinimumSum(){
        int[] array = {6,2,3,4,5,1};
        assertEquals(15, Kata.findMinSum(array));
    }
}