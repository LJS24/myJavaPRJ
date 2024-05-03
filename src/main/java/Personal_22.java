import java.util.Scanner;
public class Personal_22{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = s.nextLine();

        System.out.print("문자 : ");
        char ch = s.nextLine().charAt(0);

        char[] arr = new char[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        int count = 0;
        System.out.print("application에 i가 존재하는 위치(인덱스) : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("i 개수 : " + count);
        s.close();
    }
}