package collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>(); //Khởi tạo LinkedList
        names.add("John");  //Thêm phần tử vào LinkedList
        names.add("Anna");
        names.add("Peter");
        names.add("Victor");

        names.add(2, "Emma"); //Thêm phần tử vào vị trí index được chỉ định

        //Kiểm tra phần tử Anna có trong LinkedList không
        System.out.println("names.contains(\"Anna\"): "  + names.contains("Anna"));

        System.out.println("names.size(): " + names.size()); //Lấy kích thước

        System.out.println("LinkedList: ");
        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("Phần tử sẽ bị thay thế là: "+names.set(2, "Chris"));

        //Sử dụng Iterator
        System.out.println("Sử dụng iterator: ");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
