package HomeworkClass18;

public class TeacherTester {
    public static void main(String[] args) {

MathTeacher math=new MathTeacher();
math.name="Lisa";
math.age=45;
math.height=5.3;
math.gender='F';
math.teaching();
math.testGrades();

ChemistryTeacher chemistry =new ChemistryTeacher();
chemistry.name="Robert";
chemistry.age=29;
chemistry.height=5.10;
chemistry.gender='M';
chemistry.teaching();
chemistry.finalGrades();

PianoTeacher piano=new PianoTeacher();
piano.name="Michael";
piano.age=37;
piano.height=6.2;
piano.gender='M';
piano.teaching();









    }
}
