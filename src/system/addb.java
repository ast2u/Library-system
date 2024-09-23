/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import system.login1;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Personal
 */
public class addb extends javax.swing.JFrame {
String s;


    /**
     * Creates new form addb
     */
    public addb() {
        initComponents();
        Connect();
        books_loaded();
        setExtendedState(addb.MAXIMIZED_BOTH);
        
        
    }  
      Connection con;
      PreparedStatement pst;
      ResultSet rs;
      
      public void Connect()
      {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem","root","");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
      }  
      
      public void books_loaded()
      {
           int c;
        try{
            pst = con.prepareStatement("select * from books");
            rs = pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
       c = rsd.getColumnCount();
               
       DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
       d.setRowCount(0);
       while(rs.next())
       {
           Vector v2 = new Vector ();
           for(int i=1; i<=c; i++)
           {
               v2.add(rs.getString("id"));
               v2.add(rs.getString("ISBN"));
               v2.add(rs.getString("Title"));
               v2.add(rs.getString("Author"));
               v2.add(rs.getString("Genre"));
               v2.add(rs.getString("Category"));
               v2.add(rs.getString("Publisher"));
               v2.add(rs.getString("DatePublished"));
               v2.add(rs.getString("Synopsis"));
               v2.add(rs.getString("image"));
           }
           d.addRow(v2);
       }
       
           
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttitle = new javax.swing.JTextField();
        txtauthor = new javax.swing.JTextField();
        txtgenre = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        txtpublished = new javax.swing.JTextField();
        txtisbn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jChoose = new javax.swing.JButton();
        txt_filename = new javax.swing.JTextField();
        jbutton3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtsumma = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(1000, 740));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(44, 82, 80));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 40)); // NOI18N
        jLabel2.setText("Library System");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Libro+");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setText("Title :");

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel5.setText("Author :");

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setText("Genre :");

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel7.setText("Category :");

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel8.setText("Publisher :");

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel9.setText("Date Published :");

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel10.setText("ISBN :");

        jLabel11.setText("Upload an image for the cover of the book ");

        txttitle.setBackground(java.awt.Color.gray);
        txttitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttitle.setForeground(new java.awt.Color(153, 153, 153));
        txttitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttitleActionPerformed(evt);
            }
        });

        txtauthor.setBackground(java.awt.Color.gray);
        txtauthor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtauthor.setForeground(new java.awt.Color(153, 153, 153));
        txtauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauthorActionPerformed(evt);
            }
        });

        txtgenre.setBackground(java.awt.Color.gray);
        txtgenre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtgenre.setForeground(new java.awt.Color(153, 153, 153));

        txtcategory.setBackground(java.awt.Color.gray);
        txtcategory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtpublisher.setBackground(java.awt.Color.gray);
        txtpublisher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtpublished.setBackground(java.awt.Color.gray);
        txtpublished.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpublished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublishedActionPerformed(evt);
            }
        });

        txtisbn.setBackground(java.awt.Color.gray);
        txtisbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisbnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel12.setText("Synopsis :");

        jPanel5.setBackground(java.awt.Color.gray);

        jChoose.setText("Choose File");
        jChoose.setName(""); // NOI18N
        jChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChooseActionPerformed(evt);
            }
        });

        txt_filename.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        txt_filename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filenameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_filename, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txt_filename))
                .addContainerGap())
        );

        jbutton3.setText("ADD");
        jbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton3ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel14.setText("Year-Month-Day (ex. 2020-01-25)");

        jLabel15.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel15.setText("Only 10 numbers");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Title", "Author", "Genre", "Category", "Publisher", "DatePublished", "Synopsis", "image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtsumma.setBackground(java.awt.Color.gray);
        txtsumma.setColumns(20);
        txtsumma.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txtsumma.setLineWrap(true);
        txtsumma.setRows(5);
        txtsumma.setToolTipText("");
        txtsumma.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtsumma);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setText("Book Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpublished, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtgenre, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgenre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpublished, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtauthorActionPerformed

    private void txttitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttitleActionPerformed

    private void txtisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtisbnActionPerformed

    private void jChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChooseActionPerformed
JFileChooser chooser = new JFileChooser();
FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
chooser.addChoosableFileFilter(fnef);
int op = chooser.showOpenDialog(null);
if(op == chooser.APPROVE_OPTION){
    File selectedFile =chooser.getSelectedFile();
    String selectedImagePath= selectedFile.getAbsolutePath();
    txt_filename.setText(selectedImagePath);
    ImageIcon ip = new ImageIcon(selectedImagePath);
    Image image =ip.getImage().getScaledInstance(lbl_image.getHeight(),lbl_image.getWidth(),Image.SCALE_SMOOTH);
    
    lbl_image.setIcon(new ImageIcon(image));
}




    }//GEN-LAST:event_jChooseActionPerformed

    private void jbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton3ActionPerformed

        String isbn=txtisbn.getText();
        String title =txttitle.getText();
        String author =txtauthor.getText();
        String genre =txtgenre.getText();
        String category=txtcategory.getText();
        String publisher=txtpublisher.getText();
        String published=txtpublished.getText();
        String summa=txtsumma.getText();
        String image=txt_filename.getText();
        image = image.replace("\\","\\\\");
        
        try {
pst=con.prepareStatement("insert into books(ISBN,Title,Author,Genre,Category,Publisher,DatePublished,Synopsis,image)values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1,isbn);
            pst.setString(2,title);
            pst.setString(3,author);
            pst.setString(4,genre);
            pst.setString(5,category);
            pst.setString(6, publisher);
            pst.setString(7, published);
            pst.setString(8, summa);
            pst.setString(9, image);
            int x = pst.executeUpdate();
            
       if (x==1)
       {
           JOptionPane.showMessageDialog(this, "The Book has been listed");    
     txtisbn.setText("");
     txttitle.setText("");
     txtauthor.setText("");
     txtgenre.setText("");
     txtcategory.setText("");
     txtpublisher.setText("");
     txtpublished.setText("");
     txtsumma.setText("");
     txt_filename.setText("");
     lbl_image.setIcon(null);
     txtisbn.requestFocus();
     txttitle.requestFocus();
     txtauthor.requestFocus();
     txtgenre.requestFocus();
     txtcategory.requestFocus();
     txtpublisher.requestFocus();
     txtpublished.requestFocus();
     txtsumma.requestFocus();
     
     
     books_loaded();
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Error, No Value");
          
           
       }
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbutton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtisbn.setText(null);
        txttitle.setText(null);
        txtauthor.setText(null);
     txtgenre.setText(null);
     txtcategory.setText(null);
     txtpublisher.setText(null);
     txtpublished.setText(null);
     txtsumma.setText(null);
     txt_filename.setText("");
     lbl_image.setIcon(null);
     JOptionPane.showMessageDialog(this,"Cleared");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu ob2=new menu();
        ob2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtpublishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublishedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpublishedActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
      int selectIndex = jTable1.getSelectedRow();
      int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
    txtisbn.setText(d1.getValueAt(selectIndex, 1).toString());
      txttitle.setText(d1.getValueAt(selectIndex, 2).toString());
      txtauthor.setText(d1.getValueAt(selectIndex, 3).toString());
      txtgenre.setText(d1.getValueAt(selectIndex, 4).toString());
      txtcategory.setText(d1.getValueAt(selectIndex, 5).toString());
      txtpublisher.setText(d1.getValueAt(selectIndex, 6).toString());
      txtpublished.setText(d1.getValueAt(selectIndex, 7).toString());
      txtsumma.setText(d1.getValueAt(selectIndex, 8).toString());
     txt_filename.setText(d1.getValueAt(selectIndex, 9).toString());
   String selectedFile=txt_filename.getText();
    txt_filename.setText(selectedFile);
    ImageIcon ip = new ImageIcon(selectedFile);
    Image image =ip.getImage().getScaledInstance(lbl_image.getHeight(),lbl_image.getWidth(),Image.SCALE_SMOOTH);
    lbl_image.setIcon(new ImageIcon(image));

      
      jbutton3.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
        String isbn=txtisbn.getText();
        String title =txttitle.getText();
        String author =txtauthor.getText();
        String genre =txtgenre.getText();
        String category=txtcategory.getText();
        String publisher=txtpublisher.getText();
        String published=txtpublished.getText();
        String summa=txtsumma.getText();
        String image=txt_filename.getText();
        image = image.replace("\\","\\\\");
        try {
pst=con.prepareStatement("update books set ISBN = ?, Title = ?, Author = ?, Genre = ?, Category = ?, Publisher = ?, DatePublished = ?, Synopsis = ?, image = ? where id = ?");
            pst.setString(1,isbn);
            pst.setString(2,title);
            pst.setString(3,author);
            pst.setString(4,genre);
            pst.setString(5,category);
            pst.setString(6, publisher);
            pst.setString(7, published);
            pst.setString(8, summa);
            pst.setString(9, image);
            pst.setInt(10, id);
            int x = pst.executeUpdate();
            
       if (x==1)
       {
           JOptionPane.showMessageDialog(this, "The Book has been updated");    
     txtisbn.setText("");
     txttitle.setText("");
     txtauthor.setText("");
     txtgenre.setText("");
     txtcategory.setText("");
     txtpublisher.setText("");
     txtpublished.setText("");
     txtsumma.setText("");
     txt_filename.setText("");
     lbl_image.setIcon(null);
     txtisbn.requestFocus();
     books_loaded();
     jbutton3.setEnabled(true);
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Error, No Value");
           
       }
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
        
        try {
pst=con.prepareStatement("delete from books where id = ?");
            
            pst.setInt(1, id);
            int x = pst.executeUpdate();
            
       if (x==1)
       {
           JOptionPane.showMessageDialog(this, "Book Deleted");    
     txtisbn.setText("");
     txttitle.setText("");
     txtauthor.setText("");
     txtgenre.setText("");
     txtcategory.setText("");
     txtpublisher.setText("");
     txtpublished.setText("");
     txtsumma.setText("");
     txt_filename.setText("");
     lbl_image.setIcon(null);
     txtisbn.requestFocus();
     books_loaded();
     jbutton3.setEnabled(true);
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Error, No Value");
           
       }
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt_filenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filenameActionPerformed

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
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbutton3;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txt_filename;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtgenre;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtpublished;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextArea txtsumma;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}
