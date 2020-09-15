
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amar
 */
public class Home1 extends javax.swing.JFrame {

    /**
     * Creates new form Home1
     */
    public Home1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.9f);
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
        jPanel2 = new javax.swing.JPanel();
        log = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        About = new javax.swing.JPanel();
        ab = new javax.swing.JLabel();
        made = new javax.swing.JLabel();
        CLASS = new javax.swing.JLabel();
        pro = new javax.swing.JLabel();
        BOOK = new javax.swing.JPanel();
        book = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        RENT = new javax.swing.JPanel();
        rent = new javax.swing.JLabel();
        rent2 = new javax.swing.JLabel();
        RETURN = new javax.swing.JPanel();
        return1 = new javax.swing.JLabel();
        return2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(107, 91, 149));

        jPanel2.setBackground(new java.awt.Color(107, 91, 149));

        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (1).png"))); // NOI18N
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental-car (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(log)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(log)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(107, 91, 149));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setText("CAR RENTAL AND ONLINE BOOKINGS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48))))
        );

        About.setBackground(new java.awt.Color(255, 115, 102));
        About.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 68, 111), 2));
        About.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ab.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ab.setForeground(new java.awt.Color(255, 255, 255));
        ab.setText("About us :- ");
        About.add(ab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        made.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        made.setForeground(new java.awt.Color(255, 255, 255));
        made.setText("Made by Amar Mehta, Aditya pol and Hitanshu Rana");
        About.add(made, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, -1));

        CLASS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CLASS.setForeground(new java.awt.Color(255, 255, 255));
        CLASS.setText("Of Class XII :~ 'A'");
        About.add(CLASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, -1));

        pro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programmer.png"))); // NOI18N
        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proMouseExited(evt);
            }
        });
        About.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        BOOK.setBackground(new java.awt.Color(255, 115, 102));
        BOOK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 68, 111), 2));

        book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online-registration (1).png"))); // NOI18N
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookMouseExited(evt);
            }
        });

        book2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        book2.setForeground(new java.awt.Color(255, 255, 255));
        book2.setText("BOOK YOUR RIDE FOR FUTURE PURPOSES");
        book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                book2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                book2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BOOKLayout = new javax.swing.GroupLayout(BOOK);
        BOOK.setLayout(BOOKLayout);
        BOOKLayout.setHorizontalGroup(
            BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BOOKLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(book2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BOOKLayout.setVerticalGroup(
            BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BOOKLayout.createSequentialGroup()
                .addComponent(book)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BOOKLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(book2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RENT.setBackground(new java.awt.Color(255, 115, 102));
        RENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 68, 111), 2));

        rent.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rent.setForeground(new java.awt.Color(255, 255, 255));
        rent.setText("RENT YOUR RIDE WITH MINIMUM PER DAY COST");
        rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rentMouseExited(evt);
            }
        });

        rent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maps-and-flags.png"))); // NOI18N
        rent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rent2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rent2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rent2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout RENTLayout = new javax.swing.GroupLayout(RENT);
        RENT.setLayout(RENTLayout);
        RENTLayout.setHorizontalGroup(
            RENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RENTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rent2)
                .addGap(18, 18, 18)
                .addComponent(rent, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        RENTLayout.setVerticalGroup(
            RENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RENTLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(rent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(rent2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );

        RETURN.setBackground(new java.awt.Color(255, 115, 102));
        RETURN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 68, 111), 2));

        return1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/key (2).png"))); // NOI18N
        return1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                return1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return1MouseExited(evt);
            }
        });

        return2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        return2.setForeground(new java.awt.Color(255, 255, 255));
        return2.setText("RETURN CAR");
        return2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                return2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout RETURNLayout = new javax.swing.GroupLayout(RETURN);
        RETURN.setLayout(RETURNLayout);
        RETURNLayout.setHorizontalGroup(
            RETURNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RETURNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(return1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(return2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RETURNLayout.setVerticalGroup(
            RETURNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RETURNLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(return2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RETURNLayout.createSequentialGroup()
                .addComponent(return1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RETURN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addComponent(RENT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(BOOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RETURN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rent2MouseClicked
       this.setVisible(false);
       new Rent_car().setVisible(true);
    }//GEN-LAST:event_rent2MouseClicked

    private void rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentMouseClicked
       this.setVisible(false);
       new Rent_car().setVisible(true);
    }//GEN-LAST:event_rentMouseClicked

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
       this.setVisible(false);
       new Bookings().setVisible(true);
    }//GEN-LAST:event_bookMouseClicked

    private void book2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book2MouseClicked
        this.setVisible(false);
       new Bookings().setVisible(true);
    }//GEN-LAST:event_book2MouseClicked

    private void return2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return2MouseClicked
       this.setVisible(false);
       new Return_car().setVisible(true);
    }//GEN-LAST:event_return2MouseClicked

    private void return1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return1MouseClicked
    this.setVisible(false);
       new Return_car().setVisible(true);
    }//GEN-LAST:event_return1MouseClicked

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        this.setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_logMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void rentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentMouseEntered
        rent.setForeground(Color.BLACK);
        RENT.setBackground(new Color(140, 129, 177));
        RENT.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
        
    }//GEN-LAST:event_rentMouseEntered

    private void rentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentMouseExited
        rent.setForeground(Color.WHITE);
        RENT.setBackground(new Color(255,115,102));
        RENT.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_rentMouseExited

    private void rent2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rent2MouseEntered
           rent.setForeground(Color.BLACK);
        RENT.setBackground(new Color(140, 129, 177));
        RENT.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
    }//GEN-LAST:event_rent2MouseEntered

    private void rent2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rent2MouseExited
        rent.setForeground(Color.WHITE);
        RENT.setBackground(new Color(255,115,102));
        RENT.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_rent2MouseExited

    private void book2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book2MouseEntered
        book2.setForeground(Color.BLACK);
        BOOK.setBackground(new Color(140, 129, 177));
        BOOK.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
    }//GEN-LAST:event_book2MouseEntered

    private void book2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book2MouseExited
         book2.setForeground(Color.WHITE);
        BOOK.setBackground(new Color(255,115,102));
        BOOK.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_book2MouseExited

    private void bookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseEntered
        book2.setForeground(Color.BLACK);
        BOOK.setBackground(new Color(140, 129, 177));
        BOOK.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
    }//GEN-LAST:event_bookMouseEntered

    private void bookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseExited
          book2.setForeground(Color.WHITE);
        BOOK.setBackground(new Color(255,115,102));
        BOOK.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_bookMouseExited

    private void return1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return1MouseEntered
        return2.setForeground(Color.BLACK);
        RETURN.setBackground(new Color(140, 129, 177));
        RETURN.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
    }//GEN-LAST:event_return1MouseEntered

    private void return1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return1MouseExited
       return2.setForeground(Color.WHITE);
        RETURN.setBackground(new Color(255,115,102));
        RETURN.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_return1MouseExited

    private void return2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return2MouseEntered
      return2.setForeground(Color.BLACK);
        RETURN.setBackground(new Color(140, 129, 177));
        RETURN.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
    }//GEN-LAST:event_return2MouseEntered

    private void return2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return2MouseExited
          return2.setForeground(Color.WHITE);
        RETURN.setBackground(new Color(255,115,102));
        RETURN.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_return2MouseExited

    private void logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseEntered
      
    }//GEN-LAST:event_logMouseEntered

    private void logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseExited
        
        
    }//GEN-LAST:event_logMouseExited

    private void proMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseEntered
        ab.setForeground(Color.BLACK);
        made.setForeground(Color.BLACK);
        CLASS.setForeground(Color.BLACK);
        About.setBackground(new Color(140, 129, 177));
        About.setBorder(new LineBorder(new Color(255,255,255) , 2 ,true));
    }//GEN-LAST:event_proMouseEntered

    private void proMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseExited
         ab.setForeground(Color.WHITE);
         made.setForeground(Color.WHITE);
         CLASS.setForeground(Color.WHITE);
        About.setBackground(new Color(255,115,102));
        About.setBorder(new LineBorder(new Color(79,68,111) , 1 ,true));
    }//GEN-LAST:event_proMouseExited

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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JPanel BOOK;
    private javax.swing.JLabel CLASS;
    private javax.swing.JPanel RENT;
    private javax.swing.JPanel RETURN;
    private javax.swing.JLabel ab;
    private javax.swing.JLabel book;
    private javax.swing.JLabel book2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel log;
    private javax.swing.JLabel made;
    private javax.swing.JLabel pro;
    private javax.swing.JLabel rent;
    private javax.swing.JLabel rent2;
    private javax.swing.JLabel return1;
    private javax.swing.JLabel return2;
    // End of variables declaration//GEN-END:variables
}