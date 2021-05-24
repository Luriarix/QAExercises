package challenges;

public class BottlesOfBeer {
	
	public static void bottlesOfBeerOnTheWall() {
		int bottlesOfBeerleftOnTheWall = 99;
		
		do {
			System.out.println(bottlesOfBeerleftOnTheWall + " bottles of beer on the wall, " + bottlesOfBeerleftOnTheWall + " bottles of beer.\r\nTake one down and pass it around, " + bottlesFell(bottlesOfBeerleftOnTheWall) + " bottles of beer on the wall.\r\n");
			bottlesOfBeerleftOnTheWall = bottlesFell(bottlesOfBeerleftOnTheWall);
		} while (bottlesOfBeerleftOnTheWall > 0);
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.\r\nGo to the store and buy some more, 99 bottles of beer on the wall.\r\n");
	}
	
	public static int bottlesFell(int bottlesOnTheWall) {
		return bottlesOnTheWall - 1;
	}
}
