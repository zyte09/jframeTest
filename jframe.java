import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class jframe { 
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //create a new frame
        frame.setTitle("JFrame title goes here"); //set the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the exit option
        frame.setResizable(false); //prevent the window from resizing
        frame.setSize(420, 420); //set x, y, width and height
        frame.setVisible(true); //show the frame

        ImageIcon image = new ImageIcon("pochi.jpg"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change the icon
        frame.getContentPane().setBackground(new Color(0, 255, 255)); //change bg color or //(Color.green)
    }
}   