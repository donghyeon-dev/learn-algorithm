package level0;

public class Babbling {

    /**
     *
     *문제 설명
     * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
     * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
     * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

     * 제한사항
     * 1 ≤ babbling의 길이 ≤ 100
     * 1 ≤ babbling[i]의 길이 ≤ 15
     * babbling의 원소에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
     * 문자열은 알파벳 소문자로만 이루어져 있습니다.

     * 입출력 예
     * babbling	result
     * ["aya", "yee", "u", "maa", "wyeoo"]	1
     * ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	3
     */

    public int solution(String[] babbling){
        int answer = 0;
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        // 치환
        for(String givenBabbling : babbling){
            for(String word : words){
                givenBabbling = givenBabbling.replace(word, "1");
            }
            if(givenBabbling.equals("1") ||
                    givenBabbling.equals("11") ||
                    givenBabbling.equals("111") ||
                    givenBabbling.equals("1111")){
                answer++;
            }
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Babbling babbling = new Babbling();
        int firstInputExample = babbling.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        int secondInputExample = babbling.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        if(firstInputExample == 1 ){
            System.out.println("1번 인풋값 통과");
        } else {
            System.out.println("오답");
        }
        if(secondInputExample == 3 ){
            System.out.println("2번 인풋값 통과");
        } else {
            System.out.println("오답");
        }
    }
}
