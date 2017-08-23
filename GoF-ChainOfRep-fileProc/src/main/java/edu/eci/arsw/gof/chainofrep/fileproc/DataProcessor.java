/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author hcadavid
 */


public class DataProcessor{

    public void loadAndProcessData(String fileName) throws DataLoadException{
        
        LOG.info("Loading data...");
        DataProcessor dp = null;
        
        if (extension(fileName).equals("xml")){
            dp = new DataProcessorXML(fileName);     
        }
        else if (extension(fileName).equals("csv")){
            dp = new DataProcessorCSV(fileName);       
        }
        else if (extension(fileName).equals("json")){
           dp = new DataProcessorJSON(fileName);                  
        }
        else if (extension(fileName).equals("txt")){
          dp = new DataProcessorTXT(fileName);                
        }
        else{
            throw new DataLoadException("Format not supported:"+extension(fileName));
        }
        
        /*
            DATA PROCESSING CORE
        */
        LOG.info("Processing data...");
        LOG.info("Done. Execution finished.");
    }
    
    public String extension(String fileName){
        return FilenameUtils.getExtension(fileName);
    }
    
    static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());
    
}


