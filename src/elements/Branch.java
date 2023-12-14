package elements;

import java.awt.*;

public class Branch implements XmasShape{
    int x1, y1, x2, y2, x3, y3;
    // x1 y1
    // x2 y2       x3 y3
    // bo y3 niekoniecznie musi być jak y2
    // domyslnie: pinonow prosto, poziomomo prosto
    // x1 y1
    // x1 y2        x3 y2
    double vector[] = {0.0, 0.0};
    Color lineColor = Color.BLACK;
    Color fillColor = Color.GREEN;

    public Branch(int x1, int y1, int x2, int y2, int x3, int y3, double[] vector, Color lineColor, Color fillColor){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.vector = vector;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }
    public Branch(int x, int y, int wys, int szer, double[] vector) {
        this.x1 = this.x2 = x;
        this.y1 = y;
        this.y2 = this.y3 = y + wys;
        this.x3 = x1 + szer;
        this.vector = vector;
    }
    public Branch(int x, int y, int wys, int szer) {
        this.x1 = this.x2 = x;
        this.y1 = y;
        this.y2 = this.y3 = y + wys;
        this.x3 = x1 + szer;
    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.translate(vector[0],vector[1]);
        g2d.scale(1.0, 1.0);
    }

    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor(fillColor);

        int x[] = {x1, x2, x3}; // Wybieramy x1, x2 i x3
        int y[] = {y1, y2, y3}; // Wybieramy y1, y2 i y3
        g2d.fillPolygon(x, y, x.length);
    }
}
