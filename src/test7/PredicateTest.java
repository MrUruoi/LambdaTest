package test7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	
	private static List<Student2> list = Arrays.asList(
			new Student2("aaa", "m", 80),
			new Student2("bbb", "w", 82),
			new Student2("ccc", "w", 92),
			new Student2("ddd", "w", 90),
			new Student2("eee", "m", 99)
	);
	
	public static double avg(Predicate<Student2> predicate) {
		int count = 0;
		int sum = 0;
		
		for(Student2 s: list) {
			if(predicate.test(s)) {
				count++;
				sum += s.getScore();
			}
		}
		
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		//m avg
		double mAvg = avg(t -> t.getSex().equals("m"));
		System.out.println("mAvg: " + mAvg);
		
		double wAvg = avg(t -> t.getSex().equals("w"));
		System.out.println("mAvg: " + wAvg);
	}

}

class Student2{
	private String name;
	private String sex;
	private int score;
	
	public Student2(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}