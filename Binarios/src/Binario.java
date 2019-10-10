public class Binario implements Runnable{
	private int n;
	private Thread hilo;
	
	Binario(int n){
		this.n=n;
		hilo=new Thread(this,String.valueOf(n));
		hilo.start();
	}
	
	
	@Override
	public void run() {

		
		System.out.println(n+" es "+convierte(n,2)+" en binario "+convierte(n,8)+" en octal");
	}


	private String convierte(int n,int base) {
		int divi=n;
		int num;
		String resultado="";
		do {
			num=(int)(divi/base);
			resultado=String.valueOf(divi%base).concat(resultado);
			divi=num;
		}while (divi>=base);
		resultado=String.valueOf(divi).concat(resultado);
		return resultado;
	}
}