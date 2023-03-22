import java.util.*;

public class Repositorio {
	
	private HashMap<Integer, Produto> repositorioProduto = new HashMap<>();
	private HashMap<Integer, Lote> repositorioLote = new HashMap<>();
	
	public Repositorio() {
		this.repositorioProduto = new HashMap<>();
		this.repositorioLote = new HashMap<>();
	}
	
	public void adicionaProduto(int id, Produto p1) {
		repositorioProduto.put(id, p1);
	}
	
	public void adicionaLote(int id, Lote l1) {
		repositorioLote.put(id, l1);
	}
}
