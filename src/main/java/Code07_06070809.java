class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y){
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos: "+ this.xPos+" / yPos: "+ this.yPos);
    }
}





public class Code07_06070809 {
    public static void main(String[] args){
        Rabbit rb1 = new Rabbit();
        Rabbit rb2 = new Rabbit();
        Rabbit rb3 = new Rabbit();

        rb1.shape = "원";
        rb2.shape = "삼각형";
        rb3.shape = "토끼";

        rb1.setPosition(100, 100);
        rb2.setPosition(-100, 100);
        rb3.setPosition(0, 100);

        System.out.println("rb1.shape: "+ rb1.shape);
        System.out.println("rb2.shape: "+ rb2.shape);
        System.out.println("rb3.shape: "+ rb3.shape);
    }
}
