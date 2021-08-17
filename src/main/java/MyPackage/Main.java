package MyPackage;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();

        MyClass obj = new MyClass(str);
        System.out.println(obj.toUpper());
    }
}
