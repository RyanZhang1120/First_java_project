import acm.graphics.*;
import java.awt.Color;

public class UFO extends GCompound 
{
  
   public UFO()
   {

      GOval utop = new GOval(13, 0, 34, 20);
      GOval umid = new GOval(0, 10, 60, 18);
      GOval ubot = new GOval(20, 20, 20, 8);
      
      utop.setFilled(true);
      umid.setFilled(true);
      utop.setFillColor(new Color(71, 230, 113));
      ubot.setFilled(true);
      umid.setFillColor(new Color(135, 95, 237));    
      ubot.setFillColor(new Color(13, 130, 0));


      add(utop);
		add(umid);
		add(ubot);
   }
}