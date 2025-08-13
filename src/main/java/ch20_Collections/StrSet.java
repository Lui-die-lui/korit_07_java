package ch20_Collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 허용하는 반면,
    Set의 경우 순서는 없고 중복은 허용하지 않기 때문에
    List -> Set / 혹은 Set -> List 로의 형변환이 중요함
    예를 들어 List로 전체 설문을 받고, Set을 통해 중복응ㄹ 제거하여
    후보군만 남기는 등의 형태로 많이 사용
    또한 Set으로 중복을 제거한 후에 다시 List로 돌려서 .get(인덱스 넘버)로
    조회도 가능
    Set은 순서가 없어서...

    그래서 Set은 우리가 중1때 배우는 집합 개념과 유사
    다만 짖ㅂ합은 숫자ㅏ로만 이루어졌던 반면에
    Set은 다양한 자료형을 기준으로 만들어질 수 있다는 차이

*/
public class StrSet {
    public static void main(String[] args) {
        // Set객체 생성
        Set<String> strSet = new HashSet<>();  // alt + enter
        // List 객체 생성
        List<String> strList = new ArrayList<>();

        // List / Set에 element 추가하는 방법은 동일  리스트 or 셋명.add(element);
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);

        // Set에 추가 예시
        strSet.add("TypeScript");
        System.out.println(strSet);

        // List의 element들을 전부 Set에 대입 -> 리스트명.addAll(세트명);
//        strList.addAll(strSet);
        strSet.addAll(strList);
        System.out.println(strList); // 원래 리스트는 그대로 유지
        System.out.println(strSet); // Set에 element들이 더해지긴 했는데
        // [TypeScript, python, java, React] 이렇게 중복 제거 - 순서는 보장x
        System.out.println(strSet.size()); // 갯수만 뽑아내줌
        // 현제 상황에서 예를 들어 set 내부에 있는 각 element들을 추출하여
        // 뒤에 " 언어" 라고 붙여서 데이터를 조작하는것이 불가능
        // 이상의 문제 등을 이유로 set -> List로의 변환 역시 자주 쓰임
        for (int i = 0; i < strSet.size() ; i++) {
//            System.out.println(strSet.get); -> 순서가 없어서 get이 불가능
        }

        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet);

        System.out.println(modifiedStrList);
        // set의 순서와 동일하게 들어갔기 때문에 마찬가지로 순서가 보장되지 않음
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);

        // 그럼 이제는 list니까 요소를 추출해서 뒤에 " 언어"라고 붙일 수 있음
        for (int i = 0; i < modifiedStrList.size() ; i++) {
            System.out.println(modifiedStrList.get(i) + " 언어 ");
        }

        System.out.println();

        for (String elem : modifiedStrList) {
            System.out.println(elem + " 언어 ");
        }

    }
}

//5명의 학생이 있다고 가정하고
// 5명에게서
// 제주 제주 민속촌 민속촌 제주
// 라는 결과값을 입력받았을때
/*
* 제주
* 제주
* 민속촌
* 민속촌
* 제주
*
* 로 출력 한 번
*
* 제주
* 민속촌
*
* 한번
*
* */
