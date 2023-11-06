class Company{
String name="infosys";
int gstNo=303;
String location="Banglore";

Job job=new Job();

void showInfo(){
	System.out.println("starting showinfo in company");
	System.out.println("name:"+name);
	System.out.println("gst No:"+gstNo);
	System.out.println("location:"+location);
	System.out.println("job role:"+job.role);
	System.out.println("job salary:"+job.salary);
	System.out.println("job type:"+job.type);
	System.out.println("ending showinfo in company");
}

}