package HomeworkClass15;

public class Students {
    /*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for
each object
Print out  total number of students
     */


    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students obj1 = new Students();
        obj1.name = "Bob";
        obj1.ID = "a12345";
        numberOfStudents++;

        Students obj2 = new Students();
        obj2.name = "Virgil";
        obj2.ID = "B234512";
        numberOfStudents++;

        Students obj3 = new Students();
        obj3.name = "Josh";
        obj3.ID = "c345345";
        numberOfStudents++;

        System.out.println("Total number : " + Students.numberOfStudents);


    }


}
