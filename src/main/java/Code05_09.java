import java.util.Scanner;
public class Code05_09 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int select;

        System.out.print("1~3 중에 하나를 선택하세요==> ");
        select = s.nextInt();

        switch(select){
            case 1:
                System.out.print("1을 선택했습니다.");
                break;

            case 2:
                System.out.print("2를 선택했습니다.");
                break;

            case 3:
                System.out.print("3을 선택했습니다.");
                break;

            default:
                System.out.print("잘못된 선택입니다.");
        }
    s.close();
    }
}