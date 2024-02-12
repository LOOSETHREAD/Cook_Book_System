/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CookHub.model;

import javax.swing.Icon;

/**
 *
 * @author User
 */
public class ModelItem {

    /**
     * @return the dishDescription
     */
    public String getDishDescription() {
        return dishDescription;
    }

    /**
     * @param dishDescription the dishDescription to set
     */
    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    /**
     * @return the dishName
     */
    public String getDishName() {
        return dishName;
    }

    /**
     * @param dishName the dishName to set
     */
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    /**
     * @return the dishRecipe
     */
    public String getDishRecipe() {
        return dishRecipe;
    }

    /**
     * @param dishRecipe the dishRecipe to set
     */
    public void setDishRecipe(String dishRecipe) {
        this.dishRecipe = dishRecipe;
    }

    /**
     * @return the dishProcedure
     */
    public String getDishProcedure() {
        return dishProcedure;
    }

    /**
     * @param dishProcedure the dishProcedure to set
     */
    public void setDishProcedure(String dishProcedure) {
        this.dishProcedure = dishProcedure;
    }

    /**
     * @return the dishImage
     */
    public Icon getDishImage() {
        return dishImage;
    }

    /**
     * @param dishImage the dishImage to set
     */
    public void setDishImage(Icon dishImage) {
        this.dishImage = dishImage;
    }

    public ModelItem() {
    }

    public ModelItem(String dishName, String dishRecipe, String dishProcedure, String dishDescription, Icon dishImage) {
        this.dishName = dishName;
        this.dishRecipe = dishRecipe;
        this.dishProcedure = dishProcedure;
        this.dishDescription = dishDescription;
        this.dishImage = dishImage;
    }

  
    
   private String dishName;
   private String dishRecipe;
   private String dishProcedure;
   private String dishDescription;
   private Icon dishImage;
}

