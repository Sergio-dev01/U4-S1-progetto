import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        boolean continua = true;

        for (int i = 0; i < elementi.length && continua; i++) {
            System.out.println("Scegli il contenuto multimediale da eseguire: [0: Per uscire dal programma | 1: Immagine | 2: Audio | 3:Video] ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 0:
                    System.out.println("Uscita dal programma...");
                    continua = false;
                    break;
                case 1:
                    System.out.println("Inserisci titolo del contenuto: ");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaImmagine = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    System.out.println("--------------------");

                    elementi[i].esegui();
                    break;
                case 2:
                    System.out.println("Inserisci titolo del contenuto: ");
                    titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    System.out.println("--------------------");

                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    elementi[i].esegui();
                    break;
                case 3:
                    System.out.println("Inserisci titolo del contenuto: ");
                    titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();

                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    System.out.println("--------------------");
                    elementi[i].esegui();
                    break;
                default:
                    System.out.println("Tipo non valido !");
                    i--;
                    break;
            }
        }

    }
}