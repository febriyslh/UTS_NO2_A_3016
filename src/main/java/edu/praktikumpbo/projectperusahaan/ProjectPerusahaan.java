/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.projectperusahaan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class ProjectPerusahaan {

      public static void main(String[] args) throws IOException {
        SalariedEmployee S = new SalariedEmployee();
        CommissionEmployee C = new CommissionEmployee();
        ProjectPlanner P = new ProjectPlanner();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        try{
           S.nama_3016 = "Febri";
           S.nip_3016  = 21103016;
           S.upahMingguan_3016 = 1000000; 
        
           C.nama_3016 = "Yolanda";
           C.nip_3016 = 21103017;
           C.gajiPokok_3016 = 2000000;
           C.komisi_3016 = 1000000;
           C.totalPenjualan_3016 = 100;
           
           P.nama_3016 = "Silalahi";
           P.nip_3016 = 21103018;
           P.gajiPokok_3016 = 1500000;
           P.komisi_3016 = 500000;
           P.totalHasilProyek_3016 = 200;
           
           S.cetakSalariedEmployee();
           System.out.println("");
           C.cetakCommissionEmployee();
           System.out.println("");
           P.cetakProjectPlanner();
            System.out.println("");
        }  
    catch(Exception ex){
            System.out.println(ex);
        }
    }
}       