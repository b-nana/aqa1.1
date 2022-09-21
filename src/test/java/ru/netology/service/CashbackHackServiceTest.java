package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTellToBuyFor100If900() {

        int amount = 900;
        CashbackHackService cashbackService = new CashbackHackService();

        int actual = cashbackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldTellToBuyFor1000If0() {

        int amount = 0;
        CashbackHackService cashbackService = new CashbackHackService();

        int actual = cashbackService.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldNotTellToBuyIf1000() {

        int amount = 1000;
        CashbackHackService cashbackService = new CashbackHackService();

        int actual = cashbackService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }
}