
import java.util.*;

public class Lote {
	
	Random random = new Random();
	
	private int id;
	private Produto prod;
	private int quantidade;
	private int data;
	
	public Lote(Produto prod, int quantidade, int data) {
		this.prod = prod;
		this.quantidade = quantidade;
		this.data = data;
		int id = random.nextInt(100);
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
