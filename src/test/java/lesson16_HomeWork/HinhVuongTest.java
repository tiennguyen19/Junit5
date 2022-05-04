package lesson16_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HinhVuongTest {

    HinhVuong hv = new HinhVuong(2);
    HinhVuong hv1 = new HinhVuong(3);
//    HinhVuong hv2 = new HinhVuong(-1);
    HinhVuong hv3 = new HinhVuong(100);

    @Test
    void tinhChuVi() {
        int expected[] = {8, 12, 400};
        long actual[] = {hv.tinhChuVi(), hv1.tinhChuVi(), hv3.tinhChuVi()};
        for (int i =0; i<expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void tinhDienTich() {
        int expected = 4;
        long actual = hv.tinhDienTich();
        Assertions.assertEquals(expected, actual);
    }
}