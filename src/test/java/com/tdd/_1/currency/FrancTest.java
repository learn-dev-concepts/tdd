package com.tdd._1.currency;

import org.junit.Test;

import static org.junit.Assert.*;

// 테스트 작성하기
// 컴파일 되게 하기
// 실패하는지 확인하기
// 실행되도록 만들기
// 중복 제거

// -------------




public class FrancTest {

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquals() {
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(10)));
    }
}
