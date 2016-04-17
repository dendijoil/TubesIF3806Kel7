/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.AddBarang;
import Views.AddGudang;
import Views.AddMenu;
import Views.AddPenyedia;
import Views.AddPetugas;
import Views.DeleteBarang;
import Views.DeleteGudang;
import Views.DeleteMenu;
import Views.DeletePenyedia;
import Views.DeletePetugas;
import Views.View;
import applikasibarang.ApplikasiBarang;
import applikasibarang.Barang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author iky
 */
public class ControllerDelete extends MouseAdapter implements ActionListener {
    private ApplikasiBarang model;
    private View view;

    public ControllerDelete(ApplikasiBarang model) {
        this.model = model;
        DeleteMenu m = new DeleteMenu();
        m.setVisible(true);
        m.addListener((ActionListener) this);
        view = m;
    }
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(view instanceof DeleteMenu){
            DeleteMenu dm = (DeleteMenu) view;
            if(source.equals(dm.getBtnDelBarang())){
                DeleteBarang del_bar = new DeleteBarang();
                del_bar.setVisible(true);
                del_bar.addListener((ActionListener) this);
                dm.dispose();
                view = del_bar;
            }
            else if(source.equals(dm.getBtnDelGudang())){
                DeleteGudang del_gud = new DeleteGudang();
                del_gud.setVisible(true);
                del_gud.addListener((ActionListener) this);
                dm.dispose();
                view = del_gud;
            }
            else if(source.equals(dm.getBtnDelPetugas())){
                DeletePetugas del_pet = new DeletePetugas();
                del_pet.setVisible(true);
                del_pet.addListener((ActionListener) this);
                dm.dispose();
                view = del_pet;
            }
            else if(source.equals(dm.getBtnDelPenyedia())){
                DeletePenyedia del_peny = new DeletePenyedia();
                del_peny.setVisible(true);
                del_peny.addListener((ActionListener) this);
                dm.dispose();
                view = del_peny;
            }
            else if(source.equals(dm.getBtnBack())){
                new ControllerMenu(model);
                dm.dispose();
            }
        }
        else if(view instanceof DeleteBarang){
            DeleteBarang del_b = (DeleteBarang) view;
            if (source.equals(del_b.getBtnBack())) {
                DeleteMenu dm = new DeleteMenu();
                dm.setVisible(true);
                dm.addListener((ActionListener) this);
                del_b.dispose();
                view = dm;
            }
            else if(source.equals(del_b.getBtnOk())){
                long idb=del_b.getIdBarang();
                long id=del_b.getIdJenis();
                String s = del_b.getComboTipeDel();
                if(s.equals("Penyedia")){
                    model.deleteBarangPenyedia(id, idb);
                }
                else if(s.equals("Gudang")){
                    model.deleteBarangGudang(id, idb);
                }
                del_b.reset();
            }
        }
        else if(view instanceof DeleteGudang){
            DeleteGudang del_g = (DeleteGudang) view;
            if (source.equals(del_g.getBtnBack())) {
                DeleteMenu dm = new DeleteMenu();
                dm.setVisible(true);
                dm.addListener((ActionListener) this);
                del_g.dispose();
                view = dm;
            }
            else if(source.equals(del_g.getBtnOk())){
                long ids=del_g.getIdGudang();
                model.deleteGudang(ids);
                del_g.reset();
            }
        }
        else if(view instanceof DeletePenyedia){
            DeletePenyedia del_peny = (DeletePenyedia) view;
            if (source.equals(del_peny.getBtnBack())) {
                DeleteMenu dm = new DeleteMenu();
                dm.setVisible(true);
                dm.addListener((ActionListener) this);
                del_peny.dispose();
                view = dm;
            }
            else if(source.equals(del_peny.getBtnOk())){
                long ids=del_peny.getIdPenyedia();
                model.deletePenyedia(ids);
                del_peny.reset();
            }
        }
        else if(view instanceof DeletePetugas){
            DeletePetugas del_pet = (DeletePetugas) view;
            if (source.equals(del_pet.getBtnBack())) {
                DeleteMenu dm = new DeleteMenu();
                dm.setVisible(true);
                dm.addListener((ActionListener) this);
                del_pet.dispose();
                view = dm;
            }
            else if(source.equals(del_pet.getBtnOk())){
                long ids=del_pet.getIdPetugas();
                model.deletePetugas(ids);
                del_pet.reset();
            }
        }
    }
}
