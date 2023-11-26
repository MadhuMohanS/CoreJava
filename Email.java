class Email{
enum domain{
	NET,ORG,COM;
}
String id;
String fname;
String lastName;

  void showInfo(){
	System.out.println("values of enumeration:");
	for(domain d:domain.values()){
	System.out.println(d);
	}
	System.out.println("id:"+id);
	System.out.println("fname:"+fname);
	System.out.println("lastname :"+lastName);
  }

}
