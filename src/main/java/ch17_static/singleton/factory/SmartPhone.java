package ch17_static.singleton.factory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;
// 매개변수 전체를 요구하는 생성자를 자동 생성하는데 접근 제어자가 private
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
public class SmartPhone {
    private  String company;
    private String model;
    private String serial;
}
