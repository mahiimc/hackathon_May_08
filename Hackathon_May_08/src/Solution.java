import java.util.Scanner;

class Player {
	private int playerId;
	private String skill;
	private String level;
	private int points;
	
	public Player() {
		
	}

	public Player(int playerId, String skill, String level, int points) {
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
public class Solution {
	public static void main(String[] args) {
		final Scanner in  = new Scanner(System.in);
		Player []p = new Player[4];
		for(int i=0 ;i<4;i++) {
			int playerId = in.nextInt();
			in.nextLine();
			String skill = in.nextLine();
			String level = in.nextLine();
			int points = in.nextInt();
			in.nextLine();
			p[i]= new Player(playerId,skill,level,points);
	}
		
	String skill = in.nextLine();
	String level = in.nextLine();
	in.close();
	int sum = findPointsForGivenSkill(p,skill);
	if(sum > 0) {
		System.out.println(sum);
	}
	else {
		System.out.println("The given Skill is not available");
	}
	Player pl = getPlayerBasedOnLevel(p,skill,level);
	if( pl != null) {
	
		System.out.println(pl.getPlayerId());
	}
	else {
		System.out.println("No player is available with specified level, skill and eligibility points");
	}
		

	}
	public static int findPointsForGivenSkill(Player arr[] , String skill) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getSkill().equalsIgnoreCase(skill)) {
				sum+=arr[i].getPoints();
			}
		}
		
		return sum;
	}
	public static Player getPlayerBasedOnLevel(Player [] arr , String skill, String level) {
		Player player = new Player();
		player = null;
		for(int i=0 ; i< arr.length;i++) {
			if(arr[i].getLevel().equalsIgnoreCase(level) && arr[i].getSkill().equalsIgnoreCase(skill) &&
					arr[i].getPoints()>20) {
				player=arr[i];
			}
		}
		return player;
	}
}
