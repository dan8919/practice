package basic;

public abstract  class AbstractClass {
//Field
    private String name;
    private String id;

//    Constructor
    public AbstractClass(String name,String id){
        this.name = name;
        this.id = id;
    }

//    Method
    public void method(){

    }

    //Abstract Method는 리턴 타입 앞에 abstract라는 키워드를 붙여야 한다.
    //추상 메소드란 내용이 없는 메소드.즉 구현이 되지 않은 메소드이다.
    public abstract void  sing();

}


