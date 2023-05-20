package ru.netology.sqr;

public class SqrtService {
    public int selection(int from, int to) {

        int x = 0;

        for (int i = 10; i < 100; i++) {
            if ((i * i >= from) & (i * i <= to)) {
                x++;
            }
        }
        return x;
    }

}
