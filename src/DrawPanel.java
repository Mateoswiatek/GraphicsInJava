
import elements.Branch;
import elements.XmasShape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class DrawPanel extends JPanel {
    List<XmasShape> shapes = new ArrayList<>();
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        shapes.forEach(s -> s.draw((Graphics2D)g));
    }
    public DrawPanel addElement(XmasShape el){
        shapes.add(el);
        return this;
    }
    public DrawPanel addElementAll(List<XmasShape> el){
        shapes.addAll(el);
        return this;
    }


    DrawPanel(){
        setBackground(new Color(25, 110, 177));
//        setOpaque(true);
    }

}