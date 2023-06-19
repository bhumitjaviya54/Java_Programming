class Student {
    private int enrollmentNo;
    private String name;

    Student(int enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    String getName(){
        return name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Bhumit");
        Student s2 = new Student(2, "Kashif");
        Student s3 = new Student(3, "Dev");

        System.out.println("Student 1 name: " + s1.getName());
        System.out.println("Student 2 name: " + s2.getName());
        System.out.println("Student 3 name: " + s3.getName());
    }
}