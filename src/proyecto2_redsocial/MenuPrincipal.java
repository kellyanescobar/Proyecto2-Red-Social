package proyecto2_redsocial;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JFrame {
    

    public MenuPrincipal() {
        
        initComponents();
        
        } 
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menutransparente = new javax.swing.JPopupMenu();
        CerrarSesion = new javax.swing.JToggleButton();
        Perfil = new javax.swing.JButton();
        Tweet = new javax.swing.JButton();
        Notificaciones = new javax.swing.JButton();
        TimeLine = new javax.swing.JButton();
        Hashtags = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        Perfil.setText("Perfil");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });

        Tweet.setText("Tweet");

        Notificaciones.setText("Interacciones");

        TimeLine.setText("Time Line");
        TimeLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeLineActionPerformed(evt);
            }
        });

        Hashtags.setText("Hashtags");
        Hashtags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HashtagsActionPerformed(evt);
            }
        });

        logo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logo.setForeground(new java.awt.Color(204, 204, 0));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patito.png"))); // NOI18N
        logo.setText("Duckling");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CerrarSesion)
                        .addComponent(Hashtags, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TimeLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tweet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Notificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logo))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TimeLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tweet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Notificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Perfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hashtags)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimeLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeLineActionPerformed

    private void HashtagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HashtagsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HashtagsActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        PantallaInicial Pantalla =new PantallaInicial(); 
        Pantalla.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        Perfil VerPerfil=new Perfil();
        VerPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PerfilActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CerrarSesion;
    private javax.swing.JButton Hashtags;
    private javax.swing.JButton Notificaciones;
    private javax.swing.JButton Perfil;
    private javax.swing.JButton TimeLine;
    private javax.swing.JButton Tweet;
    private javax.swing.JLabel logo;
    private javax.swing.JPopupMenu menutransparente;
    // End of variables declaration//GEN-END:variables

 

   
}
