class Parent2 {
    public int cal(int a, int b) {
        return a + b;
    }
}

// Child 클래스
public class Personal_41 extends Parent2 {
    @Override
    public int cal(int a, int b) {
        // 예시로 곱셈으로 재정의합니다.
        return a * b;
    }

    public static void main(String[] args) {
        Parent2 parent = new Parent2();
        Personal_41 child2 = new Personal_41();

        int parentResult = parent.cal(3, 4); // 3 + 4 = 7
        int childResult = child2.cal(3, 4); // 3 * 4 = 12

        System.out.println("Parent result: " + parentResult); // 출력: Parent result: 7
        System.out.println("Child result: " + childResult); // 출력: Child result: 12
    }
}
