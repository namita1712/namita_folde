
public class Study1 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		String sample= "I will eat 2 burgers 23 fries & 1.25 cokes l8r";
		int count=0;
		int i=0;
		for (i=0;i<sample.length();i++)
		{
			if(Character.isDigit(sample.charAt(i)))
			{
				count ++;
				System.out.println("count is"+count);
			}
		}
		return count;
	}
	}


