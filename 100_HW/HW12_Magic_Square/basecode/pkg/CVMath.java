package pkg;

public class CVMath {
	int num;
	int track;
	public CVMath(){
		num = 0;
		track = 0;
	}
	public void specialSquare(int nums){
		for(int i = 0; i > -1; i++){
			num = num + i;
			if(Math.sqrt(num) % 1 == 0 && num != 0){
				System.out.println(num);
				track++;
			}
			if(track == nums){
				break;
			}
		}
	}
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
}
