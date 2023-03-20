package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) throws Exception {
        List<String> listAnimal = new ArrayList<>(); //Tạo ArrayList
        listAnimal.add("Dog");  //Thêm phần tử vào ArrayList
        listAnimal.add("Cat");
        listAnimal.add("Mouse");

        listAnimal.add(1, "Bear");

        System.out.println("Danh sách động vật: ");
        for(int i = 0; i < listAnimal.size(); i++){  //size() lấy kích thước ArrayList
            System.out.println(listAnimal.get(i));  //get(int index)  lấy ra phần tử ở vị trí index
        }

        //Sử dụng foreach
        System.out.println("Sử dụng foreach: ");
        for (String animal: listAnimal) {
            System.out.println(animal);
        }

        //Sử dụng Iterator
        System.out.println("Sử dụng iterator");
        Iterator<String> itr = listAnimal.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
