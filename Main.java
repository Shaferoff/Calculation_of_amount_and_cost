import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x, sum = 0, count = 0;
       for (int i = 1; i <= 5; i++ ) {
           x = sc.nextInt();
           if (x > 400) count++;
           sum = sum + x;
       }
        System.out.println("Количество дорогих товаров = " +count);
        System.out.println("Общая сумма покупок = " + sum);

    }

}