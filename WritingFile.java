import java.io.*;
 class WritingFile
 {
   public static void main(String a[])
    {
	   FileOpen fopen=new FileOpen();
	   fopen.openFile();
	  
	}
 }
class FileOpen
{
	void openFile()
	{
		boolean check=false;
		try
		{  
			String  userName=null,userPass=null,strUser="",strPass="";
			File fout=null,fout1=null,fileUser=null,filePass=null;
			//FileWriter fw=null,fw1=null;;
			BufferedReader br=null,br1=null;;
			BufferedWriter bw=null,bw1=null;;
			
			System.out.println("Please Enter Your Name :");
			
			br=new BufferedReader(new InputStreamReader(System.in));
			userName=br.readLine();
			
			System.out.println("Please Enter Your Password :");
			
			br1=new BufferedReader(new InputStreamReader(System.in));
			userPass=br1.readLine();
			fileUser=new File("Username.txt");
			filePass=new File("userpass.txt");
			
			br=new BufferedReader(new FileReader(fileUser));
			br1=new BufferedReader(new FileReader(filePass));

	
			while (strUser!=null&&strPass!=null)
			{
				strUser=br.readLine();
				strPass=br1.readLine();
				if(strUser.equals(userName)&&strPass.equals(userPass))
				{
					
					login();
					check=true;
					break;
				}

			//}
			//System.out.println("Your User Name or Password is Wrong  "+check);
			//else
			else
			{
				System.out.println("Your User Name or Password is Wrong");
				//System.out.println("Do You Want To Create Your Account Press Y or N");
				//System.out.println("create new account :");
				String ch=null;
				System.out.println("Do you want to create new id.......press yes/no...........");
					BufferedReader bu2=new BufferedReader(new InputStreamReader(System.in));
					ch=bu2.readLine();

				while(ch.equals("yes"))
				{
					
				String filename= "Username.txt";
                FileWriter fw = new FileWriter("Username.txt",true);
				PrintWriter pw=new PrintWriter(fw,true);
				System.out.println("Enter New User Name :");
				BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
                String se=bu.readLine();
				fw.write(se);
				fw.close();




				String filename1="userpass.txt";
				FileWriter fw1=new FileWriter("userpass.txt",true);
				PrintWriter pw1=new PrintWriter(fw1,true);
				System.out.println("Enter Your new password :");
				BufferedReader bu1=new BufferedReader(new InputStreamReader(System.in));
				String sw=bu1.readLine();
				pw1.println(sw);
                fw1.close();

				break;
			}
			break;
			}
			}
	}
     catch (Exception e)
     {
		 		System.out.println(e);

     }
	}
	
	void login()
		{
			System.out.println("You Are Logged In");
		}
}
      