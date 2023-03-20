package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        //Khởi tạo map. key là các giá trị kiểu Integer, value là các giá trị kiểu String
        Map<Integer, String> map = new HashMap<>();

        //Thêm phần tử vào map, thứ tự thêm không được duy trì mà sẽ được sắp xếp tăng dần theo key
        map.put(5, "Anna");
        map.put(1, "John");
        map.put(7, "Chris");
        map.put(4, "Ryan");

        System.out.println("Map vừa tạo: ");
        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(4, "Scarlett");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);
    }
}
