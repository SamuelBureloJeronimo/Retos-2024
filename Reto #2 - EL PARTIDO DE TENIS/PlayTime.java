/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */

public class PlayTime {

    private final int MAX_TURNS = 10;
    private final int POINT = 15;

    PlayTime(){
        initGame();
    }
    
    private void initGame(){
        //Jugadores
        int player1 = 0;
        int player2 = 0;

        //Inicia el juego
        int count = 0;
        while (count < this.MAX_TURNS) {
            //Aleatoriamente elige un jugador para darle el puntaje
            int p1_p2 = (int) (Math.random() * 2 + 1);

            //Si cae 1, el punto es para el jugador 1
            if(p1_p2 == 1)
                player1 += this.POINT;

            //Si cae 2, el punto es para el jugador 2
            if(p1_p2 == 2)
                player2 += this.POINT;
            

            //Muestra el marcador
            showStatus(player1, player2);
            count++;
        }
        //Resultados
        if(player1==player2)
            System.out.println("== Partida empatada ==");
        else if(player1>player2)
            System.out.println("== Ha ganado el Jugador 1 ==");
        else if(player1<player2)
            System.out.println("== Ha ganado el Jugador 2 ==");
    }

    private void showStatus(int p1, int p2){
        
        //
        if(p1 == 0 && p2 != 0)
            System.out.println("Love - "+p2);
        //
        else if(p1 != 0 && p2 == 0)
            System.out.println(p1+" - Love");
        else if(p1 > p2){
            System.out.println("--------------");
            System.out.println(p1+" - "+p2);
            System.out.println("*Ventaja p1*");
        } else if(p1 < p2){
            System.out.println("--------------");
            System.out.println(p1+" - "+p2);
            System.out.println("*Ventaja p2*");
        } else if(p1 == p2){
            System.out.println("--------------");
            System.out.println(p1+" - "+p2);
            System.out.println("*Deuce*");
        }
        
    }
    public static void main(String[] args) {
        PlayTime pt = new PlayTime();
    }

}