package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test2() {
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test3() {
		int [] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test4() {
		int [] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}

	@Test
	public void doesElementExist_Test1()
	{
		int[] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test2()
	{
		int[] arr = {1,2,3,4,5};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test3()
	{
		int[] arr = null;
		int iValue = 1;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}

	@Test
	public void ContainsZero_Test1()
	{
		int[][] puzzle = null;
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.ContainsZero());
	}

	@Test
	public void ContainsZero_Test2()
	{
		int[][] puzzle = {{1,2,3},{2,1,3},{3,2,0}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertTrue(lq.ContainsZero());
	}
	
	@Test
	public void ContainsZero_Test3()
	{
		int[][] puzzle = {{1,2,3},{2,1,3},{3,2,1}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.ContainsZero());
	}

	@Test
	public void getCol_Test1()
	{
		int[][] puzzle = null;
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertTrue(lq.getCol(2)==null);
	}
	
	@Test
	public void getCol_Test2()
	{
		int[][] puzzle = {{0,1,2,3},{1,2,3,4},{3,4,1,2},{4,1,3,2}};
		LatinSquare lq = new LatinSquare(puzzle);
		int[] arr = {1,2,4,1};
		assertTrue(Arrays.equals(lq.getCol(1),arr));
	}
	
	@Test
	public void getCol_Test3()
	{
		int[][] puzzle = {{0,1,2,3},{1,2,3,4},{3,4,1,2},{4,1,3,2}};
		LatinSquare lq = new LatinSquare(puzzle);
		int[] arr = {2,3,1,3};
		assertTrue(Arrays.equals(lq.getCol(2),arr));
	}
	
	@Test
	public void getRow_Test1()
	{
		int[][] puzzle = null;
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertTrue(lq.getRow(2)==null);
	}
	
	@Test
	public void getRow_Test2()
	{
		int[][] puzzle = {{0,1,2,3},{1,2,3,4},{3,4,1,2},{4,1,3,2}};
		LatinSquare lq = new LatinSquare(puzzle);
		int[] arr = {1,2,3,4};
		assertTrue(Arrays.equals(lq.getRow(1),arr));
	}
	
	@Test
	public void getRow_Test3()
	{
		int[][] puzzle = {{0,1,2,3},{1,2,3,4},{3,4,1,2},{4,1,3,2}};
		LatinSquare lq = new LatinSquare(puzzle);
		int[] arr = {3,4,1,2};
		assertTrue(Arrays.equals(lq.getRow(2),arr));
	}
	
	@Test
	public void hasAllValues_Test1()
	{
		int[] arr1 = {1,2,3};
		int[] arr2 = null;
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1,arr2));
	}
	
	@Test
	public void hasAllValues_Test2()
	{
		int[] arr1 = null;
		int[] arr2 = null;
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1,arr2));
	}
	
	@Test
	public void hasAllValues_Test3()
	{
		int[] arr1 = null;
		int[] arr2 = {1,2,3};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1,arr2));
	}
	
	@Test
	public void hasAllValues_Test4()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1,arr2));
	}

	@Test
	public void hasAllValues_Test5()
	{
		int[] arr1 = {1,2,3,5};
		int[] arr2 = {1,2,3,4};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1,arr2));
	}
	
	@Test
	public void isLatinSquare_Test1()
	{
		int[][] puzzle = null;
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test2()
	{
		int[][] puzzle = {{1,1,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test3()
	{
		int[][] puzzle = {{1,2,0,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test4()
	{
		int[][] puzzle = {{1,2,3,4},{2,3,4,1},{3,4,1,2},{0,1,2,3}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test5()
	{
		int[][] puzzle = {{1,2,3,4},{0,3,4,1},{3,4,1,2},{4,1,2,3}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test6()
	{
		int[][] puzzle = {{1,2,3,4},{2,0,4,1},{3,4,1,2},{4,1,2,3}};
		LatinSquare lq = new LatinSquare(puzzle);
		
		assertFalse(lq.isLatinSquare());
	}
	
	@Test
	public void isLatinSquare_Test7()
	{
//		int[][] puzzle = {{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		int[][] puzzle = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare lq = new LatinSquare(puzzle);
//		System.out.println(Arrays.toString(lq.getCol(0)));
//		System.out.println(Arrays.toString(lq.getCol(1)));
//		System.out.println(Arrays.toString(lq.getCol(2)));
//		System.out.println(Arrays.toString(lq.getRow(0)));
//		System.out.println(Arrays.toString(lq.getRow(1)));
//		System.out.println(Arrays.toString(lq.getRow(2)));
//		System.out.println(lq.hasDuplicates(lq.getCol(0)));
//		System.out.println(lq.hasDuplicates(lq.getCol(1)));
//		System.out.println(lq.hasDuplicates(lq.getCol(2)));
//		System.out.println(lq.hasDuplicates(lq.getRow(0)));
//		System.out.println(lq.hasDuplicates(lq.getRow(1)));
//		System.out.println(lq.hasDuplicates(lq.getRow(2)));
//		System.out.println(lq.getLatinSquare()==null);
//		System.out.println(lq.getLatinSquare().length);
		
		assertTrue(!lq.isLatinSquare());
	}
}
