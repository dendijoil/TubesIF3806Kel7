package applikasibarang;

import Controller.ControllerMenu;

public class Driver{
    public static void main (String[] args){
	ApplikasiBarang app=new ApplikasiBarang();
        /*app.mainmenu();*/
        new ControllerMenu(app);
    }
}
