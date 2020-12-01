package controller;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> arrayList = new ArrayList<>();

    public static ArrayList<Product> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Product> arrayList) {
        Program.arrayList = arrayList;
    }

    public ArrayList<Product> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("dat.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        arrayList = (ArrayList<Product>) objectInputStream.readObject();
        setArrayList((ArrayList<Product>) (objectInputStream.readObject()));
        objectInputStream.close();
        fileInputStream.close();
        return getArrayList();
    }

    public void writerToFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("dat.txt", true);
        ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
        obj.writeObject(getArrayList());
        obj.close();
        fileOutputStream.close();
    }
    public void add() throws IOException, ClassNotFoundException {
        setArrayList(readFile());
        Product product = new Product();
        System.out.println("Nhập mã sản phẩm");
        String msp = scanner.nextLine();
        product.setProductID(msp);

        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        product.setProductName(name);

        System.out.println("Nhà sản xuất");
        String nsx = scanner.nextLine();
        product.setProducer(nsx);

        System.out.println("Giá sản phẩm");
        double gsp = scanner.nextFloat();
        product.setPrice(gsp);

        arrayList.add(product);
    }

    public void show() throws IOException, ClassNotFoundException {
        writerToFile();
        readFile();
        for (Product product : arrayList) {
            System.out.println(product.toString());
        }
    }

    public void search() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String tsp = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (tsp.equals(arrayList.get(i).getProductName())) {
                System.out.println(arrayList.get(i));
                index++;
            }
        }
        if (index == 0) {
            System.out.println("không tìm thấy");
        }
    }


}
