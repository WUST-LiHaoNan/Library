package com.dhz.librarydemo;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

   public class Loginpanel extends JPanel{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ImageIcon icon;
	   public int width,height;
	   public Loginpanel(){
		   super();
		   icon=new ImageIcon("./images/logn.jpg"); 
		   width=icon.getIconWidth();
		   height=icon.getIconHeight();
		   setSize(width, height);
	   }
    	
    	public void paintComponent(Graphics g){
    		
    		super.paintComponent(g);
    		Image img=icon.getImage();
    		g.drawImage(img, 0, 0,getParent());
    	}
   }
//    	
    	
    	
    	
