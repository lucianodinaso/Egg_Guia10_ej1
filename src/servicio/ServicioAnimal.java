/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Animal;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class ServicioAnimal {
    
    Scanner leer = new Scanner(System.in);
    public String alimento;
    
    public Animal crearAnimal(){
        
        Animal mascotaCreada = new Animal();
        
        System.out.println("Ingres el nombre de la mascota: ");
        mascotaCreada.setNombre(leer.next());
        
        System.out.println("Ingrese el alimento: ");
        mascotaCreada.setAlimento(leer.next());
        
        System.out.println("Ingrese la edad: ");
        mascotaCreada.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la raza: ");
        mascotaCreada.setRaza(leer.next());
        
        return mascotaCreada;
    }
    
    public void MostrarMascota(Animal mascota){
            System.out.println(" ");
            System.out.println("***DATOS DE LA MASCOTA***");
            System.out.println("Nombre: "+ mascota.getNombre());
            System.out.println("Alimento: "+ mascota.getAlimento());
            System.out.println("Edad: "+ mascota.getEdad());
            System.out.println("Raza: "+ mascota.getRaza());
            
            System.out.println("************************");
            System.out.println(" ");
    }
    
    
    public void Alimentarse(Animal mascota){
        
        System.out.println("Ingrese los kg de alimento: ");
        Double kilos = leer.nextDouble();
        
        System.out.println(" ");
        System.out.println("La mascota: "+ mascota.getNombre() + " esta siendo alimentada con  "+ kilos+ " Kg de "+ mascota.getAlimento());
        System.out.println(" ");
    }
    
    
}
