import java.util.ArrayList;

public class LenguajeLeet {

    ArrayList<String> AlfabetoLeet = new ArrayList<>();

    //Atributos de clase
    String Letra;

    //Constructor de clase
    public LenguajeLeet(String Letra){
        this.Letra = Letra;
    }
    
    public void add (String letter) {
        this.AlfabetoLeet.add(letter);
    }
}
