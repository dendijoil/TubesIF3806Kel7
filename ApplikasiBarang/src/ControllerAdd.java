/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import Views.AddMenu;
import Views.AddBarang;
import Views.AddPetugas;
import Views.AddGudang;
import Views.AddPenyedia;
import Views.View;
import applikasibarang.ApplikasiBarang;
import applikasibarang.Barang;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

/**
 *
 * @author iky
 */
public class ControllerAdd extends MouseAdapter implements ActionListener {
    
    private ApplikasiBarang model;
    private View view;

    public ControllerAdd(ApplikasiBarang model) {
        this.model = model;
        AddMenu m = new AddMenu();
        m.setVisible(true);
        m.addListener((ActionListener) this);
        view = m;
    }
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(view instanceof AddMenu){
            AddMenu am = (AddMenu) view;
            if(source.equals(am.getBtnAddBarang())){
                AddBarang add_bar = new AddBarang();
                add_bar.setVisible(true);
                add_bar.addListener((ActionListener) this);
                am.dispose();
                view = add_bar;
            }
            else if(source.equals(am.getBtnAddGudang())){
                AddGudang add_gud = new AddGudang();
                add_gud.setVisible(true);
                add_gud.addListener((ActionListener) this);
                am.dispose();
                view = add_gud;
            }
            else if(source.equals(am.getBtnAddPetugas())){
                AddPetugas add_pet = new AddPetugas();
                add_pet.setVisible(true);
                add_pet.addListener((ActionListener) this);
                am.dispose();
                view = add_pet;
            }
            else if(source.equals(am.getBtnAddPenyedia())){
                AddPenyedia add_peny = new AddPenyedia();
                add_peny.setVisible(true);
                add_peny.addListener((ActionListener) this);
                am.dispose();
                view = add_peny;
            }
            else if(source.equals(am.getBtnBack())){
                new ControllerMenu(model);
                am.dispose();
            }
        }
        else if(view instanceof AddBarang){
            AddBarang add_b = (AddBarang) view;
            if (source.equals(add_b.getBtnBack())) {
                AddMenu am = new AddMenu();
                am.setVisible(true);
                am.addListener((ActionListener) this);
                add_b.dispose();
                view = am;
            }
            else if(source.equals(add_b.getBtnOK())){
                String s=add_b.getComboTipeAdd();
                long idjen=add_b.getIdJenis();
                long ids=add_b.getIdBarang();
                String namz=add_b.getNamaBarang();
                Barang b = new Barang(ids,namz);
                System.out.println(s+" "+namz+" "+ids);
                if(s.equals("Penyedia")){
                    model.addBarangPenyedia(idjen,b);
                }
                else if(s.equals("Gudang")){
                    model.addBarangGudang(idjen, b);
                }
                add_b.reset();
            }
        }
        else if(view instanceof AddGudang){
            AddGudang add_g = (AddGudang) view;
            if (source.equals(add_g.getBtnBack())) {
                AddMenu am = new AddMenu();
                am.setVisible(true);
                am.addListener((ActionListener) this);
                add_g.dispose();
                view = am;
            }
            else if(source.equals(add_g.getBtnOK())){
                long ids=add_g.getIdGudang();
                String namz=add_g.getNamaGudang();
                model.addGudang(ids, namz);
                add_g.reset();
            }
        }
        else if(view instanceof AddPenyedia){
            AddPenyedia add_peny = (AddPenyedia) view;
            if (source.equals(add_peny.getBtnBack())) {
                AddMenu am = new AddMenu();
                am.setVisible(true);
                am.addListener((ActionListener) this);
                add_peny.dispose();
                view = am;
            }
            else if(source.equals(add_peny.getBtnOk())){
                long ids=add_peny.getIdPenyedia();
                String namz=add_peny.getNamaPenyedia();
                model.addPenyedia(namz,ids);
//                System.out.println(ids+namz);
                add_peny.reset();
            }
        }
        else if(view instanceof AddPetugas){
            AddPetugas add_pet = (AddPetugas) view;
            if (source.equals(add_pet.getBtnBack())) {
                AddMenu am = new AddMenu();
                am.setVisible(true);
                am.addListener((ActionListener) this);
                add_pet.dispose();
                view = am;
            }
            else if(source.equals(add_pet.getBtnOK())){
                long ids=add_pet.getIdPetugas();
                String namz=add_pet.getNamaPetugas();
                model.addPetugas(namz,ids);
                add_pet.reset();
            }
        }
    }
}
