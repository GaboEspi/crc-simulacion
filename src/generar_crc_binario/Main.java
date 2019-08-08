/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generar_crc_binario;
import java.util.Scanner;
/**
 *
 * @author ESGEN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here    
        
        vista f = new vista(); 
        f.setVisible (true);
    }
    
    
//    public static void main(String[] args) {
//        // TODO code application logic here    
        
////        vista f = new vista(); 
////        f.setVisible (true);    
        
//        String dato = "", g = "";  
//        Scanner teclado = new Scanner(System.in);
//        
//        char[] aux_data;        
//        do{
//            System.out.println("ingrese datagrama de 8 a 64 caracteres en binario: ");
//            dato = teclado.nextLine();
//            System.out.println("");
//            
//            if((dato.length() >= 8) && (dato.length() <= 64)){
//                aux_data = dato.toCharArray();
//                for(int i = 0; i<dato.length();i++){                    
//                    if(!((aux_data[i] == '0') || (aux_data[i] == '1'))){
//                        System.out.println("Solo cadena de 8 a 64 caracteres entre 0 y 1");                        
//                    }
//                }
//                break;
//            }else{
//                System.out.println("Solo cadena de 8 caracteres entre 0 y 1");                
//            }
//        }while(true);
//        
//        char[] A_g; // G es es el que divide
//        do{
//            System.out.println("ingrese G de 4 caracteres en binario: ");
//            g = teclado.nextLine();
//            System.out.println("");
//            if(g.length() == 4){
//                A_g = g.toCharArray();
//                for(int i = 0; i<4;i++){                    
//                    if(!((A_g[i] == '0') || (A_g[i] == '1'))){
//                        System.out.println("Solo cadena de 4 caracteres entre 0 y 1");                        
//                    }
//                }
//                break;
//            }else{
//                System.out.println("Solo cadena de 4 caracteres entre 0 y 1");                
//            }
//        }while(true);        
//        
//        //parte 2 - operaciones        
//        
//        String r = "0000";   //R es el complemento del dato
//        String dato_r = dato + r;
//        char[] A_dato_r = dato_r.toCharArray();
//        char[] A_crc = {'0','0','0','0'};         
//        /*
//        
//                PRUEBA
//        */
//        for(int i = 0; i < A_dato_r.length;i++){
//            A_crc[0]=A_crc[1];
//            A_crc[1]=A_crc[2];
//            A_crc[2]=A_crc[3];
//            A_crc[3]=A_dato_r[i];
//            
//            System.out.print("Resto en pos " + i + ": ");
//            for(int k = 0; k<4;k++){
//                System.out.print(A_crc[k]);        
//            }
//            System.out.println("");
//            
//            if(A_crc[0]=='1'){                
//                for(int j = 0; j<4;j++){
//                    if(A_crc[j] == A_g[j]){ //Aqui va la operacion XOR
//                        A_crc[j] = '0';
//                    }else{
//                        A_crc[j] = '1';
//                    }
//                }
//            }    
//        }
//                
//        System.out.print("CRC: ");
//        for(int i=0;i<4;i++){
//             System.out.print(A_crc[i]);
//        }
//        System.out.println();
//        System.out.print("data + CRC: " + dato + " ");
//        for(int i=0;i<4;i++){
//             System.out.print(A_crc[i]);
//        }
//        System.out.println();
//        
//        
//        System.out.println("Presione Enter para continuar - comprobar CRC correcto...");
//        teclado.nextLine();
//        
//        
//        r = null; //R es el complemento del dato
//        for(int i = 0; i<4;i++){
//            r += String.valueOf(A_crc[i]);
//        }
//        dato_r = dato + r;
//        A_dato_r = dato_r.toCharArray();
//        r = "0000"; 
//        A_crc = r.toCharArray();//{'0','0','0','0'};  
//        
//        for(int i = 0; i < A_dato_r.length;i++){
//            A_crc[0]=A_crc[1];
//            A_crc[1]=A_crc[2];
//            A_crc[2]=A_crc[3];
//            A_crc[3]=A_dato_r[i];
//            
//            System.out.print("Resto en pos " + i + ": ");
//            for(int k = 0; k<4;k++){
//                System.out.print(A_crc[k]);        
//            }
//            System.out.println("");
//            
//            if(A_crc[0]=='1'){                
//                for(int j = 0; j<4;j++){
//                    if(A_crc[j] == A_g[j]){ //Aqui va la operacion XOR
//                        A_crc[j] = '0';
//                    }else{
//                        A_crc[j] = '1';
//                    }
//                }
//            }    
//        }
//                
//        System.out.print("CRC comprobacion: ");
//        for(int i=0;i<4;i++){
//             System.out.print(A_crc[i]);
//        }
//        System.out.println();
//        System.out.print("data + CRC comprobacion: " + dato + " ");
//        for(int i=0;i<4;i++){
//             System.out.print(A_crc[i]);
//        }
//        System.out.println();
//    }
}
