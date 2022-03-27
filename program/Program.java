class
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        //tworzenie listy obiektów klasy Auto
        ArrayList<Auto> lista_aut = new ArrayList<>();
        for(int i = 0; i<3;i++){
            lista_aut.add(new Auto());
        }
        for(Auto i : lista_aut){
            System.out.println(i.toString());
        }

    }
}