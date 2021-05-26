import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class ShowPicture 
{
 public static void main(String args[]) 
 {
  JFrame frame = new JFrame("JIMNY");
  ImageIcon icon = new ImageIcon("jimny.jpg");//you can put any image of amy image format
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
}