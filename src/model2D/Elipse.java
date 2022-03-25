/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;

import java.awt.Color;
import java.awt.Graphics2D;
import static java.lang.Math.pow;

/**
 *
 * @author Tu Tran
 */
public class Elipse {

    private int xO, yO, a, b;

    public Elipse(int xO, int yO, int a, int b) {
        this.xO = xO * 25;
        this.yO = yO * 25;
        this.a = a * 25;
        this.b = b * 25;
    }

    public int getxO() {
        return xO;
    }

    public void setxO(int xO) {
        this.xO = xO;
    }

    public int getyO() {
        return yO;
    }

    public void setyO(int yO) {
        this.yO = yO;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void draw (Graphics2D g, int width, int height) 
    {
        // Thuat toan Bressenhem
        g.setColor(Color.RED);
        int dem = 0;
        float p,a2,b2;
        int x,y;
        a2=(float) pow(a,2);
        b2=(float) pow(b,2);
        x=0;
        y=b;

        p=2*((float)b2/a2)-(2*b)+1;

        //ve nhanh thu 1(tu tren xuong )
        while(((float)b2/a2)*x<=y)
        {
            if (dem < 3) {
                g.fillOval(x + width / 2 + xO  , -y + height / 2 - yO + 25, 5, 5);
                g.fillOval(-x + width / 2 + xO , -y + height / 2 - yO+ 25 , 5, 5);
                dem++;
            } else if (dem < 5) {
                dem++;
            } else {
                dem = 0;
                g.fillOval(x + width / 2 + xO , -y + height / 2 - yO+ 25 , 5, 5);
                g.fillOval(-x + width / 2 + xO , -y + height / 2 - yO + 25, 5, 5);
            }
            g.fillOval(x + width / 2 + xO , y + height / 2 - yO+ 25 , 5, 5);
            g.fillOval(-x + width / 2 + xO , y + height / 2 - yO+ 25 , 5, 5);
            if(p<0)
            {
                p=p+2*((float)b2/a2)*(2*x+3);
            }
            else{
                p= p- 4*y + 2*((float)b2/a2)*(2*x+3);
                y -= 5;
            }
            x += 5;
        }
        //ve nhanh thu 2(tu duoi len )
        y=0;
        x=a;
        p=2*((float)a2/b2)-2*a+1;
        while(((float)a2/b2)*y<=x)
        {
            if (dem < 3) {
                g.fillOval(x + width / 2 + xO , -y + height / 2 - yO+ 25 , 5, 5);
                g.fillOval(-x + width / 2 + xO , -y + height / 2 - yO+ 25 , 5, 5);
                dem++;
            } else if (dem < 5) {
                dem++;
            } else {
                dem = 0;
                g.fillOval(x + width / 2 + xO , -y + height / 2 - yO+ 25 , 5, 5);
                g.fillOval(-x + width / 2 + xO , -y + height / 2 - yO + 25, 5, 5);
            }
            g.fillOval(x + width / 2 + xO , y + height / 2 - yO + 25, 5, 5);
            g.fillOval(-x + width / 2 + xO , y + height / 2 - yO + 25, 5, 5);
            if(p<0)
            {
                p=p +2*((float)a2/b2)*(2*y+3);
            }
            else
            {
                p=p- 4*x + 2*((float)a2/b2)*(2*y+3);
                x = x - 5;
            }
            y = y + 5;
        }
    }
    
}