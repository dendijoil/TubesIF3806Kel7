/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.AddMenu;
import Views.Menu;
import Views.View;
import applikasibarang.ApplikasiBarang;
import Views.DisplayGudang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import Views.Display;
import Views.DisplayPenyedia;
import Views.DisplayPetugas;
import java.awt.event.MouseEvent;

/**
 *
 * @author dendijoil
 */
public class ControllerDisplay extends MouseAdapter implements ActionListener {

    private ApplikasiBarang model;
    private View view;
//    private DisplayGudang dis;

    public ControllerDisplay(ApplikasiBarang model) {
        this.model = model;
        Display d = new Display();
        d.addMouseListener(this);
        d.setVisible(true);
        d.addListener((ActionListener) this);
        view = d;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
     //   DisplayPetugas dis_pet = new DisplayPetugas();
        if (view instanceof Display) {
            Display dis = (Display) view;
            if (source.equals(dis.getBtnDisplayGudang())) {
                DisplayGudang dis_gud = new DisplayGudang();
                dis_gud.setVisible(true);
                dis_gud.addListener((ActionListener) this);
                setTextAreaGudang(model, dis_gud);
                dis.dispose();
                view = dis_gud;

            }
            else if (source.equals(dis.getBtnDisplayPenyedia())){   
                DisplayPenyedia dis_pen = new DisplayPenyedia();
                dis_pen.setVisible(true);
                dis_pen.addListener((ActionListener) this);
                setTextAreaPenyedia(model, dis_pen);
                dis.dispose();
                view = dis_pen;
            }
            else if (source.equals(dis.getBtnDisplayPetugas())){   
                DisplayPetugas dis_pet = new DisplayPetugas();
                dis_pet.setVisible(true);
                dis_pet.addListener((ActionListener) this);
                setTextAreaPetugas(model, dis_pet);
                dis.dispose();
                view = dis_pet;
            }
            else if(source.equals(dis.getBtnBack())){
                new ControllerMenu(model);
                dis.dispose();
            }
            
        }
        else if (view instanceof DisplayGudang){
            DisplayGudang dis_gud = (DisplayGudang) view;
            if (source.equals(dis_gud.getBtnOk())) {
                Display dis = new Display();
                dis.setVisible(true);
                dis.addListener((ActionListener) this);
                dis_gud.dispose();
                view = dis;
            }
        }
        else if (view instanceof DisplayPenyedia){
            DisplayPenyedia dis_pen = (DisplayPenyedia) view;
            if (source.equals(dis_pen.getBtnOk())) {
                Display dis = new Display();
                dis.setVisible(true);
                dis.addListener((ActionListener) this);
                dis_pen.dispose();
                view = dis;
            }
        }
        else if (view instanceof DisplayPetugas){
            DisplayPetugas dis_pet = (DisplayPetugas) view;
            if (source.equals(dis_pet.getBtnOk())) {
                Display dis = new Display();
                dis.setVisible(true);
                dis.addListener((ActionListener) this);
                dis_pet.dispose();
                view = dis;
            }
        }
        
       // else if (view instanceof DisplayBarang){
         //   DisplayGudang dis_bar = (DisplayGudang) view;
            
           // }
        
    }
    
    public void setTextAreaGudang(ApplikasiBarang model, DisplayGudang view) {
        view.getTextAreaGudang().setText(model.getGudang());
    }
    public void setTextAreaPenyedia(ApplikasiBarang model, DisplayPenyedia view) {
        view.getTextAreaPenyedia().setText(model.getPenyedia());
    }
    public void setTextAreaPetugas(ApplikasiBarang model, DisplayPetugas view) {
        view.getTextAreaPetugas().setText(model.getPetugas());
    }
}
