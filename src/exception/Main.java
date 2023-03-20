package exception;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        boolean isContinue = true;
//        while (isContinue){
//            try {
//                System.out.println("Nhập tử số: ");
//                int number1 = sc.nextInt();
//                System.out.println("Nhập mẫu số");
//                int number2 = sc.nextInt();
//                int result = number1/number2;
//                System.out.println(result);
//                isContinue = false;
//            }catch (InputMismatchException e){
//                sc.nextLine();
//                System.out.println("Bạn nhập sai dữ liệu, vui lòng nhập lại");
//            }catch (ArithmeticException e){
//                System.out.println("Bạn đang chia một số cho 0");
//                System.out.println("Vui lòng nhập lại");
//            }finally {
//                System.out.println("Khối này luôn được thực thi");
//            }
//        }

        File file = new File("random.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ko tìm thấy file");
        } catch (IOException e) {
            System.out.println("Có vấn đề trong lúc đọc file" + file.getName());
        }
    }
}
