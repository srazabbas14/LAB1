import static org.junit.Assert.*;

import org.junit.Test;

public class transposeTest {

	@Test
	public void test() {
		functions obj=new functions();
		double[][] x= {{1,2},{3,4}}; 
		double[][] z= {{1,3},{2,4}}; 
		assertArrayEquals(z,functions.transpose(x));
	}

}
