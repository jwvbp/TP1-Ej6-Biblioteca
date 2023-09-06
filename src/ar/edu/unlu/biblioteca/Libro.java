package ar.edu.unlu.biblioteca;

public class Libro {

	private String autor;
	private String titulo;
	private String isbn;
	private int paginas;
	private int prestados = 0;
	private int ejemplares = 0;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public Libro(String autor, String titulo, String isbn, int paginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
		this.paginas = paginas;
	}

	public void mostrar() {
		System.out.println("El libro " + titulo + " creado por el autor " + autor + " tiene " + paginas + " paginas ");
		System.out.println("Quedan " + ejemplares + " disponibles y se prestaron " + prestados);

	}

	public void prestar() {
		if (ejemplares == 1) {
			System.out.println(titulo + " No se puede prestar");
		} else {
			prestados = prestados + 1;
			ejemplares = ejemplares - 1;
		}
	}

	public void devolver() {
		prestados = prestados - 1;
		ejemplares = ejemplares + 1;
	}

}
