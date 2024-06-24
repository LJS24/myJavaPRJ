public class Personal_39 {


        // 메서드 오버로딩 - 정수를 인자로 받는 메서드
        public void display(int a) {
            System.out.println("Display method with integer: " + a);
        }

        // 메서드 오버로딩 - 문자열을 인자로 받는 메서드
        public void display(String a) {
            System.out.println("Display method with string: " + a);
        }

        // 메서드 오버로딩 - 정수 두 개를 인자로 받는 메서드
        public void display(int a, int b) {
            System.out.println("Display method with two integers: " + a + ", " + b);
        }

        public static void main(String[] args) {
            Personal_39 obj = new Personal_39();

            // 각기 다른 display 메서드 호출
            obj.display(10); // 정수 인자
            obj.display("Hello, Java!"); // 문자열 인자
            obj.display(20, 30); // 두 개의 정수 인자
        }
    }

