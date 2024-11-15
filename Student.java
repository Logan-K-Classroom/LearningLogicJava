public class Student {
    
    private String studentName;
    private int studentId;
    private int age;
    private double gpa; //?: we dont need to use a double for gpa. Zero6: i think it is nice to use double.
    
    
    public Student(String studentName, int studentId, int age, double gpa){
        this.studentName = studentName;
        this.studentId = studentId;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentName() { return studentName; }
    public int getStudentId() { return studentId; }
    public double getStudentsGPA() { return gpa; }
    public int getStudentsAge() { return age; }
    public static void main(String[] args) {
        
        Student student1 = new Student("Logan Kessler", 0, 17, 100.5);
        
        System.out.println(student1.getStudentName());

        student1.studentName = "Jun Brewer";

        System.out.println(student1.studentName);

    }
    
}
//