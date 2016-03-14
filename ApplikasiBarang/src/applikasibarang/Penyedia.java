public class Penyedia extends Orang{
	private long id;
	private Barang[] daftarBarang=new Barang[10];
	private String nama;
	private int jum_bar_p=0;
	
	public Penyedia(String nama, long id){
		super(nama);
		this.id=id;
	}
	
	public void createBarang(Barang b){
		if(jum_bar_p<10){
			daftarBarang[jum_bar_p]=b;
			jum_bar_p++;
		}
	}
	
	public void setId(long id){
		this.id=id;
	}
	
	public long getId(){
		return id;
	}
	
	public Barang getBarangPenyedia(int x){
		return daftarBarang[x];
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public int getJumbarP(){
		return this.jum_bar_p;
	}
	
	public String jenisOtoritas(){
		return "Penyedia";
	}
	
	public void Display(){
		int mbl=0,mtr=0,uniden=0;
		System.out.println("=============================");
		System.out.println("Penyedia : "+super.getNama());
		System.out.println("=============================");
		for (int i=0;i<jum_bar_p;i++){
			System.out.print("Barang ke-"+(i+1)+" : ");
			if (daftarBarang[i] instanceof Mobil){
				System.out.println("Mobil");
				Mobil dmobil = (Mobil) daftarBarang[i];
				mbl++;
				System.out.println("ID        			 : "+dmobil.getId());
				System.out.println("Nama                 : "+dmobil.getNama());
				System.out.println("Merk 		     	 : "+dmobil.getMerk());
				System.out.println("CC 				 	 : "+dmobil.getCc());
			}
			if (daftarBarang[i] instanceof Motor){
				System.out.println("Motor");
				Motor dmotor = (Motor) daftarBarang[i];
				mtr++;
				System.out.println("ID        			 : "+dmotor.getId());
				System.out.println("Nama                 : "+dmotor.getNama());
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
		System.out.println("Penyedia "+super.getNama());
		System.out.println("=======Statistik=======");
		System.out.println("Mobil      : "+mbl);
		System.out.println("Motor      : "+mtr);
		System.out.println("Unidentified  : "+uniden);
		System.out.println("");
		System.out.println("Jumlah Barang  : "+jum_bar_p);
		System.out.println("=======================");
	}
}
