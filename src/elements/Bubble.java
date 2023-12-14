package elements;

import java.awt.*;

public class Bubble implements XmasShape {
    int x = 0 ;
    int y = 0;
    double scale = 1.0;
    Color lineColor;
    Color fillColor;

    public Bubble(int x, int y, double scale, Color fillColor, Color lineColor){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }
    public Bubble(int x, int y, double scale, Color fillColor){
        this(x, y, scale, fillColor, Color.BLACK);
    }
    public Bubble(int x, int y, double scale){
        this(x, y, scale, Color.white ,Color.BLACK);
    }
    public Bubble(int x, int y){
        this(x, y, 1.0, Color.white ,Color.BLACK);
    }

    public Bubble(int x, int y, Color color) {
        this(x, y, 1.0, color ,Color.BLACK);
        System.out.println("tworze...");
    }


    @Override
    public void render(Graphics2D g2d) {
        // ustaw kolor wypełnienia
        g2d.setColor(fillColor);
        g2d.fillOval(0,0, 100,100);

        // ustaw kolor obramowania
        g2d.setColor(lineColor);
        g2d.drawOval(0,0,100,100);
    }

    // przemieszczeie obiektu
    @Override
    public void transform(Graphics2D g2d) {
        g2d.scale(1.0, 1.0);
        g2d.translate(x,y);
        g2d.scale(scale,scale);
    }
}