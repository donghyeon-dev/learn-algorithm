package level0;

/**
 * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

 * 제한사항
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100

 *입출력 예
 * num1	num2	result
 * 10	5	2
 * 7	2	3
 */
public class Quotient {
    public int solution(int num1, int num2){
        int answer = 0;
        answer = num1 / num2;

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Quotient quotient = new Quotient();
        int firstInputExample = quotient.solution(10,5);
        int secondInputExample = quotient.solution(7,2);

        if(firstInputExample == 2){
            System.out.println("1번째 인풋 통과");
        } else {
            System.out.println("오답");
        }
        if(secondInputExample == 3){
            System.out.println("2번째 인풋 통과");
        } else {
            System.out.println("오답");
        }
    }
}
