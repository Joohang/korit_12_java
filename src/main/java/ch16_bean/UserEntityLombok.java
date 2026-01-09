package ch16_bean;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor

@Getter // 여기서 클래스 레벨
public class UserEntityLombok {
    private int username;
    @Setter // 여기서 필드레벨에 해당합니다.
    private int password;
    private String email;
    private  String name;
}
