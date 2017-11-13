
public class LoneTeen {

	public static void main(String[] args) {

		LoneTeen loneTeen = new LoneTeen();
		loneTeen.loneTeen(21,1);
	}


	public boolean loneTeen(int a, int b) {
		  boolean aTeen = (a >= 13 && a <= 19);
		  boolean bTeen = (b >= 13 && b <= 19);
		  
		  return (aTeen && !bTeen) || (!aTeen && bTeen);

		}
}
