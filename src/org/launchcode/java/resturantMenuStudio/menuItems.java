package org.launchcode.java.resturantMenuStudio;

public class menuItems {
    //Class Variables
    private String name;
    private String description;

    private double price;
    private String category;
    private Boolean isNew;

    //Constructors

    public menuItems(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not categorized";
        this.isNew = false;
    }

    public menuItems(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not categorized";
        this.isNew = false;
    }

    //Methods
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return this.price; }
    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return this.category; }
    public void setCategory( String category) { this.category = category; }

    public Boolean getIsName() { return this.isNew; }
    public void setIsName(Boolean isNew) { this.isNew = isNew; }
}
