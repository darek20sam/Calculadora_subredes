package mi.clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Vaio
 */
public class Validaciones {
        public static void soloNumeros(final JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt){
               int k=(int)evt.getKeyChar(); 
               
                if ( k>=46 && k <=57) {
                    //if (k==46) {
                       // String dato=a.getText();
                      //  int tama=4;
                       //for (int i = 0; i < tama; i++) {
                           // if (dato.contains(".")) 
                                //evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                            
                         // }
                       if (k==47) {
                          evt.setKeyChar((char)KeyEvent.VK_CLEAR); 
                       } 
                    //}
                }else{   
                  evt.setKeyChar((char)KeyEvent.VK_CLEAR); 
                  evt.consume();     
                };
            }
   
    });
        
    }
    

    public static void soloNumerosEspacio(final JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt){
               int k=(int)evt.getKeyChar(); 
               
                if ( k>=32 && k <=57) {
                    //if (k==46) {
                        //String dato=a.getText();
                        //int tama=dato.length();
                       // for (int i = 0; i < tama; i++) {
                            //if (dato.contains(".")) {
                             //   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                          //      
                          //  }
                          if (k>=33 && k <=47) {
                          evt.setKeyChar((char)KeyEvent.VK_CLEAR); 
                       } 
                      
                    //}
                }else{   
                  evt.setKeyChar((char)KeyEvent.VK_CLEAR); 
                  evt.consume();     
                };
            }
   
    });
        
    }

}
