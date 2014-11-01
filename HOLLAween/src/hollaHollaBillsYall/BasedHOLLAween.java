package hollaHollaBillsYall;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class BasedHOLLAween extends JApplet{


		  public void paint(Graphics g)
		  {
			Dimension appletSize = this.getSize();
		    int appletHeight = appletSize.height;
		    int appletWidth = appletSize.width;
		    super.paint(g);
		    g.setColor(Color.BLACK);
		    g.fillRect(0,0,(int)(appletWidth),(int)(appletHeight));
		    g.setColor(Color.RED);
		    
		    g.setFont(new Font("TimesRoman", Font.BOLD, 36));
		    g.drawString( "RED RUM", (int)(appletWidth/2.8), 30);
		    validate();
		    
		    //Random Lines!!!
		    
		    g.fillRect((int)(appletWidth/20),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/5),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    
  
		    g.fillRect((int)(appletWidth/10),(int)(appletHeight*0.2),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/30),(int)(appletHeight*0.2),(int)(appletWidth/32),(int)(appletHeight/2));
		    
		    g.fillRect((int)(appletWidth/15),(int)(appletHeight*0.2),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/8),(int)(appletHeight*0.2),(int)(appletWidth/32),(int)(appletHeight/2));
		    
		  
		    g.fillRect((int)(appletWidth/4.7),(int)(appletHeight/1.87),(int)(appletWidth/32),(int)(appletHeight/6));
		    
		    
		    g.fillRect((int)(appletWidth/3.9),(int)(appletHeight*0.2),(int)(appletWidth/32),(int)(appletHeight/2));
		    
		    
		    g.fillRect((int)(appletWidth/3),(int)(appletHeight*0.2),(int)(appletWidth/32),(int)(appletHeight/2));
		    
		    
		    g.fillRect((int)(appletWidth/2.5),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/2.7),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    
		    
		    g.fillRect((int)(appletWidth/2.1),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/1.91),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/1.75),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		 
		    
		   
		    g.fillRect((int)(appletWidth/1.3),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/1.5),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    
		    g.fillRect((int)(appletWidth/1.18),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		    g.fillRect((int)(appletWidth/1.1),(int)(appletHeight*0.5),(int)(appletWidth/32),(int)(appletHeight/2));
		  }
		}
