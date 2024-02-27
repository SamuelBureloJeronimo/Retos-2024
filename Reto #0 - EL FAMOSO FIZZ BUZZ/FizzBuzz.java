/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

 public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz(1, 100);
    }
    private static String fizzbuzz(int index, int limit){
        //Verificar si ya llego al limite
        if(index > limit)
            return "";
        //Validar si es multiplo de 3 y 5 a la vez
        if(index%3 == 0 && index%5 == 0){
            System.out.println("["+index+"]: "+"FizzBuzz");
        } else
        //Validar si es multiplo de 5
        if(index%5 == 0){
            System.out.println("["+index+"]: "+"Buzz");
        } else
        // Validar si es multiplo de 3
        if(index%3 == 0){
            System.out.println("["+index+"]: "+"Fizz");
        } else
        //Si no es multiplo de 5 o 3
            System.out.println("["+index+"]");
        //Retorna un método recursivo
        return "\n"+fizzbuzz(index+1, limit);
    }
}