package oBaratoSaiCaroLtda;

public class Pilha <T>{
		public T[] elementos;
		public int topo;
		private final int MAX = 1000;
		
	public Pilha(){
		topo = 0; //isEmpty in the position -1 or 0;
		elementos = (T[])new Object [MAX]; //10 positions;
	}
	
	public void push(T valor){
		if(isFull()){
			throw new RuntimeException("Stack Overflow!");
		}
			topo++;
			elementos[topo] = valor;
		}
	
	public T pop(){ //drop item of the pile, if not empty
		if(isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}
		T valor;
		valor = elementos[topo];
		topo--;
		return valor;
	}

	public boolean isEmpty(){
		if(topo == 0){
			return true;  //Is empty.
		}
		return false; //Not Empty
	}
	
	public boolean isFull(){
		return (topo == MAX);
	}
	
	public T top(){
		if(isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}
		return elementos[topo];  //return our pile size in the vector position;
	}

}
