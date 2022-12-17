/*Esercizio 7:
Domanda: Qual è l'output generato dal codice seguente?
char lettera = 'B';
    switch (lettera) {
    case 'A':
    case 'a':
        System.out.println("Un tipo di A.");
    case 'B':
    case 'b':
       System.out.println("Un tipo di B.");
    break ;
    default :
        System.out.println("Altro.");
        break ; }

        LA RISPOSTA È:
        Un tipo di B
*/
import java.util.Scanner;
public class Es7_DomandaAB {
    public static void main(String[] args) {
        Scanner lett= new Scanner(System.in);
        System.out.println("LETTERA A o B\n");
        System.out.print("Ingressa A o B: ");
        String lettera= lett.nextLine();
        switch (lettera) {
            case "A":
            case "a":
                System.out.println("Un tipo di A.");
                break;
            case "B":
            case "b":
                System.out.println("Un tipo di B.");
                break ;
            default :
                System.out.println("Altro.");
                break ; }
    }
}