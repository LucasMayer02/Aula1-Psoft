import java.util.*;

public class Produto {
	
	Random random = new Random();
	private int id;
	private String nome;
	private String fabricante;
	private double preco;

	public Produto(String nome, String fabricante, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
		int id = random.nextInt(100);
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
