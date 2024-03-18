package org.example;
/* 같은 타입의 변수는 쉽표로 한번에 가능.
= 오른쪽이 먼저 다 계산된 후 왼쪽에 대입되는 것과
Result와 같은 대입연산자가 무조건 왼쪽임을 기억할 것.
 */
public class Code02_06 {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 100;
        num2 = 50;

        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

        result = num1 - num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);

    }
}
