Public Class AddNumbers{

    public  int add(int a,int b){

	return a+b;
    }
}

public class AddDriver {
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	AddNumbers x=new AddNumbers();
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(x.add(a, b));
	}
}