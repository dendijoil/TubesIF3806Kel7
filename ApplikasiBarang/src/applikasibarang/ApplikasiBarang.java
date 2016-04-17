/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applikasibarang;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplikasiBarang {
    public ArrayList<Penyedia> daftarPenyedia = new ArrayList();
    public ArrayList<Petugas> daftarPetugas = new ArrayList();
    public ArrayList<Gudang> daftarGudang = new ArrayList();
    
    public void addPenyedia(String nama, long id){
        Penyedia pen = new Penyedia(nama,id);
        daftarPenyedia.add(pen);
    }
    public void addPetugas(String nama, long id){
        Petugas pet = new Petugas(nama,id);
        daftarPetugas.add(pet);
    }
    public void addGudang(long id,String nama){
        Gudang gud = new Gudang(id,nama);
        daftarGudang.add(gud);
    }
    public void editPenyedia(long findid,String nama){
        for(int i=0;i<daftarPenyedia.size();i++){
            if(findid==daftarPenyedia.get(i).getId()){
                daftarPenyedia.get(i).setNama(nama);
            } 
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    public void editPetugas(long findid,String nama){
        for(int i=0;i<daftarPetugas.size();i++){
            if(findid==daftarPetugas.get(i).getId()){
                daftarPetugas.get(i).setNama(nama);
            } 
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    public void editGudang(long findid,String nama){
        for(int i=0;i<daftarGudang.size();i++){
            if(findid==daftarGudang.get(i).getId()){
                daftarGudang.get(i).setNamaGudang(nama);
            } 
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    public void deletePenyedia(long id){
        for(int i=0;i<daftarPenyedia.size();i++){
            if(id==daftarPenyedia.get(i).getId()){
                daftarPenyedia.remove(i);
            } 
            else{
                System.out.println("Data Tidak Ditemukan/Sudah dihapus");
            }
        }
    }
    public void deletePetugas(long id){
        for(int i=0;i<daftarPetugas.size();i++){
            if(id==daftarPetugas.get(i).getId()){
                daftarPetugas.remove(i);
            } 
            else{
                System.out.println("Data Tidak Ditemukan/Sudah dihapus");
            }
        }
    }
    public void deleteGudang(long id){
        for(int i=0;i<daftarGudang.size();i++){
            if(id==daftarGudang.get(i).getId()){
                daftarGudang.remove(i);
            } 
            else{
                System.out.println("Data Tidak Ditemukan/Sudah dihapus");
            }
        }
    }
    public void addBarangPenyedia(long id,Barang b){
        for(int i=0;i<daftarPenyedia.size();i++){
            if(id==daftarPenyedia.get(i).getId()){
                daftarPenyedia.get(i).createBarang(b);
            } 
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    public void deleteBarangPenyedia(long id,long idb){
        for(int i=0;i<daftarPenyedia.size();i++){
            if(id==daftarPenyedia.get(i).getId()){
               for(int j=0;j<daftarPenyedia.get(i).getJumbarP();j++){
                   if(daftarPenyedia.get(i).getBarangPenyedia(j).getId()==idb){
                       daftarPenyedia.get(i).deleteBarang(j);
                       System.out.println("Barang Terhapus");
                   }
                   else{
                       System.out.println("Data Tidak Ditemukan Barang tersebut");
                   }
               }
            } 
            else{
                System.out.println("Data Tidak Ditemukan Penyedia tersebut");
            }
        }
    }
    public void addBarangGudang(long id,Barang b){
        for(int i=0;i<daftarGudang.size();i++){
            if(id==daftarGudang.get(i).getId()){
                daftarGudang.get(i).addBarang(b);
            } 
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    public void deleteBarangGudang(long id,long idb){
        for(int i=0;i<daftarGudang.size();i++){
            if(id==daftarGudang.get(i).getId()){
               for(int j=0;j<daftarGudang.get(i).getJumbarG();j++){
                   if(daftarGudang.get(i).getBarangGudang(j).getId()==idb){
                       daftarGudang.get(i).deleteBarangGudang(j);
                       System.out.println("Barang Terhapus");
                   }
                   else{
                       System.out.println("Data Tidak Ditemukan Barang tersebut");
                   }
               }
            } 
            else{
                System.out.println("Data Tidak Ditemukan Penyedia tersebut");
            }
        }
    }
        public void menuAdd(){
        System.out.println("1. add Gudang");
        System.out.println("2. add Penyedia");
        System.out.println("3. add Petugas");
        System.out.println("4. add Barang");
        Scanner s=new Scanner(System.in);
        System.out.print("input : ");
        int n = s.nextInt();
        switch(n){
            case 1:{
                System.out.println("ID gudang : ");
                long idgud=s.nextLong();
                System.out.println("Nama gudang : ");
                String namz=s.next();
                addGudang(idgud,namz);
                break;
            }
            case 2:{
                System.out.println("ID Penyedia : ");
                long idpen=s.nextLong();
                System.out.println("Nama Penyedia : ");
                String namz=s.next();
                addPenyedia(namz,idpen);
                break;
            }
            case 3:{
                System.out.println("ID Petugas : ");
                long idpet=s.nextLong();
                System.out.println("Nama Petugas : ");
                String namz=s.next();
                addPetugas(namz,idpet);
                break;
            }
            case 4:{
                System.out.println("jenis (penyedia/gudang) : ");
                String jen = s.next();
                System.out.println("ID Barang : ");
                long idbar=s.nextLong();
                System.out.println("Nama Barang : ");
                String namz=s.next();
                Barang b = new Barang(idbar,namz);
                if(jen.equals("penyedia")){
                    System.out.println("ID Penyedia : ");
                    long zz=s.nextLong();
                    addBarangPenyedia(zz,b);
                }
                else{
                    System.out.println("ID Gudang : ");
                    long zz=s.nextLong();
                    addBarangGudang(zz,b);
                }
                break;
            }
            default: System.out.println("Tidak ada menu tersebut"); break;
        }
    }
    public void menuEdit(){
        System.out.println("1. edit Gudang");
        System.out.println("2. edit Penyedia");
        System.out.println("3. edit Petugas");
        Scanner s=new Scanner(System.in);
        System.out.print("input : ");
        int n = s.nextInt();
        switch(n){
            case 1:{
                System.out.println("ID gudang : ");
                long idgud=s.nextLong();
                System.out.println("Nama gudang Setelah diubah : ");
                String namz=s.next();
                editGudang(idgud,namz);
                break;
            }
            case 2:{
                System.out.println("ID Penyedia : ");
                long idpen=s.nextLong();
                System.out.println("Nama Penyedia Setelah diubah : ");
                String namz=s.next();
                editPenyedia(idpen,namz);
                break;
            }
            case 3:{
                System.out.println("ID Petugas : ");
                long idpet=s.nextLong();
                System.out.println("Nama Petugas Setelah diubah : ");
                String namz=s.next();
                editPetugas(idpet,namz);
                break;
            }
            case 4:{
                System.out.println("jenis (penyedia/gudang) : ");
                String jen = s.next();
                System.out.println("ID Barang : ");
                long idbar=s.nextLong();
                if(jen.equals("penyedia")){
                    System.out.println("ID Penyedia : ");
                    long zz=s.nextLong();
                    deleteBarangPenyedia(zz,idbar);
                }
                else{
                    System.out.println("ID Gudang : ");
                    long zz=s.nextLong();
                    deleteBarangGudang(zz,idbar);
                }
                break;
            }
            default: System.out.println("Tidak ada menu tersebut"); break;
        }
    }
    public void menuDelete(){
        System.out.println("1. delete Gudang");
        System.out.println("2. delete Penyedia");
        System.out.println("3. delete Petugas");
        System.out.println("4. Delete Barang");
        Scanner s=new Scanner(System.in);
        System.out.print("input : ");
        int n = s.nextInt();
        switch(n){
            case 1:{
                System.out.println("ID gudang yang akan dihapus : ");
                long idgud=s.nextLong();
                deleteGudang(idgud);
                break;
            }
            case 2:{
                System.out.println("ID Penyedia yang akan dihapus : ");
                long idpen=s.nextLong();
                deletePenyedia(idpen);
                break;
            }
            case 3:{
                System.out.println("ID Petugas yang akan dihapus : ");
                long idpet=s.nextLong();
                deletePetugas(idpet);
                break;
            }
            default: System.out.println("Tidak ada menu tersebut"); break;
        }
    }
    public Penyedia getPenyedia(long id){
        int zz=0;
        for(int i = 0;i<daftarPenyedia.size();i++){
            if(id==daftarPenyedia.get(i).getId()){
                zz=i;
            }
        }
        return daftarPenyedia.get(zz);
    }
    public Gudang getGudang(long id){
        int zz=0;
        for(int i = 0;i<daftarGudang.size();i++){
            if(id==daftarGudang.get(i).getId()){
                zz=i;
            }
        }
        return daftarGudang.get(zz);
    }
    public String getGudang(){
        String wow="";
        for(Gudang z : daftarGudang){
            wow+=(z.toString()+"\n");
        }
        return wow;
    }
    public String getBarangPenyedia(Penyedia p){
        String wow="";
        for(int i = 0;i<p.getJumbarP();i++){
            wow+=(p.toString());
        }
        return wow;
    }
    public String getBarangGudang(Gudang g){
        String wow="";
        for(int i = 0;i<g.getJumbarG();i++){
            wow+=(g.toString());
        }
        return wow;
    }
    public String getPenyedia(){
        String wow="";
        for(Penyedia z : daftarPenyedia){
            wow+=(z.toString()+"\n");
        }
        return wow;
    }
    public String getPetugas(){
        String wow="";
        for(Petugas z : daftarPetugas){
            wow+=(z.toString()+"\n");
        }
        return wow;
    }
    
    public void editBarangPenyedia(long idp,long idb,String namz){
        for(int i=0;i<daftarPenyedia.size();i++){
            if(idp==daftarPenyedia.get(i).getId()){
               for(int j=0;j<daftarPenyedia.get(i).getJumbarP();j++){
                   if(daftarPenyedia.get(i).getBarangPenyedia(j).getId()==idb){
                       daftarPenyedia.get(i).getBarangPenyedia(j).setNama(namz);
                       System.out.println("Barang Diubah");
                   }
                   else{
                       System.out.println("Data Tidak Ditemukan Barang tersebut");
                   }
               }
            } 
            else{
                System.out.println("Data Tidak Ditemukan Penyedia tersebut");
            }
        }
    }
    public void editBarangGudang(long idg,long idb,String namz){
        for(int i=0;i<daftarGudang.size();i++){
            if(idg==daftarGudang.get(i).getId()){
               for(int j=0;j<daftarGudang.get(i).getJumbarG();j++){
                   if(daftarGudang.get(i).getBarangGudang(j).getId()==idb){
                       daftarGudang.get(i).getBarangGudang(j).setNama(namz);
                       System.out.println("Barang Diubah");
                   }
                   else{
                       System.out.println("Data Tidak Ditemukan Barang tersebut");
                   }
               }
            } 
            else{
                System.out.println("Data Tidak Ditemukan Penyedia tersebut");
            }
        }
    }
    public void menuDisplay(){
        System.out.println("1. Display Gudang");
        System.out.println("2. Display Penyedia");
        System.out.println("3. Display Petugas");
        
        Scanner s=new Scanner(System.in);
        System.out.print("input : ");
        int n = s.nextInt();
        switch(n){
            case 1:{
                for(int i=0;i<daftarGudang.size();i++){
                    System.out.println("Nama Gudang   : "+daftarGudang.get(i).getNamaGudang());
                    System.out.println("Id Gudang     : "+daftarGudang.get(i).getId());
                    System.out.println("Jumlah Barang : "+daftarGudang.get(i).getJumbarG());
                    System.out.println("");
                }
                break;
            }
            case 2:{
                for(int i=0;i<daftarPenyedia.size();i++){
                    System.out.println("Nama Penyedia          : "+daftarPenyedia.get(i).getNama());
                    System.out.println("Id Penyedia            : "+daftarPenyedia.get(i).getId());
                    System.out.println("Jumlah Barang Penyedia : "+daftarPenyedia.get(i).getJumbarP());
                    System.out.println("");
                }
                break;
            }
            case 3:{
                for(int i=0;i<daftarPetugas.size();i++){
                    System.out.println("Nama Petugas   : "+daftarPetugas.get(i).getNama());
                    System.out.println("Id Petugas     : "+daftarPetugas.get(i).getId());
                    System.out.println("");
                }
                break;
            }
            default:{
                System.out.println("Tidak ada menu tersebut"); break;
            }
        }
    }
    public void menuDisplayBarang(){
        System.out.println("1. Display Barang Gudang");
        System.out.println("2. Display Barang Penyedia");
        Scanner s=new Scanner(System.in);
        System.out.print("input : ");
        int n = s.nextInt();
        switch(n){
            case 1:{
                System.out.print("Masukan ID Gudang");
                long id=s.nextLong();
                for(int i=0;i<daftarGudang.size();i++){
                    if(id==daftarGudang.get(i).getId()){
                        for(int j=0;j<daftarGudang.get(i).getJumbarG();j++){
                            daftarGudang.get(i).Display();
                        }
                    } 
                    else{
                        System.out.println("Data Tidak Ditemukan Gudang tersebut");
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Masukan ID Penyedia");
                long id=s.nextLong();
                for(int i=0;i<daftarPenyedia.size();i++){
                    if(id==daftarPenyedia.get(i).getId()){
                        for(int j=0;j<daftarPenyedia.get(i).getJumbarP();j++){
                            daftarPenyedia.get(i).Display();
                        }
                    } 
                    else{
                        System.out.println("Data Tidak Ditemukan Gudang tersebut");
                    }
                }
                break;
            }
            default: System.out.println("Tidak ada menu tersebut"); break;
        }
    }
    public void mainmenu(){
        int pil=9999;
        while(pil != 0){
            Scanner s=new Scanner(System.in);
            System.out.println("=====================");
            System.out.println("1. Menu add");
            System.out.println("2. Menu edit");
            System.out.println("3. Menu delete");
            System.out.println("4. Display (Gudang/Penyedia/Petugas)");
            System.out.println("5. Display Barang");
            System.out.println("0. Exit");
            System.out.println("=====================");
            System.out.println("Pilihan Menu : ");
            pil=s.nextInt();
            switch(pil){
                case 1:{
                    menuAdd();
                    break;
                }
                case 2:{
                    menuEdit();
                    break;
                }
                case 3:{
                    menuDelete();
                    break;
                }
                case 4:{
                    menuDisplay();
                    break;
                }
                case 5:{
                    menuDisplayBarang();
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    System.out.println("Tidak ada menu tersebut");
                    break;
                }
            }
        }
        System.out.println("=====================");
        System.out.println("    Terima Kasih     ");
        System.out.println("=====================");
    }
}
