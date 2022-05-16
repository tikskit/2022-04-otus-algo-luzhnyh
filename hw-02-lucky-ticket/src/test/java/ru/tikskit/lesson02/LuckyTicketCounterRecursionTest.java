package ru.tikskit.lesson02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LuckyTicketCounterRecursionTest {
    @Test
    public void test0() {

        TestCaseData testCaseData = TestCaseDataProvider.getTestCaseData(0);

        LuckyTicketCounter counter = new LuckyTicketCounterRecursion();
        long actual = counter.calc(testCaseData.digitsCount);
        assertThat(actual).isEqualTo(testCaseData.expectedValue);

        System.out.println("Ответ:" + actual);
    }

    @Test
    public void test1() {

        TestCaseData testCaseData = TestCaseDataProvider.getTestCaseData(1);

        LuckyTicketCounter counter = new LuckyTicketCounterRecursion();
        long actual = counter.calc(testCaseData.digitsCount);
        assertThat(actual).isEqualTo(testCaseData.expectedValue);

        System.out.println("Ответ:" + actual);
    }

    @Test
    public void test2() {

        TestCaseData testCaseData = TestCaseDataProvider.getTestCaseData(2);

        LuckyTicketCounter counter = new LuckyTicketCounterRecursion();
        long actual = counter.calc(testCaseData.digitsCount);
        assertThat(actual).isEqualTo(testCaseData.expectedValue);

        System.out.println("Ответ:" + actual);
    }

    @Test
    public void test3() {

        TestCaseData testCaseData = TestCaseDataProvider.getTestCaseData(3);

        LuckyTicketCounter counter = new LuckyTicketCounterRecursion();
        long actual = counter.calc(testCaseData.digitsCount);
        assertThat(actual).isEqualTo(testCaseData.expectedValue);

        System.out.println("Ответ:" + actual);
    }

    @Test
    public void test4() {

        TestCaseData testCaseData = TestCaseDataProvider.getTestCaseData(4);

        LuckyTicketCounter counter = new LuckyTicketCounterRecursion();
        long actual = counter.calc(testCaseData.digitsCount);
        assertThat(actual).isEqualTo(testCaseData.expectedValue);

        System.out.println("Ответ:" + actual);
    }

    @Test
    public void test5() {

        TestCaseData testCaseData = TestCaseDataProvider.getTestCaseData(5);

        LuckyTicketCounter counter = new LuckyTicketCounterRecursion();
        long actual = counter.calc(testCaseData.digitsCount);
        assertThat(actual).isEqualTo(testCaseData.expectedValue);

        System.out.println("Ответ:" + actual);
    }



}