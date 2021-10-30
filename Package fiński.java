package fiński;

public class Slownik {
    private static String[] slowaFi = {"yksi","kaksi","kolme"};
    private static String[] slowaPl = {"jeden", "dwa", "trzy"};
    private static String correct;

    public static String sprawdzFi(String question, String answer){

        for(int i = 0; i < slowaPl.length; i++){
            if(question.equals(slowaPl[i])){
                correct = slowaFi[i];
            }
        }

        if(answer.equals(correct)){
            return "Prawidlowa odpowiedz!";
        }
        return "Bledna odpowiedz, prawdilowa odpowiedz to: " + correct;
    }

    public static String sprawdzPl(String question, String answer){

        for(int i = 0; i < slowaFi.length; i++){
            if(question.equals(slowaFi[i])){
                correct = slowaPl[i];
            }
        }

        if(answer.equals(correct)){
            return "Prawidlowa odpowiedz!";
        }
        return "Bledna odpowiedz, prawdilowa odpowiedz to: " + correct;
    }
}

