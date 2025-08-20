package Example;

import java.util.*;

public class MapList {

    public static void main(String[] args) {

        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name","홍길동");
        map1.put("rating","vip");
        map1.put("age",30);
        customers.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name","김기영");
        map2.put("rating","gold");
        map2.put("age",35);
        customers.add(map2);


        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String, Object> entry : customer.entrySet()) {
                System.out.println(entry.getKey()+ "=" + entry.getValue());

            }
        }
    }
}
