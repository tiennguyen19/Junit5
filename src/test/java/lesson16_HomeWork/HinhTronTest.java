package lesson16_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class HinhTronTest {

    // Validate invalid radius
    @DisplayName("Show exception if radius is invalid")
    @ParameterizedTest(name = "radius {0} khong hop le")
    @CsvFileSource(resources = "/HinhTron_InvalidData.csv", numLinesToSkip = 1)
    void throwExceptioin(double radius){
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> {
            HinhTron ht = new HinhTron(radius);
        });
    }
    // Tinh Chu vi
    @ParameterizedTest(name = "Radius {0}, Chu Vi {1}, Dien Tich {2}")
    @CsvFileSource(resources = "/HinhTron_ValidData.csv", numLinesToSkip = 1)
    void tinhChuVi(double radius, double expectedChuVi) {
        HinhTron ht = new HinhTron(radius);
        ht.setR(radius);
        double actual = (double)Math.round(ht.tinhChuVi()*1000)/1000;
            Assertions.assertEquals(expectedChuVi, actual, 0.000001);
        }

    // Tinh Dien Tich
    @ParameterizedTest(name = "Radius {0}, Dien Tich {2}")
    @CsvFileSource(resources = "/HinhTron_ValidData.csv", numLinesToSkip = 1)
    void tinhDienTich(double radius, double chuVi, double expectedDienTich) {
        HinhTron ht = new HinhTron(radius);
        ht.setR(radius);
        double actual = (double) Math.round(ht.tinhDienTich()*1000)/1000;
            Assertions.assertEquals(expectedDienTich, actual, 0.000001);
    }
}