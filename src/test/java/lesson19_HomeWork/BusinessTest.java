package lesson19_HomeWork;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

class BusinessTest {

    private static String CSV_PATH = "C:\\Local Disk (D)\\OMRE_AutomationClass\\Junit5\\src\\main\\resources\\lesson19_DiscountSystem.csv";
//    private static String CSV_PATH = "/lesson19_DiscountSystem.csv";

    @BeforeEach
    void createCustomer() {
        Customer customer = new Customer();
        customer.setName("Defaul user"); //(String.valueOf(new Random(5)));
        customer.setMember(false);
        customer.setMemberType(null);
    }

    @ParameterizedTest(name = "Name {0}, member {1}, Member Type {2}, date {3}, service expense {4}, product expense {5}, total expense {6}")
    @MethodSource("getExpense")
    void tinhTongExpense(String name, boolean member, String memberType, Date date, double serviceExpense, double productExpense, double expectedTotalExpense){
        Visit visit = new Visit(date, new Customer( name, member, memberType));
        Assertions.assertEquals(expectedTotalExpense, visit.getTotalExpense());
    }

    private final static Stream<Arguments> getExpense() throws IOException {
        URL url = Thread.currentThread().getContextClassLoader().getResource(CSV_PATH);
        Reader in = new FileReader(url.getPath());
        List<CSVRecord> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in).getRecords();
        Stream<Arguments> mData = tmp.stream().limit(6).map(r -> Arguments.of(r.get(0), r.get(1), r.get(2), r.get(3),
                r.get(4),r.get(5),r.get(6) ));
        return mData;
    }

}