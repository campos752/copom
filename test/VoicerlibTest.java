/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rpm7.copom.gravadorcopom.modelos.Voicerlib;

/**
 *
 * @author Adriano
 */
public class VoicerlibTest {
    
    public VoicerlibTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testeBasico(){
        PointerByReference versao = new PointerByReference();
        Voicerlib.INSTANCIA.dg_GetLibVersion(versao, (short)0);
        Pointer v = versao.getPointer();
        assertTrue(v.getString(0).startsWith("4.3"));
        
    }
}
