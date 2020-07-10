import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBot extends JFrame {
    //make text field.
    static JTextArea text = new JTextArea();
    static JTextField field=new JTextField();

    public static void main (String [] args){

        //make a frame.
        JFrame frame =new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setTitle("Jarvis Chat-bot");
        frame.add(field);
        frame.add(text);

        //add text area.
        text.setLocation(1,1);
        text.setSize(400,300);

        //field.
        field.setLocation(1,300);
        field.setSize(400,55);

        //action Listener.
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = field.getText();
                text.append("\nUser : "+msg+"\n");

                field.setText(""); //clear field after writing msg.
                if (msg.toLowerCase().contains("hey")){
                    text.append("\nJarvis: Welcome master, are we taking over the world today?\n");
                }
                else if (msg.toLowerCase().contains("hi")){
                    text.append("\nJarvis: Welcome master, are we taking over the world today?\n");
                }
                else if (msg.toLowerCase().contains("bye")){
                    text.append("\nJarvis: bye..btw im starting Skynet - queue Terminator song. \n");
                }
                else if (msg.toLowerCase().contains("no")){
                    text.append("\nJarvis: Too bad...i Had plans\n");
                }
                else {
                    text.append("\nJarvis: Sorry i dont understand that request\n");
                }
            }
        });
    }
}
