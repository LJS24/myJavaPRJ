
class Parent3 {
    public int cal(int a, int b) {
        return a + b;
    }
}

// Child 클래스
class Child2 extends Parent3 {
    @Override
    public int cal(int a, int b) {
        // 예시로 곱셈으로 재정의합니다.
        return a * b;
    }
}

public class Personal_43{
    public static void main(String[] args) {

        Parent3 parent = new Parent3();
        Child2 child = new Child2();

        int parentResult = parent.cal(3, 4);
        int childResult = child.cal(3, 4);

        System.out.println("Parent result: " + parentResult);
        System.out.println("Child result: " + childResult);
    }
}



