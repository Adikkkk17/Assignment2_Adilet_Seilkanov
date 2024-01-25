import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create list of people
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Askar", "Khaimuldin", "Teacher", 30000.78));
        people.add(new Employee("Nursultan", "Khaimuldin", "Lecturer", 31000.00));
        people.add(new Student("Adilet", "Seilkanov", 2.5));
        people.add(new Student("Umnik", "Umnikov", 3.8));
        //sort list
        Collections.sort(people);
        //Print people
        printData(people);
    }
    public static void printData(Iterable<Person> persons){
        for(Person peron : persons){
            System.out.println(peron.toString());
        }
    }
}