class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
        System.out.println("xPos : " + xPos + " / yPos : " + yPos);
    }

}
class HouseRabbit extends Rabbit{
    String owner;

    @Override
    void move(int x, int y) {
        System.out.println("이것은 덮어쓰기한 이동 함수입니다.");
    }

    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");


    }
}

class mountainRabbit extends Rabbit{
    String mountain;
    void eatWildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");

    }
}




public class Code08_0203 {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        HouseRabbit hrabbit = new HouseRabbit();
        mountainRabbit mrabbit = new mountainRabbit();

        hrabbit.shape = "삼각형";
        hrabbit.owner = "난쟁이";
        hrabbit.move(100, 100);
        hrabbit.eatFeed();

        mrabbit.shape = "삼각형";
        mrabbit.mountain = "난쟁이";
        mrabbit.move(200, 200);
        mrabbit.eatWildglass();


    }
}
