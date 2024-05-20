import java.util.ArrayList;
import java.util.List;

 public class lista {
      public static void main(String[] args) {
          List<String> lista = new ArrayList<>();

          lista.add("Roberto");
          lista.add("Maria");
          lista.add("Bruna");
          lista.add("Beka");

          System.out.println("A lista é:");
          System.out.println(lista);

           String Y = lista.remove(1);
          System.out.println("O elemento removido da lista foi" + Y);

          String X = lista.set(0,"Z");
          System.out.println("A lista atualizada é + lista");

          String elemento = lista.get (1);
          System.out.println("O segundo elemento da lista é:" + elemento);
      }
 }