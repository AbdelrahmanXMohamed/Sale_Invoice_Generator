package Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xbenx
 */
//import javax.swing.*;  

final public class InvoiceLine {
    private String ItemName;
    private int ItemPrice;
    private int Count;

    public InvoiceLine(){}
    public InvoiceLine(String ItemName,int ItemPrice,int Count) throws Exception{
        setItemName(ItemName);
        setItemPrice(ItemPrice);
        setCount(Count);   
    }
    /**
     * @return the ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     * @param ItemName the ItemName to set
     * @throws java.lang.Exception
     */
    public void setItemName(String ItemName) throws Exception {
        if (ItemName.length()> 0)
            this.ItemName = ItemName;
        else
            throw new Exception("Can't Be Empty");
    }

    /**
     * @return the ItemPrice
     */
    public int getItemPrice() {
        return ItemPrice;
    }

    /**
     * @param ItemPrice the ItemPrice to set
     * @throws java.lang.Exception
     */
    public void setItemPrice(int ItemPrice) throws Exception {
        if (ItemPrice >0)
            this.ItemPrice = ItemPrice;
        else
            throw new Exception("Can't must be bigger than ZERO");
         
    }

    /**
     * @return the Count
     */
    public int getCount() {
        return Count;
    }

    /**
     * @param Count the Count to set
     * @throws java.lang.Exception
     */
    public void setCount(int Count) throws Exception {
        if (Count>0)
            this.Count = Count;
        else
            throw new Exception("Can't must be bigger than ZERO");

    }
    @Override
    public String toString()
    {
        return "Item Name: "+ItemName+"\t"+"Item Price: "+ItemPrice+"\t"+"Count: "+Count; 
    }
}
