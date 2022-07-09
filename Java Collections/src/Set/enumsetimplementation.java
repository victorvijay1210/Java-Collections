package Set;

import java.util.EnumSet;
import java.util.Iterator;

public class enumsetimplementation {

	
	
	enum programinglang{
		JAVA,
		PHYTHON,
		CSHARP,
		JS,
		PHP,
		HTML,
		DOTNET
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		
		//To call all the enumset
		EnumSet<programinglang> pg1= EnumSet.allOf(programinglang.class);
		System.out.println(pg1);
		
		//To empty the enumset
	EnumSet<programinglang> pg2=	EnumSet.noneOf(programinglang.class);
	System.out.println(pg2);
	
	//To call particular enumset
	EnumSet<programinglang> pg3= EnumSet.of(programinglang.JS);
	System.out.println(pg3);
	
	//To call the range between enumset
    EnumSet<programinglang>  pg4=EnumSet.range(programinglang.CSHARP, programinglang.HTML);
	System.out.println(pg4);

	//to call multiple enumset
    EnumSet<programinglang>  pg5=EnumSet.of(programinglang.PHYTHON, programinglang.PHP);
	System.out.println(pg5);
	
	//add values
	pg3.addAll(pg5);
	System.out.println(pg3);
	
	//remove values
	pg3.remove(programinglang.JS);
	System.out.println(pg3);
	
	//iterate enumset	
     Iterator<programinglang>it=pg1.iterator();
	
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
	
	}

}
