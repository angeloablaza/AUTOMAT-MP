package automat.mp;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angelo Ablaza
 */
public class GameFrame extends javax.swing.JFrame {

    ArrayList<String> earth;
    ArrayList<String> mars;
    int ctr = 0;
    AutomatonFrame af;
    String scientist = "Earth";
    int steps = 1;
    boolean cowBug = false;
    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
        earth = new ArrayList<>();
        mars = new ArrayList<>();
        af = new AutomatonFrame();
        af.setVisible(true);

        intialize();
        refreshView();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        transportBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        marsTextArea = new javax.swing.JTextArea();
        locationLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        earthTextArea = new javax.swing.JTextArea();
        lionCheckBox = new javax.swing.JCheckBox();
        human_twoCheckBox = new javax.swing.JCheckBox();
        human_oneCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        grainCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cowCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        scientistMars = new javax.swing.JLabel();
        howBtn = new javax.swing.JButton();
        solutionBtn = new javax.swing.JButton();
        scientistEarth = new javax.swing.JLabel();
        restartBtn = new javax.swing.JButton();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTOMAT - New Game");
        setBackground(new java.awt.Color(0, 102, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        transportBtn.setBackground(new java.awt.Color(0, 0, 51));
        transportBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        transportBtn.setForeground(new java.awt.Color(255, 255, 255));
        transportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automat/images/rocket.png"))); // NOI18N
        transportBtn.setText("Transport");
        transportBtn.setBorder(null);
        transportBtn.setPreferredSize(new java.awt.Dimension(161, 137));
        transportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportBtnActionPerformed(evt);
            }
        });

        marsTextArea.setEditable(false);
        marsTextArea.setBackground(new java.awt.Color(0, 0, 51));
        marsTextArea.setColumns(1);
        marsTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        marsTextArea.setForeground(new java.awt.Color(255, 255, 255));
        marsTextArea.setRows(5);
        jScrollPane2.setViewportView(marsTextArea);

        locationLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        locationLbl.setForeground(new java.awt.Color(255, 255, 255));
        locationLbl.setText("Scientist is at: Earth");

        earthTextArea.setEditable(false);
        earthTextArea.setBackground(new java.awt.Color(0, 0, 51));
        earthTextArea.setColumns(1);
        earthTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        earthTextArea.setForeground(new java.awt.Color(255, 255, 255));
        earthTextArea.setRows(1);
        jScrollPane1.setViewportView(earthTextArea);

        lionCheckBox.setBackground(new java.awt.Color(0, 0, 51));
        lionCheckBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lionCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        lionCheckBox.setText("Lion");

        human_twoCheckBox.setBackground(new java.awt.Color(0, 0, 51));
        human_twoCheckBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        human_twoCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        human_twoCheckBox.setText("Human # 2");

        human_oneCheckBox.setBackground(new java.awt.Color(0, 0, 51));
        human_oneCheckBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        human_oneCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        human_oneCheckBox.setText("Human #1");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EARTH");

        grainCheckBox.setBackground(new java.awt.Color(0, 0, 51));
        grainCheckBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        grainCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        grainCheckBox.setText("Grain");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MARS");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automat/images/earth.png"))); // NOI18N

        cowCheckBox.setBackground(new java.awt.Color(0, 0, 51));
        cowCheckBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cowCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        cowCheckBox.setText("Cow");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automat/images/mars.png"))); // NOI18N

        scientistMars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automat/images/scientist (1).png"))); // NOI18N

        howBtn.setBackground(new java.awt.Color(0, 0, 51));
        howBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        howBtn.setForeground(new java.awt.Color(255, 255, 255));
        howBtn.setText("About");
        howBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howBtnActionPerformed(evt);
            }
        });

        solutionBtn.setBackground(new java.awt.Color(0, 0, 51));
        solutionBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        solutionBtn.setForeground(new java.awt.Color(255, 255, 255));
        solutionBtn.setText("Solution");
        solutionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionBtnActionPerformed(evt);
            }
        });

        scientistEarth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automat/images/scientist (1).png"))); // NOI18N

        restartBtn.setBackground(new java.awt.Color(0, 0, 51));
        restartBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        restartBtn.setForeground(new java.awt.Color(255, 255, 255));
        restartBtn.setText("Restart");
        restartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(restartBtn)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scientistEarth)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(scientistMars)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(transportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(solutionBtn))
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(howBtn)
                                .addGap(151, 151, 151)
                                .addComponent(locationLbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(human_twoCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(grainCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(cowCheckBox))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(human_oneCheckBox)
                                .addGap(22, 22, 22)
                                .addComponent(lionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howBtn)
                    .addComponent(locationLbl)
                    .addComponent(solutionBtn)
                    .addComponent(restartBtn))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scientistEarth)
                            .addComponent(scientistMars))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(human_oneCheckBox)
                            .addComponent(lionCheckBox))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(human_twoCheckBox)
                            .addComponent(grainCheckBox)
                            .addComponent(cowCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(transportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportBtnActionPerformed
        // TODO add your handling code here:
        if (getAllCheckboxes()) { //check first if player only checked 1 or 2 checkboxes
            switch (steps) {
                case 1:
                    scientist = "Mars";
                    if (cowCheckBox.isSelected() && lionCheckBox.isSelected()) {
                        earth.remove("Cow");
                        earth.remove("Lion");
                        mars.add("Cow");
                        mars.add("Lion");
                        steps++;
                    }
                    af.setLabel("/automat/images/Step2.png"); // NOI18N
                    break;
                case 2:
                    scientist = "Earth";
                    if (cowCheckBox.isSelected() && lionCheckBox.isSelected()) { //reverse previous move
                        mars.remove("Cow");
                        mars.remove("Lion");
                        earth.add("Cow");
                        earth.add("Lion");
                        steps--;
                        af.setLabel("/automat/images/Step2.png"); // NOI18N
                    } else if (lionCheckBox.isSelected()) {
                        mars.remove("Lion");
                        earth.add("Lion");
                        steps++;
                        af.setLabel("/automat/images/Step3a.png"); // NOI18N
                    } else if (cowCheckBox.isSelected()) {
                        mars.remove("Cow");
                        earth.add("Cow");
                        steps++;
                        af.setLabel("/automat/images/Step3b.png"); // NOI18N
                    }
                    break;
                case 3:
                    scientist = "Mars";
                    if (human_oneCheckBox.isSelected() && human_twoCheckBox.isSelected()) {
                        earth.remove("Human #1");
                        earth.remove("Human #2");
                        mars.add("Human #1");
                        mars.add("Human #2");
                        steps++;
                        af.setLabel("/automat/images/Step4a.png"); // NOI18N
                        cowBug = true;
                    } else if (lionCheckBox.isSelected() && grainCheckBox.isSelected()) {
                        earth.remove("Lion");
                        earth.remove("Grain");
                        mars.add("Lion");
                        mars.add("Grain");
                        steps++;
                        af.setLabel("/automat/images/Step4b.png"); // NOI18N
                    } else if (cowCheckBox.isSelected() && grainCheckBox.isSelected()) {
                        earth.remove("Cow");
                        earth.remove("Grain");
                        mars.add("Cow");
                        mars.add("Grain");
                        steps++;
                        af.setLabel("/automat/images/Step4b.png"); // NOI18N
                    } else if (lionCheckBox.isSelected()) { //reverse
                        mars.add("Lion");
                        earth.remove("Lion");
                        steps--;
                    }
                    break;
                case 4:
                    scientist = "Earth";
                    if (cowCheckBox.isSelected()) {
                        mars.remove("Cow");
                        earth.add("Cow");
                        steps++;
                        if (cowBug) {
                            af.setLabel("/automat/images/Step5a.png"); // NOI18N
                        } else {
                            af.setLabel("/automat/images/Step5b.png"); // NOI18N

                        }
                    } else if (human_oneCheckBox.isSelected() && human_twoCheckBox.isSelected()) {
                        earth.add("Human #1");
                        earth.add("Human #2");
                        mars.remove("Human #1");
                        mars.remove("Human #2");
                        steps--;
                    } else if (lionCheckBox.isSelected() && grainCheckBox.isSelected()) {
                        mars.remove("Grain");
                        mars.remove("Lion");
                        earth.add("Grain");
                        earth.add("Lion");
                        steps++;
                        af.setLabel("/automat/images/Step5b.png"); // NOI18N
                    }
                    break;
                case 5:
                    scientist = "Mars";
                    if (lionCheckBox.isSelected() && grainCheckBox.isSelected()) {
                        earth.remove("Lion");
                        earth.remove("Grain");
                        mars.add("Lion");
                        mars.add("Grain");
                        steps++;
                        af.setLabel("/automat/images/Step6a.png"); // NOI18N
                    } else if (human_oneCheckBox.isSelected() && human_twoCheckBox.isSelected()) {
                        earth.remove("Human #1");
                        earth.remove("Human #2");
                        mars.add("Human #1");
                        mars.add("Human #2");
                        steps++;
                        af.setLabel("/automat/images/Step6a.png"); // NOI18N
                    } else if (cowCheckBox.isSelected() && grainCheckBox.isSelected()) {
                        earth.remove("Cow");
                        earth.remove("Grain");
                        mars.add("Cow");
                        mars.add("Grain");
                        steps++;
                        af.setLabel("/automat/images/Step6b.png"); // NOI18N
                    } else if (cowCheckBox.isSelected()) {
                        mars.add("Cow");
                        earth.remove("Cow");
                        steps--;
                    }
                    break;
                case 6:
                    scientist = "Earth";
                    if (lionCheckBox.isSelected() && grainCheckBox.isSelected()) { //reverse previous move
                        earth.add("Lion");
                        earth.add("Grain");
                        mars.remove("Lion");
                        mars.remove("Grain");
                        steps--;
                    } else if (lionCheckBox.isSelected()) {
                        mars.remove("Lion");
                        earth.add("Lion");
                        steps++;
                        af.setLabel("/automat/images/Step7.png"); // NOI18N
                    } else if (cowCheckBox.isSelected()) {
                        mars.remove("Cow");
                        earth.add("Cow");
                        steps++;
                        af.setLabel("/automat/images/Step2.png"); // NOI18N
                    }
                    break;
                case 7:
                    scientist = "Mars";
                    if (lionCheckBox.isSelected() && cowCheckBox.isSelected()) {
                        earth.remove("Lion");
                        earth.remove("Cow");
                        mars.add("Lion");
                        mars.add("Cow");
                        steps++;
                        af.setLabel("/automat/images/Step8.png"); // NOI18N
                    } else if (lionCheckBox.isSelected()) {
                        mars.add("Lion");
                        earth.remove("Lion");
                        steps--;
                    }
//                    else {
//                        JOptionPane.showMessageDialog(rootPane, "Game Over!");
//                        restart();
//                    }
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "You can only transport 2 at a time", "Error", ERROR_MESSAGE);
        }

////SOLUTION 2.0
//        if (getAllCheckboxes()) {
//            steps++;
//            solutionTwo();
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "You can only transport 2 at a time", "Error", ERROR_MESSAGE);
//        }
        check();
        refreshView();
    }//GEN-LAST:event_transportBtnActionPerformed

    private void howBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "The Earth is slowly dying and a scientist wants to help build a new life on Mars. "
                + "\n However, he only has a spaceship that was so tiny it could only carry him and two other items. "
                + "\n He wants to transport 5 things that he thought were essential to start a new life on Mars: two humans, one lion, one cow and one bag of grain."
                + "\n Whenever the scientist is not around, either human would kill the lion out of fear or eat the cow out of hunger,"
                + "\n the lion will eat the cow, and the cow will eat the grain. Only the scientist knows how to fly the spaceship. "
                + "\n How will the scientist transport all the five items to Mars?", "About the Game", PLAIN_MESSAGE);
    }//GEN-LAST:event_howBtnActionPerformed

    private void solutionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionBtnActionPerformed
        // TODO add your handling code here:
        SolutionFrame sf = new SolutionFrame();
        sf.setVisible(true);
//        JOptionPane.showMessageDialog(rootPane, " 1. Bring the Cow and Lion to Mars"
//                + "\n 2. Bring the Lion to Earth"
//                + "\n 3. Bring both Humans to Mars"
//                + "\n 4. Bring the Cow to Earth"
//                + "\n 5. Bring the Lion and the Grain to Mars"
//                + "\n 6. Bring the Lion to Earth"
//                + "\n 7. Bring the Lion and the Cow to Mars", "Solution", PLAIN_MESSAGE);
    }//GEN-LAST:event_solutionBtnActionPerformed

    private void restartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtnActionPerformed
        // TODO add your handling code here:
        restart();
    }//GEN-LAST:event_restartBtnActionPerformed

    public void intialize() {
        earth.add("Human #1");
        earth.add("Human #2");
        earth.add("Cow");
        earth.add("Lion");
        earth.add("Grain");
        af.setLabel("/automat/images/Step1.png");
    }

    public void refreshView() {
        earthTextArea.setText("");
        marsTextArea.setText("");
        locationLbl.setText("Scientist is at: " + scientist.toUpperCase());

        human_oneCheckBox.setSelected(false);
        human_twoCheckBox.setSelected(false);
        lionCheckBox.setSelected(false);
        cowCheckBox.setSelected(false);
        grainCheckBox.setSelected(false);

        try {
            for (int i = 0; i < earth.size(); i++) {
                earthTextArea.append((earth.get(i)) + "\n");
            }
        } catch (Exception e) {

        }

        try {
            for (int i = 0; i < mars.size(); i++) {
                marsTextArea.append((mars.get(i)) + "\n");
            }
        } catch (Exception e) {
        }

        //For Scientist icon
        if (scientist.equals("Earth")) {
            scientistMars.setVisible(false);
            scientistEarth.setVisible(true);
        } else {
            scientistEarth.setVisible(false);
            scientistMars.setVisible(true);
        }

//        af.setLabel(steps);
        if (mars.size() == 5 && scientist.equals("Mars")) {
            JOptionPane.showMessageDialog(rootPane, "Congrats! You colonized Mars", "Winner Winner Chicken Dinner!", INFORMATION_MESSAGE);
        }
    }

    public void check() {
        if ((earth.toString().contains("Human #1") || earth.toString().contains("Human #2"))
                && earth.toString().contains("Cow") && !scientist.equals("Earth")) {
            JOptionPane.showMessageDialog(rootPane, "Human(s) ate the Cow", "Game Over", ERROR_MESSAGE);
        } else if ((earth.toString().contains("Human #1") || earth.toString().contains("Human #2"))
                && earth.toString().contains("Lion") && !scientist.equals("Earth")) {
            JOptionPane.showMessageDialog(rootPane, "Human(s) killed the Lion", "Game Over", ERROR_MESSAGE);
        } else if ((mars.toString().contains("Human #1") || mars.toString().contains("Human #2"))
                && mars.toString().contains("Cow") && !scientist.equals("Mars")) {
            JOptionPane.showMessageDialog(rootPane, "Human(s) ate the Cow", "Game Over", ERROR_MESSAGE);
        } else if ((mars.toString().contains("Human #1") || mars.toString().contains("Human #2"))
                && mars.toString().contains("Lion") && !scientist.equals("Mars")) {
            JOptionPane.showMessageDialog(rootPane, "Human(s) killed the Lion", "Game Over", ERROR_MESSAGE);
        } else if (earth.toString().contains("Cow") && earth.toString().contains("Lion") && !scientist.equals("Earth")) {
            JOptionPane.showMessageDialog(rootPane, "Lion ate the cow", "Game Over", ERROR_MESSAGE);
        } else if (mars.toString().contains("Cow") && mars.toString().contains("Lion") && !scientist.equals("Mars")) {
            JOptionPane.showMessageDialog(rootPane, "Lion ate the cow", "Game Over", ERROR_MESSAGE);
        } else if (earth.toString().contains("Cow") && earth.toString().contains("Grain") && !scientist.equals("Earth")) {
            JOptionPane.showMessageDialog(rootPane, "Cow ate the Grains", "Game Over", ERROR_MESSAGE);
        } else if (mars.toString().contains("Cow") && mars.toString().contains("Grain") && !scientist.equals("Mars")) {
            JOptionPane.showMessageDialog(rootPane, "Cow ate the Grains", "Game Over", ERROR_MESSAGE);
        }
        //System.out.println("Step: " + steps);
    }

    public void restart() {
        steps = 1;
        scientist = "Earth";
        earth.clear();
        mars.clear();
        human_oneCheckBox.setSelected(false);
        human_twoCheckBox.setSelected(false);
        lionCheckBox.setSelected(false);
        cowCheckBox.setSelected(false);
        grainCheckBox.setSelected(false);
        intialize();
        refreshView();
    }

    public boolean getAllCheckboxes() {
        if (human_oneCheckBox.isSelected()) {
            ctr++;
        }

        if (human_twoCheckBox.isSelected()) {
            ctr++;
        }

        if (lionCheckBox.isSelected()) {
            ctr++;
        }

        if (cowCheckBox.isSelected()) {
            ctr++;
        }
        if (grainCheckBox.isSelected()) {
            ctr++;
        }

        if (ctr <= 2) {
            ctr = 0; //reset ctr count
            return true;
        }
        ctr = 0; //reset ctr count
        return false;

    }

    public void solutionTwo() {
        if (human_oneCheckBox.isSelected()) {
            if (scientist.equals("Earth")) {
                earth.remove("Human #1");
                mars.add("Human #1");
            } else {
                mars.remove("Human #1");
                earth.add("Human #1");
            }
        }

        if (human_twoCheckBox.isSelected()) {
            if (scientist.equals("Earth")) {
                earth.remove("Human #2");
                mars.add("Human #2");
            } else {
                mars.remove("Human #2");
                earth.add("Human #2");
            }
        }

        if (cowCheckBox.isSelected()) {
            if (scientist.equals("Earth")) {
                earth.remove("Cow");
                mars.add("Cow");
            } else {
                mars.remove("Cow");
                earth.add("Cow");
            }
        }

        if (lionCheckBox.isSelected()) {
            if (scientist.equals("Earth")) {
                earth.remove("Lion");
                mars.add("Lion");
            } else {
                mars.remove("Lion");
                earth.add("Lion");
            }
        }

        if (grainCheckBox.isSelected()) {
            if (scientist.equals("Earth")) {
                earth.remove("Grain");
                mars.add("Grain");
            } else {
                mars.remove("Grain");
                earth.add("Grain");
            }
        }

        if (scientist.equals("Mars")) {
            scientist = "Earth";
        } else {
            scientist = "Mars";
        }
    }

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cowCheckBox;
    private javax.swing.JTextArea earthTextArea;
    private javax.swing.JCheckBox grainCheckBox;
    private javax.swing.JButton howBtn;
    private javax.swing.JCheckBox human_oneCheckBox;
    private javax.swing.JCheckBox human_twoCheckBox;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox lionCheckBox;
    private javax.swing.JLabel locationLbl;
    private javax.swing.JTextArea marsTextArea;
    private javax.swing.JButton restartBtn;
    private javax.swing.JLabel scientistEarth;
    private javax.swing.JLabel scientistMars;
    private javax.swing.JButton solutionBtn;
    private javax.swing.JButton transportBtn;
    // End of variables declaration//GEN-END:variables
}
