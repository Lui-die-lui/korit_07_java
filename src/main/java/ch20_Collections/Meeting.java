package ch20_Collections;

import java.util.*;

/*
* 모임 참석자 명단 관리 프로그램 작성
* 지시 사항
* 1.Set을 사용해서 참석자 명단(String)을 저장 (중복이름 안받기위해)
* 2.사용자로부터 참석자 이름을 계속해서 입력받을 예정
* 3. 입력 받은 이름을 Set에 추가
* 4. 종료 라고 입력하면 더이상 이름을 입력받지 않음.
* 최종 모임 참석자 명단을 콘솔에 출력
*
* 실행 예 (While 문 사용)
*--- 모임 참석자 명단 관리 ---
* [종료] 라고 입력하면 프로그램을 종료합니다.
* 참석자 이름을 입력하세요 >>> 김일
* 참석자 이름을 입력하세요 >>> 김이
* 참석자 이름을 입력하세요 >>> 김삼
* 참석자 이름을 입력하세요 >>> 종료
* 프로그램이 종료되었습니다.
*
* --- 최종 참석자 명단 ---
* 김일, 김이, 김삼
* */
public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> attedees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();
        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ] 를 입력하면 프로그램을 종료합니다.");
        // 여기서부터 횟수가 정해지지 않은 반복문 작성
        // 사실 boolean으로도 처리 가능

        while (true) {
            System.out.print("참석자 이름을 입력하세요. >>> ");
            String name = scanner.nextLine();
            if (name.equals("종료")) { // String이기때문에 equals
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            attedees.add(name); // 위 if의 조건에 맞지 않으면 if 그냥 통과(이걸 위쪽에 적으면 입력한 종료까지 들어감)
        }
        System.out.println(attedees);

        meetingList.addAll(attedees);
        System.out.println("--- 최종 참석자 명단 ---");
        for (int i = 0; i < meetingList.size() ; i++) {
            // 마지막 인덱스라면
            if (i == meetingList.size() - 1) { // meetingList.size() - 1 는 list의 마지막 index 넘버
                System.out.print(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i) + ", ");
        }


    }

}
