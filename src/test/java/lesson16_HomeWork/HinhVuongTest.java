package lesson16_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class HinhVuongTest {
    @DisplayName("Show exception if side is invalid")
    @ParameterizedTest(name = "Side {0} khong hop le")
    @CsvFileSource(resources = "/HinhVuong_InvalidData.csv", numLinesToSkip = 1)
    void throwExceptioin(long side){
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> {
            HinhVuong hv = new HinhVuong(side);
        });
    }
    // Tinh Chu vi
    @ParameterizedTest(name = "side {0}, Chu Vi {1}, Dien Tich {2}")
    @CsvFileSource(resources = "/HinhVuong_ValidData.csv", numLinesToSkip = 1)
    void tinhChuVi(long side, long expectedChuVi) {
        HinhVuong hv = new HinhVuong(side);
        hv.setSide(side);
        long actual = (long)Math.round(hv.tinhChuVi()*1000)/1000;
        Assertions.assertEquals(expectedChuVi, actual, 0.000001);
    }

    // Tinh Dien Tich
    @ParameterizedTest(name = "side {0}, Dien Tich {2}")
    @CsvFileSource(resources = "/HinhVuong_ValidData.csv", numLinesToSkip = 1)
    void tinhDienTich(long side, long chuVi, long expectedDienTich) {
        HinhVuong hv = new HinhVuong(side);
        hv.setSide(side);
        long actual = (long) Math.round(hv.tinhDienTich()*1000)/1000;
        Assertions.assertEquals(expectedDienTich, actual, 0.000001);
    }
}