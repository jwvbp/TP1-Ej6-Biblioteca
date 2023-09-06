package ar.edu.unlu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> misLibros = new ArrayList<Libro>();

	public void agregarLibro(Libro libro) {
		misLibros.add(libro);
	}

	public void listarLibros() {
		for (int i = 0; i < misLibros.size(); i++) {
			misLibros.get(i).mostrar();
		}
	}

	public void prestarLibro(Libro libro) {
		libro.prestar();
	}

	public void devolverLibro(Libro libro) {
		libro.devolver();
	}

	public int totalPrestamos() {
		int contador = 0;
		for (int i = 0; i < misLibros.size(); i++) {
			contador += misLibros.get(i).getPrestados();
		}
		return contador;
	}
}
