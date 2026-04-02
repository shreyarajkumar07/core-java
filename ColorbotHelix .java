class ColorbotHelix{
//static variables
static boolean isSwitch;
static int maxTemperature=21;
static int minTemperature=12;
static int currentTemperature=23;
//static method
public static boolean onOroff(){
	System.out.println("onOroff method started");
	if(isSwitch==false){
		isSwitch=true;
		System.out.println("ColorbotHelix is ON:"+isSwitch);
		}
		else{
			isSwitch=false;
			System.out.println("ColorbotHelix is OFF:"+isSwitch);
		}
		System.out.println("onOroff method ended");
		return isSwitch;
}
} 