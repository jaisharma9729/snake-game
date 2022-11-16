import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class Frame extends JFrame{
    Frame (){
        //adding the panel to the snake
        this.add(new Panel() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.setTitle("snake");
        //setting the closing action to close all intances of jframe
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ensuring uniformly of the panel
        this.setResizable(false);
        //ensuring system preffered size is set
        this.pack();
        //displaying the panel to the user
        this.setVisible(true);
        //ensuring the game starts at the center of the display
        this.setLocationRelativeTo(null);
    }
}