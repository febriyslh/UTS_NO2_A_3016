/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectperusahaan;

/**
 *
 * @author User
 */
public class ProjectPlanner {
    String nama_3016;
    int nip_3016;
    double gajiPokok_3016;
    double komisi_3016;
    double totalHasilProyek_3016;
    private double GajiProjectPlanner_3016;
    private double pajak_3016;

    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        pajak_3016 = (0.05 * gajiPokok_3016);
        GajiProjectPlanner_3016 = gajiPokok_3016 + (komisi_3016*totalHasilProyek_3016) - pajak_3016;
        return GajiProjectPlanner_3016;
    }
    
    public void cetakProjectPlanner(){
        System.out.println(" \n");
        System.out.println(" Data Project Planner \n");
        System.out.println("Nama :"+nama_3016);
        System.out.println("NIP :"+nip_3016);
        System.out.println("gaji Pokok :"+gajiPokok_3016);
        System.out.println("Komisi : "+komisi_3016);
        System.out.println("Total Hasil Proyek :"+totalHasilProyek_3016);

    }
}


