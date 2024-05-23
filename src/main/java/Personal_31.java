interface Car3{
    void move();

}
interface Cannon2{
    void fire();

}

interface Flare{
    void flare();

}

class Tank2 implements Car3, Cannon2, Flare {
    @Override
    public void move() {         //interface 이므로 Override 가 아닌 implement 로 사용. 어노테이션은 동일하게 Override 로 표기되는 듯.//
        System.out.println("탱크 전진.");
    }

    @Override
    public void fire() {
        System.out.println("탱크 주포 발사.");
    }

    @Override
    public void flare() {
        System.out.println("플레어 작동.");
    }
}

public class Personal_31 {
    public static void main(String[] args){
        Tank2 tank = new Tank2();
        tank.move();
        tank.fire();
        tank.flare();

    }
}
