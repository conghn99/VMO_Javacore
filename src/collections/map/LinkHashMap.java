package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap {
    public static void main(String[] args) {
        //Khởi tạo map. key là các giá trị kiểu Integer, value là các giá trị kiểu String
        Map<Integer, String> map = new LinkedHashMap<>();

        //Thêm phần tử vào map và thứ tự thêm vào được duy trì
        map.put(5, "Java");
        map.put(1, "HTML/CSS");
        map.put(7, "Python");
        map.put(4, "C/C++");

        System.out.println("Map vừa tạo: ");
        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(1, "Ruby");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);
    }
}
