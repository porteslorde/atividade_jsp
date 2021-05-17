/**
 *
 * @author maria
 */
package Listadeveiculos;

import java.util.ArrayList;


public class ListaDeVeiculos {

public static void main(String[] args) {
      
    ArrayList <Veiculo> veiculos = new ArrayList();
   
   Veiculo veiculo1 = new Veiculo("Corolla Cross", "abc-000");
   
   Veiculo veiculo2 = new Veiculo("Civic Sport", "abc-001");
   
   Veiculo veiculo3 = new Veiculo("Land Rover Defender", "abc-002");
   
   Veiculo veiculo4 = new Veiculo("Lamborghi Aventador", "abc-003");
   
   Veiculo veiculo5 = new Veiculo("Amarok", "Abc-004");
   
   Veiculo veiculo6 = new Veiculo("Blazer V6", "abc-005");
   
   Veiculo veiculo7 = new Veiculo("Porshe 911", "abc-006");
   
   Veiculo veiculo8 = new Veiculo("Santa Fé", "abc-007");
   
   Veiculo veiculo9 = new Veiculo("Polo Gti ", "abc-008");
   
   Veiculo veiculo10 = new Veiculo("Uno", "abc-009");
   
   veiculos.add(veiculo1);
   veiculos.add(veiculo2);
   veiculos.add(veiculo3);
   veiculos.add(veiculo4);
   veiculos.add(veiculo5);
   veiculos.add(veiculo6);
   veiculos.add(veiculo7);
   veiculos.add(veiculo8);
   veiculos.add(veiculo9);
   veiculos.add(veiculo10);
 
   veiculos.forEach((c) -> {
       System.out.print("Modelo: "+c.modelo+" Placa: "+c.placa+"\n\n");
    });
}


}