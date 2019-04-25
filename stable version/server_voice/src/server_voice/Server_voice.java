/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_voice;

/**
 *
 * @author dipta10
 */
public class Server_voice {

    public static boolean calling = false;
    
    public static void main(String[] args) {
        server_fr fr = new server_fr();
        fr.setVisible(true);
        fr.setResizable(false);
    }
    
}
