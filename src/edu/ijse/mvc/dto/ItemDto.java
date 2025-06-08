/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Lihini
 */
public class ItemDto {
    
    private String id;
    private String desc;
    private String pack;
    private double unitPrice;
    private int qoh;
    
    public ItemDto(){
        
    }

    public ItemDto(String id, String desc, String pack, double unitPrice, int qoh) {
        this.id = id;
        this.desc = desc;
        this.pack = pack;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }
    
    
    
    public void setId(String id){
       this.id = id;
    }
    
    public String getId(){
       return this.id;
    }
    
    public void setDesc(String desc){
       this.desc = desc;
    }
    
    public String getDesc(){
       return this.desc;
    }
    
    public void setPack(String id){
        this.setId(id);
    }
    
    public String getId(){
       return this.getId();
    }

    /**
     * @return the pack
     */
    public String getPack() {
        return pack;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }
    
    
}
