
import javax.swing.JOptionPane;
public class HelloNameDIalog {
    public static void main(String[] args) {
        String results;
            String name = JOptionPane.showInputDialog("Enter your name:");
            JOptionPane.showMessageDialog(null, "Hi, " + name + "!");
        }
    }
