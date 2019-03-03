package repaso;

import java.util.Arrays;

public class MatrizIdentidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] bidi = new int [3][3];
		for(int i=0; i<bidi.length; i++)
		{
			for(int j=0; j<bidi[i].length; j++)
			{
				if(i == j)
				{
					bidi[i][j] = 1;
				}
				else
				{
					bidi[i][j] = 0;
				}
			}
		}
		for(int i=0; i<bidi.length; i++)
		{
			System.out.println(Arrays.toString(bidi[i]));
		}

	}

}
