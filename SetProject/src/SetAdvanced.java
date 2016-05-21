import java.util.LinkedHashMap;
import java.util.List;

/**
 * SetAdvanced class is a custom implementation of a Set in Java
 * Note: All efforts were guided to use prior Map or Set implementations
 * 
 * @author Alex
 *
 */
public class SetAdvanced {
	
	/**
	 * SetAdvanced is backed by a LinkedHashmap of managed objects
	 */
	private LinkedHashMap<Object,Object> set = new LinkedHashMap<>();
	
	/**
	 * SetAdvanced class constructor
	 */
	public SetAdvanced() {
	}
	
	/**
	 * SetAdvanced class constructor
	 * With given list of values to add
	 * 
	 * @param values
	 * 		Values to add
	 */
	public SetAdvanced(List<Object> values) {
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
	 * Add object to SetAdvanced
	 * 
	 * @param value
	 * 		Object to add
	 */
	public void add(Object value) {
		// Check for uniqueness
		if (!this.set.containsKey(value)) {
			// Add unique key with placeholder object value
			this.set.put(value, new Object());
		}
	}
	
	/**
	 * Does SetAdvanced contain this value
	 * 
	 * @param value
	 * 		Value to verify if contains
	 * @return
	 * 		True if SetAdvanced contains value
	 */
	public boolean contains(Object value) {
		// Check if empty
		if (this.set.isEmpty()) {
			return false;
		}
		
		return this.set.containsKey(value);
	}
	
	/**
	 * Delete object from SetAdvanced
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
		if (this.set.containsKey(value)) {
			this.set.remove(value);
		}
	}
	
	/**
	 * Delete all objects from SetAdvanced
	 */
	public void deleteAll() {
		// Leverage LinkedHashmap function to clear
		this.set.clear();
	}
	
	/**
	 * Gets the SetAdvanced
	 * 
	 * @return
	 * 		Unmodifiable SetAdvanced
	 */
	public LinkedHashMap<Object,Object> getSet() {
		// Pass back an unmodifiable version of our set
		return this.set;
	}
	
	/**
	 * Gets the size of the SetAdvanced
	 * 
	 * @return
	 * 		Size of the SetAdvanced
	 */
	public int getSize() {
		return this.set.size();
	}
	
	/**
	 * Print out SetAdvanced to console
	 */
	public void print() {
		// Check if set is empty
		if (this.set.isEmpty()) {
			return;
		}
		
		// Print each key - ignore placeholder value
		for (Object value : this.set.keySet()) {
			System.out.print(value + " ");
		}
		
		// Extra line when done for prettiness
		System.out.println();
	}
}
