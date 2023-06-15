package org.launchcode.java.resturantMenuStudio.resturant;

public class MenuItem {
    //Class Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors

    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not categorized";
        this.isNew = false;
        //this.dateAdded = new Date() this was added in class if no date is entered it will default todays date
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
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

    public Boolean isNew() { return this.isNew; } //ch 5.6.3 4a
    public void setIsNew(Boolean isNew) { this.isNew = isNew; }

    /*5.6 Studio Begin
    //we're adding isNew(), printOutMenuItem(menuItem), isEqual(menuItem)
    //when we create new methods we put them below getters and setters
     */

    //Other Methods Start Here

    @Override
    public String toString() { //5.6.3 4b.
        /*PseudoCode
        printOutMenuItem()
    	print itemName
		print itemDescription
		print itemPrice
		print itemCategory
		print itemIsNew
         */
        //printOutMenuItem()
        String returnString = "";

        //print ItemName
        returnString += "Item Name" + this.name + "\n";

        //print itemDescription
        returnString += "Item Description" + this.description + "\n";

        //print itemPrice
        returnString += "Item Price" + this.price + "\n";

        //print itemCategory
        returnString += "Item Category" + this.category + "\n";

        //print itemIsNew
        returnString += "Item Is New" + this.isNew + "\n";

        return returnString;
    }

    @Override //@ override type the letters Im and the command overide/implement comes up double click find equals
    //it'll write equals for us
    public boolean equals(Object obj) {//21:35 explained
        if (obj == this) return true;

        //Pseudo Code:
        //isEqual (menuItem) //add this to the MenuItem class when implemented
        //if menuItem is not a MenuItem
        if (!(obj instanceof MenuItem)) {
            //return false(pseudo code)
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        //if itemName equals menuItem.itemName
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;
        //and itemDescription equals menuItem.itemDescription
        //and itemPrice equals menuItem.itemPrice
        //and itemCategory equals menuItem.itemCategory
        //then return true
        //otherwise return false
        else return false;
    }
}
