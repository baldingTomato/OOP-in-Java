package włoski;

public class Slownik {
    private static String[] slowaWl = {"uno", "due", "tre"};
    private static String[] slowaPl = {"jeden", "dwa", "trzy"};
    private static String correct;

    public static String sprawdzWl(String question, String answer){

        for(int i = 0; i < slowaPl.length; i++){
            if(question.equals(slowaPl[i])){
                correct = slowaWl[i];
            }
        }

        if(answer.equals(correct)){
            return "Prawidlowa odpowiedz!";
        }
        return "Bledna odpowiedz, prawdilowa odpowiedz to: " + correct;
    }

    public static String sprawdzPl(String question, String answer){

        for(int i = 0; i < slowaWl.length; i++){
            if(question.equals(slowaWl[i])){
                correct = slowaPl[i];
            }
        }

        if(answer.equals(correct)){
            return "Prawidlowa odpowiedz!";
        }
        return "Bledna odpowiedz, prawdilowa odpowiedz to: " + correct;
    }
}
