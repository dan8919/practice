package basic.overrinding;
//추상클래스를 상속 받고 인터페이스를 구현한 Horse클래스

public class Horse extends Animal implements Ridable {
    @Override
    public void run() {
        System.out.println(this.getName()+"은 (는) 네발로 뛴다.");
    }


    @Override
    public void youCanRide(String rideName) {
        System.out.println(this.getName()+"은(는)"+ rideName +"을(를) 태울 수 있다.");
    }


}
