package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test

    public void shouldSqrtSquareCeiling () {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.sqrtSquare(min,max);

        assertEquals(expected, actual);
    }


}