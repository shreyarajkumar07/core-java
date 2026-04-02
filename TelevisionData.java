class TelevisionData
{
    
    static int tvPrice[] = {
        15000, 18000, 20000, 22000, 25000,
        27000, 30000, 32000, 35000, 38000
    };

    
    static float tvScreenSize[] = {
        32.0f, 40.0f, 42.5f, 43.0f, 50.0f,
        55.0f, 58.0f, 60.0f, 65.0f, 70.0f
    };

    
    static String tvBrandName[]={
	    "Samsung","LG","Sony","Panasonic","TCL",
	    "Hisense","OnePlus","Bravio","Philips","Sharp"
	};

    
    static short tvWarrantyMonths[] = {
        12, 12, 24, 24, 36,
        36, 12, 24, 36, 12
    };
	
public static void getTVDetails()
{
for(int index=0;index<tvPrice.length;index++)
{
System.out.println("TV Price:"+tvPrice[index]);
System.out.println("TV Screen Size:"+tvScreenSize[index]);
System.out.println("TV Brand:"+tvBrandName[index]);
System.out.println("TV Warranty Months:"+tvWarrantyMonths[index]);
System.out.println("-----------------------------------");
}
}
}