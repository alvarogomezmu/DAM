import herramientas.*;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
/**
 *
 * @author AlumnoT
 */
public class ejercicio2 {
    public static void main(String[] args){
        
        
        Connection conn = null;
        CallableStatement x = null;
        
        try{
            
            
            /*
            
            //function 

            create or replace function eje2(pdni personas.dni%type) return personas.edad%type is    
            pedad personas.edad%type;    
            begin    
            select edad into pedad from personas where dni=pdni; 
            return pedad;    
            end eje2;    
            /  


            //bloque anónimo 

            SET SERVEROUTPUT ON      
            declare      
            vedad personas.edad%type;  
            begin      
            vedad:=eje2(2);  
            if vedad = 10 then  
            dbms_output.put_line('diez');  
            elsif vedad = 15 then  
            dbms_output.put_line('quince');  
            else  
            dbms_output.put_line('treinta');  
            end if;  
            end;      
            / 
            
            */
            
            
            
            conn = herramientas.conectarOracle("usu2", "root");
            
            String solucion="{?=call eje2(?)}";
            
            //Ejecuta la sentencia
            x = conn.prepareCall(solucion);
            
            //Devuelve los datos 
            x.registerOutParameter(1, Types.INTEGER);
            x.setString(2, "2");
            
            //Recojemos los datos
            x.executeUpdate();
            
            //Filtramos por el valor
            if(x.getInt(1) == 10){
                System.out.println("Diez");
            }else if(x.getInt(1) == 15){
                System.out.println("Quince");
            }else{
                System.out.println("Treinta");
            }
            

        }catch(IOException e){

        }catch(ClassNotFoundException e){

        }catch(SQLException e){

        }catch(InstantiationException e){

        }catch(IllegalAccessException e){

        }finally { 

                if (x != null) { 
                    
                    try{
                      x.close();
                    }catch(SQLException e){
                    
                    }
                } 
                if (conn != null) { 
                    try { 
                        conn.close(); 

                    } catch (SQLException e) { 

                    } 
                } 
        } 

    } 
        
        
}



