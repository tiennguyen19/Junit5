package lesson19_HomeWork;

import java.util.Date;

public class Visit{

    Date date;
    private double serviceExpense;
    private double productExpense;
    Customer customer;

    public Visit(){}
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
        double productExpenseFinal = getProductExpense()*(1-DiscountRate.getProductDiscountRate(customer.getMemberType()));
        double serviceExpenseFinal = getServiceExpense()*(1-DiscountRate.getServiceDiscountRate(customer.getMemberType()));
        double totalExpense = productExpenseFinal + serviceExpenseFinal;
        return totalExpense;
        //return Math.round(totalExpense*1000)/1000;
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
