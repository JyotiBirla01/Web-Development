import java.awt.*;
import java.awt.Graphics;

public class Font {
    public static void main(String[] args) {
        // Font[] fonts;
        // fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        // for (int i = 0; i < fonts.length; i++) {
        // System.out.println(fonts[i].getFontName()+":");
        // System.out.println(fonts[i].getFamily()+":");

        // }
        DrawingPanel panel = new DrawingPanel();
        Graphics g = panel.getGraphics();
        g.setFont(new Font("Hello", Font.BOLD, 36));
        g.drawString("Mac", 100, 100);

    }

}
