package lesson16_HomeWork;

import org.apache.commons.csv.CSVFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Stream;

public class HinhTruTest2 {

    @DisplayName("Show exception if side is invalid")
    @ParameterizedTest(name = "Chieu cao {0}, ban kinh day {1} nem ra exception {5}")
    @MethodSource("dataThrownException")
    void throwException(double chieuCao, double banKinhDay, String expectedException) {
        Exception e = Assertions.assertThrows(RuntimeException.class, () -> {
            HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
        });
        Assertions.assertEquals(expectedException, e.getMessage());
    }

    static Stream<Arguments> dataThrownException() throws IOException {
        Reader in = new FileReader("C:\\Local Disk (D)\\OMRE_AutomationClass\\Junit5\\src\\test\\resources\\HinhTru_ValidAndInvalidData.csv");
        Stream<Arguments> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in)
                .stream()
                .limit(6)
                .map(r -> Arguments.of(r.get(0), r.get(1), r.get(5)));
        return tmp;
}

//        @ParameterizedTest(name = "Chieu cao {0}, Ban kinh day {1}, The tich {4}")
//        @CsvFileSource(resources = "/HinhTru_ValidData.csv", numLinesToSkip = 1)
//        void tinhThetich(double chieuCao, double banKinhDay, double dientich1, double dientich2, double expectedTheTich) {
//            HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
//
//            double actual = (double)Math.round(hTru.tinhTheTich()*1000)/1000;
//            Assertions.assertEquals(expectedTheTich, actual, 0.000001);
//        }
//
//        @ParameterizedTest(name = "Chieu cao {0}, Ban kinh day {1}, Dien tich xung quanh {2}")
//        @CsvFileSource(resources = "/HinhTru_ValidData.csv", numLinesToSkip = 1)
//        void tinhDienTichXungQuanh(double chieuCao, double banKinhDay, double expectedDienTichXungQuanh) {
//            HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
//
//            double actual = (double)Math.round(hTru.tinhDienTichXungQuanh()*1000)/1000;
//            Assertions.assertEquals(expectedDienTichXungQuanh, actual, 0.000001);
//        }
//
//        @ParameterizedTest(name = "Chieu cao {0}, Ban kinh day {1}, Dien tich toan phan {3}")
//        @CsvFileSource(resources = "/HinhTru_ValidData.csv", numLinesToSkip = 1)
//        void tinhDienTich(double chieuCao, double banKinhDay, double __, double expectedDienTichToanPhan) {
//            HinhTru hTru = new HinhTru(chieuCao, banKinhDay);
//
//            double actual = (double) Math.round(hTru.tinhDienTichToanPhan()*1000)/1000;
//            Assertions.assertEquals(expectedDienTichToanPhan, actual, 0.000001);
//        }
}
