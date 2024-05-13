class Car{
    private int speed;
    private String color;

    Car(int speed) {
        this.speed = speed;

    }

    void setCar(int speed, String color){
        this.speed = speed;
        this.color = color;

    }
}

public class Quiz_02040513 {
    public static void main(String[] args){
        Car car1 = new Car(100);

    }
}
