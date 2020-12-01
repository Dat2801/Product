package view;

import controller.Program;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Program program = new Program();
        int number = 8;
        do {
//            program.readFile();
            program.writerToFile();
            System.out.println("Mời chọn chức năng");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm");
            System.out.println("3. Hiển thị sản phẩm");
            System.out.println("4. Thoát");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    program.add();
                    break;
                case 2:
                    program.search();
                    break;
                case 3:
                    program.show();
                    break;
            }
        } while (number != 4);
    }
}
