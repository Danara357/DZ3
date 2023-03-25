public class Main {
    public static void main(String[] args) {
        task4();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte MachinePerformance = 16;
        byte time = 2;
        int bottlesMinute = MachinePerformance/time;
        int for20 = bottlesMinute*20;
        System.out.println("За 20 минут машина произвела " +  for20 + " штук бутылок.");
        int forDay = bottlesMinute*24*60;
        System.out.println("За сутки машина произвела " +  forDay + " штук бутылок.");
        int forThreeDays = bottlesMinute*3*24*60;
        System.out.println("За 3 дня машина произвела " +  forThreeDays + " штук бутылок.");
        int forMonth = forDay*30;
        System.out.println("За месяц машина произвела " +  forMonth + " штук бутылок.");
    }
}