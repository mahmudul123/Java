/**
 * 
 */
package HW;

/**
 * @author mahmudulalam
 *
 */
public class One_Two_Three_dimensional_arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//One dimensional_array
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}
		
		//This is a two dimensional_array
		
		int secondarray[][]= {{10,20,30,40,50},{2,3,4,5,6,7},{34,5,6,7,8,9}};
			for(int i=0; i<=secondarray.length;i++) {
				System.out.println(secondarray[i][i]);
			}
		
		System.out.println(secondarray[0][0]);
		
		//Three dimensional_array
		
		int thirdarray[][][]= {{{1,2,3,4},{4,5,6,7}},{{9,8,9},{10,11,12,13,14}}};
		System.out.println(thirdarray[0][0][0]);
		
	}
	
	
	

}
