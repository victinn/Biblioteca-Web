package biblioteca.models;

import biblioteca.entities.Usuarios;
import java.util.ArrayList;


public class UsuarioModel {
    public static ArrayList<Usuarios> arrayUsuarios = new ArrayList();
       
       public void add(Usuarios u){
           arrayUsuarios.add(u);
       }
       
       public ArrayList getUsuarios(){
           return arrayUsuarios;
       }
       
       public void remover(int index){
           arrayUsuarios.remove(index);
       }
}
