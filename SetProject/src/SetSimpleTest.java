
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class SetSimpleTest {
	
	/**
	 * Create a SetSimple without parameters
	 * 
	 * @return
	 * 		New populated SetSimple
	 */
	public SetSimple createSet() {
		SetSimple mySet = new SetSimple();
		
		mySet.add("Happy");
		mySet.add("Birthday");
		mySet.add("to");
		mySet.add("me!");
		mySet.add("me!");
		
		return mySet;
	}
	
	/**
	 * Create a SetSimple with parameters
	 * 
	 * @param values
	 * 		Items to add to our SetSimple
	 * @return
	 * 		New populated SetSimple
	 */
	public SetSimple createSetWithParameters() {
		List<Object> myList = new ArrayList<>();
		
		myList.add("Happy");
		myList.add("Birthday");
		myList.add("to");
		myList.add("me!");
		myList.add("me!");
		
		return new SetSimple(myList);
	}

	@Test
	public void test() {
		HashSet<Object> uniqueSet = new HashSet<>();
		SetSimple testSet = createSet();
		
		if (testSet != null) {
			// Verify our testSet items are unique - definition of set
			for (Object value : testSet.getSet()) {
				if (!uniqueSet.contains(value)) {
					uniqueSet.add(value);
				} else {
					fail("Test - Set contains duplicates");
				}
			}
			
			// Console view
			testSet.print();
			
			// Verify we have same amount of unique items
			assertEquals(testSet.getSize(), uniqueSet.size());
		} else {
			fail("Test - Set was null");
		}
	}
	
	@Test
	public void testParameters() {
		HashSet<Object> uniqueSet = new HashSet<>();
		SetSimple testSet = createSetWithParameters();
		
		if (testSet != null) {
			// Verify our testSet items are unique - definition of set
			for (Object value : testSet.getSet()) {
				if (!uniqueSet.contains(value)) {
					uniqueSet.add(value);
				} else {
					fail("TestParameters - Set with parameters contains duplicates");
				}
			}
			
			// Console view
			testSet.print();
			
			// Verify we have same amount of unique items
			assertEquals(testSet.getSize(), uniqueSet.size());
		} else {
			fail("TestParameters - Set with parameters was null");
		}
	}
}
