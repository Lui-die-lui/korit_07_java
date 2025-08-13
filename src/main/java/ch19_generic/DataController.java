package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date(); // Java 내장 클래스로 객체 생성

        ResponseData<String> responseData1 =new ResponseData<>("날짜 저장 성공",now.toString());
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장 성공 : " ,30);
        System.out.println(responseData2);

        // 특정 객체의 자료형만 넣을 수도 있음
        ResponseData<Date> responseData3 = new ResponseData<>("날짜 객체 저장 성공", now);
        System.out.println(responseData3);
    }
}
