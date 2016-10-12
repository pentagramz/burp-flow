/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvqzao.flow;

import javax.swing.JButton;

/**
 *
 * @author nme
 */
public class FlowFilterPopup extends javax.swing.JPanel {

    /**
     * Creates new form FlowTablePane
     */
    public FlowFilterPopup() {
        initComponents();
    }

    public JButton getFlowFilterDefaults() {
        return flowFilterDefaults;
    }

    public JButton getFlowFilterHelp() {
        return flowFilterHelp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flowFilterHelp = new javax.swing.JButton();
        flowFilterDefaults = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));

        flowFilterHelp.setLabel("");
        flowFilterHelp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        flowFilterHelp.setMaximumSize(new java.awt.Dimension(24, 24));
        flowFilterHelp.setMinimumSize(new java.awt.Dimension(24, 24));
        flowFilterHelp.setPreferredSize(new java.awt.Dimension(24, 24));

        flowFilterDefaults.setInheritsPopupMenu(true);
        flowFilterDefaults.setLabel("");
        flowFilterDefaults.setMargin(new java.awt.Insets(0, 0, 0, 0));
        flowFilterDefaults.setMaximumSize(new java.awt.Dimension(24, 24));
        flowFilterDefaults.setMinimumSize(new java.awt.Dimension(24, 24));
        flowFilterDefaults.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flowFilterHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flowFilterDefaults, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(678, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flowFilterHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flowFilterDefaults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        flowFilterDefaults.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton flowFilterDefaults;
    private javax.swing.JButton flowFilterHelp;
    // End of variables declaration//GEN-END:variables
}
