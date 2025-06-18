

public class Main {
    public static void main(String[] args) {
        try {
            GrafoMatriz grafo = new GrafoMatriz();

            // Agregar vértices
            grafo.nuevoVertice("Alicante");
            grafo.nuevoVertice("Barcelona");
            grafo.nuevoVertice("Cartagena");
            grafo.nuevoVertice("Murcia");
            grafo.nuevoVertice("Reus");

            // Agregar arcos con pesos 
            //Nota, el grafo y la matriz mostrados en el libro no coinciden entre si, en la matriz mostrada hay un arco de valor 4, pero en el grafo no existe
            grafo.nuevoArco("Alicante", "Cartagena", 3);
            grafo.nuevoArco("Alicante", "Murcia", 5);
            grafo.nuevoArco("Barcelona", "Cartagena", 3);
            grafo.nuevoArco("Barcelona", "Murcia", 6);
            grafo.nuevoArco("Barcelona", "Reus", 3);
            grafo.nuevoArco("Cartagena", "Alicante", 3);
            grafo.nuevoArco("Reus", "Barcelona", 1);
            grafo.nuevoArco("Murcia", "Barcelona", 2);

            // Mostrar resultados
            grafo.imprimirVertices();
            System.out.println();
            grafo.imprimirMatriz();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

