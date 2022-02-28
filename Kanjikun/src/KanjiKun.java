import java.util.Scanner;

public class KanjiKun {
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
        int equalTotalPrice = totalPrice / 2;

        int oneManPrice = equalTotalPrice / numberOfMale;
        int oneWomanPrice = equalTotalPrice / numberOfFemale;

        System.out.format("男性:%d円\n女性:%d円",oneManPrice,oneWomanPrice);
    }
}
