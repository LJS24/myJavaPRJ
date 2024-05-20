interface Car2{
    void move();

}
interface Cannon{
    void fire();

}

class Tank implements Car2, Cannon {
    @Override
    public void move() {         //interface 이므로 Override 가 아닌 implement 로 사용. 어노테이션은 동일하게 Override 로 표기되는 듯.//
        System.out.println("탱크가 앞으로 이동합니다.");
    }

    @Override
    public void fire() {
        System.out.println("탱크에서 대포를 발사합니다.");
    }
}



public class Code08_10 {
    public static void main(String[] args){
        Tank tank1 = new Tank();
        tank1.move();
        tank1.fire();

    }
}
