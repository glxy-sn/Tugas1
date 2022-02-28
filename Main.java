/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author mac
 */
class Data{
    double f,r,c,k;
    double Temp1;
    Data(double Temp1){
        this.Temp1=Temp1;
    }
}
public class Main {
    public static void main(String[] args){
        int choose;
        double Temp1;
        String condition;
        boolean loop=true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("======================\nWater Temperature Converter\n======================");
        System.out.println("Please Input the Data");
        System.out.println("Temperature in Celcius: ");
        Temp1 = input.nextDouble();
        Data Water = new Data(Temp1);
        Tugas1 converter = new Tugas1(Temp1);
        
        while (loop){
            Water.c = converter.c;
            Water.r = converter.toReamur();
            Water.f = converter.toFarenheit();
            Water.k = converter.toKelvin();
            condition = converter.WaterCon();
            System.out.println("======================\n1.View Data Conversion\n2.Edit Data Conversion\n3.Exit");
            System.out.println("Choose: ");
            choose = input.nextInt();
            
            if (choose == 1){
                System.out.println("Temperature in Celcius: " + Water.c + " °C");
                System.out.println("Convert to Reamur: " + Water.r + " °R");
                System.out.println("Convert to Farenheit: " + Water.f + " °F");
                System.out.println("Convert to Kelvin: " + Water.k + " °K");
                System.out.println("Water Temperature " + condition);
            }else if (choose == 2){
                System.out.println("Edit Data Conversion ");
                System.out.println("Temperature in Celcius: ");
                Temp1 = input.nextDouble();
                converter.convertCelcius(Temp1);
            }else if (choose == 3){
                loop = false;
            }else{
                System.out.println("Please input the correct number");
                loop = true;
            }
        }
    }
}
