package sweetpos;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;

public class SplashScreen extends JFrame {

    private static final String GIF_PATH = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\sweetpos\\src\\resources\\splashScreen.gif";

    public SplashScreen() {
        setUndecorated(true);
        setLayout(new BorderLayout());

        try {
            File gifFile = new File(GIF_PATH);
            URL gifUrl = gifFile.toURI().toURL();

            JLabel splashLabel = new JLabel(new ImageIcon(gifUrl));
            add(splashLabel, BorderLayout.CENTER);

            setSize(1280, 720);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Timer timer = new Timer();
            timer.schedule(new java.util.TimerTask() {
                @Override
                public void run() {
                    setVisible(false);
                    EventQueue.invokeLater(() -> {
                        new login().setVisible(true);
                    });
                }
            }, 4800); // Set the splash screen duration in milliseconds (e.g., 3000 for 3 seconds)
        
        } catch (MalformedURLException e) {
        }
    }
}
