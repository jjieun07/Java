package baseball;

import java.util.*;

// ¾ß±¸

class Base {
	String name;
	int score;
	int win;
	int draw;
	int loss;
	float rate; // ½Â·ü (win / (win + loss)
	float gb1;
	float gb2;

	Base(String name) {
		this.name = name;
		win = 0;
		draw = 0;
		loss = 0;
		rate = 0.0f;
		gb1 = 0.0f;
		gb2 = 0.0f;
	}

	void rating() {
		rate = (win / ((float) win + loss));
	}

	int getScore() {
		score = win + draw + loss;
		return score;
	}

	void print() {
		System.out.println(name + "\t" + getScore() + "\t" + win + "\t" + draw + "\t" + loss + "\t"
				+ String.format("%.2f", rate) + "\t" + gb1 + "\t" + gb2);
	}

}

public class Main {
	public static void main(String[] args) {
		// LinkedList<LinkedList<Base>> Year = new LinkedList<LinkedList<Base>>();

		LinkedList<Base> Team = new LinkedList();

		Team.add(new Base("·Ôµ¥"));
		Team.add(new Base("»ï¼º"));
		Team.add(new Base("ÇÑÈ­"));
		Team.add(new Base("¿¤Áö"));

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

		for (int i = 1; i < Team.size(); i++) {
			Base TeamA = Team.get(i - 1);
			Base TeamB = Team.get(i);

			TeamB.gb1 = (TeamA.win - TeamB.win) + (((float) (TeamA.draw - TeamB.draw)) / 2);
		}

		for (int i = 0; i < Team.size(); i++) {
			Base TeamA = Team.get(0);
			Base TeamB = Team.get(i);

			TeamB.gb2 = (TeamA.win - TeamB.win) + (((float) (TeamA.draw - TeamB.draw)) / 2);
		}

		System.out.println("---------------------------game---------------------------");
		System.out.println("ÆÀ¸í\tÀüÀû\t½Â\t¹«\tÆÐ\t½Â·ü\t½ÂÂ÷1\t½ÂÂ÷2");
		System.out.println("------------------------------------------------------------");

		for (Base item : Team) {
			item.print();

		}
	}

}
