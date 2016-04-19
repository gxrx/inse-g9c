/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Oli
 */
public class draw extends JPanel{
    
    
    public void draw(){
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        g.fillRect(10, 15, 100, 20);   //draw rectangle with blue fill
        g.drawRect(100, 125, 200, 200);
        g.drawRect(500, 125, 200, 200);
        g.fillRect(300, 200, 125, 25); //arrow
        g.fillPolygon(new int[] {425, 425, 500}, new int[] {250, 175, 210}, 3); //arrow   
        
        JLabel label1 = new JLabel();
        label1.setText("1.1 Choosing Roles");
        label1.setBounds(140, 180, 200, 50);
        add(label1);
        
        
    }
}
