/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package View;
import java.io.*; 
import java.util.ArrayList;
import Model.FileOperation;
import Control.InvoiceHeader;
import Control.InvoiceLine;
import javax.swing.*;
//import java.awt.*;  
//import java.awt.event.*;  


/**
 *
 * @author Xbenx
 */
public class MainFrame extends javax.swing.JFrame {
    private int SelectedInvoiceHeader=-1;
    private int SelectedInvoiceLine=-1;
    private ArrayList<InvoiceHeader>read=new ArrayList<>();
    private FileOperation HandleFile; 
    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddNewInvoice = new javax.swing.JDialog();
        CustomerNameLabel = new javax.swing.JLabel();
        InvoiceDateLabel = new javax.swing.JLabel();
        CustomerNameTextField = new javax.swing.JTextField();
        InvoiceDateTextField = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        AddNewItem = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        ItemName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ItemPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Count = new javax.swing.JTextField();
        AddNewItembtn = new javax.swing.JButton();
        EditInvoicesDialog = new javax.swing.JDialog();
        CustomerNameLabel1 = new javax.swing.JLabel();
        InvoiceDateLabel1 = new javax.swing.JLabel();
        CustomerNameTextField1 = new javax.swing.JTextField();
        InvoiceDateTextField1 = new javax.swing.JTextField();
        EditInvoicebtn = new javax.swing.JButton();
        EditItemDialog = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        ItemName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ItemPrice1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Count1 = new javax.swing.JTextField();
        EditItembtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InvoiceHeaderTable = new javax.swing.JTable();
        DeleteInvoice = new javax.swing.JButton();
        AddInvoice = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceLineTable = new javax.swing.JTable();
        DeleteItem = new javax.swing.JButton();
        AddItem = new javax.swing.JButton();
        EditInvoice = new javax.swing.JButton();
        EditItem = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        LoadFile = new javax.swing.JMenuItem();

        AddNewInvoice.setTitle("Add New Invoice");
        AddNewInvoice.setResizable(false);
        AddNewInvoice.setSize(new java.awt.Dimension(400, 214));

        CustomerNameLabel.setText("Customer Name:");

        InvoiceDateLabel.setText("Invoice Date:");

        Add.setText("Add New Invoice");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddNewInvoiceLayout = new javax.swing.GroupLayout(AddNewInvoice.getContentPane());
        AddNewInvoice.getContentPane().setLayout(AddNewInvoiceLayout);
        AddNewInvoiceLayout.setHorizontalGroup(
            AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewInvoiceLayout.createSequentialGroup()
                .addGroup(AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewInvoiceLayout.createSequentialGroup()
                        .addGroup(AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddNewInvoiceLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(InvoiceDateLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewInvoiceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CustomerNameLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InvoiceDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(CustomerNameTextField)))
                    .addGroup(AddNewInvoiceLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Add)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        AddNewInvoiceLayout.setVerticalGroup(
            AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewInvoiceLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameLabel)
                    .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddNewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceDateLabel)
                    .addComponent(InvoiceDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Add)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        CustomerNameTextField.getAccessibleContext().setAccessibleName("");
        CustomerNameTextField.getAccessibleContext().setAccessibleDescription("");

        AddNewInvoice.getAccessibleContext().setAccessibleName("AddNewInvoice");

        AddNewItem.setTitle("Add New Item");
        AddNewItem.setName("AddNewItem"); // NOI18N
        AddNewItem.setSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("Item Name:");

        jLabel2.setText("Item Price:");

        jLabel3.setText("Count:");

        AddNewItembtn.setText("Add New Item");
        AddNewItembtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewItembtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddNewItemLayout = new javax.swing.GroupLayout(AddNewItem.getContentPane());
        AddNewItem.getContentPane().setLayout(AddNewItemLayout);
        AddNewItemLayout.setHorizontalGroup(
            AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewItemLayout.createSequentialGroup()
                .addGroup(AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewItemLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewItembtn)
                    .addGroup(AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ItemName)
                        .addComponent(ItemPrice)
                        .addComponent(Count, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        AddNewItemLayout.setVerticalGroup(
            AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewItemLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(AddNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(AddNewItembtn)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        EditInvoicesDialog.setTitle("Edit Invoice");
        EditInvoicesDialog.setResizable(false);
        EditInvoicesDialog.setSize(new java.awt.Dimension(400, 214));

        CustomerNameLabel1.setText("Customer Name:");

        InvoiceDateLabel1.setText("Invoice Date:");

        EditInvoicebtn.setText("Edit Invoice");
        EditInvoicebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditInvoicebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EditInvoicesDialogLayout = new javax.swing.GroupLayout(EditInvoicesDialog.getContentPane());
        EditInvoicesDialog.getContentPane().setLayout(EditInvoicesDialogLayout);
        EditInvoicesDialogLayout.setHorizontalGroup(
            EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditInvoicesDialogLayout.createSequentialGroup()
                .addGroup(EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditInvoicesDialogLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InvoiceDateLabel1)
                            .addComponent(CustomerNameLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InvoiceDateTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(CustomerNameTextField1)))
                    .addGroup(EditInvoicesDialogLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(EditInvoicebtn)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        EditInvoicesDialogLayout.setVerticalGroup(
            EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditInvoicesDialogLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameLabel1)
                    .addComponent(CustomerNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditInvoicesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceDateLabel1)
                    .addComponent(InvoiceDateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EditInvoicebtn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        EditItemDialog.setTitle("Edit Item");
        EditItemDialog.setName("AddNewItem"); // NOI18N
        EditItemDialog.setSize(new java.awt.Dimension(400, 300));

        jLabel4.setText("Item Name:");

        jLabel5.setText("Item Price:");

        jLabel6.setText("Count:");

        EditItembtn.setText("Edit Item");
        EditItembtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditItembtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EditItemDialogLayout = new javax.swing.GroupLayout(EditItemDialog.getContentPane());
        EditItemDialog.getContentPane().setLayout(EditItemDialogLayout);
        EditItemDialogLayout.setHorizontalGroup(
            EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditItemDialogLayout.createSequentialGroup()
                .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EditItemDialogLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditItemDialogLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditItembtn)
                    .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ItemName1)
                        .addComponent(ItemPrice1)
                        .addComponent(Count1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        EditItemDialogLayout.setVerticalGroup(
            EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditItemDialogLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(EditItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Count1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(EditItembtn)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rubic");
        setResizable(false);

        InvoiceHeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InvoiceNumber", "CustomerName", "InvoiceDate", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InvoiceHeaderTable.setCellSelectionEnabled(true);
        InvoiceHeaderTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InvoiceHeaderTable.setName(""); // NOI18N
        InvoiceHeaderTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        InvoiceHeaderTable.setShowVerticalLines(true);
        InvoiceHeaderTable.getTableHeader().setReorderingAllowed(false);
        InvoiceHeaderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceHeaderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(InvoiceHeaderTable);
        InvoiceHeaderTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (InvoiceHeaderTable.getColumnModel().getColumnCount() > 0) {
            InvoiceHeaderTable.getColumnModel().getColumn(0).setResizable(false);
            InvoiceHeaderTable.getColumnModel().getColumn(1).setResizable(false);
            InvoiceHeaderTable.getColumnModel().getColumn(2).setResizable(false);
            InvoiceHeaderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        DeleteInvoice.setText("Delete Invoice");
        DeleteInvoice.setEnabled(false);
        DeleteInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteInvoiceMouseClicked(evt);
            }
        });

        AddInvoice.setText("Add Invoice");
        AddInvoice.setActionCommand("");
        AddInvoice.setEnabled(false);
        AddInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddInvoiceMouseClicked(evt);
            }
        });

        InvoiceLineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice Number", "Item Name", "Item Price", "Count", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InvoiceLineTable.setColumnSelectionAllowed(true);
        InvoiceLineTable.getTableHeader().setReorderingAllowed(false);
        InvoiceLineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceLineTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(InvoiceLineTable);
        InvoiceLineTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (InvoiceLineTable.getColumnModel().getColumnCount() > 0) {
            InvoiceLineTable.getColumnModel().getColumn(0).setResizable(false);
            InvoiceLineTable.getColumnModel().getColumn(1).setResizable(false);
            InvoiceLineTable.getColumnModel().getColumn(2).setResizable(false);
            InvoiceLineTable.getColumnModel().getColumn(3).setResizable(false);
            InvoiceLineTable.getColumnModel().getColumn(4).setResizable(false);
        }

        DeleteItem.setText("Delete Item");
        DeleteItem.setEnabled(false);
        DeleteItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteItemMouseClicked(evt);
            }
        });

        AddItem.setText("Add Item");
        AddItem.setEnabled(false);
        AddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemMouseClicked(evt);
            }
        });

        EditInvoice.setText("Edit Invoice");
        EditInvoice.setToolTipText("");
        EditInvoice.setEnabled(false);
        EditInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditInvoiceMouseClicked(evt);
            }
        });

        EditItem.setText("Edit Item");
        EditItem.setEnabled(false);
        EditItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditItemMouseClicked(evt);
            }
        });

        FileMenu.setText("File");

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Save.setText("Save");
        Save.setEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        FileMenu.add(Save);

        LoadFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        LoadFile.setText("Load");
        LoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileActionPerformed(evt);
            }
        });
        FileMenu.add(LoadFile);

        Menu.add(FileMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(DeleteItem)
                        .addGap(82, 82, 82)
                        .addComponent(AddItem)
                        .addGap(77, 77, 77)
                        .addComponent(EditItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(DeleteInvoice)
                        .addGap(64, 64, 64)
                        .addComponent(AddInvoice)
                        .addGap(66, 66, 66)
                        .addComponent(EditInvoice)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteInvoice)
                    .addComponent(AddInvoice)
                    .addComponent(EditInvoice))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteItem)
                    .addComponent(AddItem)
                    .addComponent(EditItem))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileActionPerformed
        try
        {
            javax.swing.JFileChooser fc=new javax.swing.JFileChooser();    
            String LineFile="";
            String HeaderFile="";
            int i=fc.showOpenDialog(this);    
            if(i==javax.swing.JFileChooser.APPROVE_OPTION){    
                File f=fc.getSelectedFile();    
                HeaderFile=f.getPath();    
                i=fc.showOpenDialog(this);    
                if(i==javax.swing.JFileChooser.APPROVE_OPTION){    
                    f=fc.getSelectedFile();    
                    LineFile=f.getPath();    
                    }
                }
                HandleFile=new FileOperation();
                SelectedInvoiceLine=-1;
                SelectedInvoiceHeader=-1;
                read=HandleFile.ReadFromExcal(HeaderFile,LineFile);
                Rerender();   
                AddInvoice.setEnabled(true);
                Save.setEnabled(true);
        }
        catch(Exception e)
        {
            if (read.isEmpty())
              Save.setEnabled(false);
//            AddInvoice.setEnabled(false);
//            DeleteInvoice.setEnabled(false);
//            AddItem.setEnabled(false);
//            EditInvoice.setEnabled(false);
//            DeleteItem.setEnabled(false);
//            EditItem.setEnabled(false);
            Error(e.getMessage());
        }
    }//GEN-LAST:event_LoadFileActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try{
        javax.swing.JFileChooser fc=new javax.swing.JFileChooser();    
        String LineFile="";
        String HeaderFile="";
        int i=fc.showOpenDialog(this);    
        if(i==javax.swing.JFileChooser.APPROVE_OPTION){    
            File f=fc.getSelectedFile();    
            HeaderFile=f.getPath();    
            i=fc.showOpenDialog(this);    
            if(i==javax.swing.JFileChooser.APPROVE_OPTION){    
                f=fc.getSelectedFile();    
                LineFile=f.getPath();    
            }
        }
        HandleFile.WriteToExcal(HeaderFile, LineFile,read);}
        catch(Exception e)
        {
            Error(e.getMessage());
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void InvoiceHeaderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceHeaderTableMouseClicked
        // TODO add your handling code here:
        DeleteInvoice.setEnabled(true);
        AddInvoice.setEnabled(true);
        EditInvoice.setEnabled(true);
        AddItem.setEnabled(true);
        EditItem.setEnabled(false);
        DeleteItem.setEnabled(false);
        
        SelectedInvoiceHeader=InvoiceHeaderTable.getSelectedRow();
        String SelectedInvoiceHeaderNumber=InvoiceHeaderTable.getValueAt(InvoiceHeaderTable.getSelectedRow(), 0).toString();        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) InvoiceLineTable.getModel();         
        for (int i = model.getRowCount()-1; i >= 0; i--)
            model.removeRow(i);
        for (InvoiceLine data :read.get(SelectedInvoiceHeader).getItems())
            model.addRow(new Object[]{SelectedInvoiceHeaderNumber,data.getItemName(),data.getItemPrice(),data.getCount(),data.getCount()*data.getItemPrice()});
    }//GEN-LAST:event_InvoiceHeaderTableMouseClicked

    private void InvoiceLineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceLineTableMouseClicked
        SelectedInvoiceLine=InvoiceLineTable.getSelectedRow();
        DeleteItem.setEnabled(true);
        EditItem.setEnabled(true);
        DeleteInvoice.setEnabled(false);
        EditInvoice.setEnabled(false);

        
    }//GEN-LAST:event_InvoiceLineTableMouseClicked

    private void DeleteInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteInvoiceMouseClicked
        read.remove(SelectedInvoiceHeader);
        SelectedInvoiceHeader=-1;
        Rerender();
        DeleteInvoice.setEnabled(false);
    }//GEN-LAST:event_DeleteInvoiceMouseClicked

    private void AddInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddInvoiceMouseClicked
        AddNewInvoice.setVisible(true);
    }//GEN-LAST:event_AddInvoiceMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
    try{
        read.add(new InvoiceHeader(InvoiceDateTextField.getText(),CustomerNameTextField.getText()));
        Rerender();
        AddNewInvoice.setVisible(false);
        ResetAllTextfield();
        }   
        catch(Exception e)
       {
             Error(e.getMessage());
       }
    }//GEN-LAST:event_AddActionPerformed

    private void EditInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditInvoiceMouseClicked
        CustomerNameTextField1.setText(read.get(SelectedInvoiceHeader).getCustomerName());
        InvoiceDateTextField1.setText(read.get(SelectedInvoiceHeader).getInvoiceDate());
        EditInvoicesDialog.setVisible(true);
    }//GEN-LAST:event_EditInvoiceMouseClicked

    private void EditItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditItemMouseClicked
        ItemName1.setText(read.get(SelectedInvoiceHeader).getItems().get(SelectedInvoiceLine).getItemName());
        ItemPrice1.setText(""+read.get(SelectedInvoiceHeader).getItems().get(SelectedInvoiceLine).getItemPrice());
        Count1.setText(""+read.get(SelectedInvoiceHeader).getItems().get(SelectedInvoiceLine).getCount());
        EditItemDialog.setVisible(true);
    }//GEN-LAST:event_EditItemMouseClicked

    private void EditInvoicebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditInvoicebtnMouseClicked
        try{
            read.get(SelectedInvoiceHeader).setCustomerName(CustomerNameTextField1.getText());
            read.get(SelectedInvoiceHeader).setInvoiceDate(InvoiceDateTextField1.getText());
            Rerender();
            EditInvoicesDialog.setVisible(false);
            ResetAllTextfield();
        }catch(Exception e)
        {
            Error(e.getMessage());
        }

    }//GEN-LAST:event_EditInvoicebtnMouseClicked

    private void AddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemMouseClicked
        AddNewItem.setVisible(true);
    }//GEN-LAST:event_AddItemMouseClicked

    private void AddNewItembtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewItembtnMouseClicked
    try{
            read.get(SelectedInvoiceHeader).addItems(new InvoiceLine(ItemName.getText(),Integer.parseInt(ItemPrice.getText()),Integer.parseInt(Count.getText())));
            Rerender();
            AddNewItem.setVisible(false);
            ResetAllTextfield();
        }
       catch(Exception e)
       {
             Error(e.getMessage());
       }
    }//GEN-LAST:event_AddNewItembtnMouseClicked

    private void EditItembtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditItembtnMouseClicked
         try{
            read.get(SelectedInvoiceHeader).getItems().get(SelectedInvoiceLine).setItemName(ItemName1.getText());
            read.get(SelectedInvoiceHeader).getItems().get(SelectedInvoiceLine).setItemPrice(Integer.parseInt(ItemPrice1.getText()));
            read.get(SelectedInvoiceHeader).getItems().get(SelectedInvoiceLine).setCount(Integer.parseInt(Count1.getText()));
            Rerender();
            EditItemDialog.setVisible(false);
            ResetAllTextfield();
        }catch(Exception e)
        {
            Error(e.getMessage());
        }
    }//GEN-LAST:event_EditItembtnMouseClicked

    private void DeleteItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteItemMouseClicked
        read.get(SelectedInvoiceHeader).removeItems(SelectedInvoiceLine);
        SelectedInvoiceLine=-1;
        Rerender();
        DeleteItem.setEnabled(false);
    }//GEN-LAST:event_DeleteItemMouseClicked
    
    private void Error(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage,"Error",JOptionPane.ERROR_MESSAGE);
    }
    
    private void Rerender(){
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) InvoiceHeaderTable.getModel();
        for (int index = model.getRowCount()-1; index >= 0; index--)
            model.removeRow(index);
        for (InvoiceHeader data :read)
            model.addRow(new Object[]{data.getInvoiceNumber(),data.getCustomerName(),data.getInvoiceDate(),data.getTotal()});
        model = (javax.swing.table.DefaultTableModel) InvoiceLineTable.getModel();
        
        for (int index = model.getRowCount()-1; index >= 0; index--)
            model.removeRow(index);
        if (SelectedInvoiceHeader!=-1)
        {
            String SelectedInvoiceHeaderNumber=InvoiceHeaderTable.getValueAt(SelectedInvoiceHeader, 0).toString();      
            for (InvoiceLine data :read.get(SelectedInvoiceHeader).getItems())
                model.addRow(new Object[]{SelectedInvoiceHeaderNumber,data.getItemName(),data.getItemPrice(),data.getCount(),data.getCount()*data.getItemPrice()});
        }
    }
    private void ResetAllTextfield()
    {
        ItemName.setText("");
        ItemPrice.setText("");
        Count.setText("");
        CustomerNameTextField.setText("");
        InvoiceDateTextField.setText("");
        ItemName1.setText("");
        ItemPrice1.setText("");
        Count1.setText("");
        CustomerNameTextField1.setText("");
        InvoiceDateTextField1.setText("");
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddInvoice;
    private javax.swing.JButton AddItem;
    private javax.swing.JDialog AddNewInvoice;
    private javax.swing.JDialog AddNewItem;
    private javax.swing.JButton AddNewItembtn;
    private javax.swing.JTextField Count;
    private javax.swing.JTextField Count1;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JLabel CustomerNameLabel1;
    private javax.swing.JTextField CustomerNameTextField;
    private javax.swing.JTextField CustomerNameTextField1;
    private javax.swing.JButton DeleteInvoice;
    private javax.swing.JButton DeleteItem;
    private javax.swing.JButton EditInvoice;
    private javax.swing.JButton EditInvoicebtn;
    private javax.swing.JDialog EditInvoicesDialog;
    private javax.swing.JButton EditItem;
    private javax.swing.JDialog EditItemDialog;
    private javax.swing.JButton EditItembtn;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JLabel InvoiceDateLabel;
    private javax.swing.JLabel InvoiceDateLabel1;
    private javax.swing.JTextField InvoiceDateTextField;
    private javax.swing.JTextField InvoiceDateTextField1;
    private javax.swing.JTable InvoiceHeaderTable;
    private javax.swing.JTable InvoiceLineTable;
    private javax.swing.JTextField ItemName;
    private javax.swing.JTextField ItemName1;
    private javax.swing.JTextField ItemPrice;
    private javax.swing.JTextField ItemPrice1;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
