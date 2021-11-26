/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double degreesX1 = Double.parseDouble(args[0]);
        double degreesY1 = Double.parseDouble(args[1]);
        double degreesX2 = Double.parseDouble(args[2]);
        double degreesY2 = Double.parseDouble(args[3]);
        double x1 = Math.toRadians(degreesX1);
        double y1 = Math.toRadians(degreesY1);
        double x2 = Math.toRadians(degreesX2);
        double y2 = Math.toRadians(degreesY2);
        double xx = ((x2 - x1) / 2);
        double sinxx = Math.sin(xx);
        double sin2X = sinxx * sinxx;
        double cosx1 = Math.cos(x1);
        double cosx2 = Math.cos(x2);
        double yy = ((y2 - y1) / 2);
        double sinyy = Math.sin(yy);
        double sin2Y = sinyy * sinyy;
        double valueIn = sin2X + cosx1 * cosx2 * sin2Y;
        double valueOut = Math.sqrt(valueIn);
        double arcsin = Math.asin(valueOut);
        double distance = 2 * 6371 * arcsin;

        System.out.print(distance);
        System.out.println(" kilometers");


    }
}
