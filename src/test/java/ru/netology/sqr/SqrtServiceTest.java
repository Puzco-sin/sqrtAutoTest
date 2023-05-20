package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files= "src/test/resources/sqrtData.csv")
    void soldAllNumbers(int from, int to, int expected) {
        SqrtService service = new SqrtService();

        int actual = service.selection(from, to);
        assertEquals(expected, actual);
    }

 //   @org.junit.jupiter.api.Test
 //   void soldNoNumbers() {
 //       SqrtService service = new SqrtService();
 //       int from = 0;
 //       int to = 99;
 //       int expected = 0;

 //        int actual = service.selection(from, to);
 //        assertEquals(expected, actual);
 //    }


}
