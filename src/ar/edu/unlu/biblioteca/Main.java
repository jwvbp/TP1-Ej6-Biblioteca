package ar.edu.unlu.biblioteca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biblioteca miBiblio = new Biblioteca();

		Libro miLibro = new Libro("jose", "Poemas", "11-11111-1", 150);
		miLibro.setEjemplares(10);
		miBiblio.agregarLibro(miLibro);

		Libro miLibro2 = new Libro("cristina", "Otros Poemas", "11-22222-1", 278);
		miLibro2.setEjemplares(1);
		miBiblio.agregarLibro(miLibro2);

		miBiblio.listarLibros();

		miBiblio.prestarLibro(miLibro);
		miBiblio.prestarLibro(miLibro2);

		miBiblio.listarLibros();

		System.out.println(miBiblio.totalPrestamos() + " prestamos en total");
	}

}
