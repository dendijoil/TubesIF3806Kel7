package applikasibarang;

import java.util.ArrayList;

public class Gudang{
	private String nama;
        private long id;
	public int jum_bar_g=0;
	private ArrayList<Barang> daftarBarang = new ArrayList();
	
	public Gudang(long id,String nama){
		setNamaGudang(nama);
                setId(id);
	}
	
	public void addBarang(Barang b){
            daftarBarang.add(b);
            jum_bar_g++;
	}
        
        public void setId(long id){
            this.id=id;
	}
	
	public long getId(){
            return id;
	}
        public long getJumbarG(){
            return daftarBarang.size();
	}
        
        public Barang getBarangGudang(int x){
		return daftarBarang.get(x);
	}
	
	public void deleteBarangGudang(long ids){
            for(int i=0;i<daftarBarang.size();i++){
                if(daftarBarang.get(i).getId()==ids){
                    daftarBarang.remove(i);
                    jum_bar_g--;
                }
                else{
                    System.out.println("Data Tidak Ditemukan");
                }
            }
        }
	
	public void setNamaGudang(String nama){
		this.nama=nama;
	}
	
	public String getNamaGudang(){
		return this.nama;
	}
	
	public void Display(){
		int mbl=0,mtr=0,uniden=0;
		System.out.println("=============================");
		System.out.println("Gudang : "+getNamaGudang());
		System.out.println("=============================");
		for (int i=0;i<daftarBarang.size();i++){
			System.out.print("Barang ke-"+(i+1)+" : ");
                        System.out.println("ID : "+daftarBarang.get(i).getId());
			System.out.println("Nama : "+daftarBarang.get(i).getNama());
                        System.out.println("Jenis : "+daftarBarang.get(i).getjenis());
                        System.out.println("=============================");
                }
	}
}
