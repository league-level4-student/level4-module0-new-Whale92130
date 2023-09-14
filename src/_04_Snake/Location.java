package _04_Snake;

public class Location {
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	boolean equals(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}
}
