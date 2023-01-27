/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Principal {
    public static void main(String[] args) {
        
    var roca=new Actor("Dwayne Johnson","Black Adam",12000000,54);
        System.out.println("Informacion del Actor:"+"\n"+roca.mostrarinfoActor());
        
    var electronica=new Departamento("Programación",20,"Ing.Mauricio Ortiz");
        System.out.println("Informacion del departamento:"+"\n"+electronica.mostrarInfoDepartamento());
    
    var profesor=new Empleado("Jose Ulloa",1980,1200,electronica);
        System.out.println("Informacion del empleado:"+"\n"+profesor.mostrarInfoEmpleado());
        
    var ups=new Empresa(1000,"Universidad Politécnica Salesiana",120000,"Padre Rector");
    System.out.println("Informacion de la empresa:"+"\n"+ups.mostrarInfoEmpresa());
    
    var españa=new Pais("España","43,33 millones de habitantes","Europa"
            ,"505.990 km²");
    System.out.println("Informacion del pais:"+"\n"+españa.mostrarInfoPais());

    var barcelona=new Equipo(20,true,"muy alta",españa
            ,12000000,"Futbol Club Barcelona");
    System.out.println("Informacion del equipo:"+"\n"+barcelona.mostrarInfoEquipo());

    var lewan=new Jugador("Robert Lewandowski","Delantero",barcelona);
    System.out.println("Informacion del jugador:"+"\n"+lewan.mostrarInfoJugador());

    var blacka=new Pelicula("Black Adam",195000000,roca);
    System.out.println("Informacion de la pelicula:"+"\n"+blacka.mostrarInfoPelicula());

    var blackadam=new Personaje(roca,blacka,"Black Adam");
    System.out.println("Informacion del personaje:"+"\n"+blackadam.mostrarinfoPersonaje());

    }
}
