/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienDoi2D;

import MaTran.NhanMaTran;
import model2D.Diem2D;

/**
 *
 * @author Tu Tran
 */
public class PhepQuay {
    public static Diem2D Quay(Diem2D tam, Diem2D A, double gocQuay) 
    {
        // Áp dụng cho quay tất cả và cả tâm O
        Diem2D kq = new Diem2D(0, 0);
        float[] Atn = new float[3];
        Atn[0] = A.getX();
        Atn[1] = A.getY();
        Atn[2] = 1;
        float[][] tt = new float[][]{{1, 0, 0}, {0, 1, 0}, {-tam.getX(), -tam.getY(), 1}};
        float[][] tt1 = new float[][]{{1, 0, 0}, {0, 1, 0}, {tam.getX(), tam.getY(), 1}};
        float[][] q = new float[][]{{(float) Math.cos(gocQuay), (float) Math.sin(gocQuay), 0}, {(float) (-Math.sin(gocQuay)), (float) Math.cos(gocQuay), 0}, {0, 0, 1}};
        float[][] qbk = new float[3][3];
        qbk = NhanMaTran.NhanXX(3, tt, q);
        qbk = NhanMaTran.NhanXX(3, qbk, tt1);
        Atn = NhanMaTran.NhanMotX(3, Atn, qbk);
        kq.setX((int) Atn[0]);
        kq.setY((int) Atn[1]);
        return kq;
    }
}
