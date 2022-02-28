/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author mac
 */
public class Tugas1 {
    double c, f, r, k;
    String condition;
    
    public Tugas1(double c){
        this.c = c;
    }
    
    public void convertCelcius(double c) {
        this.c=c;
    }
    public double toReamur(){
        r = (4*this.c)/5;
        return r;
    }
    public double toFarenheit(){
        f = ((9*this.c)/5)+32;
        return f;
    }
    public double toKelvin(){
        k = this.c+273.15;
        return k;
    }
    public String WaterCon(){
        if (this.c < 1){
            condition = "The Water is Freezing";
        }else if (this.c > 99){
            condition = "The Water is Boiling";
        }else{
            condition = "The Water is on Room Temperature";
        }
        return condition;
    }
    
}
