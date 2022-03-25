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
public class HinhTron {

    private int xO, yO, r;

    public HinhTron(int xO, int yO, int r) {
        this.xO = xO * 25;
        this.yO = yO * 25;
        this.r = r * 25;
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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public void draw(Graphics2D g, int width, int height) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Presenhem
        int dem = 0;
        int x, y, p, x0;
        p = 3 - 2 * r;
        x = 0;
        y = r;
        while (x < y) { //ve 1/8 duong tron
            g.fillOval(x + width / 2 + xO , y + height / 2 - yO + 25, 5, 5);
                g.fillOval(y + width / 2 + xO , x + height / 2 - yO + 25, 5, 5);
                g.fillOval(-y + width / 2 + xO , x + height / 2 - yO + 25, 5, 5);
                g.fillOval(-x + width / 2 + xO , y + height / 2 - yO + 25, 5, 5);
                g.fillOval(-x + width / 2 + xO , -y + height / 2 - yO + 25, 5, 5);
                g.fillOval(-y + width / 2 + xO , -x + height / 2 - yO + 25 , 5, 5);
                g.fillOval(y + width / 2 + xO , -x + height / 2 - yO + 25, 5, 5);
                g.fillOval(x + width / 2 + xO , -y + height / 2 - yO + 25, 5, 5);
            if (p < 0) {
                p += 4 * x + 6;
            } else {
                p += 4 * (x - y) + 10;
                y -= 5;
            }
            x += 5;
        }
    }
}
