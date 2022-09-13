import java.util.Scanner;

public class ConverterBitcoin {
    public static void main(String[] args) {
        // курс Bitcoin до $
        System.out.println("What is Bitcoin price today?");
        float btc = new Scanner(System.in).nextInt();

        // сума $, яку хочете обміняти
        System.out.println("How much $ do you have?");
        float usd = new Scanner(System.in).nextInt();

        // обробка даних
        float result = usd / btc;

        // виведення результату
        System.out.println("You can buy " + result + " BTC");

    }
}
