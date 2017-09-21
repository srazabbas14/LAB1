import static org.junit.Assert.*;

import org.junit.Test;

public class scalarTest {

	@Test
	public void test() {
		functions obj=new functions();
		double[][] x= {{1,2},{3,4}}; 
		int s=4; 
		double[][] z= {{4,8},{12,16}}; 
		assertArrayEquals(z,functions.scalar_multiply(x, s));
	}

}
