package lesson16_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HinhTronTest {

    HinhTron ht = new HinhTron(0.512);

    @org.junit.jupiter.api.Test
    void tinhChuVi() {
        double expected = 3.217;
        double actual = Math.round(ht.tinhChuVi()*1000)/1000;
            Assertions.assertEquals(expected, actual, 0.000001);
        }

    @org.junit.jupiter.api.Test
    void tinhDienTich() {
        double expected = 0.824;
        double actual = Math.round(ht.tinhDienTich()*1000)/1000;
            Assertions.assertEquals(expected, actual, 0.000001);
    }
}