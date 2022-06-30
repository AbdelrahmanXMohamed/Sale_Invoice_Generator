/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.InvoiceHeader;
import Control.InvoiceLine;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Xbenx
 */
public class FileOperation {
    private HashMap<Integer,InvoiceHeader> relation ;
    public ArrayList<InvoiceHeader> ReadFromExcal(String HeaderFile,String LineFile) throws Exception
    {
        relation = new HashMap<>();
        try {
        FileReader filereader = new FileReader(HeaderFile);
        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;
 
        while ((nextRecord = csvReader.readNext()) != null) {
            String[] fullData= new String[3];
            int count=0;
            for (String cell : nextRecord) {
                fullData[count]=cell;
                ++count;  
            }
            relation.put(Integer.parseInt(fullData[0]),new InvoiceHeader(Integer.parseInt(fullData[0]),fullData[1],fullData[2]));
        }                
        filereader.close();
        
        filereader = new FileReader(LineFile);
        csvReader = new CSVReader(filereader);
 
        while ((nextRecord = csvReader.readNext()) != null) {
            String[] fullData= new String[4];
            int count=0;
            for (String cell : nextRecord) {
                fullData[count]=cell;
                ++count;  
            }
            relation.get(Integer.parseInt(fullData[0])).addItems(new InvoiceLine(fullData[1],Integer.parseInt(fullData[2]),Integer.parseInt(fullData[3])));
        }
        filereader.close();
        }
        catch (Exception e) {
            throw new Exception("Failed to load");
        }
        return new ArrayList<>(relation.values());

    }
    
    public InvoiceHeader getRelationById(int id){return relation.get(id);}
    public void RelationById(int id){relation.remove(id);}
    public ArrayList<InvoiceHeader> getRelation(){return new ArrayList<>(relation.values());}
    
    
    public void WriteToExcal(String HeaderFile,String LineFile,ArrayList<InvoiceHeader>data) throws Exception
    {
//            System.out.println(relation);

    try {
        FileWriter outputfile = new FileWriter(new File(HeaderFile));
        CSVWriter writer = new CSVWriter(outputfile,CSVWriter.DEFAULT_SEPARATOR,
                                         CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
        
        for(InvoiceHeader i : data) writer.writeNext(new String[]{""+i.getInvoiceNumber(),""+i.getInvoiceDate(),i.getCustomerName()}); 
        
        writer.close();
    }
    
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
        FileWriter outputfile = new FileWriter(new File(LineFile));
        CSVWriter writer = new CSVWriter(outputfile,CSVWriter.DEFAULT_SEPARATOR,
                                         CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
        for(InvoiceHeader i : data)
            for(InvoiceLine j: i.getItems()) writer.writeNext(new String[]{""+i.getInvoiceNumber(),j.getItemName(),""+j.getItemPrice(),""+j.getCount()});            
        writer.close();
    }
        catch (IOException e) {
            throw new Exception("Failed to save");
        }
    }
    
    
    @Override
    public String toString()
    {
        String Relation="";
        for (InvoiceHeader i : relation.values())
        {
            Relation+=i.toString();
        }
        return Relation;
    }
}
