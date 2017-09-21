import static org.junit.Assert.*;

import org.junit.Test;

public class inverseTest {

	@Test
	public void test() {
		functions obj=new functions();
		double[][] x= {{1,0},{0,1}}; 
		double[][] z= {{1,0},{0,1}}; 
		assertArrayEquals(z,functions.inverse(x));
	}

}
