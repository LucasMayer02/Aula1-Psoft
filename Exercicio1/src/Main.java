
public class Main {
	
	public static void main(String[] args) {
		Fachada f1 = new Fachada();
		
		f1.criaProduto("Iphone", "Apple", 4500);
		Produto p = new Produto("Iphone", "Apple", 4500);
		f1.criaLote(p, 2000, 2022);
	}
}
