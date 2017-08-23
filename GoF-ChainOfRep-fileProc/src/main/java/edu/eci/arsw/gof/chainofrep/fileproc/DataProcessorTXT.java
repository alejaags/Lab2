/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;
import java.util.logging.Logger;

/**
 *
 * @author 2110111
 */
public class DataProcessorTXT extends DataProcessor{
    private String fn;
    public DataProcessorTXT(String fileName){
        fn=fileName;
        processTXT();
    }
    
    private void processTXT() {
        LOG.info("Processing TXT...");
    }
}
