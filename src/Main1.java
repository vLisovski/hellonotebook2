import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side of square:");
        Square sq = new Square(scanner.nextInt());
        sq.area();
        sq.diagonal();
        sq.perimeter();
    }
}
