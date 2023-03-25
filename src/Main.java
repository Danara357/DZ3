public class Main {
    public static void main(String[] args) {
        task8();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        double differenceSalaryMasha = newSalaryMasha - salaryMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей.");
        double differenceSalaryDenis = newSalaryDenis - salaryDenis;
        System.out.println ("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей.");
        double differenceSalaryKristina = newSalaryKristina - salaryKristina;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей.");
    }
}
