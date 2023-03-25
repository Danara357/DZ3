public class Main {
    public static void main(String[] args) {
        task7();
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte needResetKg = 7;
        int needResetGramm = needResetKg * 1000;
        short loseWeightMinimum = 250;
        short loseWeightMaximum = 500;
        int loseWeight = loseWeightMinimum + loseWeightMaximum;
        int loseWeightMedium = loseWeight / 2;
        int dayLoseWeightMinimum = needResetGramm / loseWeightMinimum;
        System.out.println(dayLoseWeightMinimum + " дней уйдет на похудение, если спортсмен будет терять каждый день по " +  loseWeightMinimum + " грамм.");
        int dayLoseWeightMaximum = needResetGramm / loseWeightMaximum;
        System.out.println(dayLoseWeightMaximum + " дней уйдет на похудение, если спортсмен будет терять каждый день по " +  loseWeightMaximum + " грамм.");
        int dayLoseWeightMedium = needResetGramm / loseWeightMedium;
        System.out.println("Потребуется в среднем " + dayLoseWeightMedium + " дней, чтобы добиться требуемого результата похудения.");
    }
}