package Classes;

import java.awt.*;

import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;

public abstract class Car {
    private String make; // марка
    private String model; // модель
    private Color color; // цвет
    private TypeOfBody typeOfBody; // тип кузова
    private int numOfWHeels; // число колёс
    private TypeOfGearBox typeOfGearBox; // тип коробки передач
    private TypeOfFuel typeOfFuel; // тип топлива
    private float engineCapacity; // объём двигателя

    public Car(String make, String model, Color color, TypeOfBody typeOfBody, int numOfWHeels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numOfWHeels = numOfWHeels;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.engineCapacity = engineCapacity;
    }

    // метод: движения
    public void movement() {
    }

    // метод обслуживания
    public void maintenance() {
    }

    // метод включения фар
    public boolean turnLight() {
        return true;
    }

    // метод переключения передач
    public boolean turnWhapers() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumOfWHeels() {
        return numOfWHeels;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setNumOfWHeels(int numOfWHeels) {
        this.numOfWHeels = numOfWHeels;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}