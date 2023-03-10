/*문자열 내 p와 y의 개수
문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.

입출력 예
s	answer
"pPoooyY"	true
"Pyy"	false
*/

class Solution {
    boolean solution(String s) {
        
        int count=0;
        
        for(String a: s.toLowerCase().split("")){ //문자열 s를 소문자로 변환함 = toLowerCase() 사용
            if(a.equals("p")) //문자열 a가 p와 같은 경우
                count++; //count 증가
            else if(a.equals("y")) //문자열 a가 y와 같은 경우
                count--; //count 감소
        
        }
        if(count==0) //둘의 갯수가 같을 경우= count가 0일때
            return true; 
        else //다를 경우 = count가 0이 아닐 때 
            return false;
    }
}
