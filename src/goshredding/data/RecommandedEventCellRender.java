/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.data;

import goshredding.vo.EventVO;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Songyun Hu
 */
public class RecommandedEventCellRender extends javax.swing.JPanel implements TableCellRenderer{

    /**
     * Creates new form RecommandedEventCellRender
     */
    public RecommandedEventCellRender() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        recommandEventName = new javax.swing.JLabel();
        recommandEventType = new javax.swing.JLabel();
        recommandEventTime = new javax.swing.JLabel();
        recommandEventDate = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(380, 50));
        setPreferredSize(new java.awt.Dimension(400, 50));

        jPanel1.setBackground(new java.awt.Color(239, 246, 254));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        recommandEventName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        recommandEventName.setText("Clyne MTB");
        jPanel1.add(recommandEventName);
        recommandEventName.setBounds(6, 6, 260, 20);

        recommandEventType.setText("Mountain biking");
        jPanel1.add(recommandEventType);
        recommandEventType.setBounds(7, 28, 103, 16);

        recommandEventTime.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        recommandEventTime.setText("4:00 PM");
        jPanel1.add(recommandEventTime);
        recommandEventTime.setBounds(275, 6, 100, 21);

        recommandEventDate.setText("2019/10/30");
        jPanel1.add(recommandEventDate);
        recommandEventDate.setBounds(275, 28, 78, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel recommandEventDate;
    private javax.swing.JLabel recommandEventName;
    private javax.swing.JLabel recommandEventTime;
    private javax.swing.JLabel recommandEventType;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        EventVO eventObj=(EventVO)value;
        recommandEventName.setText(eventObj.eventName);
        recommandEventDate.setText(eventObj.eventDate);
        recommandEventTime.setText(eventObj.eventTime);
        recommandEventType.setText(eventObj.eventType);
        if(isSelected){
             jPanel1.setBackground(new java.awt.Color(218,227,243));
        }else{
             jPanel1.setBackground(new java.awt.Color(239, 246, 254));
        }
        return this; 
    }
}
