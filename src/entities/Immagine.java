package entities;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
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

    public void show() {
        System.out.println("Titolo: " + titolo);
        System.out.print("Luce schermo: ");
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public void esegui() {
        show();

    }
}
