import controller.BurbleController;

public class Principal{
	public static void main(String[] args){
		BurbleController burble = new BurbleController();
		int vetor[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		burble.ordena(vetor);
	}
}
		