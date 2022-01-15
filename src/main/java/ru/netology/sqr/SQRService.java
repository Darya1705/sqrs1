package ru.netology.sqr;

public class SQRService {

    public int sqrtSquare(int min, int max) {
        int count = 0;
        for (int i = 10; i < 99; i = i + 1) {
            if (i * i > min) {
                if (i * i < max) {

                    count = count + 1;
                }
            }
        }

        return count;
    }
}
