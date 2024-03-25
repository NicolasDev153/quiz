package quizes.q2.nikoloz_beridze_3.paint;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int taxes = 63 * 1000;
        int GasBills = 45;
        int electricityBills = 195 * 100;
        int parkingRent = 21 * 100;
        int waterBills = 98;

        int otherExpenses = taxes + waterBills + GasBills + electricityBills + parkingRent;
        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);

        System.out.println(totalExpenses / 100.0);
        System.out.println(profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        double profit = (pricePerCoffee * numCoffeeSold - totalCostOfBeans - otherExpenses) / 100.0;
        return profit;
    }
}
