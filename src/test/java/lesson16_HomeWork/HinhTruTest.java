package lesson16_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class HinhTruTest {

    @DisplayName("Show exception if side is invalid")
    @ParameterizedTest(name = "Chieu cao {0}, ban kinh day {1} khong hop le")
    @CsvFileSource(resources = "/HinhTru_InvalidData.csv", numLinesToSkip = 1)
    void throwExceptioin(double chieuCao, double banKinhDay){
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> {
            HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
        });
    }

    @ParameterizedTest(name = "Chieu cao {0}, Ban kinh day {1}, The tich {4}")
    @CsvFileSource(resources = "/HinhTru_ValidData.csv", numLinesToSkip = 1)
    void tinhThetich(double chieuCao, double banKinhDay, double dientich1, double dientich2, double expectedTheTich) {
        HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
        double actual = (double)Math.round(hTru.tinhTheTich()*1000)/1000;
        Assertions.assertEquals(expectedTheTich, actual, 0.000001);
    }

    @ParameterizedTest(name = "Chieu cao {0}, Ban kinh day {1}, Dien tich xung quanh {2}")
    @CsvFileSource(resources = "/HinhTru_ValidData.csv", numLinesToSkip = 1)
    void tinhDienTichXungQuanh(double chieuCao, double banKinhDay, double expectedDienTichXungQuanh) {
        HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
        double actual = (double)Math.round(hTru.tinhDienTichXungQuanh()*1000)/1000;
        Assertions.assertEquals(expectedDienTichXungQuanh, actual, 0.000001);
    }

    @ParameterizedTest(name = "Chieu cao {0}, Ban kinh day {1}, Dien tich toan phan {3}")
    @CsvFileSource(resources = "/HinhTru_ValidData.csv", numLinesToSkip = 1)
    void tinhDienTich(double chieuCao, double banKinhDay, double __, double expectedDienTichToanPhan) {
        HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
        double actual = (double) Math.round(hTru.tinhDienTichToanPhan()*1000)/1000;
        Assertions.assertEquals(expectedDienTichToanPhan, actual, 0.000001);
    }
}
