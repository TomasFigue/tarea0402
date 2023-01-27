/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package TAREA_1;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Clase 01_01_02");
        
        var perro1=new Perro();
        var perro2=new Perro();
        var perro3=new Perro();
        
        perro1.nombre="firulais";
        perro1.raza="mestizo";
        perro1.edad=5;
        perro1.color="cafe";
        
        System.out.println("mi perro se llama "+perro1.nombre+" tiene "
                +perro1.edad+ " años"+", es un " + perro1.raza+" y es de color "
                +perro1.color);
        
        perro2.nombre="estiven";
        perro2.raza="pastor";
        perro2.edad=2;
        perro2.color="blanco";
        
        System.out.println("mi otro perro se llama "+perro2.nombre+" tiene "
                +perro2.edad+ " años"+ ",es un " + perro2.raza+" y es de color"+
                perro2.color);
        
        perro3.nombre="joven";
        perro3.raza="dalmata";
        perro3.edad=6;
        perro3.color="mixto";
        
        System.out.println("y mi ultimo perro se llama "+perro3.nombre+" tiene "
                +perro3.edad+ " años"+ ", es un " + perro3.raza+" y es de color"
                +perro3.color);
        
        
        

        var persona1=new Persona();
        var persona2=new Persona();
        var persona3=new Persona();
        
        persona1.cedula= "0984645427";
        persona1.edad=21;
        persona1.nombre="Simon";
        persona1.altura= 1.75;
        
        System.out.println("La persona se llama "+persona1.nombre+", Tiene "
                +persona1.edad+" años, mide "+persona1.altura
                +" metros y su numero de cedula es "+persona1.cedula);
        
        persona2.cedula= "0845254541";
        persona2.edad=45;
        persona2.nombre="Juan";
        persona2.altura= 1.80;
        
        System.out.println("La otra persona se llama "+persona2.nombre+", Tiene "
                +persona2.edad+" años, mide "+persona2.altura
                +" metros y su numero de cedula es "+persona2.cedula);
        
        persona3.cedula= "0658587487";
        persona3.edad=78;
        persona3.nombre="Antonio";
        persona3.altura= 1.70;
        
        System.out.println("La ultima persona se llama "+persona3.nombre+", Tiene "
                +persona3.edad+" años, mide "+persona3.altura
                +" metros y su numero de cedula es "+persona3.cedula);
        
        
        
        
        
        var compu1=new Computador();
        var compu2=new Computador();
        var compu3=new Computador();
        
        compu1.capacidad="260 gb";
        compu1.marca="LG";
        compu1.modelo="A5";
        compu1.precio=400;
        
        System.out.println("El computador es marca "+compu1.marca
                +", tiene una capacidad de "+compu1.capacidad+", su modelo es "
        +compu1.modelo+" y tiene un precio de $"+compu1.precio);
        
        compu2.capacidad="570 gb";
        compu2.marca="HP";
        compu2.modelo="A7";
        compu2.precio=900;
        
        System.out.println("El otro computador es marca "+compu2.marca
                +", tiene una capacidad de "+compu2.capacidad+", su modelo es "
        +compu2.modelo+" y tiene un precio de $"+compu2.precio);
        
        compu3.capacidad="1 Tb";
        compu3.marca="ASUS";
        compu3.modelo="A10";
        compu3.precio=1500;
        
        System.out.println("El ultimo computador es marca "+compu3.marca
                +", tiene una capacidad de "+compu3.capacidad+", su modelo es "
        +compu3.modelo+" y tiene un precio de $"+compu3.precio);
        
        
        
        var auto1 = new Auto();
        var auto2 = new Auto();
        var auto3 = new Auto();
        
        auto1.marca="Volswagen";
        auto1.ano=2019;
        auto1.placa="UBA 2354";
        auto1.color="rojo"; 
        
        System.out.println("mi carro es de la marca "+auto1.marca+"el ano es "
                +auto1.ano+ " la placa es "  + auto1.placa+" y el color es "
                +auto1.color); 
        
        auto2.marca="Toyota";
        auto2.ano=2018;
        auto2.placa="UBA 2674";
        auto2.color="azul"; 
        
        System.out.println("mi carro es de la marca "+auto2.marca+"el ano es "
                +auto2.ano+ " la placa es "  + auto2.placa+" y el color es "
                +auto2.color); 
        
        auto3.marca="Ferrari";
        auto3.ano=2020;
        auto3.placa="UBA 2694";
        auto3.color="morado"; 
        
        System.out.println("mi carro es de la marca "+auto3.marca+"el ano es "
                +auto3.ano+ " la placa es "  + auto3.placa+" y el color es "
                +auto3.color);
        
        
        
        
        var casa1 = new Casa();
        var casa2 = new Casa();
        var casa3 = new Casa();
        
        casa1.numeroVentanas=6;
        casa1.ubicacion="centro";
        casa1.numeroPersonas=9;
        casa1.numeroBanos=4; 
        
        System.out.println("mi casa tiene: "+casa1.numeroVentanas+"ventanas"+" esta ubicado en "
                +casa1.ubicacion+ " habitan "  + casa1.numeroPersonas+" personas "+" y tiene"
                +casa1.numeroBanos+"banos");
        
        
        casa2.numeroVentanas=8;
        casa2.ubicacion="a las afueras";
        casa2.numeroPersonas=10;
        casa2.numeroBanos=5; 
        
        System.out.println("mi casa tiene: "+casa2.numeroVentanas+" esta ubicado en "
                +casa2.ubicacion+ " habitan "  + casa2.numeroPersonas+" personas "+" y tiene"
                +casa2.numeroBanos+"banos");
        
        casa3.numeroVentanas=6;
        casa3.ubicacion="lejos de la ciudad";
        casa3.numeroPersonas=4;
        casa3.numeroBanos=7; 
        
        System.out.println("mi casa tiene: "+casa3.numeroVentanas+" esta ubicado en "
                +casa3.ubicacion+ " habitan "  + casa3.numeroPersonas+" personas "+" y tiene"
                +casa3.numeroBanos+"banos");
        
        
        
        
        var celular1 = new Celular();
        var celular2 = new Celular();
        var celular3 = new Celular();
        
        celular1.marca="samsung";
        celular1.capacidad="65gb";
        celular1.numeroDuenos=9;
        celular1.apps=4; 
        
        System.out.println("el celular es marca "+celular1.marca+"tiene una capacidad de: "
                +celular1.capacidad+ " tuvo "  + celular1.numeroDuenos+" duenos "+" y tiene"
                +celular1.apps+"apps"); 
        
        celular2.marca="apple";
        celular2.capacidad="68gb";
        celular2.numeroDuenos=5;
        celular2.apps=3; 
        
        System.out.println("el celular es marca "+celular2.marca+"tiene una capacidad de: "
                +celular2.capacidad+ " tuvo "  + celular2.numeroDuenos+" duenos "+" y tiene"
                +celular2.apps+"apps"); 
        
        celular3.marca="Nokia";
        celular3.capacidad="500gb";
        celular3.numeroDuenos=6;
        celular3.apps=9; 
        
        System.out.println("el celular es marca "+celular3.marca+"tiene una capacidad de: "
                +celular3.capacidad+ " tuvo "  + celular3.numeroDuenos+" duenos "+" y tiene"
                +celular3.apps+"apps");
        
        
}
        
        
        
        
   
        
 
        
        
        
        
        
    }

