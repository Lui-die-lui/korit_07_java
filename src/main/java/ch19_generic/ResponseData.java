package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseData<T> {
    private String message;
    private T data;
}

/*
    우리가 제네릭을 쓰려면 class에 추가적인 명령어가 필요
    public class ResponseData<T>
* */
