package applikasibarang;

public class Driver{
	
    public static void main (String[] args){
		Gudang g = new Gudang ("The Fiends");
		Petugas pet1 = new Petugas("Her Man",1001);
		Penyedia pen1 = new Penyedia("A Sep",2002);
		Penyedia pen2 = new Penyedia("Bu-D",2003);
		
		Motor mt1 = new Motor (100011,"Trumpeter",150,"Hondudes");
		Motor mt2 = new Motor (100012,"Daisoujou",200,"Yahmama");
		Mobil mb1 = new Mobil (100101,"Harlot",1500,"Mustibisa");
		Mobil mb2 = new Mobil (100102,"Matador",1200,"Duitsaha");
		Barang unin1 = new Barang (110001,"Batu Bertuah");
		
		pen1.createBarang(mt1);
		pen1.createBarang(mt2);
		pen2.createBarang(mb1);
		pen2.createBarang(mb2);
		pen1.createBarang(unin1);
		
		g.addBarang(mt1);
		g.addBarang(mt2);
		g.addBarang(mb1);
		g.addBarang(mb2);
		g.addBarang(unin1);
		
		g.Display();
		
		System.out.println("=============================");
		
		pen1.Display();
		pen2.Display();
		
	}
}
