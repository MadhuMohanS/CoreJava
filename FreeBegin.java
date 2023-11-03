class FreeBegin{
String company;
	String role;
	double salary;
	int noOfOpenings;
	String requiredSkills;
	int noOfApplications;
	String advertised;
	int experience;
	int noOfRounds;
	int noOfShortlisted;
	int noOfReference;
	String type;
	public static void main(String args[]){
		System.out.println("starting main in FreeBegin");
		Placement placement=new Placement("tcs","assistant",25000,50,"java,advance java",1000,"web site",2,3,200,100,"online");
		placement.displayInfo();
		Placement placement1=new Placement("tcs","data analytcs",30000,60,"python",1000,"web site",0,3,100,50,"online");
		placement1.displayInfo();
		Placement placement2=new Placement("accenture","data engineer",40000,60,"python",2000,"web site,online",2,3,200,100,"ofline");
		placement2.displayInfo();
		Placement placement3=new Placement("accenture","content designer",25000,100,"java,advance java,web content",2000,"web site",4,3,200,100,"online");
		placement3.displayInfo();
		Placement placement4=new Placement("cognizant","java developer",50000,80,"java,advance java,springboot",2000,"web site",2,3,200,100,"online");
		placement4.displayInfo();
		Placement placement5=new Placement("tcs","python developer",30000,70,"python,data visulaization",2000,"web site",2,3,200,100,"online");
		placement5.displayInfo();
		Placement placement6=new Placement("tcs","assistant",25000,50,"java,advance java",1000,"web site",2,3,200,100,"online");
		placement6.displayInfo();
		Placement placement7=new Placement("tcs","data analytcs",30000,60,"python",1000,"web site",0,3,100,50,"online");
		placement7.displayInfo();
		Placement placement8=new Placement("accenture","data engineer",40000,60,"python",2000,"web site,online",2,3,200,100,"ofline");
		placement8.displayInfo();
		Placement placement9=new Placement("accenture","content designer",25000,100,"java,advance java,web content",2000,"web site",4,3,200,100,"online");
		placement9.displayInfo();
		Placement placement10=new Placement("cognizant","java developer",50000,80,"java,advance java,springboot",2000,"web site",2,3,200,100,"online");
		placement10.displayInfo();
		Placement placement11=new Placement("tcs","python developer",30000,70,"python,data visulaization",2000,"web site",2,3,200,100,"online");
		placement11.displayInfo();
		System.out.println("======================================");
		
		Technology technology=new Technology(2,2,"html,css","Java full stack","notepad++","laptop","minimum 4gb","mark","best",3,"x-workz","omkar");
		technology.displayInfo();
		Technology technology1=new Technology(4,3,"html,css,javascript","Java full stack","visual studio code","laptop","minimum 4gb","anthony","best",3,"x-workz","omkar");
		technology1.displayInfo();
		Technology technology2=new Technology(3,2,"html,css,python","python full stack","spider","laptop","minimum 8gb","ostier","good",3,"jspider","ganesh");
		technology2.displayInfo();
		Technology technology3=new Technology(2,3,"java","Java","notepad++","laptop","minimum 4gb","ogle","best",1,"x-workz","omkar");
		technology3.displayInfo();
		Technology technology4=new Technology(4,2,"html,css,javascript,sql,servlet","Java full stack","notepad++","laptop","minimum 4gb","mark","best",3,"x-workz","omkar");
		technology4.displayInfo();
		Technology technology5=new Technology(2,2,"python","data science","eclipse","laptop","minimum 8gb","mark","best",3,"xlr","vignesh");
		technology5.displayInfo();
		Technology technology6=new Technology(1,3,"data analytics","data analytics","eclipse","laptop","minimum 8gb","oglie","best",2,"besant","ravinder");
		technology6.displayInfo();
		Technology technology7=new Technology(3,2,"html,css,python","python full stack","spider","laptop","minimum 8gb","ostier","good",3,"jspider","ganesh");
		technology7.displayInfo();
		Technology technology8=new Technology(2,3,"java","Java","notepad++","laptop","minimum 4gb","ogle","best",1,"x-workz","omkar");
		technology8.displayInfo();
		Technology technology9=new Technology(4,2,"html,css,javascript,sql,servlet","Java full stack","notepad++","laptop","minimum 4gb","mark","best",3,"x-workz","omkar");
		technology9.displayInfo();
		Technology technology10=new Technology(2,2,"python","data science","eclipse","laptop","minimum 8gb","mark","best",3,"xlr","vignesh");
		technology10.displayInfo();
		Technology technology11=new Technology(1,3,"data analytics","data analytics","eclipse","laptop","minimum 8gb","oglie","best",2,"besant","ravinder");
		technology11.displayInfo();
		
		System.out.println("======================================");
		
		Free free=new Free("java","Because we are csr students","only for csr students");
		free.displayInfo();
		Free free1=new Free("html","Because we are csr students","only for csr students");
		free1.displayInfo();
		Free free2=new Free("css","paid 5k","no");
		free2.displayInfo();
		Free free3=new Free("js","only for 2 months","only for csr students");
		free3.displayInfo();
		Free free4=new Free("jpa","Because we are csr students","only for csr students");
		free4.displayInfo();
		Free free5=new Free("mvc","Because we are csr students","only for csr students");
		free5.displayInfo();
		Free free6=new Free("jquery","no free paid 4k","no");
		free6.displayInfo();
		Free free7=new Free("bootstrap","no free paid 5k","no");
		free7.displayInfo();
		Free free8=new Free("js","only for 2 months","only for csr students");
		free8.displayInfo();
		Free free9=new Free("ajax","no free paid 4k","no");
		free9.displayInfo();
		Free free10=new Free("jdbc","Because we are csr students","only for csr students");
		free10.displayInfo();
		Free free11=new Free("servlet","Because we are csr students","only for csr students");
		free11.displayInfo();
		
		System.out.println("======================================");
		
		Month month=new Month("january",31,8,2);
		month.displayInfo();
		Month month1=new Month("february",28,6,3);
		month1.displayInfo();
		Month month2=new Month("march",30,8,2);
		month2.displayInfo();
		Month month3=new Month("april",31,8,3);
		month3.displayInfo();
		Month month4=new Month("may",30,8,2);
		month4.displayInfo();
		Month month5=new Month("june",31,8,2);
		month5.displayInfo();
		Month month6=new Month("july",30,8,4);
		month6.displayInfo();
		Month month7=new Month("august",31,8,6);
		month7.displayInfo();
		Month month8=new Month("september",30,8,2);
		month8.displayInfo();
		Month month9=new Month("october",31,8,2);
		month9.displayInfo();
		Month month10=new Month("november",30,8,2);
		month10.displayInfo();
		Month month11=new Month("june",31,8,6);
		month11.displayInfo();
		
		System.out.println("======================================");
		
		Course course=new Course("java full stack",5,"xworkz",25000,"btm","omkar",2);
	    course.displayInfo();
		Course course1=new Course("python full stack",5,"xworkz",25000,"btm","abhishek",2);
		course1.displayInfo();
		Course course2=new Course("java full stack",5,"xworkz",20000,"jp nagar","Suhas",3);
		course2.displayInfo();
		Course course3=new Course("java",5,"xworkz",25000,"btm","omkar",2);
		course3.displayInfo();
		Course course4=new Course("mern",5,"jspider",30000,"btm","omkar",2);
		course4.displayInfo();
		Course course5=new Course("data science",6,"qspider",30000,"jayanagar","amulya",3);
		course5.displayInfo();
		Course course6=new Course("web development",5,"xworkz",25000,"btm","omkar",2);
		course6.displayInfo();
		Course course7=new Course("java full stack",5,"xworkz",25000,"banashanakri","omkar",2);
		course7.displayInfo();
		Course course8=new Course("data science",6,"qspider",30000,"btm","amulya",3);
		course8.displayInfo();
		Course course9=new Course("data science",6,"qspider",30000,"rajaji nagar","amulya",3);
		course9.displayInfo();
		Course course10=new Course("mern",5,"jspider",30000,"btm","omkar",2);
		course10.displayInfo();
		Course course11=new Course("java full stack",5,"xworkz",20000,"btm","Suhas",3);
		course11.displayInfo();
		
		System.out.println("======================================");
		
		
		
		System.out.println("ending main in FreeBegin");
		
	}
}