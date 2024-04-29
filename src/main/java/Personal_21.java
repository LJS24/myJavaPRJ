import java.util.Scanner;
public class Personal_21{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int before = s.nextInt();
        int after = s.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
            money+=after;
            month++;
        }

        System.out.println(month);
    }
}