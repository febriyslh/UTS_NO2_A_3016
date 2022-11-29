/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectperusahaan;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    String nama_3016;
    int nip_3016;
    double gajiPokok_3016;
    double komisi_3016;
    double totalPenjualan_3016;
    private double GajiCommisionEmploye_3016;
    
    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        return GajiCommisionEmploye_3016 = gajiPokok_3016 + (komisi_3016*totalPenjualan_3016);
    }
    
     public void cetakCommissionEmployee(){
        System.out.println(" \n");
        System.out.println(" Data Commission Employee \n");
        System.out.println("Nama :"+nama_3016);
        System.out.println("NIP :"+nip_3016);
        System.out.println("gaji Pokok :"+gajiPokok_3016);
        System.out.println("Komisi : "+komisi_3016);
        System.out.println("Total Penjualam :"+totalPenjualan_3016);
    }
}
