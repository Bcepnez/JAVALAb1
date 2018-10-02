
public class Main {

	static int top = 0 ;
	static int queue = 0 ;
	static int[] st = new int[10];
	static int[] Q = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int j;
		for (j=0;j<=10;j++){
			push(j+1);
			add(j+1);
		}
		for(j=0;j<=10;j++){
			System.out.print(pop()+" ");
			System.out.println(delete());
		}
	}
	static void push(int x) {
		if (top >= st.length)
		System.out.println("Stack is full");
		else
		st[top++] = x;
	}
	static int pop() {
		if (top > 0)
		return st[--top];
		System.out.print("Stack underflow : ");
		return 0;
	}
	static void add(int x) {
		if (queue >= st.length)
		System.out.println("Queue is full");
		else
		Q[queue++] = x;
	}
	static int delete() {
		if (queue > 0){
			int del = Q[0];
			queue-- ;
			for(int i = 0;i<queue;i++){
				Q[i]=Q[i+1];
			}
			return del;
		}
		
		System.out.print("Queue underflow : ");
		return 0;
	}
}
