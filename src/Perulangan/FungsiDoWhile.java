/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author MOKLET-2
 */
public class FungsiDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mendeklarasikan Variabel
        int bil = 1;
        //Pernyataan Perulangan
        do{
        //statement
        System.out.print(bil+" ");
        //Simbol bil++ singkatan dari ekspresi: i += 1 
        bil++;
        //Perulangan ini akan menghasilkan bilangan dari 1 sampai 10
        }while (bil<=10);
    }
    
}
