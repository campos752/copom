/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpm7.copom.gravadorcopom;

import rpm7.copom.gravadorcopom.modelos.Voicerlib;

/**
 *
 * @author Adriano
 */
public class GravadorCopom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String versao = "";
        short info = 0;
        short i = Voicerlib.INSTANCIA.dg_GetLibVersion(versao, info);
        System.out.println(versao + info);
    }
    
}
