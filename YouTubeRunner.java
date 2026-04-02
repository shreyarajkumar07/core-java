class YouTubeRunner{

    public static void main(String []search){

        YouTube tube=new YouTube();
        
        String msg=tube.search("googly","Yash");
        System.out.println(msg);

        boolean login=tube.login("Shreyarajkumar","abc@123");
        System.out.println(login);
        
        String login2=tube.login("shreyarajkumar746.com","abc@123","abc");
        System.out.println(login2);

    }
}