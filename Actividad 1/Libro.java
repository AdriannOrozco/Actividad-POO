public class Libro{
   String titulo;  
   String autor;  
   int numeroDePaginas;

   //Constructor por defecto
    public Libro(){
    titulo = "100 años de soledad";
    autor = "Gabriel Garcia Márquez";
    numeroDePaginas = 100;
}

    //Constructor Parametrizado
    public Libro(String titulo, String autor, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    //Método para mostrar los detalle del libro
    @Override
    public String toString(){
        return "Titulo: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroDePaginas + " páginas.";
    }
}