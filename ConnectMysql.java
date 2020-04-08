/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.mysql;


/**
 *
 * @author Pirmansyah
 */
public class ConnectMysql {
    MahasiswaDataSource datasource = new MahasiswaDataSource();
   
        public static void main(String[] args) {
            
//           Memanggil method insert
//           new ConnectMysql().testInsert();
            
           
//           memanggil method update
//           new ConnectMysql().testUpdate();


//           memanggil method delete
           new ConnectMysql().testDelete();

    }
        

    public void testInsert(){

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("43A87006180122");
        mhs.setNama("Ardit Achmad");
        mhs.setJurusan("Sastra Sunda");
        mhs.setAlamat("Bekasi");
        mhs.setEmail("Arditach@gmail.com");
        mhs.setTelepon("08971064545");
        boolean sukses = datasource.insert(mhs);

        if(sukses) {
            System.out.println("Insert Data Berhasil!");
        }else{
            System.out.println("Insert Data Gagal!");
        }
    }
    

    public void testUpdate(){

        Mahasiswa mhs = datasource.getByID("43A87006180144");
        mhs.setNama("Pirman");
        boolean sukses = datasource.update(mhs);
        if(sukses) {
            System.out.println("Update Data Berhasil!");
        }else{
            System.out.println("Update Data Gagal!");
        }
    }
        public void testDelete(){

        Mahasiswa mhs = datasource.getByID("43A87006180119");
        boolean sukses = datasource.delete(mhs);
        if(sukses) {
            System.out.println("Delete Data Berhasil!");
        }else{
            System.out.println("Delete Data Gagal!");
        }
    }
}
