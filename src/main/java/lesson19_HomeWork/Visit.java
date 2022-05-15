package lesson19_HomeWork;

import java.util.Date;

public class Visit extends Customer {

    Date date;
    double serviceExpense;
    double productExpense;
    Customer customer;

    public Visit(Date date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalExpense(){
        double productExpenseFinal = productExpense*(1-DiscountRate.getProductDiscountRate(customer.getMemberType()));
        double serviceExpenseFinal = serviceExpense*(1-DiscountRate.getServiceDiscountRate(customer.getMemberType()));
        double totalExpense = productExpenseFinal + serviceExpenseFinal;
        return Math.round(totalExpense*1000)/1000;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", customer=" + customer +
                '}';
    }
}
