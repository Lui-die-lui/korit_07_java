package ch17_bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
// 여기 애너테이션을 달면 class level
@Data
public class UserEntityLombok {
    // 여기에 달면 field level
//    @Setter username 에만 setter
    private  int username;
    private int password;
    private String email;
    private String name;

}
