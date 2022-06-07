package game;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class SwingPaintDemo1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> startaSpel());
    }

    private static void startaSpel() {
        System.out.println("Startat? "+
                SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("We Gamin bois");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,250);


        Player jag = new Player(5,5);
        f.add(new MyPanel(jag));
        f.setVisible(true);

    }
}