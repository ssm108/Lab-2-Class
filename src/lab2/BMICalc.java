/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ssm108
 */
public class BMICalc {
    int feet;
    int inches;
    int pounds;
    
    public BMICalc(int feet, int inches, int pounds){
        this.feet = feet;
        this.inches = inches;
        this.pounds = pounds;
        
    }
    
    public int calculateBMI(){
        //here is the calculation
        int x = (feet * 12) + inches;
        int y = pounds * 703;
        int z = x * x;
        int bmi = y / z;
        return bmi;
    }
    
}
