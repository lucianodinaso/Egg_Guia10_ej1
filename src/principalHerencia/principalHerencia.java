/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalHerencia;

import entidad.Animal;
import entidad.Perro;
import servicio.ServicioAnimal;

/**
 *
 * @author lucho
 */
public class principalHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Creación del servicio Animal
        ServicioAnimal sa = new ServicioAnimal();
        
        //Declaración de Perro
        Animal perro1 = sa.crearAnimal();
        sa.MostrarMascota(perro1);
        sa.Alimentarse(perro1);
        
        Animal perro2 = sa.crearAnimal();
        sa.MostrarMascota(perro2);
        sa.Alimentarse(perro2);
        
        Animal gato1 = sa.crearAnimal();
        sa.MostrarMascota(gato1);
        sa.Alimentarse(gato1);
        
        Animal caballo1 = sa.crearAnimal();
        sa.MostrarMascota(caballo1);
        sa.Alimentarse(caballo1);
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
