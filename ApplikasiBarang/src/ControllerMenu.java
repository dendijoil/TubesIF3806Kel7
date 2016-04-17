/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.Menu;
import Views.View;
import applikasibarang.ApplikasiBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author dendijoil
 */
public class ControllerMenu extends MouseAdapter implements ActionListener{
    private ApplikasiBarang model;
    private View view;
    
    public ControllerMenu(ApplikasiBarang model){
        this.model = model;
        Menu m = new Menu();
        m.setVisible(true);
        m.addListener((ActionListener) this);
        view = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(view instanceof Menu){
            Menu men = (Menu) view;
            if(source.equals(men.getBtnAdd())){
                new ControllerAdd(model);
                men.dispose();
            }
            else if(source.equals(men.getBtnDelete())){
                new ControllerDelete(model);
                men.dispose();
            }
            else if(source.equals(men.getBtnEdit())){
                new ControllerEdit(model);
                men.dispose();
            }
            else if(source.equals(men.getBtnDisplay())){
                new ControllerDisplay(model);
                men.dispose();
            }
            else if(source.equals(men.getBtnDisplayBarang())){
                new ControllerDisplayBarang(model);
                men.dispose();
            }
            else if(source.equals(men.getBtnExit())){
                men.dispose();
            }
            
        }
    }
}
