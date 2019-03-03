package repaso;

public class MainBidi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a [] [] = new float[3][5];
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)
				a[i][j] = 3.5F * (i+j);
		
		for(int i=0; i<a.length; i++) {
			System.out.println();
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		/*int b [][] = new int [4][3];
		int x=3;
		for(int i = b.length-1; i>=0; i--)
		{
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j] = x + i;
				System.out.println(b[i][j]);
			}
		}*/
		/*int imp[][] = {{1,3,5,7},{9,11,13,15},{17,19,21,23}};
		for(int i = 0; i<imp.length; i++)
		{
			for(int j=0; j<imp[i].length; j++)
			{
				System.out.println(imp[i][j]);
			}
		}*/
		/*char c [] [] = new char[2][];
		for(int i=0; i<c.length; i++)
		{
			c[i] = new char[i+5];
			for(int j=0; j<c[i].length; j++)
			{
				c[i][j] = '$';
				//System.out.println(c[i][j]);
			}
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.println();
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
		}*/
		
	}

}
