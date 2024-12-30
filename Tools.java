public class Tools {
    public void numbers(int n) {
	for(int i = 0; i <= n; i++){
	 System.out.print(i + " "); 
	}
		}
    public void multiples(int m, int n) { 
	for (int i = 1; i <= n; i++){ 
	System.out.print(i * m + " "); 
	}
		}

    public static void main(String[] args){
        Tools t = new Tools();
        t.numbers(10);
System.out.println();//Move to next line
        t.multiples(2, 10); // even
System.out.println();//Move to next line
        t.multiples(3, 10); // multiples of 3
System.out.println();//Move to next line
	t.multiples(4, 10); // multiples of 4
System.out.println();//Move to next line
	t.multiples(5, 10); // multiples of 5
    }
}
