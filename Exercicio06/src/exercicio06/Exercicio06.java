package exercicio06;
/*
Implemente uma interface "Mídia" com método "reproduzir". Crie as classes "CD", "DVD" e "Blu-ray" que implementam a interface de forma polimórfica.
*/
public class Exercicio06 {

    public static void main(String[] args) {
        Midia a = new CD();
        Midia b = new DVD();
        Midia c = new BluRay();
        
        a.reproduzir();
        b.reproduzir();
        c.reproduzir();
    }
    
}
