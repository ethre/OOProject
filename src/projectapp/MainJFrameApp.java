/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class MainJFrameApp extends javax.swing.JFrame {
     JPanel cardsContainer;
    
    /**
     * Creates new form MainJFrameApp
     */
     public MainJFrameApp() {
        initComponents();
        ScreenPanel mainpanel = new ScreenPanel();
        Subjects subjectspanel = new Subjects();
        Tools toolspanel = new Tools();
        Timetable timetablepanel = new Timetable();
        Notepad notepadpanel = new Notepad();
        Physics physicspanel = new Physics();
        Chemistry chemistrypanel = new Chemistry();
        Biology biologypanel = new Biology();
        Relativity physicsquizpanel = new Relativity();
        ChemistryQuiz chemistryquizpanel = new ChemistryQuiz();
        CInteractive cinteractivepanel = new CInteractive();
        CImageQuiz cimagequiz = new CImageQuiz();
        CStructure cstructure = new CStructure();
        CAtmosphere catmosphere = new CAtmosphere();
        CMaterials cmaterials = new CMaterials();
        BTheStudyOfLife StudyofLifepanel = new BTheStudyOfLife();
        BTextQuiz BTextQuizpanel = new BTextQuiz();
        BCycles BCyclespanel = new BCycles();
        BTheCell TheCellpanel = new BTheCell();
        BImageQuiz BImageQuiz = new BImageQuiz();
        BGeneticsQuiz BGenetics = new BGeneticsQuiz();
        BTheOrganism BOrganism = new BTheOrganism();
        BStructure BStructure = new BStructure();
        BDiagramQuiz BDiagram = new BDiagramQuiz();
        BExperiments BExperiments = new BExperiments();
        ExaminationTechniques ETechniques = new ExaminationTechniques();
        PExperiments PExp = new PExperiments();
        PMagnetic PMag = new PMagnetic();
        PNuclear PNuc = new PNuclear();
        PRelativity PRela = new PRelativity();
        
        
        cardsContainer = new JPanel(new CardLayout());
        cardsContainer.add(PMag, "PMAGNETIC");
        cardsContainer.add(PNuc, "PNUCLEAR");
        cardsContainer.add(PRela, "PRELATIVITY");
        cardsContainer.add(PExp, "PEXPERIMENTS");
        cardsContainer.add(BExperiments, "BEXPERIMENTS");
        cardsContainer.add(BOrganism, "BORGANISM");
        cardsContainer.add(BStructure, "BSTRUCTURE");
        cardsContainer.add(BDiagram, "BDIAGRAM");
        cardsContainer.add(BGenetics, "BGENETICS");
        cardsContainer.add(BImageQuiz, "BIMAGE");
        cardsContainer.add(TheCellpanel, "THECELL");
        cardsContainer.add(BTextQuizpanel, "BTextQuiz");
        cardsContainer.add(BCyclespanel, "BCycles");
        cardsContainer.add(mainpanel, "MAIN");
        cardsContainer.add(subjectspanel,"SCREEN1");
        cardsContainer.add(toolspanel, "SCREEN2");
        cardsContainer.add(notepadpanel, "NOTEPAD");
        cardsContainer.add(timetablepanel, "TIMETABLE");
        cardsContainer.add(physicspanel, "PHYSICS");
        cardsContainer.add(chemistrypanel, "CHEMISTRY");
        cardsContainer.add(biologypanel, "BIOLOGY");
        cardsContainer.add(physicsquizpanel, "PHYSICSQUIZ");
        cardsContainer.add(chemistryquizpanel, "CHEMISTRYQUIZ");
        cardsContainer.add(cinteractivepanel, "CINTERACTIVE");
        cardsContainer.add(cimagequiz, "CIMAGEQUIZ");
        cardsContainer.add(cstructure, "CSTRUCTURE");
        cardsContainer.add(catmosphere, "CATMOSPHERE");
        cardsContainer.add(cmaterials, "CMATERIALS");
        cardsContainer.add(StudyofLifepanel, "STUDYOFLIFE");
        cardsContainer.add(ETechniques, "ETECH");
        
        
        
        
        
        // add the cards container to the JFrame 
        this.setLayout(new FlowLayout());
        this.add(cardsContainer);
        CardLayout cl = (CardLayout)(cardsContainer.getLayout());
        cl.show(cardsContainer, "MAIN");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
