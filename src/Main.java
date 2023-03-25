public class Main {
    public static void main(String[] args) {
        task5();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte paintTotal = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        int oneClassPainte = whitePaintClass + brownPaintClass;
        int classTotal = paintTotal/oneClassPainte;
        int whitePaintTotal = classTotal * whitePaintClass;
        int brownPaintTotal = classTotal * brownPaintClass;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски.");
    }
}