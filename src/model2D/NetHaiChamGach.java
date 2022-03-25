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
public class NetHaiChamGach {

    private int x1, x2, y1, y2;

    public NetHaiChamGach(int x1, int y1, int x2, int y2) {
        this.x1 = x1 * 25;
        this.y1 = y1 * 25;
        this.x2 = x2 * 25;
        this.y2 = y2 * 25;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void draw(Graphics2D g, int width, int height) {
        g.setColor(Color.RED);  //dat mau hinh ve la red
        int dem = 0;
        int x, y, Dx, Dy, p;
        Dx = Math.abs(x2 - x1);
        Dy = Math.abs(y2 - y1);

        x = x1;
        y = y1;
        int x_unit = 1, y_unit = 1;

        g.fillOval(x + width / 2 , height / 2 - y , 2, 2);

        //xét trường hợp để cho y_unit và x_unit để vẽ tăng lên hay giảm xuống
        if (x2 - x1 < 0) {
            x_unit = -x_unit;
        }
        if (y2 - y1 < 0) {
            y_unit = -y_unit;
        }
        if (Dx >= Dy) {
            p = 2 * Dy - Dx;

            while (x != x2) {
                if (p < 0) {
                    p += 2 * Dy;
                } else {
                    p += 2 * (Dy - Dx);
                    y += y_unit;
                }
                x += x_unit;
                if (dem < 10) {
                    g.fillRect(x + width/2 , height/2 - y , 2, 2);
                    dem++;
                } else if (dem < 13) {
                    dem++;
                } else if (dem < 14) {
                    g.fillRect(x + width/2 , height/2 - y , 2, 2);
                    dem++;
                } else if (dem < 17) {
                    dem++;
                } else if (dem < 18) {
                    g.fillRect(x + width/2 , height/2 - y , 2, 2);
                    dem++;
                } else if (dem < 20) {
                    dem++;
                } else {
                    dem = 0;
                }
            }
        } else {
            p = 2 * Dx - Dy;

            while (y != y2) {
                if (p < 0) {
                    p += 2 * Dx;
                } else {
                    p += 2 * (Dx - Dy);
                    x += x_unit;
                }
                y += y_unit;
                if (dem < 10) {
                    g.fillRect(x + width/2 , height/2 - y , 2, 2);
                    dem++;
                } else if (dem < 13) {
                    dem++;
                } else if (dem < 14) {
                    g.fillRect(x + width/2 , height/2 - y , 2, 2);
                    dem++;
                } else if (dem < 17) {
                    dem++;
                } else if (dem < 18) {
                    g.fillRect(x + width/2 , height/2 - y , 2, 2);
                    dem++;
                } else if (dem < 20) {
                    dem++;
                } else {
                    dem = 0;
                }

            }
        }
    }
}