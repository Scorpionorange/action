import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/08/26.
 */
public class mainTest {
    public static void main(String[] args){

        /*
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                JFrame af = new ActionFrame();
                af.setTitle("ActionFrame");
                af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                af.setVisible(true);
            }
        });
        */
        EventQueue.invokeLater(() -> {
            JFrame af = new ActionFrame();
            af.setTitle("ActionFrame");
            af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            af.setVisible(true);
        });
    }
}
