package _01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class mapTest {
	private static map MAP=new map();
	int flag=0;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	void testNeighbor_01() {
		if(MAP.neighbor(0, 0)==0)
			flag = 1;
		else
			flag = 0;
		assertEquals(1,flag);
	}
	//neighbor“ª∞„≤‚ ‘	
	@Test
	void testNeighbor_02() {
		if(MAP.neighbor(3, 9)==1)
			flag = 1;
		else
			flag = 0;
		assertEquals(1,flag);
	}
	//neighbor“ª∞„≤‚ ‘
	@Test
	void testNeighbor_03() {
		if(MAP.neighbor(4, 10)==3)
			flag = 1;
		else
			flag = 0;
		assertEquals(1,flag);
	}

	@Test
	void testUpdate_map() {
		MAP.update_map();
		if(MAP.new_map[0][0]==0&&MAP.new_map[4][10]==1&&MAP.new_map[7][11]==0)
			flag = 1;
		else
			flag = 0;
		assertEquals(1,flag);
	}

	@Test
	void testCopy_map() {
		MAP.copy_map();
		flag = 1;
		for(int i=0;i<41;i++)
			for(int j=0;j<36;j++)
				if(MAP.map[i][j]!=MAP.new_map[i][j])
					flag = 0;
		assertEquals(1,flag);	
	}

}
