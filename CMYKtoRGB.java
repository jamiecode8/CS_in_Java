/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yello = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        double white = (1 - black);
        double d_redCode = 255 * white * (1 - cyan);
        double d_greenCode = 255 * white * (1 - magenta);
        double d_blueCode = 255 * white * (1 - yello);
        int redCode = (int) d_redCode;
        int greenCode = (int) d_greenCode;
        int blueCode = (int) d_blueCode;
        System.out.print("red = ");
        System.out.println(redCode);
        System.out.print("green = ");
        System.out.println(greenCode);
        System.out.print("blue = ");
        System.out.println(blueCode);

    }
}
