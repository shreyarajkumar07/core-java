class page{
static String pageNames[]={"TittlePages","IndexPages","ChapterPage","ExecisePage","LastPage","NotePage","ContentPage","PicturePage"};
static int PageNumbers[]={1,2,3,4,5,6,7,8};
static float PageRating[]={4.5f,3.5,3.4f,8.3f,7.6f,3.6f,8.6f,8.2f};
public static void getPageDetails(){
	for(int index=0;index<pageNames.length;index++){
		System.out.println("page Name:"+pageNames[index]);
		System.out.println("Page Numbers:"+pageNumbers[index]);
		System.out.println("Page Rating:"+pageRating[index]);
		System.out.println();
		
	}
}
}