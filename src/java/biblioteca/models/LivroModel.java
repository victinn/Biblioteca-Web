package biblioteca.models;

import biblioteca.entities.Livros;
import java.util.ArrayList;


public class LivroModel {
       public static ArrayList<Livros> arrayLivros = new ArrayList();
       
       public void add(Livros l){
           arrayLivros.add(l);
       }
       
       public ArrayList getlivros(){
           return arrayLivros;
       }
       
       public void remover(int index){
           arrayLivros.remove(index);
       }
       
       public Livros procurarPeloIndex(int index){
           Livros livro = arrayLivros.get(index);
           return livro;
       }
}
