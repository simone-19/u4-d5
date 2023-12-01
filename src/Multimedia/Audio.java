package Multimedia;
import Interface.Volume;
import elementoMultimediale.Element;

public class Audio extends Element implements Volume {
    private int volume;
    public Audio(String titolo, int volume) {
        super(titolo);
        this.volume = volume;
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
    public String toString(){return "titolo: " + getTitolo()+ " "  + "volume: " + volume;
}}


