package POO_Actividad_Integradora2.Egg;

public class Libro extends ItemBiblioteca implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int nroPaginas;
    private boolean prestado;
    
    public Libro(String titulo, String autor, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.prestado = false;
    }

    public void mostrarInformacion() {
        System.out.println("\nTítulo: " + this.titulo +
                            "\nAutor: " + this.autor +
                            "\nNúmero de páginas: " + this.nroPaginas);

        System.out.println();
    }

    @Override
    public void prestar(){
        System.out.println("\nPrestando libro... \n");
    }

    @Override
    public void devolver(){
        System.out.println("\nDevolviendo libro... \n");
    }

    @Override
    public double calcularMultas(){
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.titulo.compareTo(libro.getTitulo());
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Libro l){
            return l.getTitulo().equals(this.titulo);
        }
        return false;
    }
}
