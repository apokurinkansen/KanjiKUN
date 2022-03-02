import java.util.Scanner;

public class KanjiKun {
    private int MAN_MORE_PRICE = 1000;
    private int DIVIDE_HUMAN = 2;
    private int totalPrice = 0;
    private int numberOfMale = 0;
    private int numberOfFemale = 0;

    Scanner scanner = new Scanner(System.in);

    KanjiKun(int x, int y, int z) {
        this.totalPrice = x;
        this.numberOfMale = y;
        this.numberOfFemale = z;
    }

    public void Calculation() {
        // int equalHumanTotalPrice = totalPrice / DIVIDE_HUMAN;
        // int oneManPrice = equalHumanTotalPrice / numberOfMale;
        // int oneWomanPrice = equalHumanTotalPrice / numberOfFemale;
        // System.out.format("男性:%d円\n女性:%d円", oneManPrice, oneWomanPrice);

        int manMoreTotalPrice = numberOfMale * MAN_MORE_PRICE;
        int humanTotalPrice = (totalPrice - manMoreTotalPrice) / DIVIDE_HUMAN;
        int kadai2Man = (humanTotalPrice + manMoreTotalPrice) / numberOfMale;
        int kadai2Weman = humanTotalPrice / numberOfFemale;

        System.out.format("男性:%d円\n女性:%d円", kadai2Man, kadai2Weman);
    }
}
