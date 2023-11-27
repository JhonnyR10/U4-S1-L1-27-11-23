import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] listaString = new String[3];
        for (int i = 0; i < listaString.length; i++) {
            System.out.println("Inserisci la stringa n: " + (i + 1));
            listaString[i] = input.nextLine();
        }
        input.close();
        System.out.println(listaString[0] + " " + listaString[1] + " " + listaString[2]);
        System.out.println(listaString[2] + " " + listaString[1] + " " + listaString[0]);
    }
}
