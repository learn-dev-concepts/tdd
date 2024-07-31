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
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquals() {
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(10)));
    }
}
