class SonyTVRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean TVstatus=SonyTV.onORoff();
	  System.out.println("main method TV status:"+TVstatus);
	  System.out.println("-------second time method call------");
	  SonyTV.onORoff();
	  System.out.println("-------third time method call--------");
	  SonyTV.onORoff();
	  System.out.println("-------fourth time method call--------");
	  SonyTV.onORoff();
    } 
}