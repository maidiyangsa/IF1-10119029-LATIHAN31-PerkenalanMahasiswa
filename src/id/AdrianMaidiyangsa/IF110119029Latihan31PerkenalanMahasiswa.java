/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program perkenalan mahasiswa, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class IF110119029Latihan31PerkenalanMahasiswa {
    public static void main(String[] args) {
        PerkenalanMahasiswa mhs1 = new PerkenalanMahasiswa();
        mhs1.nama = "Adrian Maidiyangsa";
        mhs1.nim = "10119029";

        PerkenalanMahasiswa mhs2 = new PerkenalanMahasiswa();
        mhs2.nama = "Adrian Ganteng";
        mhs2.nim = "10119030";

        PerkenalanMahasiswa mhs3 = new PerkenalanMahasiswa();
        mhs3.nama = "Adrian Tampan";
        mhs3.nim = "10119031";

        PerkenalanMahasiswa mhs4 = new PerkenalanMahasiswa();
        mhs4.nama = "Adrian Segalanya";
        mhs4.nim = "10119032";
        
        mhs1.perkenalanDiri();
        mhs2.perkenalanDiri();
        mhs3.perkenalanDiri();
        mhs4.perkenalanDiri();
    }
}
