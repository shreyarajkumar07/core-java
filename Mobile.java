class Mobile
{
    
    static int  MobilePrice[] = {
        15000, 18000, 20000, 22000, 25000,
        27000, 30000, 32000, 35000, 38000
    };

    
    static float  MobileScreenSize[] = {
        32.0f, 40.0f, 42.5f, 43.0f, 50.0f,
        55.0f, 58.0f, 60.0f, 65.0f, 70.0f
    };

    
    static String  MobileBrandName[]={
	    "Oppo","Redmi","Poco","Iphone","Pixel",
	    "Nokia","OnePlus","Iphone17","Oppo17","RedmiNote5"
	};

    
    static short  MobileWarrantyMonths[] = {
        12, 12, 24, 24, 36,
        36, 12, 24, 36, 12
    };
	
public static void get MobileDetails()
{
for(int index=0;index< mobilePrice.length;index++)
{
System.out.println(" Mobile Price:"+ mobilePrice[index]);
System.out.println(" Mobile Screen Size:"+ mobileScreenSize[index]);
System.out.println(" Mobile Brand:"+ mobileBrandName[index]);
System.out.println(" Mobile Warranty Months:"+ mobileWarrantyMonths[index]);
System.out.println("-----------------------------------");
}
}
}