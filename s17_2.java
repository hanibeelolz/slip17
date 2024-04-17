import java.awt.*; 
import javax.swing.*; 
public class NumberDisplay implements Runnable { 
private JTextField textField; 
public NumberDisplay(JTextField textField) { 
this.textField = textField; 
} 
public void run() { 
for (int i = 1; i <= 100; i++) { 
textField.setText(Integer.toString(i)); 
try { 
Thread.sleep(100); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
} 
} 
public static void main(String[] args) { 
JFrame frame = new JFrame("Number Display"); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
JTextField textField = new JTextField(10); 
JButton button = new JButton("Start"); 
JPanel panel = new JPanel(); 
panel.add(textField); 
panel.add(button); 
frame.add(panel, BorderLayout.CENTER); 
frame.pack(); 
frame.setVisible(true); 
button.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) { 
NumberDisplay numberDisplay = new NumberDisplay(textField); 
Thread thread = new Thread(numberDisplay); 
thread.start(); 
} 
}); 
} 
}
