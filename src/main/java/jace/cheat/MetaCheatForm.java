/*
 * Copyright (C) 2012 Brendan Robert (BLuRry) brendan.robert@gmail.com.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package jace.cheat;

import jace.core.Utility;
import static jace.core.Utility.gripe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This is the metacheat user interface. The actual logic of metacheat is in the
 * Metacheats class.
 *
 * @author Brendan Robert (BLuRry) brendan.robert@gmail.com 
 */
public class MetaCheatForm extends javax.swing.JFrame {

    /**
     * Creates new form MetaCheatForm
     */
    public MetaCheatForm() {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTypes = new javax.swing.ButtonGroup();
        valueTypes = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        cheatPanel = new javax.swing.JPanel();
        activeCheatsLabel = new javax.swing.JLabel();
        activeCheatsScroll = new javax.swing.JScrollPane();
        activeCheatsTable = new javax.swing.JTable();
        removeSelectedButton = new javax.swing.JButton();
        addNewCheatLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addValueLabel = new javax.swing.JLabel();
        addAddressLabel = new javax.swing.JLabel();
        addByteValueButton = new javax.swing.JButton();
        addWordValueButton = new javax.swing.JButton();
        addAddressField = new javax.swing.JTextField();
        addValueField = new javax.swing.JTextField();
        disableCheatButton = new javax.swing.JButton();
        enableCheatButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchForValue = new javax.swing.JRadioButton();
        searchForLabel = new javax.swing.JLabel();
        searchForChange = new javax.swing.JRadioButton();
        searchNumber = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        resultsStatusLabel = new javax.swing.JLabel();
        resultsScroll = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        addSelected = new javax.swing.JButton();
        searchForByte = new javax.swing.JRadioButton();
        searchForWord = new javax.swing.JRadioButton();
        addWatchLabel = new javax.swing.JLabel();
        addStartLabel = new javax.swing.JLabel();
        addStartNumber = new javax.swing.JTextField();
        addEndNumber = new javax.swing.JTextField();
        addEndLabel = new javax.swing.JLabel();
        addWatchesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        activeCheatsLabel.setText("Active Cheats");

        activeCheatsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activeCheatsScroll.setViewportView(activeCheatsTable);

        removeSelectedButton.setText("Remove Selected");
        removeSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSelectedButtonActionPerformed(evt);
            }
        });

        addNewCheatLabel.setText("Add a new cheat:");

        addValueLabel.setText("Value");

        addAddressLabel.setText("Address");

        addByteValueButton.setText("Add Byte Value");
        addByteValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addByteValueButtonActionPerformed(evt);
            }
        });

        addWordValueButton.setText("Add Word Value");
        addWordValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordValueButtonActionPerformed(evt);
            }
        });

        disableCheatButton.setText("Disable Selected");
        disableCheatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disableCheatButtonActionPerformed(evt);
            }
        });

        enableCheatButton.setText("Enable Selected");
        enableCheatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableCheatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cheatPanelLayout = new javax.swing.GroupLayout(cheatPanel);
        cheatPanel.setLayout(cheatPanelLayout);
        cheatPanelLayout.setHorizontalGroup(
            cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cheatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeCheatsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(cheatPanelLayout.createSequentialGroup()
                        .addGroup(cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activeCheatsLabel)
                            .addComponent(addNewCheatLabel)
                            .addGroup(cheatPanelLayout.createSequentialGroup()
                                .addComponent(addByteValueButton)
                                .addGap(18, 18, 18)
                                .addComponent(addWordValueButton))
                            .addGroup(cheatPanelLayout.createSequentialGroup()
                                .addComponent(addValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cheatPanelLayout.createSequentialGroup()
                                .addComponent(addAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cheatPanelLayout.createSequentialGroup()
                        .addComponent(disableCheatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enableCheatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeSelectedButton)))
                .addContainerGap())
        );
        cheatPanelLayout.setVerticalGroup(
            cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cheatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activeCheatsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activeCheatsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeSelectedButton)
                    .addComponent(disableCheatButton)
                    .addComponent(enableCheatButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addNewCheatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAddressLabel)
                    .addComponent(addAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addValueLabel)
                    .addComponent(addValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cheatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addByteValueButton)
                    .addComponent(addWordValueButton))
                .addContainerGap())
        );

        tabs.addTab("Cheats", cheatPanel);

        searchTypes.add(searchForValue);
        searchForValue.setSelected(true);
        searchForValue.setText("Value");
        searchForValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchForValueActionPerformed(evt);
            }
        });

        searchForLabel.setText("Search for:");

        searchTypes.add(searchForChange);
        searchForChange.setText("Change");
        searchForChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchForChangeActionPerformed(evt);
            }
        });

        searchNumber.setText("0");
        searchNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNumberActionPerformed(evt);
            }
        });

        valueLabel.setText("Value:");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        resultsStatusLabel.setText("No results");
        resultsStatusLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        resultsStatusLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Last Search", "Current Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultsTable.getTableHeader().setResizingAllowed(false);
        resultsScroll.setViewportView(resultsTable);
        resultsTable.getColumnModel().getColumn(0).setResizable(false);
        resultsTable.getColumnModel().getColumn(1).setResizable(false);
        resultsTable.getColumnModel().getColumn(2).setResizable(false);

        addSelected.setText("Add Selected");
        addSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSelectedActionPerformed(evt);
            }
        });

        valueTypes.add(searchForByte);
        searchForByte.setSelected(true);
        searchForByte.setText("Byte");

        valueTypes.add(searchForWord);
        searchForWord.setText("Word");

        addWatchLabel.setText("Add Watches:");

        addStartLabel.setText("Start");

        addEndLabel.setText("End");

        addWatchesButton.setText("Add");
        addWatchesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWatchesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(addSelected)
                        .addGap(18, 18, 18)
                        .addComponent(resultsStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(searchForLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchForChange)
                                    .addComponent(searchForValue))
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(searchPanelLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(searchForByte))
                                    .addGroup(searchPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(searchForWord))))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(valueLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                                .addComponent(addWatchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addWatchesButton))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addStartLabel)
                                    .addComponent(addEndLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addEndNumber)
                                    .addComponent(addStartNumber))))))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchForLabel)
                            .addComponent(searchForValue)
                            .addComponent(searchForByte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchForChange)
                            .addComponent(searchForWord)
                            .addComponent(addStartLabel)
                            .addComponent(addStartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel)
                            .addComponent(resetButton)
                            .addComponent(searchButton)
                            .addComponent(addEndLabel)
                            .addComponent(addEndNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addWatchesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addWatchLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSelected)
                    .addComponent(resultsStatusLabel))
                .addContainerGap())
        );

        tabs.addTab("Search", searchPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchForValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchForValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchForValueActionPerformed

    private void searchForChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchForChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchForChangeActionPerformed

    private void searchNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNumberActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        MetaCheats.singleton.resetSearch();
        resultsStatusLabel.setText("Results cleared.");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void addSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSelectedActionPerformed
        List<Integer> addr = new ArrayList<Integer>(MetaCheats.singleton.results.keySet());
        int val = Utility.parseHexInt(searchNumber.getText());
        for (int i : resultsTable.getSelectedRows()) {
            if (searchForByte.isSelected()) {
                MetaCheats.singleton.addByteCheat(addr.get(i), val);
            } else {
                MetaCheats.singleton.addWordCheat(addr.get(i), val);
            }
        }
    }//GEN-LAST:event_addSelectedActionPerformed

    private void removeSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSelectedButtonActionPerformed
        Set<Integer> remove = new HashSet<Integer>();
        for (int i : activeCheatsTable.getSelectedRows()) {
            String s = String.valueOf(activeCheatsTable.getModel().getValueAt(i, 0));
            remove.add(Utility.parseHexInt(s));
        }
        for (int i : remove) {
            MetaCheats.singleton.removeCheat(i);
        }
    }//GEN-LAST:event_removeSelectedButtonActionPerformed

    private void addByteValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addByteValueButtonActionPerformed
        try {
            int addr = Utility.parseHexInt(addAddressField.getText());
            int val = Utility.parseHexInt(addValueField.getText());
            MetaCheats.singleton.addByteCheat(addr, val);
        } catch (NullPointerException e) {
            gripe("Please enure that the address and value fields are correctly filled in.");
        }
    }//GEN-LAST:event_addByteValueButtonActionPerformed

    private void addWordValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordValueButtonActionPerformed
        try {
            int addr = Utility.parseHexInt(addAddressField.getText());
            int val = Utility.parseHexInt(addValueField.getText());
            MetaCheats.singleton.addWordCheat(addr, val);
        } catch (NullPointerException e) {
            gripe("Please enure that the address and value fields are correctly filled in.");
        }
    }//GEN-LAST:event_addWordValueButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchForChange.isSelected() == searchForValue.isSelected()) {
            gripe("Please select if you want to search for a fixed value or a delta change");
            return;
        }
        if (searchForByte.isSelected() == searchForWord.isSelected()) {
            gripe("Please select if you want to search for a byte or a word value");
            return;
        }
        try {
            int val = Utility.parseHexInt(searchNumber.getText());
            MetaCheats.singleton.performSearch(searchForChange.isSelected(), searchForByte.isSelected(), val);
        } catch (NullPointerException e) {
            gripe("Please enter a value");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void disableCheatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disableCheatButtonActionPerformed
        for (int i : activeCheatsTable.getSelectedRows()) {
            String s = String.valueOf(activeCheatsTable.getModel().getValueAt(i, 0));
            MetaCheats.singleton.disableCheat(Utility.parseHexInt(s));
        }

    }//GEN-LAST:event_disableCheatButtonActionPerformed

    private void enableCheatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableCheatButtonActionPerformed
        for (int i : activeCheatsTable.getSelectedRows()) {
            String s = String.valueOf(activeCheatsTable.getModel().getValueAt(i, 0));
            MetaCheats.singleton.enableCheat(Utility.parseHexInt(s));
        }
    }//GEN-LAST:event_enableCheatButtonActionPerformed

    private void addWatchesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWatchesButtonActionPerformed
        try {
            int addrStart = Utility.parseHexInt(addStartNumber.getText());
            int addrEnd = Utility.parseHexInt(addEndNumber.getText());
            if (addrStart > addrEnd) {
                gripe("Start address must be smaller than end address!");
                return;
            }
            MetaCheats.singleton.addWatches(addrStart, addrEnd);
            resultsStatusLabel.setText("Added range to watch list.");
        } catch (NullPointerException e) {
            gripe("Please enure that the start and end fields are correctly filled in.");
        }
    }//GEN-LAST:event_addWatchesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MetaCheatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetaCheatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetaCheatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetaCheatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetaCheatForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel activeCheatsLabel;
    public javax.swing.JScrollPane activeCheatsScroll;
    public javax.swing.JTable activeCheatsTable;
    public javax.swing.JTextField addAddressField;
    public javax.swing.JLabel addAddressLabel;
    public javax.swing.JButton addByteValueButton;
    public javax.swing.JLabel addEndLabel;
    public javax.swing.JTextField addEndNumber;
    public javax.swing.JLabel addNewCheatLabel;
    public javax.swing.JButton addSelected;
    public javax.swing.JLabel addStartLabel;
    public javax.swing.JTextField addStartNumber;
    public javax.swing.JTextField addValueField;
    public javax.swing.JLabel addValueLabel;
    public javax.swing.JLabel addWatchLabel;
    public javax.swing.JButton addWatchesButton;
    public javax.swing.JButton addWordValueButton;
    public javax.swing.JPanel cheatPanel;
    public javax.swing.JButton disableCheatButton;
    public javax.swing.JButton enableCheatButton;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton removeSelectedButton;
    public javax.swing.JButton resetButton;
    public javax.swing.JScrollPane resultsScroll;
    public javax.swing.JLabel resultsStatusLabel;
    public javax.swing.JTable resultsTable;
    public javax.swing.JButton searchButton;
    public javax.swing.JRadioButton searchForByte;
    public javax.swing.JRadioButton searchForChange;
    public javax.swing.JLabel searchForLabel;
    public javax.swing.JRadioButton searchForValue;
    public javax.swing.JRadioButton searchForWord;
    public javax.swing.JTextField searchNumber;
    public javax.swing.JPanel searchPanel;
    public javax.swing.ButtonGroup searchTypes;
    public javax.swing.JTabbedPane tabs;
    public javax.swing.JLabel valueLabel;
    public javax.swing.ButtonGroup valueTypes;
    // End of variables declaration//GEN-END:variables
}
