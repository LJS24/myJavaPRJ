class Rabbittt{
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbittt(){
        count++;
    }
}


public class Personal_25 {
    public static void main(String[] args){
        System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbittt.count);

        Rabbittt rabitP = new Rabbittt();
        System.out.println("토끼 객체1 생성 전의 총 토끼 수 ==>" + Rabbittt.count);

        Rabbittt rabitQ = new Rabbittt();
        System.out.println("토끼 객체2 생성 전의 총 토끼 수 ==>" + Rabbittt.count);
    }
}
