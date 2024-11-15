public class Student {
    
    String studentName;
    int studentId;
    int age;
    float gpa; //?: we dont need to use a double for gpa. Zero6: i think it is nice to use double.
    
    
    public Student(String studentName, int studentId, int age, float gpa){
        this.studentName = studentName;
        this.studentId = studentId;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentName() { return studentName; }
    
    public static void main(String[] args) {
        
    }
}
//............................................................................................................................................................................................................................................