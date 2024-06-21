class Parent1 {
    public int cal(int a, int b) {
        return a + b;
    }
}

// Child 클래스
public class Child extends Parent1 {
    @Override
    public int cal(int a, int b) {
        // 예시로 곱셈으로 재정의합니다.
        return a * b;
    }

    public static void main(String[] args) {
        Parent1 parent = new Parent1();
        Child child = new Child();

        int parentResult = parent.cal(3, 4); // 3 + 4 = 7
        int childResult = child.cal(3, 4); // 3 * 4 = 12

        System.out.println("Parent result: " + parentResult); // 출력: Parent result: 7
        System.out.println("Child result: " + childResult); // 출력: Child result: 12
    }
}
