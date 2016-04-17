/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.Edit;
import Views.EditBarang;
import Views.EditGudang;
import Views.EditPenyedia;
import Views.EditPetugas;
import Views.View;
import applikasibarang.ApplikasiBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author iky
 */
public class ControllerEdit extends MouseAdapter implements ActionListener {
    private ApplikasiBarang model;
    private View view;

    public ControllerEdit(ApplikasiBarang model) {
        this.model = model;
        Edit ed = new Edit();
        ed.setVisible(true);
        ed.addListener((ActionListener) this);
        view = ed;
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(view instanceof Edit){
            Edit ed = (Edit) view;
            if(source.equals(ed.getbtnEditBarang())){
                EditBarang ed_bar = new EditBarang();
                ed_bar.setVisible(true);
                ed_bar.addListener((ActionListener) this);
                ed.dispose();
                view = ed_bar;
            }
            else if(source.equals(ed.getbtnEditGudang())){
                EditGudang ed_gud = new EditGudang();
                ed_gud.setVisible(true);
                ed_gud.addListener((ActionListener) this);
                ed.dispose();
                view = ed_gud;
            }
            else if(source.equals(ed.getbtnEditPetugas())){
                EditPetugas ed_pet = new EditPetugas();
                ed_pet.setVisible(true);
                ed_pet.addListener((ActionListener) this);
                ed.dispose();
                view = ed_pet;
            }
            else if(source.equals(ed.getbtnEditPenyedia())){
                EditPenyedia ed_peny = new EditPenyedia();
                ed_peny.setVisible(true);
                ed_peny.addListener((ActionListener) this);
                ed.dispose();
                view = ed_peny;
            }
            else if(source.equals(ed.getbtnBack())){
                new ControllerMenu(model);
                ed.dispose();
            }
        }
        else if(view instanceof EditBarang){
            EditBarang ed_b = (EditBarang) view;
            if (source.equals(ed_b.getBtnBack())) {
                Edit ed = new Edit();
                ed.setVisible(true);
                ed.addListener((ActionListener) this);
                ed_b.dispose();
                view = ed;
            }
            else if(source.equals(ed_b.getbtnOk())){
                long idb=ed_b.getIdBarang();
                long id=ed_b.getIdJenis();
                String namz=ed_b.getNamaBarang();
                String s = ed_b.getJenis();
                if(s.equals("Penyedia")){
                    model.editBarangPenyedia(id, idb, namz);
                }
                else if(s.equals("Gudang")){
                    model.editBarangGudang(id, idb, namz);
                }
                ed_b.reset();
            }
        }
        else if(view instanceof EditGudang){
            EditGudang ed_g = (EditGudang) view;
            if (source.equals(ed_g.getBtnBack())) {
                Edit ed = new Edit();
                ed.setVisible(true);
                ed.addListener((ActionListener) this);
                ed_g.dispose();
                view = ed;
            }
            else if(source.equals(ed_g.getbtnOk())){
                long ids=ed_g.getIdGudang();
                String namz=ed_g.getNamaGudang();
                model.editGudang(ids, namz);
                ed_g.reset();
            }
        }
        else if(view instanceof EditPenyedia){
            EditPenyedia ed_peny = (EditPenyedia) view;
            if (source.equals(ed_peny.getBtnBack())) {
                Edit ed = new Edit();
                ed.setVisible(true);
                ed.addListener((ActionListener) this);
                ed_peny.dispose();
                view = ed;
            }
            else if(source.equals(ed_peny.getbtnOk())){
                long ids=ed_peny.getIdPenyedia();
                String namz=ed_peny.getNamaPenyedia();
                model.editGudang(ids, namz);
                ed_peny.reset();
            }
        }
        else if(view instanceof EditPetugas){
            EditPetugas ed_pet = (EditPetugas) view;
            if (source.equals(ed_pet.getBtnBack())) {
                Edit ed = new Edit();
                ed.setVisible(true);
                ed.addListener((ActionListener) this);
                ed_pet.dispose();
                view = ed;
            }
            else if(source.equals(ed_pet.getbtnOk())){
                long ids=ed_pet.getIdPetugas();
                String namz=ed_pet.getNamaPetugas();
                model.editGudang(ids, namz);
                ed_pet.reset();
            }
        }
    }

}
