import java.util.ArrayList;

class Lesson{
    String name;
    int grade;
    String teacher;
    static int lessonNumber;

    Lesson(){
        lessonNumber++;
    }
    Lesson(String a){
        name = a;
        lessonNumber++;
    }
    Lesson(String a, int s, String h){
        name = a;
        grade = s;
        teacher = h;
        lessonNumber++;
    }
    void writeLessonInformation(){
        System.out.println("Lesson Name : " + name);
        System.out.println("Lesson Grade : " + grade);
        System.out.println("Teacher Name : " + teacher);
    }
    void writeLessonNumberInformation(){
        System.out.println("Total Lesson Number : " + lessonNumber);
    }

}

class Student{
    String name;
    int grade;
    ArrayList <Lesson> lessonList = new ArrayList<Lesson>();
    static int numberOfStudent = 0;

    Student(){
        numberOfStudent++;
    }
    Student(String a, ArrayList<Lesson> d){
        name = a;
        lessonList = d;
        numberOfStudent++;
    }
    Student(String a, int s, ArrayList<Lesson> d){
        name = a;
        grade = s;
        lessonList = d;
        numberOfStudent++;
    }
    void writeStudentInformation(){
        System.out.println("Name : " + name);
        System.out.println("Grade : " + grade);
        System.out.println("Number of Students : " + numberOfStudent);
        System.out.println("Number of Lessons : " + lessonList.size());
        
    }
    void writeStudentLessonInformation(){
        System.out.println("Lesson List : ");
        for (int i = 0; i < lessonList.size(); i++) {
            lessonList.get(i).writeLessonInformation();
        }
    }
}    

class ClassesAndMethods{
    public static void main(String[] args) {

        Lesson lesson1 = new Lesson("Object Oriented Programming", 2, "Ahmet SAYAR");
        Lesson lesson2 = new Lesson("Data Structures and Algorithm", 2, "Onur GÖK");
        Lesson lesson3 = new Lesson("Logic", 2, "Burcu KIR SAVAŞ");
        
        Student student1 = new Student();
        student1.writeStudentInformation();
        student1.writeStudentLessonInformation();
        System.out.println();
        
        ArrayList<Lesson> lessons2 = new ArrayList<Lesson>();
        lessons2.add(lesson1);
        Student student2 = new Student("Ali", lessons2);
        student2.writeStudentInformation();
        student2.writeStudentLessonInformation();
        System.out.println();
        
        ArrayList<Lesson> lessons3 = new ArrayList<Lesson>();
        lessons3.add(lesson2);
        lessons3.add(lesson3);
        Student student3 = new Student("Veli", 2, lessons3);
        student3.writeStudentInformation();
        student3.writeStudentLessonInformation();
        System.out.println();

        lesson1.writeLessonNumberInformation();
    }
}
