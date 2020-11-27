package basic.overrinding;
//추상클래스를 상속 받은 kangaroo 클래스
public class Kangaroo extends Animal{

    @Override
    void run() {
        System.out.println(this.getName()+"은  네발로 뛴다.");

    }
}
