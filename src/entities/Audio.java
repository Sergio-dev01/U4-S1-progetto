package entities;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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
            String p = "";
            for (int j = 0; j < volume; j++) {
                p = p + "!";
            }
            System.out.println(titolo + p);
        }
    }

    @Override
    public void esegui() {
        play();
    }
}
