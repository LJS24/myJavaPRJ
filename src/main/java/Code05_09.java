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
                break;  /*이거 없으면 안 끝나서 모든 경우가 실행된다.*/

            default:  /*else if문의 else와 같음.*/
                System.out.print("잘못된 선택입니다.");  /*if else문은 하나 실행하고 다른 경우를 지나가는 방식이며, switch case문은 하나 실행하고 함수에서 빠져나가는 방식.*/
        }
    s.close();
    }
}
