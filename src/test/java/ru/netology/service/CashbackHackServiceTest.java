package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
        public void shouldTellAmountToAdd() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1100;

            int actual = service.remain(amount);
            int expected = 900;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldNotTellAmountToAdd() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;

            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }
    }