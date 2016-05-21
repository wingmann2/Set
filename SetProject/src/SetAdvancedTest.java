import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class SetAdvancedTest {

	/**
	 * Create a SetAdvanced without parameters
	 * 
	 * @return
	 * 		New populated SetAdvanced
	 */
	public SetAdvanced createSet() {
		SetAdvanced mySet = new SetAdvanced();
		
		mySet.add("Happy");
		mySet.add("Birthday");
		mySet.add("to");
		mySet.add("me!");
		mySet.add("me!");
		
		return mySet;
	}
	
	/**
	 * Create a SetAdvanced with parameters
	 * 
	 * @param values
	 * 		Items to add to our SetAdvanced
	 * @return
	 * 		New populated SetAdvanced
	 */
	public SetAdvanced createSetWithParameters() {
		List<Object> myList = new ArrayList<>();
		
		myList.add("Happy");
		myList.add("Birthday");
		myList.add("to");
		myList.add("me!");
		myList.add("me!");
		
		return new SetAdvanced(myList);
	}
	
	@Test
	public void test() {
		HashSet<Object> uniqueSet = new HashSet<>();
		SetAdvanced testSet = createSet();
		
		if (testSet.getSet() != null) {
			// Verify our testSet items are unique - definition of set
			for (Object value : testSet.getSet().keySet()) {
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
		SetAdvanced testSet = createSetWithParameters();
		
		if (testSet.getSet() != null) {
			// Verify our testSet items are unique - definition of set
			for (Object value : testSet.getSet().keySet()) {
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
