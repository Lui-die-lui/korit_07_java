package ch20_Collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // Map 에 key - value 쌍(entry) 삽입 메서드 -> .put(키, 값);
        strMap1.put("kor2025001", "김일");
        strMap1.put("kor2025002", "김이");
        strMap1.put("kor2025003", "김삼");
        strMap1.put("kor2025004", "김사");
        strMap1.put("kor2025005", "김오");
        // 입력한 순서대로 출력되지 않음
        System.out.println(strMap1);
        // {kor2025004=김사, kor2025003=김삼, kor2025005=김오, kor2025002=김이, kor2025001=김일}
        // key 하나당 value는 하나임. 즉 키가 같다면 value는 가장 최근걸로 덮어쓰기 됨.
        strMap1.put("kor2025005", "KimFive");
        System.out.println(strMap1);
        // {kor2025004=김사, kor2025003=김삼, kor2025005=KimFive, kor2025002=김이, kor2025001=김일}

        /*
        * List의 경우에는 순서가 있기 때문에 기본적으로 index를 통한 조회가 가능
        * 하지만 Map의 경우 아까 출력결과에서 본 것처럼 순서를 보장하지 않기 때문에
        * .get("키값"); 을 통해 조회 가능
        * */

        System.out.println(strMap1.get("kor2025001") + " 님");

        //
        Map<String, Double[]>  koreanScores1 = new HashMap<>();
        koreanScores1.put("김일", new Double[2]);


        Map<String, Double>  koreanScores2 = new HashMap<>();
        koreanScores2.put("김일", 98.2);
        koreanScores2.put("김이", 34.4);
        koreanScores2.put("김삼", 97.2);
        koreanScores2.put("김사", 98.3);
        koreanScores2.put("김오", 67.1);
        koreanScores2.put("김육", 100.0);

        // 특정 key의 value 수정
        // #1. 아까 말한 것처럼 key에는 value가 하나밖에 없기 때문에 최근걸로 덮어쓰기 됨
        System.out.println(koreanScores2);
        koreanScores2.put("김오", 4.5); // -> put 은 넣는데 만약 같은 키 값이 있으면 덮어씀
        System.out.println(koreanScores2);

        //# 2. .replace(); -> 없는 키 값을 넣으면 오류가 남
        koreanScores2.replace("김오", 789.2);
        System.out.println(koreanScores2);

        /*
        * 두가지 방법이 있는 이유는 .put()의 경우에는
        * 없는 key 라면 key를 새로 생성해서 value를 초기화하겠지만
        * 있는 key 라면 value에 재대입을 하게 됨.
        *
        * 반면 .replace()는 없는 key 라면 value 값의 갱신이 일어나지 않음
        * 있는 key 라면 재대입이 일어난다는 차이가 있음
        * */

        // 특정 key의 존재 여부 -> containsKey(); -> boolean
        boolean serchKeyFlag1 = strMap1.containsKey("kor2025006");
        System.out.println("kor2025006 존재 여부 : " + serchKeyFlag1); // false

        // 특정 value 존재 여부 -> containsValue(); -> boolean
        boolean serchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println("김삼 존재 여부 : " + serchValueFlag1); // true

        // Map의 엔트리로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 Set를  하나 만드는데, 내부에 Key가 String, Value가 String 인 Map이
        // 통째로 들어간다는 것을 의미
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        // 이상의 코드는 strMap1의 key-value 쌍을 Set로 바꾸는 메서드인 .entrySet()의
        // 호출 결과를 entrySet2라는 변수에 담았음을 뜻함.
        System.out.println(strMap1);
        // {kor2025004=김사, kor2025003=김삼, kor2025005=KimFive, kor2025002=김이, kor2025001=김일}
        System.out.println(entrySet2);
        // [kor2025004=김사, kor2025003=김삼, kor2025005=KimFive, kor2025002=김이, kor2025001=김일]
        System.out.println();

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map.Entry<String, String>> entryList2 = strMap1.entrySet();
        // Map -> List 로의 직접 변환이 불가능하다는 예시

        entryList1.addAll(entrySet2); // set에 있는 list -> list
        System.out.println(entryList1); // list로 바꿨으니까 element 추출이 가능
        // 이상까지의 과정에서 Map -> Set -> List로 바꾸는  과정을 코드로 작성하였는데
        // Map -> List로 바로 가는게 가능한지 여부를 따질 필요가 있음 -> 불가능

        // .sort() 도 가능하고 추출도 가능
        System.out.println("---------------- keySet 출력 ---------------");
        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        //Value Set 출력
//        Set<String> valueSet = strMap1.values();
        // 불가능한 이유(Set은 중복 제거됨 - 값의 중복 제거)
        // 이상에서 강제 형변환을 하지 않은 상태에서 오류가 발생하는 이유는
        // key는 어차피 중복을 허용하지 않기 때문에 Set으로 바꾸는게 가능한 반면,
        // 복수의 key에서 동일한 value가 존재할 수 있기 때문에
        // 직접적으로 Set을 바꾸지 않음.

        Collection<String> values = strMap1.values();
        System.out.println(values);
        // 저희 Collection 자료형은 또 처음 써봤습니다.
        // .sort() = Collections


    }
}
