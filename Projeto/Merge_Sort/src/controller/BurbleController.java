public class BurbleController{

		public BurbleController(){
			super();
		}
		
	public void ordena(int[] vetor){
		int aux;
		
		for(int i=0; i< (vetor.length -1); i++){
			for(int j=(i+1); j < vetor.length; j++){
				if(vetor[i] > vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		for(int i=0; i< vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
}	
		