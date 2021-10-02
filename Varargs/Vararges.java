
//!!!What is Varargs?
//!!!Varargs က String Arrays အစားထိုး Variable ဖြစ်တယ်
//!!!အားသာချက် က String Arrays ကို Declare လုပ်ဖို့မလိုဘဲသုံးနိုင်တယ်



class TestingVararges{

	//How to Use Varargs
	public void loadVararges(String ... values){
		for(String str:values){
			System.out.println(str);
		}
	}
	
	public void loadVararges(String name,String ... values){
		System.out.println(" 1 "+ name);
		for (String str:values ) {
			System.out.println(str);
		}
	}

}

public class Vararges{
	public static void main(String []args){

		TestingVararges testing1=new TestingVararges();
		//###ချို့ယွင်းချက် က 
		//###Varargs မှာ Method OVERLOADING သုံး ရင် String Arrays ကို ဆောက်ပေးရတယ်
		//###အောက်ကလိုသုံးရင်Compile Time Error တက်တယ်
		//testing1.loadVararges("A","B","C");
		//~~~OVERLOADING သုံးချင်ရင် String Arrays ဆောက်ပေးရတယ်
		String s[]={"A","B","C"};
		testing1.loadVararges("Maung",s);
	}

}


