package baseball2;

import java.util.*;

// ¾ß±¸

class Base {
	String name;
	int win;
	int draw;
	int loss;
	float rate; // ½Â·ü (win / (win + loss)

	Base(String name) {
		this.name = name;
		win = 0;
		draw = 0;
		loss = 0;
		rate = 0.0f;
	}

	void rating() {
		rate = (win / ((float) win + loss));
	}

	int getScore() {
		return win + draw + loss;
	}

}

class Game {
	private LinkedList<Base> Team;
	private String year;
	private float gb1;
	private float gb2;

	Game(String year) {
		this.year = year;
	}
	
	void start(LinkedList<Base> team) {
		this.Team = team;
		int random;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < Team.size() - 1; j++) {
				for (int k = j + 1; k < Team.size(); k++) {
					random = (int) (Math.random() * 3);
					Base teamA = Team.get(j);
					Base teamB = Team.get(k);
					if (random == 0) {
						teamA.draw++;
						teamB.draw++;
					} else if (random == 1) {
						teamA.win++;
						teamB.loss++;
					} else {
						teamA.loss++;
						teamB.win++;
					}
				}
			}
		}
	}

	void show() {
		// ½Â·ü °è»ê
		for (Base item : Team) {
			item.rating();
		}

		Collections.sort(Team, new Comparator<Base>() {
			public int compare(Base b1, Base b2) {
				if (b1.rate < b2.rate)
					return 1;
				else
					return -1;
			}
		});
		
		System.out.println("---------------------------game"+ year +"---------------------------");
		System.out.println("ÆÀ¸í\tÀüÀû\t½Â\t¹«\tÆÐ\t½Â·ü\t½ÂÂ÷1\t½ÂÂ÷2");
		System.out.println("------------------------------------------------------------");
		
		for (int i = 0; i < Team.size(); i++) {
			System.out.print(
					Team.get(i).name + "\t" + Team.get(i).getScore() + "\t" + Team.get(i).win + "\t" + Team.get(i).draw
							+ "\t" + Team.get(i).loss + "\t" + String.format("%.2f", Team.get(i).rate) + "\t");
			if (i - 1 >= 0) {
				System.out.println(getGB(Team.get(i - 1), Team.get(i)) + "\t" + getGB(Team.get(0), Team.get(i)));
			} else {
				System.out.println("0.0\t0.0");
			}
		}

	}

	float getGB(Base b1, Base b2) {
		return (b1.win - b2.win) + (((float) (b1.draw - b2.draw)) / 2);
	}

}

public class Main {
	public static void main(String[] args) {
		LinkedList<Game> Year = new LinkedList<Game>();
		
		LinkedList<Base> Team98 = new LinkedList();
		LinkedList<Base> Team99 = new LinkedList();
		LinkedList<Base> Team00 = new LinkedList();
		LinkedList<Base> Team01 = new LinkedList();

		Team98.add(new Base("·Ôµ¥"));
		Team98.add(new Base("»ï¼º"));
		Team98.add(new Base("ÇÑÈ­"));
		Team98.add(new Base("¿¤Áö"));

		Game game98 = new Game("98");
		game98.start(Team98);
		
		Team99.add(new Base("·Ôµ¥"));
		Team99.add(new Base("»ï¼º"));
		Team99.add(new Base("ÇÑÈ­"));
		Team99.add(new Base("¿¤Áö"));

		Game game99 = new Game("99");
		game99.start(Team99);

		Team00.add(new Base("·Ôµ¥"));
		Team00.add(new Base("»ï¼º"));
		Team00.add(new Base("ÇÑÈ­"));
		Team00.add(new Base("¿¤Áö"));
		
		Game game00 = new Game("00");
		game00.start(Team00);
		
		Team01.add(new Base("·Ôµ¥"));
		Team01.add(new Base("»ï¼º"));
		Team01.add(new Base("ÇÑÈ­"));
		Team01.add(new Base("¿¤Áö"));
		
		Game game01 = new Game("01");
		game01.start(Team01);

		Year.add(game98);
		Year.add(game99);
		Year.add(game00);
		Year.add(game01);
		
		for(Game list : Year) {
			list.show();
		}
	}
}

