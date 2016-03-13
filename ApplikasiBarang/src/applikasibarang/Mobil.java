
public class Mobil extends Barang{
	private int cc;
	private String merk;

	public Mobil(long id,String nama,int cc,String merk){
		super(id,nama);
		this.cc=cc;
		this.merk=merk;
	}
	
	public void setCc(int cc){
		this.cc = cc;
	}

	public void setMerk(String merk){
		this.merk = merk;
	}

	public int getCc (){
		return cc;
	}

	public String getMerk(){
		return merk;
	}
}
