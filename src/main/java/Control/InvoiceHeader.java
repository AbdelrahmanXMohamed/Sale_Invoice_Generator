package Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xbenx
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.ArrayList; 
public class InvoiceHeader {


    private static int Id;
    private int InvoiceNumber;
    private LocalDate InvoiceDate;
    private String CustomerName;
    private ArrayList<InvoiceLine>items=new ArrayList<InvoiceLine>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private int Total;
    public void setInvoiceDate(String InvoiceDate) throws Exception {
        try
        {
            this.InvoiceDate=LocalDate.parse(InvoiceDate, formatter);
        }
        catch(DateTimeParseException  e)
        {
            throw new Exception("Incorrect date format");
        }       }
    public void setCustomerName(String CustomerName) throws Exception {
        if (CustomerName.length()>0)
            this.CustomerName=CustomerName;
        else
            throw new Exception("Customer Name can't be empty");    }
    public InvoiceHeader(){
        Id+=1;
        InvoiceNumber=Id;
    }
    public InvoiceHeader(int InvoiceNumber,String InvoiceDate,String CustomerName){
        this.InvoiceDate=LocalDate.parse(InvoiceDate, formatter);
        this.CustomerName=CustomerName;
        this.InvoiceNumber=InvoiceNumber;
        Id=InvoiceNumber;
    
    }
    public InvoiceHeader(String InvoiceDate,String CustomerName) throws Exception{
        this();
        if (CustomerName.length()>0)
            this.CustomerName=CustomerName;
        else
            throw new Exception("Customer Name can't be empty");
        try
        {
            this.InvoiceDate=LocalDate.parse(InvoiceDate, formatter);
        }
        catch(DateTimeParseException  e)
        {
            throw new Exception("Incorrect date format");
        }   
        
    }
    public int getInvoiceNumber()
    {
        return this.InvoiceNumber;
    }
    
    public String getCustomerName()
    {
        return this.CustomerName;
    }
    
    public String getInvoiceDate()
    {
        return formatter.format(this.InvoiceDate);
    }    

    /**
     * @return the items
     */
    public ArrayList<InvoiceLine> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void addItems(InvoiceLine items) {
        this.items.add(items);
    }
    public void removeItems(int id){
    if (items.isEmpty())
        System.err.println("Items is Empty");
    else
        items.remove(id);
    }

    public int getTotal() {
        Total=0;
        for(InvoiceLine i:items)
            Total+=i.getItemPrice()*i.getCount();
       
        return Total;
    }
    @Override
    public String toString()
    {
        String itemsString="";
        for (InvoiceLine i:items)
        {
            itemsString+=i.toString()+"\n";
        }
        return  "Invoice Number: "+InvoiceNumber+"\tCustomer Name: "+getCustomerName()+"\tInvoice Date: "+getInvoiceDate()+"\n"+itemsString;
    }
}
