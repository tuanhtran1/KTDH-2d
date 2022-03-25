/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Tu Tran
 */
public class TamGiacDeu {

    private int xDinh, yDinh, canh;

    public TamGiacDeu(int xDinh, int yDinh, int canh) {
        this.xDinh = xDinh*25;
        this.yDinh = yDinh*25;
        this.canh = canh*25;
    }

    public int getxDinh() {
        return xDinh;
    }

    public void setxDinh(int xDinh) {
        this.xDinh = xDinh;
    }

    public int getyDinh() {
        return yDinh;
    }

    public void setyDinh(int yDinh) {
        this.yDinh = yDinh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public void draw(Graphics2D g, int width, int height)
        {
            g.setColor(Color.RED);  //dat mau hinh ve la red
            //khai bao tọa độ các đỉnh
            int xA, yA, xB, yB, xC, yC;
            xA = xDinh + width/2;
            yA = height/2 - yDinh  + 25;
            
            xB = xDinh - canh /2 + width /2  ;
            yB = height/2 -(int) (yDinh - canh*Math.sin(Math.PI/3)) + 25;
       
            xC = xDinh + canh/2 + width/2 ;
            yC = yB;
            /*int xA, yA, xB, yB, xC, yC;
            xA = xDinh ;
            yA = yDinh ;
            
            xB = xDinh - canh /2;
            yB = (int) (yDinh - canh*Math.sin(Math.PI/3));
       
            xC = xDinh + canh/2;
            yC = yB;*/
  
            //Vẽ Cạnh bên trái
            //DoanThang ab = new DoanThang(xA,yA,xB,yB);
            //ab.draw((Graphics2D)g, width, height);
            g.drawLine(xA, yA, xB, yB);
            //vẽ cạnh bên phải
            g.drawLine(xA, yA, xC, yC);
            //DoanThang ac = new DoanThang(xA,yA,xC,yC);
            //ac.draw(g, width, height);
            //Vẽ cạnh đáy
            g.drawLine(xB, yB, xC, yC);
            //DoanThang bc = new DoanThang(xB,yB,xC,yC);
            //bc.draw(g, width, height);
        }
    }
