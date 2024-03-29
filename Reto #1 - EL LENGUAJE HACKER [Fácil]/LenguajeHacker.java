/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.ArrayList;
import java.util.Scanner;
/*
 * @Author Samuel Burelos Jerónimo
 */
public class LenguajeHacker {
    
    //Contiene todas las letras y numeros del alfabeto Leet
    static DB db = new DB();

    public static void main(String[] args) {
        //Crear un objeto para poder solicitar entrada de datos vía consola.
        Scanner sc = new Scanner(System.in);
        //Solita una entrada de datos
        System.out.print("Texto: ");
        String txt = sc.nextLine(); //Lo recibe  y guarda en la variable "txt"
        sc.close();
        //Convierte la entrada en lenguaje hacker
        System.out.println("Lenguaje Leet: "+convertToLeet(txt));
    }
    /*
     * Método recursivo que recorre una cadena.
     * @param <c> - Contiene el String a recorrer
     * @return String+[Método recursivo]
     */
    public static String convertToLeet(String c){
        //Valida que haya mas valores que comparar
        if(c.isEmpty())
            return "";
        String leet = indentificarLetter(c.charAt(0), db.alfabeto, 0);
        return leet+convertToLeet(c.substring(1));
    }
    /*
     * Método recursivo que identifica la letra en el lenguaje Leet
     * y retorna su equivalente.
     * @param <char> c - Contiene la letra a buscar
     * @param <ArrayList<LenguajeLeet>> alfabet - Contiene el alfabeto Leet
     * @param <int> index - Contiene el indice de recursividad
     * @return [Método recursivo]
     */
    private static String indentificarLetter(char c, ArrayList<LenguajeLeet> alfabet, int index){
        //Finaliza cuando llegue al final y no encuentre coincidencias
        if(alfabet.size() < index+1)
            return "?";
        //Valida si coincide
        if(alfabet.get(index).Letra.equalsIgnoreCase(c+""))
            return alfabet.get(index).AlfabetoLeet.get(0);
        
        //Si no, entonces sigue buscando
        return indentificarLetter(c, alfabet, index+1);
    }
 }