import Multimedia.Audio;
import Multimedia.Image;
import Multimedia.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Image picture = new Image("img di sfondo", 3);
        System.out.println(picture);
        Audio vol = new Audio("il ballo delle incertezze", 4);
        System.out.println(vol);
        Video maker = new Video("mi corazoncito", 4, 3);
        System.out.println(maker);
    }
}