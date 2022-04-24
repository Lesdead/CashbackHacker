package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual,expected);
    }
}