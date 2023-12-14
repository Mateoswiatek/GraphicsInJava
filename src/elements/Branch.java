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
    int v_x = 1;
    int v_y = 1;
    double obrot = 1.0;
    Color lineColor = Color.BLACK;
    Color fillColor = Color.GREEN;

    public Branch(int wys, int szer, int v_x, int v_y) {
        this.x1 = this.x2 = this.y1= 0;
        this.y2 = this.y3 = wys;
        this.x3 = szer;
        this.v_x = v_x;
        this.v_y = v_y;
    }
    public Branch(int wys, int szer, int v_x, int v_y, double obrot) {
        this.x1 = this.x2 = this.y1= 0;
        this.y2 = this.y3 = wys;
        this.x3 = szer;
        this.obrot = obrot;
        this.v_x = v_x;
        this.v_y = v_y;
    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.scale(1.0, 1.0);
        g2d.translate(v_x,v_y);
        g2d.scale(obrot, 1.0);
    }

    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor(fillColor);

        int x[] = {x1, x2, x3}; // Wybieramy x1, x2 i x3
        int y[] = {y1, y2, y3}; // Wybieramy y1, y2 i y3
        g2d.fillPolygon(x, y, x.length);
    }
}
