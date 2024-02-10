//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo

        //visualizza hashset creato
        System.out.println(readFruitSet());
        Frutta fruit1 = new Frutta();
        fruit1.setText1("mela");
        //visualizza oggetto creato
        System.out.println(fruit1.getText1());

        //visualizza hashset senza l'oggetto
        System.out.println(checkStringSet(readFruitSet(), fruit1));

        //Svuotare l'hashset, verificarlo e stampare il risultato

        //creo un duplicato del primo Hashset
        HashSet<String> clearFruitSet;
        clearFruitSet = readFruitSet();
        //Stampo l'hashset duplicato
        System.out.println(clearFruitSet);
        //svuoto l'hashset
        clearFruitSet.clear();
        //stampo hashset vuoto
        System.out.println(clearFruitSet);
    }
    //Scrivere una funzione che restituisca un hashset riempito
    public static HashSet<String> readFruitSet(){
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("mela");
        fruitSet.add("pera");
        fruitSet.add("pesca");
        fruitSet.add("fragola");
        fruitSet.add("lampone");
        fruitSet.add("mirtillo");
        return fruitSet;
    }
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
    public static HashSet<String> checkStringSet(HashSet<String> readFruitSet, Frutta fruit1){
        Iterator<String> iterator = readFruitSet.iterator();
        while (iterator.hasNext()){
            String blocco1 = iterator.next();
            if (blocco1.equals(fruit1.getText1())) {
                iterator.remove();
            }
        } return readFruitSet;
    }
}