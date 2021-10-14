
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
        var start = new Processor("horse.jpg");
        //.rotatedNearestNeighbor(1)
        //.crop(10,10,300,300)
        //.translateNearestNeighbor(50,50)
        start.histogram(20000).save("histogram.png");
        start.brighten(100)
        .save("done.png")
        .histogram(20000)
        .save("histogram2.png");
    }
}
