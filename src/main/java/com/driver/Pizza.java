package com.driver;

public class Pizza {

    private int price;
    private int baseprice;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int paperBagPrice;
    private boolean extraCheese;
    private boolean extraTopping;
    private boolean paperBag;
    private boolean isbillGenerate;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg == true)
        {
            this.baseprice = 300;
            this.extraToppingPrice = 70;
        }
        else{
            this.baseprice = 400;
            this.extraToppingPrice = 120;
        }
        this.price += baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==false)
        {
            this.extraCheesePrice = 80;
            this.price += this.extraCheesePrice;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping==false)
        {
            if(this.isVeg == true)
            {
                this.extraToppingPrice = 70;
                this.price += this.extraToppingPrice;
                this.extraTopping = true;
            }
            else
            {
                this.extraToppingPrice = 120;
                this.price += this.extraToppingPrice;
                this.extraTopping = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.paperBag==false)
        {
            this.paperBagPrice = 20;
            this.price += this.paperBagPrice;
            this.paperBag = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.isbillGenerate == false)
        {
            this.bill = "Base Price Of The Pizza: "+this.baseprice+"\n";
            if(this.extraCheese)
            {
                this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if(this.extraTopping)
            {
                this.bill += "Extra Toppings Added: "+this.extraToppingPrice+"\n";
            }
            if(this.paperBag)
            {
                this.bill += "Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill += "Total Price: "+this.price;
            this.isbillGenerate = true;
        }
        return this.bill;
    }
}
