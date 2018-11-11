import javax.swing.*;
import java.awt.*;

public class PlayGround extends JFrame
{
   public PlayGround()
   {
      init();
   }
   
   private void init()
   {
      JButton quitButton = new JButton("Quit");
      quitButton.addActionListener((event)->System.exit(0));
      
      createLayout(quitButton);
      
      
      
      setTitle("Test 1");      //title at the top of the window
      setSize(300,300);        //(wide,tall) inital size of the window
      setLocationRelativeTo(null);   //relative location on screen
      setDefaultCloseOperation(EXIT_ON_CLOSE); //what happens when you click on close
   
   } //end of init 
   
   
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() ->
      {
         PlayGround ex = new PlayGround();
         ex.setVisible(true);
      });
   }
}