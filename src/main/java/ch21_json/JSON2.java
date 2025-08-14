package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
@AllArgsConstructor
class User {
    // JSON 문자열이기때문에 String
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

// 대표 클래스는 여기
public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄로 출력하고
        // 하나는 prettyPrinting 적용시켜서 출력 상의 차이를 확인해보기위해 두 개 만듦

        // 1. Java Object -> json으로 변환

        User user1 = new User("Kim1","9876","a@test.com", "김일","20");
        System.out.println(user1);
//        System.out.println(gson.toJson(user));
        String jsonUser1 = gson.toJson(user1);
        System.out.println(jsonUser1);
        String jsonUser2 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser2);

        // 2. Map -> json 변환
//        userMap1을 생성하고
//        "productCode", "MYWY3KH/A"
        // "productName", "아이폰 16 프로 맥스"

        Map<String, String> productMap1 =  new HashMap<>();
        productMap1.put("productCode","MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");
        System.out.println(productMap1);

        // Map -> Json
        String jsonProduct1 = gson.toJson(productMap1);
        System.out.println(jsonProduct1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct2);

        /*
        * 이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 집어넣는것도 가능
        * Map으로 생성된 entry를 Json형태로 바꾸는것도 가능
        * 즉, toJson() overLoading이 이루어졌다고 볼 수 있음
        *
        * 그리고 gson 객체에서도 toJson()이 있고 gsonBuilder에서도 toJson()이 있다는 점 또한 주목할 부분
        *
        * 그 다음은 json -> Map / Java Object로 바꾸는 방식도 있음
        * 근데 String daa인 json을 "" 포함해서 쓰는게 너무 귀찮기 때문에
        * user1과 productMap1을 json으로 바꾼 데이터를 그대로 쓰도록 하겠습니다.
        *
        * jsonUser2를 user2로 바꾸고,
        * jsonProduct2를 productMap2로 바꾸도록 할 예정
        *
        * 형식 :
        * gson.formJson(제이슨데이터, 바꾸고자하는_클래스명.class);
        * */

        User user2 = gson.fromJson(jsonUser2, User.class);
        // 다시 Java 객체로 바뀜
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        System.out.println(productMap2);

        /*
        * 특정 Java 객체와 Json String data가 있다고 가정했을 때 서로 왔다갔다 하면서 고칠 수 있음.
        * Map과 Json 데이터 역시 그렇다.
        * */

        Map<String, String> userMap1 = gson.fromJson(jsonUser2, Map.class);
        System.out.println(userMap1);
        /*
        * 그렇다면 이상의 코드처럼 Java 객체로 만든 것을
        * -> Json 데이터로 바꾼 다음에 -> 그걸 Map 형태로도 할 수 있음
        * 하지만 Map의 경우 Json으로 바꾸는 것까지는 자유인데 걔를 Java객체로 만들고자 한다면
        * 클래스가 정의되어야 합니다.
        * 객체는 클래스라는 설계도를 기준으로 만들어진 거니까요.
        *
        * json -> jsonObject로 바꿈
        * 그 말은 ㄴjson =/= jsonObject라는 뜻이 되겠네요.
        *
        * 잘 생각해보시면 jsonUser1을 선언할 때 자료형을 String으로 잡았습니다.
        * 근데 jsonObject의 자료형은 뭔가요?
        *
        * */


        JsonObject jsonObject1 = gson.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject1);
        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject2);
        /*
        * gsonBuilder로 fromJson()을 적용하더라도 콘솔 상에서
        * prettyPrinting은 적용되지 않음
        * 결과값:
        * {username=Kim1, password=9876, email=a@test.com, name=김일, age=20}
        * 이상의 이유는 fromJson() 이라는 메서드명에서 알 수 있듯이
        * JsonData(즉 String Data)를 Map으로 바꾸는 것
        * String의 경우에는 개행을 통해서 prettyPrinting이 적용될 수 있지만,
        * Map은 toString()이든 gsonBuilder.fromJson() 이건 콘솔에 찍히는 결과값은 동일하다고 볼 수 있음
        * */
    }
}
