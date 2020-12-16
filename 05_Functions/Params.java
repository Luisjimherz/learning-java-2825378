public class Params{
    public static double calcMealPrice(double listedPrice,
                                     double tipRate,
                                     double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        //calcMealPrice(15, .2, 0.08);
        //calcMealPrice(25, .18, 0.08);
        double total = calcMealPrice(100, .2,.08);
        System.out.println(total / 5);
    }
}