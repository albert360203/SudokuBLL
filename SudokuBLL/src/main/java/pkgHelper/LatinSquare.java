package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;

	public LatinSquare()
	{
		
		
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		boolean doesElementExist = false;
		
		if(arr == null)
			return false;
		
		for(int i : arr)
		{
			if(i==iValue)
			{
				doesElementExist = true;
				break;
			}
		}
		return doesElementExist;
	}
	
	
	public boolean ContainsZero()
	{
		if (LatinSquare == null)
			return false;
		
		for(int[] r : LatinSquare)
		{
			if(doesElementExist(r,0))
				return true;
		}
		return false;
	}
	public int[] getCol(int iCol)
	{
		if(LatinSquare == null)
			return null;
		
		int l = LatinSquare.length;
		
		int[] arr = new int[l];
		
		for(int r=0; r<l; r++)
		{
			arr[r]=LatinSquare[r][iCol];
		}
		return arr;
	}
	
	public int[] getRow(int iRow)
	{
		if(LatinSquare == null)
			return null;
		
		return LatinSquare[iRow];
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2)
	{
		if(arr2==null)
			return true;
		for(int x: arr2)
		{
			if(!doesElementExist(arr1,x))
				return false;
		}
		return true;
	}
	
	
	public boolean hasDuplicates(int [] arr)
	{
		if(arr == null)
			return false;
		
		boolean hasDuplicates = false;
		
		int[] tmp = new int[arr.length];
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		Arrays.sort(tmp);
		
		for(int i=0; i<tmp.length-1; i++)
		{
			if(tmp[i] == tmp[i+1])
			{
				hasDuplicates = true;
				break;
			}
		}
		
		return hasDuplicates;
	}
	
	
	public boolean isLatinSquare()
	{
		if(LatinSquare == null)
			return false;
		
		for(int i=0; i<LatinSquare.length; i++)
		{
			if(hasDuplicates(getRow(i)) || hasDuplicates(getCol(i)))
			{
				return false;
			}
		}
		
		for(int r=1; r<LatinSquare.length; r++)
		{
			if(!hasAllValues(getRow(0),getRow(r)))
				return false;
		}
		
		for(int c=1; c<LatinSquare.length; c++)
		{
			if(!hasAllValues(getCol(0),getCol(c)))
				return false;
		}
		
		return true;
		
	}
	

}
