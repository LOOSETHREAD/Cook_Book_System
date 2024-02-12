/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CookHub.forms;

import CookHub.components.DishItem;
import CookHub.events.EventItem;
import CookHub.model.ModelItem;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class DishesForm extends javax.swing.JPanel {

   
    public EventItem getEvent() {
        return event;
    }

    public void setEvent(EventItem event) {
        this.event = event;
    }

    public void addDish(ModelItem data){
      DishItem dish = new DishItem();
      dish.setModel(data);
      dish.addMouseListener(new MouseAdapter() {
          @Override
          public void mousePressed(MouseEvent e) {
         if (SwingUtilities.isLeftMouseButton(e)) {
                    event.itemClick(dish, data);
                }               
                super.mousePressed(e);
          
          }
      });

      panelItem1.add(dish);
      repaint();
      revalidate();
 
  }
      public void setSelected(Component item){
           
        for (Component com : panelItem1.getComponents()) {
            DishItem i = (DishItem)com;
           
            if (i.isSelected()) {
                i.setSelected(false);
            }
            ((DishItem) item).setSelected(true);
        }
        
    }
    public DishesForm() {
        initComponents();
        setOpaque(false);
    }
private EventItem event;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new CookHub.swing.PanelItem();

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jScrollPane1.setViewportView(panelItem1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private CookHub.swing.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}
