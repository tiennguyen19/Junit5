package lesson19_HomeWork;

public class Customer {
    String name;
    Boolean member=true;
    static String memberType;

    public Customer(){}

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType=" + memberType +
                '}';
    }
}
