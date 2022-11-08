package level0;

/**
 * 문제 설명
 * 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.

 * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
 * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

 * 제한사항
 * 0 ≤ dots의 원소 ≤ 100
 * dots의 길이 = 4
 * dots의 원소의 길이 = 2
 * dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
 * 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
 * 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
 * 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
 * 입출력 예
 * [[1, 4], [9, 2], [3, 8], [11, 6]]	1
 * [[3, 5], [4, 1], [2, 4], [5, 10]]	0
 */
public class Parallel {
    public int solution(int[][] dots){
        int answer = 0;

        /**
         * 1-2 : 3-4
         * 1-3 : 2-4
         * 1-4 : 2-3
         *
         */

        int x1 = dots[0][0];
        int y1 = dots[0][1];

        int x2 = dots[1][0];
        int y2 = dots[1][1];

        int x3 = dots[2][0];
        int y3 = dots[2][1];

        int x4 = dots[3][0];
        int y4 = dots[3][1];

        int dotsLength = dots.length;

        if(y1-y2 != 0 &&  y3-y4 != 0) {
            if (getSlope(x1, y1, x2, y2) == getSlope(x3, y3, x4, y4)) {
                answer = 1;
            }
        }

        if(y1-y3 != 0 &&  y2-y4 != 0) {
            if (getSlope(x1, y1, x3, y3) == getSlope(x2, y2, x4, y4)) {
                answer = 1;
            }
        }
        if(y1-y4 != 0 &&  y2-y3 != 0) {
            if (getSlope(x1, y1, x4, y4) == getSlope(x2, y2, x3, y3)) {
                answer = 1;
            }
        }

        if(y1-y2 == 0 &&  y3-y4 == 0) {
            answer = 1;
        }
        if(y1-y3 == 0 &&  y2-y4 == 0) {
            answer = 1;
        }
        if(y1-y4 == 0 &&  y2-y3 == 0) {
            answer = 1;
        }




        return answer;
    }

    public int getSlope(int x1, int y1, int x2, int y2){
        int slope = 0;
        slope = (y1-y2) * (x1-x2);

        return slope;
    }

    /**
     * 직선이 평행하다는걸 증명하기위해서 기울기를 구해서 비교를 하기로 했다.
     *
     */

    public static void main(String[] args) {
        Parallel parallel = new Parallel();
        int firstInputResult = parallel.solution(new int[][]{{1,4}, {9,2}, {3,8}, {11,6}});
        int secondInputResult = parallel.solution(new int[][]{{4,7}, {7,7}, {4,5}, {7,5}});
        if(firstInputResult == 1){
            System.out.println("1번째 인풋 통과");
        } else {
            System.out.println("오답");
        }
        if(secondInputResult == 1){
            System.out.println("2번째 인풋 통과");
        } else {
            System.out.println("오답");
        }

    }
}
