package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnCashbackIfAmountIs1000() {
       CashbackHackService cashbackHackService;
        cashbackHackService = new CashbackHackService();
       System.out.println();
       int amount=1000;
       System.out.println(0==amount);
        int actual = cashbackHackService.calculateCashback(amount);
        int expected=100;
        System.out.println(    );
assertEquals(expected, actual);
    }
}