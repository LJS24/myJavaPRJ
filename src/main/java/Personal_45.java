class Solution2 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int yaksu;

        int[] Arr = new int[number];
        for (int i = 1; i <= number; i++) {
            yaksu = 0;
            for (int k = 1; k * k <= i; k++) {  // i의 제곱근까지만 확인
                if (i % k == 0) {
                    yaksu++;  // k는 약수
                    if (k != i / k) {
                        yaksu++;  // i/k는 약수
                    }
                }
            }
            if (yaksu > limit) {
                yaksu = power;
            }
            Arr[i-1] = yaksu;
        }

        for (int j = 0; j < number; j++) {
            answer += Arr[j];
        }

        return answer;
    }
}
public class Personal_45 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.solution(5, 3, 2);
        System.out.println(sol.solution(5, 3, 2));
    }
}

