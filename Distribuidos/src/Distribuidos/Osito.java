package Distribuidos;

import java.util.ArrayList;
import java.util.List;

public class Osito {
public static void main(String[] args){
		
		//Listas
		List<List<Double>> Tabla = new ArrayList<List<Double>>();

		List<Osote> Tabla2 = new ArrayList<Osote>();
		//Sublistas
		for(int i = 0; i < 10; i++){
			Tabla2.add(new Osote("RTFGH8UJIOL", 3456.0));
		}
        Tabla.add(new ArrayList<Double>());

        for(Osote o: Tabla2){
        	System.out.println(o.getIP());
         	System.out.println(o.getCalificacion());
        }
        
        //System.out.println(Tabla);
        //System.out.println(Tabla2);
	}		

}
