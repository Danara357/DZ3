public class Main {
    public static void main(String[] args) {
        task6();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte bananaWeight = 80;
        int allBananasWeight = banana * bananaWeight;
        short milkTotal = 200;
        byte milkPortion = 100;
        byte milkWeightPortion = 105;
        int amountMilkPortion = milkTotal / milkPortion;
        int allMilkWeight = amountMilkPortion * milkWeightPortion;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int allIceCreamWeight = iceCream * iceCreamWeight;
        byte egg = 4;
        byte eggWeight = 70;
        int allEggWeight = egg * eggWeight;
        int sportsBreakfastWeight = allBananasWeight + allMilkWeight + allIceCreamWeight + allEggWeight;
        System.out.println("Вес спортзавтрака " + sportsBreakfastWeight + " грамм.");
        float sportsBreakfastWeightKilogram =  sportsBreakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака " + sportsBreakfastWeightKilogram + " килограмм.");
    }
}
