import java.util.Scanner;
import java.util.ArrayList;
public class ProgramRunner
	{
		//yay
		static ArrayList<Program>TVshows = new ArrayList<Program>();

		public static void main(String[] args)
			{
				
				createPrograms();
				printList();
				add1Season();
				seperate();
				printList();
				removeLongestNamedShow();
				seperate();
				printList();
				changeFirstShowName();
				seperate();
				printList();

			}
		
		public static void createPrograms()
			{
				Program arrow = new Program("Arrow", "Action", 8);
				Program cloneWars = new Program("Star Wars the Clone Wars", "Cartoon", 7);
				Program outerBanks = new Program("Outer Banks", "Drama", 2);
				Program allAmerican = new Program("All American", "Drama", 3);
				Program familyGuy = new Program("Family Guy", "Comedy", 28);			
				TVshows.add(arrow);
				TVshows.add(cloneWars);
				TVshows.add(outerBanks);
				TVshows.add(allAmerican);				
				TVshows.add(familyGuy);
				
			
			}
		
		public static void printList()
		{
			for (int i = 0; i<TVshows.size(); i++)
				{
					System.out.println("\n" + TVshows.get(i).getTitle());
					System.out.println(TVshows.get(i).getGenre());
					System.out.println(TVshows.get(i).getNumberOfSecondAired());
				}
		}
		
		public static void add1Season()
		{
			for (int i = 0; i<TVshows.size(); i++)
				{
					TVshows.get(i).setNumberOfSecondAired(TVshows.get(i).getNumberOfSecondAired()+1);
				}
		}
		
		public static void removeLongestNamedShow()
		{
			int longestNameShow = -1;
			int longest = 0;
			for (int i = 0; i<TVshows.size(); i++)
				{
					
					
					if(TVshows.get(i).getTitle().length() > longest)
						{
							longest = TVshows.get(i).getTitle().length();
							longestNameShow = i;
						}
				}
			
			TVshows.remove(TVshows.get(longestNameShow));
		}
		
		public static void changeFirstShowName()
		{
			TVshows.get(0).setTitle("Max and Andie");
			
			
		}
		
		
		public static void seperate()
			{
				Scanner userFakeInput = new Scanner(System.in);
				String pause;
				pause = userFakeInput.nextLine();
			}

			

	}
