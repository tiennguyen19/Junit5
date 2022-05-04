package lesson16_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HinhTruTest {
    HinhTru htru = new HinhTru(2.334,-7.234);

    @Test
    void tinhTheTich() {
        double expected = 383.714;
        double actual = htru.tinhTheTich();
        Assertions.assertEquals(expected, actual,0.001);
    }

    @Test
    void tinhDienTichXungQuanh() {
        double expected = 106.086;
        double actual = htru.tinhDienTichXungQuanh();
        Assertions.assertEquals(expected, actual,0.001);
    }

    @Test
    void tinhDienTichToanPhan() {
        double expected = 434.89;
        double actual = htru.tinhDienTichToanPhan();
        Assertions.assertEquals(expected, actual,0.001);
    }
}