package MyClasses;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Functions {
    public void displayImage(int width, int height, String imagePath, JLabel label){ //Displays the logo in the dashboard
        //Gets the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        //Scales the image
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        //Sets the image to the container
        label.setIcon(new ImageIcon(image));
    }
}
