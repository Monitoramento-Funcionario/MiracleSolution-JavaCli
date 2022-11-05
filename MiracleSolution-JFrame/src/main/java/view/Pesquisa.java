/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Monitoramento;

/**
 *
 * @author YK984KU
 */
public class Pesquisa extends javax.swing.JFrame {

    private Integer idUsuario;

    public Pesquisa(Integer idUsuario) {
        Monitoramento monitoramento = new Monitoramento();

        this.idUsuario = idUsuario;
        initComponents();
        monitoramento.setTimeOut(idUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p1r1 = new javax.swing.JRadioButton();
        p1r2 = new javax.swing.JRadioButton();
        p1r3 = new javax.swing.JRadioButton();
        p1r4 = new javax.swing.JRadioButton();
        p1r5 = new javax.swing.JRadioButton();
        p2r1 = new javax.swing.JRadioButton();
        p2r2 = new javax.swing.JRadioButton();
        p2r3 = new javax.swing.JRadioButton();
        p2r4 = new javax.swing.JRadioButton();
        p2r5 = new javax.swing.JRadioButton();
        p3r1 = new javax.swing.JRadioButton();
        p3r2 = new javax.swing.JRadioButton();
        p3r3 = new javax.swing.JRadioButton();
        p3r4 = new javax.swing.JRadioButton();
        p3r5 = new javax.swing.JRadioButton();
        p4r1 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        p4r3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        p4r5 = new javax.swing.JRadioButton();
        p5r1 = new javax.swing.JRadioButton();
        p5r2 = new javax.swing.JRadioButton();
        p5r3 = new javax.swing.JRadioButton();
        p5r4 = new javax.swing.JRadioButton();
        p5r5 = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(862, 543));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa de");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText(" Lorem ipsum dolor sit amet, consectetur  adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Satisfação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 51, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Pergunta 1");

        jLabel5.setBackground(new java.awt.Color(255, 51, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Pergunta 2");

        jLabel7.setBackground(new java.awt.Color(255, 51, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Pergunta 4");

        jButton11.setBackground(new java.awt.Color(255, 204, 255));
        jButton11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 51));
        jButton11.setText("Enviar");

        jLabel8.setBackground(new java.awt.Color(255, 51, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Pergunta 3");

        jLabel10.setBackground(new java.awt.Color(255, 51, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Pergunta 5");

        p1r1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(p1r1);
        p1r1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p1r1.setForeground(new java.awt.Color(51, 51, 51));
        p1r1.setText("1");

        p1r2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(p1r2);
        p1r2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p1r2.setForeground(new java.awt.Color(51, 51, 51));
        p1r2.setText("2");

        p1r3.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(p1r3);
        p1r3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p1r3.setForeground(new java.awt.Color(51, 51, 51));
        p1r3.setText("3");

        p1r4.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(p1r4);
        p1r4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p1r4.setForeground(new java.awt.Color(51, 51, 51));
        p1r4.setText("4");

        p1r5.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(p1r5);
        p1r5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p1r5.setForeground(new java.awt.Color(51, 51, 51));
        p1r5.setText("5");

        p2r1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup2.add(p2r1);
        p2r1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p2r1.setForeground(new java.awt.Color(51, 51, 51));
        p2r1.setText("1");

        p2r2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup2.add(p2r2);
        p2r2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p2r2.setForeground(new java.awt.Color(51, 51, 51));
        p2r2.setText("2");

        p2r3.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup2.add(p2r3);
        p2r3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p2r3.setForeground(new java.awt.Color(51, 51, 51));
        p2r3.setText("3");

        p2r4.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup2.add(p2r4);
        p2r4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p2r4.setForeground(new java.awt.Color(51, 51, 51));
        p2r4.setText("4");

        p2r5.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup2.add(p2r5);
        p2r5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p2r5.setForeground(new java.awt.Color(51, 51, 51));
        p2r5.setText("5");

        p3r1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup3.add(p3r1);
        p3r1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p3r1.setForeground(new java.awt.Color(51, 51, 51));
        p3r1.setText("1");

        p3r2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup3.add(p3r2);
        p3r2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p3r2.setForeground(new java.awt.Color(51, 51, 51));
        p3r2.setText("2");

        p3r3.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup3.add(p3r3);
        p3r3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p3r3.setForeground(new java.awt.Color(51, 51, 51));
        p3r3.setText("3");

        p3r4.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup3.add(p3r4);
        p3r4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p3r4.setForeground(new java.awt.Color(51, 51, 51));
        p3r4.setText("4");

        p3r5.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup3.add(p3r5);
        p3r5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p3r5.setForeground(new java.awt.Color(51, 51, 51));
        p3r5.setText("5");

        p4r1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup4.add(p4r1);
        p4r1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p4r1.setForeground(new java.awt.Color(51, 51, 51));
        p4r1.setText("1");

        jRadioButton1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup4.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setText("2");

        p4r3.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup4.add(p4r3);
        p4r3.setForeground(new java.awt.Color(51, 51, 51));
        p4r3.setText("3");

        jRadioButton2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup4.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("4");

        p4r5.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup4.add(p4r5);
        p4r5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p4r5.setForeground(new java.awt.Color(51, 51, 51));
        p4r5.setText("5");

        p5r1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup5.add(p5r1);
        p5r1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p5r1.setForeground(new java.awt.Color(51, 51, 51));
        p5r1.setText("1");

        p5r2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup5.add(p5r2);
        p5r2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p5r2.setForeground(new java.awt.Color(51, 51, 51));
        p5r2.setText("2");

        p5r3.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup5.add(p5r3);
        p5r3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p5r3.setForeground(new java.awt.Color(51, 51, 51));
        p5r3.setText("3");

        p5r4.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup5.add(p5r4);
        p5r4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p5r4.setForeground(new java.awt.Color(51, 51, 51));
        p5r4.setText("4");

        p5r5.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup5.add(p5r5);
        p5r5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        p5r5.setForeground(new java.awt.Color(51, 51, 51));
        p5r5.setText("5");

        jButton12.setBackground(new java.awt.Color(255, 204, 255));
        jButton12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 51));
        jButton12.setText("Voltar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p4r1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p4r3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p4r5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p2r1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p2r2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p2r3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p2r4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p2r5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p1r1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1r2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1r3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1r4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1r5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p3r1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p3r2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p3r3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p3r4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p3r5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(p5r1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p5r2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p5r3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p5r4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p5r5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 179, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1r1)
                    .addComponent(p1r2)
                    .addComponent(p1r3)
                    .addComponent(p1r4)
                    .addComponent(p1r5))
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2r1)
                    .addComponent(p2r2)
                    .addComponent(p2r3)
                    .addComponent(p2r4)
                    .addComponent(p2r5))
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3r1)
                    .addComponent(p3r2)
                    .addComponent(p3r3)
                    .addComponent(p3r4)
                    .addComponent(p3r5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4r1)
                    .addComponent(jRadioButton1)
                    .addComponent(p4r3)
                    .addComponent(jRadioButton2)
                    .addComponent(p4r5))
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p5r1)
                    .addComponent(p5r2)
                    .addComponent(p5r3)
                    .addComponent(p5r4)
                    .addComponent(p5r5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(180, 108, 191));
        jLabel11.setText("MIRACLE");

        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(55, 54, 54));
        jLabel12.setText("SOLUTIONS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Home home = new Home(idUsuario);

    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton p1r1;
    private javax.swing.JRadioButton p1r2;
    private javax.swing.JRadioButton p1r3;
    private javax.swing.JRadioButton p1r4;
    private javax.swing.JRadioButton p1r5;
    private javax.swing.JRadioButton p2r1;
    private javax.swing.JRadioButton p2r2;
    private javax.swing.JRadioButton p2r3;
    private javax.swing.JRadioButton p2r4;
    private javax.swing.JRadioButton p2r5;
    private javax.swing.JRadioButton p3r1;
    private javax.swing.JRadioButton p3r2;
    private javax.swing.JRadioButton p3r3;
    private javax.swing.JRadioButton p3r4;
    private javax.swing.JRadioButton p3r5;
    private javax.swing.JRadioButton p4r1;
    private javax.swing.JRadioButton p4r3;
    private javax.swing.JRadioButton p4r5;
    private javax.swing.JRadioButton p5r1;
    private javax.swing.JRadioButton p5r2;
    private javax.swing.JRadioButton p5r3;
    private javax.swing.JRadioButton p5r4;
    private javax.swing.JRadioButton p5r5;
    // End of variables declaration//GEN-END:variables
}
