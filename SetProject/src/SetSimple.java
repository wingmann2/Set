import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SetSimple class is a custom implementation of a Set in Java
 * Note: All efforts were guided to not use prior Map or Set implementations
 * 
 * @author Alex
 *
 */
public class SetSimple {
	
	/**
	 * SetSimple is backed by a list of managed objects
	 */
	private List<Object> set = new ArrayList<>();
	
	/**
	 * SetSimple class constructor
	 */
	public SetSimple() {
	}
	
	/**
	 * SetSimple class constructor
	 * With given list of values to add
	 * 
	 * @param values
	 * 		Values to add
	 */
	public SetSimple(List<Object> values) {
		// Check if empty
		if (values.isEmpty()) {
			return;
		}
		
		// Iterate through the values to add4
		for (Object value : values) {
			this.add(value);
		}
	}
	
	/**
	 * Add object to SetSimple
	 * 
	 * @param value
	 * 		Object to add
	 */
	public void add(Object value) {
		// Check if proposed value to add is null
		if (value == null) {
			// Reject null values to add
			return;
		}
		// Check for uniqueness
		if (!this.set.contains(value)) {
			this.set.add(value);
		}
	}
	
	/**
	 * Does SetSimple contain this value
	 * 
	 * @param value
	 * 		Value to verify if contains
	 * @return
	 * 		True if SetSimple contains value
	 */
	public boolean contains(Object value) {
		// Check if empty
		if (this.set.isEmpty()) {
			return false;
		}
		
		return this.set.contains(value);
	}
	
	/**
	 * Delete object from SetSimple
	 * 
	 * @param value
	 * 		Object to delete
	 */
	public void delete(Object value) {
		// Check if empty
		if (this.set.isEmpty()) {
			return;
		}
		
		// Remove if set contains value
		if (this.set.contains(value)) {
			this.set.remove(value);
		}
	}
	
	/**
	 * Delete all objects from SetSimple
	 */
	public void deleteAll() {
		// Leverage list function to clear
		this.set.clear();
	}
	
	/**
	 * Gets the SetSimple
	 * 
	 * @return
	 * 		Unmodifiable SetSimple
	 */
	public List<Object> getSet() {
		// Pass back an unmodifiable version of our set
		return Collections.unmodifiableList(this.set);
	}
	
	/**
	 * Gets the size of the SetSimple
	 * 
	 * @return
	 * 		Size of the SetSimple
	 */
	public int getSize() {
		return this.set.size();
	}
	
	/**
	 * Print out SetSimple to console
	 */
	public void print() {
		// Check for empty set
		if (this.set.isEmpty()) {
			return;
		}
		
		// Print each value in set
		for (Object value : this.set) {
			System.out.print(value + " ");
		}
		
		// Extra line when done for prettiness
		System.out.println();
	}

}
