import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст который хотите найти: ");
            String str = scanner.nextLine();
            Student student = new Student();
            student.name = "Azamat";
            student.family = "Rahmankulov";
            student.ves = "50";
            student.rost = "1.73";
            student.hobi = "footbal";
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write(student.toString());
            fileWriter.close();
            FileReader fileReader = new FileReader("file.txt");
            Scanner scanner1 = new Scanner(fileReader);
            System.out.println(student);
            if (Objects.equals(str, student.name)){
                System.out.println("Найдено в строке 1: "+str);
                }
            if (Objects.equals(str, "STOP")){
                break;
            }
            }
        }
    }
