import elements.Branch;
import elements.Bubble;
import elements.Bubbles;
import elements.TreeBranch;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int WIDTH = 1920;
        final int HEIGHT = 1080;
        int srodek_x = 460;
        int pocz_y = 20;


        JFrame frame = new JFrame("Choinka");
        DrawPanel drawPanel =  new DrawPanel();
        TreeBranch treeBranch = new TreeBranch();
        Bubbles bubbles = new Bubbles();

        int new_x = srodek_x;
        int new_y = pocz_y;
        int new_wys = 50;
        int new_szer = 80;
        for(int i = 4; i < 12; i++){
            new_y+=i*5;
            new_wys+=i*5;
            new_szer+=i*7;
            treeBranch.addBranch(new Branch(new_x, new_y , new_wys, new_szer))
                    .addBranch(new Branch(new_x, new_y , new_wys, -new_szer));
            System.out.println("wymiary:");
            System.out.println(new_x);
            System.out.println(new_y);
            bubbles.addBubble(new Bubble(new_x, new_y));
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