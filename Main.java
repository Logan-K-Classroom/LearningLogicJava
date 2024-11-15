import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
       
        Student student0 = new Student("Jun Brewer", 00, 18, 100);
        Student student1 = new Student("Logan Kessler", 01, 17, 100.5);
        Student student2 = new Student("Oliver Elliott", 02, 15, 9001.01);
        Student student3 = new Student("Kaleb Thompson", 03, 15, 3.56);
        Student student4 = new Student("Miles Poland", 04, 15, 4.14);
        
        //student1.studentName = "Jun Brewer";

        //System.out.println(student1.studentName);

        System.out.println(student1.getStudentName());

        ArrayList<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Jun Brewer", 00, 18, 6.66));
        students.add(new Student("Miles Poland", 01, 15, 4.14));
        students.add(new Student("Oliver Elliott", 02, 15, 9001.01));
        students.add(new Student("Kaleb Thompson", 03,15,3.56));      
        students.add(new Student("Logan Kessler", 04, 17, 3.83));
        
        for (int i = 0; i < students.size(); i++) { 
        System.out.println(students.get(i).getStudentName());
        }

       
              
    }
}
//