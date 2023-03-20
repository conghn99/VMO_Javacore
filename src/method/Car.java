package method;

public class Car {

    String name;

    Car(String carName){
        this.name = carName;
    }

    // oto con phổ thông luôn luôn có 4 bánh nên đặt hàm này là static
    // đây là static method
    public static int getNumberOfWheels(){
        return 4;
    }
    // Mỗi instance xe sẽ có mỗi trạng thái khác nhau
    public String getStatus(){
        return this.name + " is running on " + getNumberOfWheels() + " wheels";
    }
}
