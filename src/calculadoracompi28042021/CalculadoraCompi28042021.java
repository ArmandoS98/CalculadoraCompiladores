/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracompi28042021;

/**
 *
 * @author Armando Santos
 */
public class CalculadoraCompi28042021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Loading starts...");

        splashudv.SplashArt Splash = new splashudv.SplashArt();
        Splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                Splash.progressP.setText(Integer.toString(i) + "%");
                Splash.progressBar.setValue(i);
            }

        } catch (InterruptedException e) {
        }

        System.out.println("Loading process completed. Closing loading window...");
        Splash.dispose();

        new Main().show();
    }
    
}
