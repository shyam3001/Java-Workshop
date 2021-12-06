package day4;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SunsetExample extends JPanel implements Runnable {
    static int x = 100;

    @Override
    public void run() {
        try {
            while (true) {
                x = (x+1) % 400;
                Thread.sleep(10);
                repaint();
            }
        } catch (Exception e) {
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        int r = (int)((x%400*256)/400);
        g2.setPaint(new Color(255, r, r));
        g2.fillOval(x, x, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        SunsetExample p = new SunsetExample();
        f.setContentPane(p);
        f.setVisible(true);
        
        new Thread(p).start();
    }
}
