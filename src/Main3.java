import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo lato del rettangolo");
        float lato1 = Float.parseFloat(input.nextLine());
        System.out.println("Inserisci il secondo lato del rettangolo");
        float lato2 = Float.parseFloat(input.nextLine());
        float perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è : " + perimetro);

        System.out.println("Inserisci un numero per verificare se è pari o dispari");
        int numPoD = Integer.parseInt(input.nextLine());
        System.out.println("Il numero inserito è (true=pari & false=dispari) : " + pariDispari(numPoD));

        System.out.println("Inserisci il primo lato del Triangolo");
        float latoT1 = Float.parseFloat(input.nextLine());
        System.out.println("Inserisci il secondo lato del Triangolo");
        float latoT2 = Float.parseFloat(input.nextLine());
        System.out.println("Inserisci il terzo lato del Triangolo");
        float latoT3 = Float.parseFloat(input.nextLine());
        System.out.println("L'area del rettangolo è : " + perimetroTriangolo(latoT1, latoT2, latoT3));
    }


    public static float perimetroRettangolo(float lato1, float lato2) {
        return (lato1 * 2) + (lato2 * 2);
    }

    public static boolean pariDispari(int num) {
        float modulo = num % 2;
        if (modulo == 0) {
            return true;
        } else {
            return false;
        }
//        Suggerimento di intellij: return modulo==0;

    }

    public static double perimetroTriangolo(float latoT1, float latoT2, float latoT3) {
        double semiperimetro = (latoT1 + latoT2 + latoT3) / 2;

        return Math.sqrt(semiperimetro * (semiperimetro - latoT1) * (semiperimetro - latoT2) * (semiperimetro - latoT3));
    }
}
