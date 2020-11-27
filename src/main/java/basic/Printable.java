package basic;

public interface Printable {
    public abstract void paper();

    //default method
    //나중에 setPrint()기능이 추가될때 구현체에서 고칠 필요가 없으며 인터페이스의 디폴트 메서드 내부 코드만 수정하면 됨.
    public default void setPrint(boolean color){
        if(color){
            System.out.println("컬러 출력");
        }
        else {
            System.out.println("흑백 출력");
        }
    }
}
