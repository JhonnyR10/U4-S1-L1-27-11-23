public class Main1 {
    public static void main(String[] args) {

        int moltiplicazione = moltiplica(2, 3);
        System.out.println("Risultato della moltiplicazione " + moltiplicazione);

        String stringaConcatenata = concatena("ciao", 10);
        System.out.println(stringaConcatenata);

        String[] array = {"Ciao", "a tutti", "mi", "chiamo", "Giovanni"};
        String stringa = "Epicoders";

        String[] nuovoArray = inserisciInArray(array, stringa);
        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.println(nuovoArray[i]);
        }
//        System.out.println(Arrays.toString(nuovoArray));
    }

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String string, int num) {
        return string + num;
    }

    public static String[] inserisciInArray(String[] array, String string) {
        String[] nuovoArray = new String[6];

//        for (int i = 0; i < 2; i++) {
//            nuovoArray[i] = array[i];
//        }
//        nuovoArray[2] = string;
//        for (int i = 2; i < 5; i++) {
//            nuovoArray[i + 1] = array[i];
//        }
//        visto che intellij mi suggerisce di usare arraycopy lo faccio!!
        System.arraycopy(array, 0, nuovoArray, 0, 2);
        nuovoArray[2] = string;
        System.arraycopy(array, 2, nuovoArray, 3, 3);
        return nuovoArray;
    }
}