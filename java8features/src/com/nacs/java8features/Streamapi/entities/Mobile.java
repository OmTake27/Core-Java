package com.nacs.java8features.Streamapi.entities;

import java.util.Objects;

public class Mobile implements Comparable<Mobile> {
    private int serialId;
    private String manufacturer;
    private String model;
    private float price;
    private int ram;
    private String processor;
    private String color;
    private String refreshrate;

    public Mobile() {
        super();
    }

    public Mobile(int serialId, String manufacturer, String model, float price, int ram, String processor, String color,
            String refreshrate) {
        super();
        this.serialId = serialId;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.processor = processor;
        this.color = color;
        this.refreshrate = refreshrate;
    }

    public int getSerialId() {
        return serialId;
    }

    public void setSerialId(int serialId) {
        this.serialId = serialId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRefreshrate() {
        return refreshrate;
    }

    public void setRefreshrate(String refreshrate) {
        this.refreshrate = refreshrate;
    }

    @Override
    public boolean equals(Object temp) {
        if (this == temp) {
            return true;
        }
        if (temp == null || getClass() != temp.getClass()) {
            return false;
        }
        Mobile mobile = (Mobile) temp;
        return serialId == mobile.serialId &&
               Float.compare(mobile.price, price) == 0 &&
               ram == mobile.ram &&
               Objects.equals(manufacturer, mobile.manufacturer) &&
               Objects.equals(model, mobile.model) &&
               Objects.equals(processor, mobile.processor) &&
               Objects.equals(color, mobile.color) &&
               Objects.equals(refreshrate, mobile.refreshrate);
    }

    @Override
    public int hashCode() {                                
        return Objects.hash(serialId, manufacturer, model, price, ram, processor, color, refreshrate);
    }
    @Override
    public int compareTo(Mobile temp) {
  //  	return this.ram-temp.ram;
   // 	return this.manufacturer.compareTo(temp.manufacturer);
  return (int)(this.price-temp.price); 
    }

    @Override
    public String toString() { 
        return "Mobile [serialId=" + serialId + ", manufacturer=" + manufacturer + ", model=" + model + ", price="
                + price + ", ram=" + ram + ", processor=" + processor + ", color=" + color + ", refreshrate="
                + refreshrate + "]";
    }
}
