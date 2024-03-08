import java.util.HashSet;
import java.util.Iterator;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato
public class Main {
    public static void main(String[] args) {


        String dogFindEquals = "Labrador";

        HashSet<String> dogs = createDogs();

        System.out.println(dogs + "primo getdogs");

        Iterator<String> it1 = dogs.iterator();

        while (it1.hasNext()) {
            String element = it1.next();

            if (element.equals(dogFindEquals)) {
                it1.remove();
            }
        }
        System.out.println(dogs + "getDogs() togli " + dogFindEquals);

    }

    public static HashSet<String> createDogs() {
        HashSet<String> dog = new HashSet<String>();
        dog.add("Labrador");
        dog.add("Pitbull");
        dog.add("Amstaff");

        return dog;
    }
}