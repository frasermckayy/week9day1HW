import java.util.ArrayList;
import java.util.Collections;

public class Student {
 private ArrayList<String> students;


    public Student() {
        this.students = new ArrayList<>();
        students.add("Fraser");
        students.add("Tom");
        students.add("Mike");
        students.add("Matt");
        students.add("Cameron");
        students.add("Andrew");
        students.add("William");
        students.add("Louise");
        students.add("Emily");
        students.add("Nicola");


    }

    public ArrayList<String> getStudent() {
        return students;
    }

    public void setStudent(ArrayList<String> students) {
        this.students = students;
    }


    public String getRandomStudent(){
       Collections.shuffle(students);
       String result = students.get(0);
       return result;
   }

    public ArrayList<String> getTwoStudents(){
        ArrayList<String> twoStudents = new ArrayList<>();
        Collections.shuffle(students);
        String randomStudent1= students.get(0);
        String randomStudent2 = students.get(1);
        twoStudents.add(randomStudent1);
        twoStudents.add(randomStudent2);
        return twoStudents;

    }

    public void addName (String student){
        students.add(student);
    }

}
