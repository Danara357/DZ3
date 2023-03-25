public class Main {
    public static void main(String[] args) {
        task3();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsLp = 23;
        byte studentsAs = 27;
        byte studentsEa = 30;
        int studentsAll = studentsLp + studentsAs + studentsEa;
        short sheetsPaper = 480;
        int studentsPaper = sheetsPaper/studentsAll;
        System.out.println("На каждого ученика рассчитано " + studentsPaper + " листов бумаги.");
    }
}