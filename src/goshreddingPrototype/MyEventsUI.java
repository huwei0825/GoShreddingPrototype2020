/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshreddingPrototype;

import goshredding.data.CalendarPanel;
import goshredding.data.MyEventTableModel;
import goshredding.service.GoService;
import goshredding.vo.EventVO;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author huwei
 */
public class MyEventsUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    ArrayList<EventVO> eventList = new ArrayList<EventVO>();
    ArrayList<EventVO> eventListOriginal = new ArrayList<EventVO>();

    public MyEventsUI() {
        initComponents();
        if (GoService.currentUserType == 2) {
            editBtn.remove(editBtn);
            deleteBtn.setText("Leave");
        }
       
        CalendarPanel ser = CalendarPanel.getInstance();
        JPanel calendarPanel = ser.getCalendarPanel();
        calendarPanel.setPreferredSize(new Dimension(300, 300));
        calendarContainerPanel.add(calendarPanel);
        ser.myeventsui = this;
        //display events on "my events" table
        try {
            
        if (GoService.currentUserType == 1) {
            eventListOriginal = GoService.getInstance().getEventByOrganizerId(GoService.currentUserId);
        }
        if (GoService.currentUserType == 2) {
            //eventListOriginal = GoService.getInstance().getEventByOrganizerId(GoService.currentUserId);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        EventVO event = new EventVO();
        for (int i = 0; i < eventListOriginal.size(); i++) {
            event = (EventVO) eventListOriginal.get(i);
            myEventsTable.setValueAt(event.eventName, i, 0);
            myEventsTable.setValueAt(event.eventDate, i, 1);
            myEventsTable.setValueAt(event.eventType, i, 2);
        }
        eventList = eventListOriginal;
//        MyEventTableModel eventTableModel = new MyEventTableModel(eventList);
//        myEventsTable.setModel(eventTableModel);

    }

    public void displayEventsByDate(String date) {
        ArrayList<EventVO> eventListNew = new ArrayList<EventVO>();

        for (int i = 0; i < eventListOriginal.size(); i++) {
            EventVO event = new EventVO();
            event = (EventVO) eventListOriginal.get(i);
            if (event.eventDate.equalsIgnoreCase(date)) {
                eventListNew.add(event);
            }
        }
        if(eventListNew.size() == 0){
            JOptionPane.showMessageDialog(null, "No events on this date");
        }
        eventList = eventListNew;
        MyEventTableModel eventTableModel = new MyEventTableModel(eventList);
        myEventsTable.setModel(eventTableModel);
        myEventsTable.repaint();
        eventTypeComboBox.setSelectedIndex(3);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eventTypeComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        myEventsTable = new javax.swing.JTable();
        openBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        calendarContainerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 246, 254));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 480));

        jPanel.setBackground(new java.awt.Color(239, 246, 254));
        jPanel.setPreferredSize(new java.awt.Dimension(850, 480));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("My events");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Event type:");

        eventTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All events", "Past events", "Future events", "value from calender" }));
        eventTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eventTypeComboBoxItemStateChanged(evt);
            }
        });

        myEventsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Event name", "Date", "Type"
            }
        ));
        myEventsTable.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(myEventsTable);

        openBtn.setBackground(new java.awt.Color(72, 124, 175));
        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(72, 124, 175));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(72, 124, 175));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        calendarContainerPanel.setBackground(new java.awt.Color(239, 246, 254));
        calendarContainerPanel.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Calender：");

        backBtn.setBackground(new java.awt.Color(72, 124, 175));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eventTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(358, 358, 358))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eventTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calendarContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        int row = myEventsTable.getSelectedRow();
        EventVO event = (EventVO) eventList.get(row);
        if (!event.eventName.equalsIgnoreCase("You have no events yet")) {
            OpenEventsUI oeFrm = new OpenEventsUI();
            oeFrm.sourceForm = 2;
            oeFrm.setEvent(event);
            oeFrm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_openBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try{
        int row = myEventsTable.getSelectedRow();
        EventVO event = (EventVO) eventList.get(row);
        
        if (!event.eventName.equalsIgnoreCase("You have no events yet")) {
            EventInformationUI eiFrm = new EventInformationUI();
            eiFrm.setEvent(event);
            eiFrm.sourceForm = 2;
            eiFrm.setVisible(true);
            this.dispose();
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select an event first");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try{
        int row = myEventsTable.getSelectedRow();
        EventVO event = (EventVO) eventList.get(row);
        int delete = JOptionPane.showConfirmDialog(null, "Are you sure want to delete?");
            
        if (delete == JOptionPane.YES_OPTION) {
            try{
                GoService.getInstance().deleteEvent(event);
            }catch(Exception e){
                
            }
            }
        MyEventsUI me = new MyEventsUI();
                me.setVisible(true);
                this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select an event first");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainFormUI mainFrm = new MainFormUI();
        mainFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void eventTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eventTypeComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (eventTypeComboBox.getSelectedIndex() == 0) {
                eventList = eventListOriginal;
                MyEventTableModel eventTableModel = new MyEventTableModel(eventList);
                myEventsTable.setModel(eventTableModel);
            } else if (eventTypeComboBox.getSelectedIndex() == 1) {
                System.out.println("select all events 1");
            }
            myEventsTable.repaint();
        }
    }//GEN-LAST:event_eventTypeComboBoxItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyEventsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel calendarContainerPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> eventTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myEventsTable;
    private javax.swing.JButton openBtn;
    // End of variables declaration//GEN-END:variables
}
