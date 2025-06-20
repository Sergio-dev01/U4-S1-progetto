package entities;

import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        if (luminosita > 0) {
            luminosita++;
        }
    }

    public void diminuisciLuminosita() {
        if (luminosita < 100) {
            luminosita--;
        }
    }

    public void alzaVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Titolo: " + titolo);

            System.out.print("Volume : ");
            for (int j = 0; j < volume; j++) {
                System.out.print("" + "!");
            }

            System.out.print("luminosita : ");
            for (int k = 0; k < luminosita; k++) {
                System.out.print("" + "*");
            }

            System.out.println();
        }
    }

    @Override
    public void esegui() {
        play();
    }
}
