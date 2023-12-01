package Multimedia;

import Interface.Luminosità;
import Interface.Volume;
import elementoMultimediale.Element;
import Interface.Luminosità;
public class Video extends Element implements Volume, Luminosità {
    private int Volume;
    private int Luminosità;

    public Video(String titolo, int volume, int luminosità) {
        super(titolo);
        this.volume = volume;
        this.luminosità = luminosità;
}
    @Override
    public void alzaVolume() {
        if (volume <= 0)
            volume++;
        else {
            System.out.println("lil volume deve essere alzata");

        }

    };
    @Override
    public void abbassaVolume() {
        if (volume <= 0)
            volume++;
        else {
            System.out.println("lil volume deve essere abbassato");

        }

    }
    @Override
    public void alzaLuminosità() {
        if (luminosità <= 0)
            luminosità++;
        else {
            System.out.println("la luminosità deve essere alzata");

        }

    }

    ;

    @Override
    public void abbassaLuminosità() {
        if (luminosità >= 5)
            luminosità--;
        else {
            System.out.println("la luminosità deve essere abbassata");
        }

    }
    @Override
    public String toString(){return "titolo: " + getTitolo()+ " "  + "volume: " + volume + " " + "luminosità: " + luminosità;
}}