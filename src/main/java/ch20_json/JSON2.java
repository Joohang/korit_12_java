package ch20_json;

import ch16_bean.UserEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체들 생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄 출력 / 하나는 Pretty printing 적용한 버전 보여주기 위해 두 개 생성.

         User user1 = new User("kim1", "9876","a@test.com","김일","20");

        String jasonData1 = gson.toJson(user1);
        String jasonData2 = gsonBuilder.toJson(user1);
        System.out.println(jasonData1);
        System.out.println(jasonData2);
        /*
            Map 자료형을 -> Json 데이터로 바꾸는 것도 가능합니다.
         */

        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode" , "MYWY3KH/A");
        productMap1.put("productName" , "아이폰 16 프로 맥스");
        //
        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct1);
        System.out.println(jsonProduct2);
        /*
            이상의 두 사례에서 toJason()이라는 메서드는 argument로 Java Object 자체를 넣는 것도,
            Map으로 생성된  entry를 Json형태로 바꾸는 것도 가능하다는 것을 확인할 수 있습니다.
            그리고 JsonObject 객체도 바꿀수 있었네요

            그러면 반대로 json -> Map / Java Object로 바꾸는 것도 가능하겠네요.

            근데 String data인 json을 "" 포함해서 생성하는게 너무 귀찮기 때문에
            user1과 productMap1을 json으로 바꾼 데이터를 바꿔보도록 하겠습니다.

            jsonData2 를 user2객체로 변경해 보겠습니다. String -> user 으로 바뀌는 거겠네요
            jsonProduct2를 productMap2로 바꾸겠습니다.
         */

        User user2 = gsonBuilder.fromJson(jasonData2, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct1, Map.class);
        System.out.println(productMap2);

        // 그러면 JsonData1 /2 를 userMap1으로 바꿀 수 있겠네요
        // field : fieldValue 로 일대일 매칭이 되니까요
        /*
            하지만 jsonProduct1 /2 는 Java Object로 못 바꿉니다 -> 클래스가 아직 정의되지
            않았으니까요

         */

        Map<String,String> userMap1 = gson.fromJson(jasonData1, Map.class);

        System.out.println(userMap1);

        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(users);
        String jsonUsers = gsonBuilder.toJson(users);
        System.out.println(jsonUsers);
    }
}
