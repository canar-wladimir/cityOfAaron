/*
 * The Player class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */

package model;

import java.io.Serializable;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;

/*
 * @author Megan Hendrickson
 */
public class CropData implements Serializable {
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;
    
    public int getYear(){
        return this.year;
        }

   public void setYear(int _year){
        this.year = _year;
        }

    public int getPopulation() {
        return this.population;
    }
    
    public void setPopulation(int _population){
        this.population = _population;
    }

    public int getAcresOwned(){
        return this.acresOwned;
        }

   public void setAcresOwned(int _acresOwned){
        this.acresOwned = _acresOwned;
        }

    public int getCropYield() {
        return this.cropYield;
    }
    
    public void setCropYield(int _cropYield){
        this.cropYield = _cropYield;
    }

    public int getWheatInStore(){
        return this.wheatInStore;
    }
    
    public void setWheatInStore(int _wheatInStore){
        this.wheatInStore =  _wheatInStore;
    }
    
    public int getNumberWhoDied(){
        return this.numberWhoDied;
    }
    
    public void setNumberWhoDied(int _numberWhoDied){
        this.numberWhoDied = _numberWhoDied;
    }

    public int getNewPeople() {
        return this.newPeople;
    }
    
    public void setNewPeople(int _newPeople){
        this.newPeople = _newPeople;
    }

    public int getHarvest() {
        return this.harvest;
    }

    public void setHarvest(int _harvest){
        this.harvest = _harvest;
    }

    public int getWheatForFood() {
        return this.wheatForFood;
    }
    
    public void setWheatForFood(int _wheatForFood) {
        this.wheatForFood = _wheatForFood;
    }
    
    public int getAcresPlanted() {
        return this.acresPlanted;
    }
    
    public void setAcresPlanted(int _acresPlanted) {
        this.acresPlanted = _acresPlanted;
    }
    

}

