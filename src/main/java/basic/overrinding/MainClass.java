package basic.overrinding;

import org.omg.CORBA.ShortSeqHelper;
//인터페이스와 추상클래스,메서드 오버라이딩을 사용한 다형성 구현
public class MainClass {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Kangaroo kangol = new Kangaroo();

        //상속받은 말의 속성
        horse.setName("얼룩말");
        horse.setLeg("다리 4개");

        //상속받은 캥거루의 속성
        kangol.setName("캥거루");
        kangol.setLeg("다리 4개");


        //말 구현체의 메서드 호출
        horse.run();
        horse.youCanRide("Baekjh");
        //horse는

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        //구현체의 메서드 호출
        kangol.run();
        //kangol 은 추상클래스만 상속받음



    }
}
