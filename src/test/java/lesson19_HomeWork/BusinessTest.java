package lesson19_HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class BusinessTest {

    private Customer customer = null;

    @BeforeEach
    void initCustomer() {
        customer = new Customer("None");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/lesson19_DiscountSystem.csv",numLinesToSkip = 1)
    void tinhTongExpense(String name, boolean member, String memberType, String date, String serviceExpense, String productExpense, double expectedTotalExpense) throws ParseException {
        customer.setName(name);
        customer.setMember(member);
        customer.setMemberType(memberType);
        Date d = new SimpleDateFormat("MM/dd/yyyy").parse(date);

        Visit visit = new Visit(d, customer);

        double cServiceExpense = 0, cProductExpense = 0;
        if (serviceExpense != null) {
            cServiceExpense = Double.parseDouble(serviceExpense);
        }
        if (productExpense != null) {
            cProductExpense = Double.parseDouble(productExpense);
        }

        visit.setServiceExpense(cServiceExpense);
        visit.setProductExpense(cProductExpense);
        double actualResult = visit.getTotalExpense();
        Assertions.assertEquals(expectedTotalExpense, actualResult,0.009);
    }
}