/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectperusahaan;

/**
 *
 * @author User
 */
public class SalariedEmployee {
    String nama_3016;
    int nip_3016;
    double upahMingguan_3016;
    private double GajiSalariedEmploye;
    
    
    
    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        return GajiSalariedEmploye = upahMingguan_3016;
    }
    
    public void cetakSalariedEmployee(){
        System.out.println(" \n");
        System.out.println(" Data Commission Employee \n");
        System.out.println("Nama :"+nama_3016);
        System.out.println("NIP :"+nip_3016);
        System.out.println("gaji Pokok :"+upahMingguan_3016);
    }  
}
