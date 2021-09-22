package dataDrivenFramework;

import java.io.IOException;

import com.utils.LibGlobal;

public class ExcelRead2 extends LibGlobal{

	
	public static void main(String[] args) throws IOException {
		
		//getData methods are in com.utils >> LibGlobal Lib_global file
		System.out.println(getData(2, 0));
		System.out.println(getData(2, 1));
		System.out.println(getData(2, 2));
	}
}
