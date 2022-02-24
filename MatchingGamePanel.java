import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/* Andre Austin - Virginia Commonwealth University */

/* 
  Panel of the application to be displayed inside a JFrame
  and manipulated there.
*/   
public class MatchingGamePanel extends JPanel
{
	private JButton heat, lakers, thunder, warriors, clippers, rockets;
	
	private JButton bam, lebron, kawhi, curry, cp3, harden;
	
	private JLabel game;
   
   private boolean lal=false;
   private boolean mia=false;
   private boolean okc=false;
   private boolean gs=false;
   private boolean lac=false;
   private boolean hou=false;
   private boolean adebayo=false;
   private boolean james=false;
   private boolean leonard=false;
   private boolean steph=false;
   private boolean paul=false;
   private boolean jh3=false;
   
   private int count=0;
   private int c=0;

   	
	public MatchingGamePanel()
	{	
		/* creating buttons */
      warriors = new JButton("");
      lakers = new JButton("");
      heat = new JButton("");
		clippers = new JButton("");
      thunder = new JButton("");
	 	rockets = new JButton("");	
		bam = new JButton("");
		lebron = new JButton("");
		kawhi = new JButton("");
		curry = new JButton("");
	 	cp3 = new JButton("");
		harden = new JButton("");
      
		/* setting icons for prior buttons */
		lakers.setIcon(new ImageIcon("lakers.jpg"));
      warriors.setIcon(new ImageIcon("warriors.jpg"));
      heat.setIcon(new ImageIcon("heat.jpg"));
		thunder.setIcon(new ImageIcon("thunder.jpg"));
      rockets.setIcon(new ImageIcon("rockets.jpg"));
		clippers.setIcon(new ImageIcon("clippers.jpg"));
		bam.setIcon(new ImageIcon("bam.jpg"));
		lebron.setIcon(new ImageIcon("lebron.jpg"));
		kawhi.setIcon(new ImageIcon("kawhi.jpg"));
		curry.setIcon(new ImageIcon("curry.jpg"));
		cp3.setIcon(new ImageIcon("cp3.jpg"));
		harden.setIcon(new ImageIcon("harden.jpg"));
		
		/* creating layout for the game */
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
      JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
      /* placing teams on lower panel of the frame */
		southPanel.add(lakers);
      southPanel.add(heat);
		southPanel.add(warriors);
      southPanel.add(rockets);
		southPanel.add(clippers);
      southPanel.add(thunder);
      
      JLabel l = new JLabel("CHOOSE A PLAYER **FIRST**, THEN MATCH HIM TO HIS APPROPRIATE TEAM!", JLabel.CENTER);
      l.setAlignmentX(0);
      l.setAlignmentY(0);
      centerPanel.add(l);
		
      /* placing players on upper panel of the frame */
		northPanel.add(bam);
		northPanel.add(lebron);
		northPanel.add(kawhi);
		northPanel.add(curry);
		northPanel.add(cp3);
		northPanel.add(harden);
		
      /* adding panels to JFrame using BorderLayout style */
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
      add(centerPanel, BorderLayout.CENTER);
      
      /* giving actions to the buttons created */
      lebron.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            james=true;
            if(lal==true && james==true && count==2)  {
                lakers.setIcon(new ImageIcon("check.jpg"));
                lebron.setIcon(new ImageIcon("check.jpg"));
                count=0;
                lal=false;
                james=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      lakers.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            lal=true;
            if(lal==true && james==true && count==2)  {
                lakers.setIcon(new ImageIcon("check.jpg"));
                lebron.setIcon(new ImageIcon("check.jpg"));
                count=0;
                lal=false;
                james=false;
                c++;
            }
            else if(count==2) {
               count=0;
            }
         }
      });

		bam.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            adebayo=true;
            if(mia==true && adebayo==true && count==2)  {
                heat.setIcon(new ImageIcon("check.jpg"));
                bam.setIcon(new ImageIcon("check.jpg"));
                count=0;
                adebayo=false;
                mia=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      heat.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            mia=true;
            if(mia==true && adebayo==true && count==2)  {
                heat.setIcon(new ImageIcon("check.jpg"));
                bam.setIcon(new ImageIcon("check.jpg"));
                count=0;
                adebayo=false;
                mia=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      kawhi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            leonard=true;
            if(leonard==true && lac==true && count==2)  {
                kawhi.setIcon(new ImageIcon("check.jpg"));
                clippers.setIcon(new ImageIcon("check.jpg"));
                count=0;
                lac=false;
                leonard=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      clippers.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            lac=true;
            if(leonard==true && lac==true && count==2)  {
                kawhi.setIcon(new ImageIcon("check.jpg"));
                clippers.setIcon(new ImageIcon("check.jpg"));
                count=0;
                lac=false;
                leonard=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      cp3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            paul=true;
            if(paul==true && okc==true && count==2)  {
                cp3.setIcon(new ImageIcon("check.jpg"));
                thunder.setIcon(new ImageIcon("check.jpg"));
                count=0;
                okc=false;
                paul=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      thunder.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            okc=true;
            if(paul==true && okc==true && count==2)  {
                cp3.setIcon(new ImageIcon("check.jpg"));
                thunder.setIcon(new ImageIcon("check.jpg"));
                count=0;
                okc=false;
                paul=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      curry.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            steph=true;
            if(steph==true && gs==true && count==2)  {
                warriors.setIcon(new ImageIcon("check.jpg"));
                curry.setIcon(new ImageIcon("check.jpg"));
                count=0;
                steph=false;
                gs=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      warriors.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            gs=true;
            if(steph==true && gs==true && count==2)  {
                warriors.setIcon(new ImageIcon("check.jpg"));
                curry.setIcon(new ImageIcon("check.jpg"));
                count=0;
                steph=false;
                gs=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      harden.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            jh3=true;
            if(jh3==true && hou==true && count==2)  {
                harden.setIcon(new ImageIcon("check.jpg"));
                rockets.setIcon(new ImageIcon("check.jpg"));
                count=0;
                jh3=false;
                hou=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
      
      rockets.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            count++;
            hou=true;
            if(jh3==true && hou==true && count==2)  {
                harden.setIcon(new ImageIcon("check.jpg"));
                rockets.setIcon(new ImageIcon("check.jpg"));
                count=0;
                jh3=false;
                hou=false;
                c++;
            }
            else if(count==2)
               count=0;
         }
      });
	}
}  
