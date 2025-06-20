import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Scegli il contenuto da eseguire: [1: Immagine - 2: Audio] ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci titolo del contenuto: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaImmagine = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    System.out.println("--------------------");
                    elementi[i].esegui();
                    break;
                case 2:
                    System.out.println("Durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Volume: ");
                    int volumeAudio = scanner.nextInt();
                    System.out.println("--------------------");
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    elementi[i].esegui();
                    break;
                default:
                    System.out.println("Tipo non valido !");
            }
        }
    }
}