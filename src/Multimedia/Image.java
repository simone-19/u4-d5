package Multimedia;

import Interface.Luminosità;
import com.sun.tools.javac.Main;
import elementoMultimediale.Element;

public class Image extends Element implements Luminosità {
    //attributi
    private int luminosità;

    //costruttori
    public Image (String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }
    ;


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
public String toString(){return "titolo: "+ getTitolo()+" " + "luminosità " + luminosità;
}}