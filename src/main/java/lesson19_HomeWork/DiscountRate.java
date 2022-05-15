package lesson19_HomeWork;

public class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;

    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    private final Customer customer = new Customer();
    public static double getServiceDiscountRate(String type){
      switch (type){
          case "PREMIUM": return 0.2;
          case "GOLD": return 0.15;
          case "SILVER": return 0.1;
      }
      return 0;
    }

    public static double getProductDiscountRate(String type) {
        switch (type){
            case "PREMIUM": return 0.1;
            case "GOLD": return 0.1;
            case "SILVER": return 0.1;
        }
        return 0;
    }
}
