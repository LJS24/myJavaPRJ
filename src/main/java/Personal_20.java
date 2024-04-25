import java.util.Scanner;

class Rabbit{
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y){
        xPos = x;
        yPos = y;
    }
}
public class Personal_20 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Rabbit rabbit;
        int userX, userY;

        rabbit = new Rabbit();
        rabbit.shape = "토끼";
        int num=1;
        while(num<10){
            System.out.print("토끼가 이동할 X 좌표-> ");
            userX = s.nextInt();
            System.out.print("토끼가 이동할 Y 좌표-> ");
            userY = s.nextInt();
            rabbit.setPosition(userX, userY);
            System.out.printf("** 토끼의 현재 위치는 (%d, %d)입니다.\n", userX, userY);
            num+=1;
        }
        System.out.print("토끼가 힘이 다 빠져버렸네요..");
    }
}
