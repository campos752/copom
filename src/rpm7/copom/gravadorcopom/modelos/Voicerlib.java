/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpm7.copom.gravadorcopom.modelos;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

/**
 *
 * @author Adriano
 */
public interface Voicerlib extends Library{
    
    Voicerlib INSTANCIA  = (Voicerlib) Native.loadLibrary("Voicerlib", Voicerlib.class);
 
    public static class EventDataStruct implements Structure.ByReference {
        public short command;
        public short data;
        public short port;
        public short data_aux;
        public short card;
    }
    
    public interface ReceiveEventsFunc extends Callback {
        void invoke(EventDataStruct data);
    }
    ReceiveEventsFunc ReceiveEvents(EventDataStruct context_data);
    short dg_StartVoicerlib(String path);
    short dg_DriverEnabled();
    short dg_GetLibVersion(PointerByReference szVersion, short nInfo);
    
}
