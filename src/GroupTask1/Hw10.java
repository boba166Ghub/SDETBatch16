package GroupTask1;

public class Hw10 {
    public static void main(String[] args) {

        String[] syntax = {"STLC", "SDLC", "TestCase", "ManualTest","STLC", "Scrum", "Agile","TestCase"};

        for (int i = 0; i < syntax.length; i++) {
            for (int j = i + 1; j < syntax.length; j++) {
                if (syntax[i].equals(syntax[j])) {
                    System.out.println(syntax[j]);
                }

            }

        }
    }
}





