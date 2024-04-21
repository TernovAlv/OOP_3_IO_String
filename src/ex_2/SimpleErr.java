package ex_2;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class SimpleErr {
    public static void main(String[] args) {
        try {
            InputStream inputStream=new FileInputStream("D:");
            System.out.println("File opened " );
        }
        catch (FileNotFoundException e){
            System.err.println("Файла не існує");
            e.printStackTrace();
        }
    }

    //Завдання 2
    //
    //Створіть файл, запишіть у нього довільні дані та закрийте файл.
    // Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
}
