//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.PrintStream;

public class Main {
    public static void main(String[] var0) {
        Point var1 = new Point();
        PrintStream var10000 = System.out;
        double var10001 = var1.getx();
        var10000.println("p1: (" + var10001 + ", " + var1.gety() + ")");
        Point var2 = new Point((double)3.0F, (double)4.0F);
        var10000 = System.out;
        var10001 = var2.getx();
        var10000.println("p2: (" + var10001 + ", " + var2.gety() + ")");
        double var3 = var1.distance(var2);
        System.out.println("Distance p1 -> p2 = " + var3);
        double var5 = var2.distance((double)6.0F, (double)8.0F);
        System.out.println("Distance p2 -> (6,8) = " + var5);
    }
}
