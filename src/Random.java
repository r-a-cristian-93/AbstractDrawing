
import java.awt.*;

public abstract class Random {

    public static Color getBlues() {
        int red = (int) (Math.random() * 100);
        int green = 200;
        int blue = 200 + (int)(Math.random() * 50);
        return new Color(red, green, blue);
    }

    public static Color getGreens() {
        int red = 100;
        int green = 200 + (int)(Math.random() * 50);
        int blue = 150;
        return new Color(red, green, blue);
    }

    public static Color getYellows() {
        int red = 200 + (int)(Math.random() * 50);
        int green = 200 + (int)(Math.random() * 50);
        int blue = 50;
        return new Color(red, green, blue);
    }

    public static Color getReds() {
        int red = 200 +(int) (Math.random() * 50);
        int green = 100;
        int blue = 50;
        return new Color(red, green, blue);
    }

    public static Color getMagentas() {
        int red = 200 +(int) (Math.random() * 50);
        int green = 100;
        int blue = 200 +(int) (Math.random() * 50);
        return new Color(red, green, blue);
    }
}
