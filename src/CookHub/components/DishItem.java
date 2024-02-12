
package CookHub.components;

import CookHub.model.ModelItem;


public class DishItem extends javax.swing.JPanel {

   
    public ModelItem getModel() {
        return model;
    }

   
    public void setModel(ModelItem model) {
        this.model = model;
        dishImage.setImage(model.getDishImage());
        dishTitile.setText(model.getDishName());
        dishDescription.setText(model.getDishDescription());
        dishIngredients.setText(model.getDishRecipe());
        dishProcedures.setText(model.getDishProcedure());
    }

  
    public boolean isSelected() {
        return selected;
    }

   
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

  
    public DishItem() {
        initComponents();
        dishDescription.setVisible(false);
        dishIngredients.setVisible(false);
        dishProcedures.setVisible(false);
    }

    private ModelItem model;
    private boolean selected;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dishImage = new CookHub.components.PictureBox();
        dishTitile = new javax.swing.JLabel();
        dishIngredients = new javax.swing.JLabel();
        dishDescription = new javax.swing.JLabel();
        dishProcedures = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        dishImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dishImageMouseClicked(evt);
            }
        });

        dishTitile.setText("Title");
        dishTitile.setToolTipText("");
        dishTitile.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dishTitile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dishDescription)
                .addGap(31, 31, 31)
                .addComponent(dishIngredients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(dishProcedures)
                .addGap(34, 34, 34))
            .addComponent(dishImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dishImage, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dishTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dishDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dishIngredients)
                    .addComponent(dishProcedures))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dishImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dishImageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dishImageMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dishDescription;
    private CookHub.components.PictureBox dishImage;
    private javax.swing.JLabel dishIngredients;
    private javax.swing.JLabel dishProcedures;
    private javax.swing.JLabel dishTitile;
    // End of variables declaration//GEN-END:variables
}
