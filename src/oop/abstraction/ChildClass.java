package oop.abstraction;

public class ChildClass extends BaseClass implements BaseInterface {

    @Override
    public void show1() {
        System.out.println("Override lại phương thức abstract lớp cha");
    }

    // Có thể override lại hoặc ko phương thức có thân
//    public void show2() {
//        System.out.println("Override lại phương thức có thân lớp cha");
//    }

    @Override
    public void show3() {
        System.out.println("Override lại phương thức của interface");
    }
}
