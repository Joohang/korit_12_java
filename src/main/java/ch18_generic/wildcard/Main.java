package ch18_generic.wildcard;

public class Main {
    // method  정의 영역
    /*
        현재 AnimalData에서는 field로 들어온 객체가 Animal 클래서의 서브 클래스인지
        아닌지를 구분할 수 없기 때문에 이를 판단하는 메서드를 Mains에서 정의하겠습니다
     */
    public AnimalData<? extends  Animal> getAnimal(int flag) {
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }

    public static void main(String[] args) {
         AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
         AnimalData<Human> animalData2 = new AnimalData<>(new Human());
         AnimalData<Car> animalData3 = new AnimalData<>(new Car());
         /*
            이상의 상황에서는 AnimalData 에 Car 객체가  animal field 에 들어가있지만
            문제가 되지 않습니다. 그러면 animal field에 Tiger / Human / Car
            객체가 들어가 있다는 점은 여기 main에서 확인 안됩니다. 코드 다른 곳
            까보셔야 합니다.
          */
        animalData1.showData();
        animalData2.showData();
//        animalData3.showData();     오류 발생
        /*
            animalData3.showData(); 에서 오류 발생함을 확인할 수 있습니다.
            AnimalData 클래스를 확인하셔야 하는데, 저희가(Animal)이라고 형변환을 시키는
            부분 때문이겠네요. Car를 Animal로 형변환시킬 수 있는 근거가 없는 상태니까요.
         */

        // .getAnimal()메서드 호출하겠습니다.
        Main main = new Main();
        //  wildcard  적용하겠습니다.
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(100);

        animalData4.showData();
        animalData5.showData();
//        animalData6.showData();
        System.out.println(animalData4);
        System.out.println(animalData6);

        System.out.println("----field 에 null 값 대입 ----");
        AnimalData animalData100 = new AnimalData(null);
        if (animalData100==null) {
            System.out.println("내부에 값이 없습니다.");
        } else {
            System.out.println("객체는 생성됐는데 field에 값이 없습니다.");
        }

        System.out.println(animalData100.getAnimal());
        animalData100.setAnimal(new Car());
        System.out.println(animalData100.getAnimal());
    }
}
