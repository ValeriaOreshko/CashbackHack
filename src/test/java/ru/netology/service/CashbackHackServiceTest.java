package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;

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
            int amount = 2000;

            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }
    }