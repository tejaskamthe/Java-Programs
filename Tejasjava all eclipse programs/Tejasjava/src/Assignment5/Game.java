package Assignment5;

class GameDemo {
	GameDemo() {
	System.out.println("This Is The Demo of Game Class..");
	}
	}
	class BoardGame extends GameDemo{
		BoardGame() {
		System.out.println("Board Game is Very Interesting to Play..");
		}
		}
	class Chess extends BoardGame{
		Chess() {
			System.out.println("Chess Is Very Mindfull Game And Also Indoor Game..");
		}
	}
	class Game extends Chess{
		Game() {
			System.out.println("This Is The Chlid Class Of GameDeo,BoardGame & Chess classes");
		}
	
	public static void main(String[] args) {
		Game g=new Game();
		//g.Games();
	}
	
}
