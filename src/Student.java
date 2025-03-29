public class Student {
    public static void main(String[] args) {
        Student student = new Student("Amigo");
        System.out.println(student.name);
    }


    public Student() {
    }

        String name;

    public Student(String name) {
        this.name = name;
    }
}


