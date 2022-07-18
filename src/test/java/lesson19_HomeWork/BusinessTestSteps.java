package lesson19_HomeWork;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BusinessTestSteps {

    private Visit visit;
    private Customer customer;
    private double tmp;

    @Given("Khach hang la <MemberType>")
    public void khachHangLaMemberType(String memberType) {
        customer.setMemberType(memberType);
    }

    @When("Tinh gia tri <ServiceExpense> va <ProductExpense> cua khach hang <MemberType>")
    public void tinhGiaTriServiceExpenseVaProductExpenseCuaKhachHangMemberType(double ServiceExpense, double ProductExpense, String memberType) {
        tmp = visit.getTotalExpense();

    }

    @Then("Tong chi phi bang <double>")
    public void tongChiPhiBangTotalExpense(double result) {
        Assertions.assertEquals(result, tmp);
    }


}

