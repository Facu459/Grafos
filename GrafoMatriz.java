

public class GrafoMatriz {
    int numVerts;
    static int MaxVerts = 20;
    Vertice[] verts;
    int[][] matAd;

    public GrafoMatriz() {
        this(MaxVerts);
    }

    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < mx; j++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }

    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }

    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        for (int i = 0; i < numVerts; i++) {
            if (verts[i].equals(v)) {
                return i;
            }
        }
        return -1;
    }

    public void nuevoArco(String a, String b, int peso) throws Exception {
        int va = numVertice(a);
        int vb = numVertice(b);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = peso;
    }

    public void imprimirMatriz() {
        System.out.println("Matriz de Adyacencia con Pesos:");
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                System.out.print(matAd[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirVertices() {
        for (int i = 0; i < numVerts; i++) {
            System.out.println(i + ": " + verts[i].nomVertice());
        }
    }
}

