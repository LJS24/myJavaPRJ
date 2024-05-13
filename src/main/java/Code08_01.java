class Rabbit5{
    String shape;
    int xPos;
    int yPos;
    static int count;
    Rabbit5(){
        count++;  //new로 올라갈 때마다 실행되어 Rabbit의 수를 세 주는 것.//

    }
}
public class Code08_01 {
    public static void main(String[] args){
        System.out.println("객체 생성 전의 총 토끼 수==>" + Rabbit5.count);

        Rabbit5 rabbits1 = new Rabbit5(); //항상 new는 객체 단위로 메모리에 올린다. //
        System.out.println("토끼 객체 1 생성 후 총 토끼 수==>" + Rabbit5.count);

        Rabbit5 rabbits2 = new Rabbit5();
        System.out.println("토끼 객체 2 생성 후 총 토끼 수==>" + Rabbit5.count);


    }
}
