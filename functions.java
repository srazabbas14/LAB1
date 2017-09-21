public class functions {
	 public static double[][] addition(double[][] a, double[][] b) {
	        int m = a.length;
	        int n = a[0].length;
	        double[][] f = new double[m][n];
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                f[i][j] = a[i][j] + b[i][j];
	        return f;
	    }
	 
	  public static double[][]subtraction(double[][] a, double[][] b) {
	        int m = a.length;
	        int n = a[0].length;
	        double[][] f = new double[m][n];
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                f[i][j] = a[i][j] - b[i][j];
	        return f;
	        
	    }
	  
	  public static double[][] multiplication(double[][] a, double[][] b) {
	        int m1 = a.length;
	        int n1 = a[0].length;
	        int m2 = b.length;
	        int n2 = b[0].length;
	        if (n1 != m2) throw new RuntimeException("Matrix dimensions are not valid");
	        double[][] f = new double[m1][n2];
	        for (int i = 0; i < m1; i++)
	            for (int j = 0; j < n2; j++)
	                for (int k = 0; k < n1; k++)
	                    f[i][j] += a[i][k] * b[k][j];
	        return f;
	    }
	  
	  public static double[][] scalar_multiply(double[][] a, int scalar) {
		  int n1 = a.length;
		  int n2 = a[0].length;
		  double[][] f = new double[n1][n2];
		  for (int i = 0; i < n1; i++)
	            for (int j = 0; j < n2; j++)
	            {
	                f[i][j] = a[i][j] * scalar;
	              
	            }
		 return f;
	  }
	  
	  public static double[][] transpose(double[][] a) {
	        int m = a.length;
	        int n = a[0].length;
	        double[][] z = new double[n][m];
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                z[j][i] = a[i][j];
	       return z;
	    }
	  
	  public static double[][] inverse(double a[][]) 
	    {
	        int n = a.length;
	        double x[][] = new double[n][n];
	        double b[][] = new double[n][n];
	        int index[] = new int[n];
	        for (int i=0; i<n; ++i) 
	            b[i][i] = 1;
	 
	 
	        gaussian(a, index);
	 
	        for (int i=0; i<n-1; ++i)
	            for (int j=i+1; j<n; ++j)
	                for (int k=0; k<n; ++k)
	                    b[index[j]][k]
	                    	    -= a[index[j]][i]*b[index[i]][k];
	 
	        for (int i=0; i<n; ++i) 
	        {
	            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
	            for (int j=n-2; j>=0; --j) 
	            {
	                x[j][i] = b[index[j]][i];
	                for (int k=j+1; k<n; ++k) 
	                {
	                    x[j][i] -= a[index[j]][k]*x[k][i];
	                }
	                x[j][i] /= a[index[j]][j];
	            }
	        }
	        return x;
	    }
	 
	    public static void gaussian(double a[][], int index[]) 
	    {
	        int n = index.length;
	        double c[] = new double[n];
	 
	        for (int i=0; i<n; ++i) 
	            index[i] = i;
	 
	        for (int i=0; i<n; ++i) 
	        {
	            double c1 = 0;
	            for (int j=0; j<n; ++j) 
	            {
	                double c0 = Math.abs(a[i][j]);
	                if (c0 > c1) c1 = c0;
	            }
	            c[i] = c1;
	        }
	 
	        int k = 0;
	        for (int j=0; j<n-1; ++j) 
	        {
	            double pi1 = 0;
	            for (int i=j; i<n; ++i) 
	            {
	                double pi0 = Math.abs(a[index[i]][j]);
	                pi0 /= c[index[i]];
	                if (pi0 > pi1) 
	                {
	                    pi1 = pi0;
	                    k = i;
	                }
	            }
	 
	            int temp = index[j];
	            index[j] = index[k];
	            index[k] = temp;
	            for (int i=j+1; i<n; ++i) 	
	            {
	                double pj = a[index[i]][j]/a[index[j]][j];
	 
	                a[index[i]][j] = pj;
	 
	                for (int l=j+1; l<n; ++l)
	                    a[index[i]][l] -= pj*a[index[j]][l];
	            }
	        }
	    }	  
}
