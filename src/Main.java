import java.util.Scanner;

/**
 * Created by KPS on 7/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("please enter another number");
        int b = scanner.nextInt();
        int w = a+b;
        int x = a-b;
        int y = a*b;
        int z = a/b;
        int q = a%b;
        System.out.println(w+"\n"+x+"\n"+y+"\n"+z+"\n"+q);


    }
}
