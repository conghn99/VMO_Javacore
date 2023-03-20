package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        //Thêm phần tử vào map
        map.put(5, "Ford");
        map.put(1, "Suzuki");
        map.put(7, "Mercedes");
        map.put(4, "Mazda");

        System.out.println("Map vừa tạo: ");
        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(1, "Vinfast");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);
    }
}
