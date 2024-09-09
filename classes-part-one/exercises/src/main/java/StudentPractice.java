public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student("Dera", 12345, 1, 4.0);
        System.out.println(student.getName());
        Teacher instructor = new Teacher("Terrance","Weeden", "launchcode",1);
        System.out.println(instructor.getFirstName());
    }
}
