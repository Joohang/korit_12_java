package ch18_generic.bmi;

public class Bmi {

    public double calcBmi(Person person ) {
        double bmi = 0;
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();
        bmi = weight / (height*height)*0.01;
        return bmi;
    }

    public void printResult(Person person) {
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();
        double bmi = calcBmi(person);
        String result = " " ;
        if ( bmi < 18.5 ) {
            result = "저체중";
        } else if ( bmi < 23 ) {
            result = "정상";
        } else if ( bmi < 25 ) {
            result = "비만 전 단계";
        } else if ( bmi < 30 ) {
            result = "1 단계 비만";
        } else if ( bmi < 35 ) {
            result = "2 단계 비만";
        } else {
            result = "3 단계 비만";
        }

        System.out.println( name + " 님의 키는 " + height + " cm이고 몸무게는 " + weight+
                " kg이고, bmi 지수는 " + bmi + " 으로" + result + "입니다.");
    }
}
