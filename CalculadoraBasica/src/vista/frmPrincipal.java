
package vista;

import javax.swing.JOptionPane;
import controlador.Operaciones;
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null); //Posiciona el Frame en el centro..
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroUno = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        less = new javax.swing.JButton();
        divition = new javax.swing.JButton();
        multipli = new javax.swing.JButton();
        respuesta = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("     CALCULADORA BASICA");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setText("Numero 1:");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setText("Numero 2:");

        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Resultado");

        jButton1.setText("Suma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        less.setText("Resta");
        less.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessActionPerformed(evt);
            }
        });

        divition.setText("Division");
        divition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divitionActionPerformed(evt);
            }
        });

        multipli.setText("Multiplicacion");
        multipli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipliActionPerformed(evt);
            }
        });

        respuesta.setEditable(false);
        respuesta.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        respuesta.setForeground(new java.awt.Color(0, 102, 102));
        respuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        respuesta.setText("             ");
        respuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\Iconos Net\\icons\\2697649_app store_game_apps_app_games_store_apple.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\Iconos Net\\icons\\2697654_photos_picture_photography_pictures_gallery_photo_apple.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\Iconos Net\\icons\\2697652_mobile_compass_browser_app_apple_browse_safari.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\Iconos Net\\icons\\2697647_whatsapp_apple_call_instant_communication_message_chat_messages.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\Iconos Net\\icons\\2697648_twitter_apple_conversation_tweet_message_update_news.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Juter Calculator");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\Iconos Net\\icons\\2697653_reminders_task_list_tasks_todo_todo list_apple.png")); // NOI18N

        jLabel12.setText("V 1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroUno, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(numero2))
                        .addGap(18, 18, 18)
                        .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(less)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divition)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(multipli))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(less)
                    .addComponent(divition)
                    .addComponent(multipli))
                .addGap(24, 24, 24)
                .addComponent(jLabel10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a,b;
        float p1,p2,res;
        float v1,v2;
        a = numeroUno.getText(); //captura el dato en string
        b = numero2.getText(); //Captura el dato en string.
       /* p1=Float.parseFloat(a); //Convierte el dato que esta en string a numero flotante
        p2=Float.parseFloat(b);*/
       
       try{
            v1 = Float.valueOf(a); 
// De igual forma con la sentetencia valueof convierte el string en numero flotante.
            v2 = Float.valueOf(b); //Reciben los datos en float y los convierten en string
            JOptionPane.showMessageDialog(rootPane, "El resultado es: " + (v1+v2));
            
            Operaciones sum = new Operaciones(v1,v2); // Hago llamado a la clase por medio del objeto sum
           /* float resultado = sum.suma();
            String resul = String.valueOf(resultado);
   respuesta.setText(resul);*/ 
          //Esta forma tambien sirve para hacer el calculo - De esta forma la hizo el profe.
            sum.suma();
            respuesta.setText(Float.toString(sum.suma()));

        }catch(NumberFormatException e){
            numeroUno.setText("");
            numero2.setText("");
            JOptionPane.showMessageDialog(rootPane, "Error en los datos de entrada");
        }
        //respuesta.setEditable(false);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaActionPerformed
        // TODO add your handling code here:
        respuesta.setEditable(false);
        respuesta.setEnabled(false);
    }//GEN-LAST:event_respuestaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        numeroUno.setText(null);
        numero2.setText(null);
        respuesta.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessActionPerformed
        // TODO add your handling code here:
            String a,b;
        float p1,p2,res;
        float v1,v2;
        a = numeroUno.getText(); //captura el dato en string
        b = numero2.getText(); //Captura el dato en string.
       /* p1=Float.parseFloat(a); //Convierte el dato que esta en string a numero flotante
        p2=Float.parseFloat(b);*/
       
       try{
            v1 = Float.valueOf(a); 
// De igual forma con la sentetencia valueof convierte el string en numero flotante.
            v2 = Float.valueOf(b); //Reciben los datos en float y los convierten en string
            JOptionPane.showMessageDialog(rootPane, "El resultado es: " + (v1-v2));
            
            Operaciones sum = new Operaciones(v1,v2); // Hago llamado a la clase por medio del objeto sum
           /* float resultado = sum.suma();
            String resul = String.valueOf(resultado);
   respuesta.setText(resul);*/ 
          //Esta forma tambien sirve para hacer el calculo - De esta forma la hizo el profe.
            //sum.suma();
            respuesta.setText(Float.toString(sum.resta()));

        }catch(NumberFormatException e){
            numeroUno.setText("");
            numero2.setText("");
            JOptionPane.showMessageDialog(rootPane, "Error en los datos de entrada");
        }
    }//GEN-LAST:event_lessActionPerformed

    private void divitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divitionActionPerformed
        // TODO add your handling code here:
              String a,b;
        float p1,p2,res;
        float v1,v2;
        a = numeroUno.getText(); //captura el dato en string
        b = numero2.getText(); //Captura el dato en string.
       /* p1=Float.parseFloat(a); //Convierte el dato que esta en string a numero flotante
        p2=Float.parseFloat(b);*/
       
       try{
            v1 = Float.valueOf(a); 
// De igual forma con la sentetencia valueof convierte el string en numero flotante.
            v2 = Float.valueOf(b); //Reciben los datos en float y los convierten en string
            JOptionPane.showMessageDialog(rootPane, "El resultado es: " + (v1/v2));
            
            Operaciones sum = new Operaciones(v1,v2); // Hago llamado a la clase por medio del objeto sum
           /* float resultado = sum.suma(); ** Se invoca el metodo de la clase operacion/controler.
            String resul = String.valueOf(resultado);
   respuesta.setText(resul);*/ 
          //Esta forma tambien sirve para hacer el calculo - De esta forma la hizo el profe.
            //sum.suma();
            respuesta.setText(Float.toString(sum.division()));

        }catch(NumberFormatException e){
            numeroUno.setText("");
            numero2.setText("");
            JOptionPane.showMessageDialog(rootPane, "Error en los datos de entrada");
        }
    }//GEN-LAST:event_divitionActionPerformed

    private void multipliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipliActionPerformed
        // TODO add your handling code here:
             String a,b;
        float p1,p2,res;
        float v1,v2;
        a = numeroUno.getText(); //captura el dato en string
        b = numero2.getText(); //Captura el dato en string.
       /* p1=Float.parseFloat(a); //Convierte el dato que esta en string a numero flotante
        p2=Float.parseFloat(b);*/
       
       try{
            v1 = Float.valueOf(a); 
// De igual forma con la sentetencia valueof convierte el string en numero flotante.
            v2 = Float.valueOf(b); //Reciben los datos en float y los convierten en string
            JOptionPane.showMessageDialog(rootPane, "El resultado es: " + (v1*v2));
            
            Operaciones sum = new Operaciones(v1,v2); // Hago llamado a la clase por medio del objeto sum
           /* float resultado = sum.suma();
            String resul = String.valueOf(resultado);
   respuesta.setText(resul);*/ 
          //Esta forma tambien sirve para hacer el calculo - De esta forma la hizo el profe.
            sum.suma();
            respuesta.setText(Float.toString(sum.multiplicacion()));

        }catch(NumberFormatException e){
            numeroUno.setText("");
            numero2.setText("");
            JOptionPane.showMessageDialog(rootPane, "Error en los datos de entrada");
        }
    }//GEN-LAST:event_multipliActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divition;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton less;
    private javax.swing.JButton multipli;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField numeroUno;
    private javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables
}
