package applikasibarang;

public class Gudang{
	private String nama;
	public int jum_bar_g=0;
	private Barang[] daftarBarang=new Barang[10];
	
	public Gudang(String nama){
		setNamaGudang(nama);
	}
	
	public void addBarang(Barang b){
		if(jum_bar_g<10){
			daftarBarang[jum_bar_g]=b;
			jum_bar_g++;
		}
	}
	
	public void ambilBarang(long ids){
		for(int j=0;j<jum_bar_g;j++){	
			if(daftarBarang[j].getId()==ids){
				for(int k=j;k<(jum_bar_g-1);k++){
					daftarBarang[k]=daftarBarang[k+1];
					jum_bar_g=jum_bar_g-1;
				}
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
		for (int i=0;i<jum_bar_g;i++){
			System.out.print("Space ke-"+(i+1)+" : ");
			if (daftarBarang[i] instanceof Mobil){
				System.out.println("Mobil");
				Mobil dmobil = (Mobil) daftarBarang[i];
				mbl++;
				System.out.println("ID        			 : "+daftarBarang[i].getId());
				System.out.println("Nama                 : "+daftarBarang[i].getNama());
				System.out.println("Merk 		     	 : "+dmobil.getMerk());
				System.out.println("CC 				 	 : "+dmobil.getCc());
			}
			if (daftarBarang[i] instanceof Motor){
				System.out.println("Motor");
				Motor dmotor = (Motor) daftarBarang[i];
				mtr++;
				System.out.println("ID        			 : "+daftarBarang[i].getId());
				System.out.println("Nama                 : "+daftarBarang[i].getNama());
				System.out.println("Merk 		     	 : "+dmotor.getMerk());
				System.out.println("CC 				 	 : "+dmotor.getCc());
			}
			else{
				System.out.println("Unidentified");
				uniden++;
				System.out.println("ID        			 : "+daftarBarang[i].getId());
				System.out.println("Nama                 : "+daftarBarang[i].getNama());
			}
			System.out.println("");
		}
		
		System.out.println("=======Statistik=======");
		System.out.println("Mobil      : "+mbl);
		System.out.println("Motor      : "+mtr);
		System.out.println("Unidentified  : "+uniden);
		System.out.println("");
		System.out.println("Jumlah Barang  : "+jum_bar_g);
		System.out.println("=======================");
	}
	
}
