package ex_2_domashka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "example.txt";//створюємо назву файлу за допомогою класу обгортки String  для опрацювання данних
        // з текстовими символами. Ми зберігаємо назву файла, як рядок.
        // Це дозволяє пееередавати назвиу файлу в інші частини проги де це буде потрібно.

        // Записуємо довільні данні в файл.
        try (FileWriter fileWriter = new FileWriter(fileName)) { // Тут ми створили об'єкт 'filewreiter` класу FileWreiter
                                                                // (який ми імпортували з бібіліотеки java.io), що вка
                                                               //на початку кода.
            fileWriter.write("Цей файл створенно для тестування роботи з файлами.\n"); // Тут за допомогою метода 'write`
            fileWriter.write("Це друга строка (рядок) файлу\n");                      // у файл 'example.txt` записуємо текстові дані.
            fileWriter.write("А це третій рядок у цьому файлі.");
        }
        catch (IOException e){
            System.err.println("Помилка при записі у файл:"+e.getMessage());
        }
        //Зчитуємо дані з нашого файлу `example.txt` та виводимо на консоль.
        try(FileReader fileReader=new FileReader(fileName); // Тут 'FileReader' клас, імпортованний з бібліотеки java.io.та об'єкт 'fileReader 'цього класу.
            BufferedReader bufferedReader=new BufferedReader(fileReader)) //Тут клас 'BufferedReader',імпортованний з біб-
        //ліотеки java.io,який має методи, що дозволяє зчитувати файли рядками, що є більш єффективним,а не символами.
        {
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }

        }
        catch (IOException e)
        {
            System.err.println( "Помилка при читанні файлу: " +e.getMessage());
        }
    }
}
