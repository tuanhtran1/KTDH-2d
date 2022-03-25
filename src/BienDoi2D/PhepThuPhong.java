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
public class PhepThuPhong {
    public static Diem2D ThuPhong(Diem2D A, float Sx, float Sy) {
        float[] Atn = new float[3];
        Atn[0] = A.getX();
        Atn[1] = A.getY();
        Atn[2] = 1;
        float[][] tp = new float[][]{{Sx, 0, 0}, {0, Sy, 0}, {0, 0, 1}}; //Ma trận thu phóng
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tp);
        Diem2D kq = new Diem2D((int) Atn[0], (int) Atn[1]);
        return kq;
    }
}
