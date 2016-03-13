
public class Barang{
	private long id;
	private String nama;

	public Barang(long id,String nama){
		this.id=id;
		this.nama=nama;
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
}
