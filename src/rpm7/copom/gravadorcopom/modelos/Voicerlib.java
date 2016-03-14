/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpm7.copom.gravadorcopom.modelos;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 *
 * @author Adriano
 */
public interface Voicerlib extends Library{
    Voicerlib INSTANCIA  = (Voicerlib) Native.loadLibrary("Voicerlib", Voicerlib.class);
    
    short dg_StartVoicerlib(String path);
    short  dg_DriverEnabled();
    short dg_GetLibVersion(String szVersion, short nInfo);
}
