package applikasibarang;

public class Barang{
	private long id;
	private String nama;
        private int jenis;

	public Barang(long id,String nama,int jenis){
		this.id=id;
		this.nama=nama;
                this.jenis=jenis;
	}
	
	public void setId(long id){
		this.id = id;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public long getId (){
		return id;
	}

	public String getNama(){
		return nama;
	}
        
        public void setjenis(int jenis){
		this.jenis = jenis;
	}

	public String getjenis (){
		if(jenis==1){
                    return "Makanan";
                }
                else{
                    return "Bukan Makanan";
                }
	}
}
