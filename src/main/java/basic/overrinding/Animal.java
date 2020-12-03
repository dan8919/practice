package basic.overrinding;

import lombok.Getter;
import lombok.Setter;


//동물 추상 클래스 공통적인 기능
@Setter
@Getter
public abstract class Animal {
    private String name;
    private String leg;

    //Abstract method
    abstract  void run();

    public void animal() {
        System.out.println("동물인가 ?:");
    }
}
