public class Test10{
    public static void main(String[] args){
		for (int i=1; i<=6; i++) {
			for (int k=i-4; k<=i-4+5; k++){
				if (k<1)
					System.out.printf("*");
				else
					System.out.printf("%d", k);
			}
			System.out.print("");
		}
	}
}
