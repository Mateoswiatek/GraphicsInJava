import elements.Branch;
import elements.Bubble;
import elements.Bubbles;
import elements.TreeBranch;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int WIDTH = 1920;
        final int HEIGHT = 1080;


        JFrame frame = new JFrame("Choinka");
        DrawPanel drawPanel =  new DrawPanel();
        TreeBranch treeBranch = new TreeBranch();
        Bubbles bubbles = new Bubbles();


        int pol_x = WIDTH/2;
        int pol_y = 20;
        int start_wysokosc = 120;
        int start_szerokosc = 200;
        for(int i = 6; i < 12; i++){
            start_wysokosc+=i*6;
            start_szerokosc+=i*7;
            pol_y+=i*10;
            Random random = new Random();
            int[] radcolor = new int[6];

            for (int j = 0; j < radcolor.length; j++) {
                radcolor[j] = random.nextInt(256); // Losowanie liczby w zakresie od 0 do 255
            }
            System.out.println("ilosc elementow: " + (i));
            treeBranch.addBranch(new Branch(start_wysokosc, start_szerokosc, pol_x, pol_y))
                   .addBranch(new Branch(start_wysokosc, start_szerokosc, pol_x, pol_y, -1.0));

            bubbles.addBubble(new Bubble(pol_x + start_szerokosc, start_szerokosc+pol_y, new Color(radcolor[0], radcolor[1], radcolor[2])))
                    .addBubble(new Bubble(pol_x - start_szerokosc-80, start_szerokosc+pol_y, new Color(radcolor[3], radcolor[4], radcolor[5])));
        }

        // niestety takie coś wywala :(
        //drawPanel.addElementAll(treeBranch.getBranches());
        treeBranch.getBranches().forEach(drawPanel::addElement);
        bubbles.getBubblesList().forEach(drawPanel::addElement);

        frame.setContentPane(drawPanel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}