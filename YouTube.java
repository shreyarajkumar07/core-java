class YouTube{

    public String search(String movieName){
        System.out.println("Invoking search By Movie Name :"+movieName);
        String message=null;

        if(movieName!=null){
            message="searching Movie Name is Avalable :"+movieName;
        }
        return message;

    }

    public String search(String movieName,String hero){
        System.out.println("Invoking search by movieName : "+movieName+" hero : "+hero);
        String message=null;
        if(movieName!=null && hero !=null ){
            message="searching movieName is available: "+movieName+"and hero: "+hero;
        }
        return message;
    }

    public boolean login(String userName,String psw){
        System.out.println("invoking login using userName:"+userName+"and password:"+psw);
        String regUsername="Shreyarajkumar";
        String regPsw="abc@123";
        boolean isLogin;
        if(userName==regUsername && psw==regPsw){
            isLogin=true;
        }else{
            isLogin=false;
        }
        return isLogin;
    }

    public  String login(String email,String psw,String confirmPsw){
        System.out.println("invoking login using userName:"+email+"and password:"+psw);
        String regEmail="shreyarajkumar746.com";
        String regPsw="abc@123";
       String isLogin;
        if(email==regEmail && psw==regPsw){
            isLogin="login success";
        }else{
            isLogin="login failed";
        }
        return isLogin;
    }
}