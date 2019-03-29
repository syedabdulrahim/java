import java.util.Scanner;
public class first {

	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		Library lb[]=new Library[4];
	
		for(int i=0;i<lb.length;i++) {
			
			 int id=sc.nextInt();sc.nextLine();	
			 String name=sc.nextLine();
			 String address=sc.nextLine();
			 
			 lb[i]=new Library(id,name,address);
			
		}
		
		 int ans=searchLibraryById(lb, 4);
		 System.out.println(ans);
		
	//	System.out.println(lb[0].getId());

	}

	
	
	
	public static int  searchLibraryById(Library[] lbs,int key) {
		
		int ans=-1;
		for(int i=0;i<lbs.length;i++) {
			
			if(lbs[i].getId()==key) {
				
				ans=i+1;
			}
			
		}
		
		return ans;
	}
}


class Library{
	
	
	
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Library(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
	
	
}
