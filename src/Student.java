import java.io.FileReader;

public class Student {
    String name;
    String family;
    String ves;
    String rost;
    String hobi;




    @Override
    public String toString() {
        return "Student " +
                "name " + name + "\n" +
                "family " + family + "\n" +
                "ves " + ves + "\n" +
                "rost " + rost + "\n" +
                "hobi " + hobi ;
    }


}
