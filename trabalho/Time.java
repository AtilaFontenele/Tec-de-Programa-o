package trabalho;
import java.util.*;
public class Time {
	private int id;
	private String time;
	private ArrayList<Goleiro> goleiros;
	public Time(int id,String time) {
		this.id=id;
		this.time=time;	
		this.goleiros= new ArrayList<Goleiro>();
	}
	public void addGoleiro(Goleiro goleiro) {
		goleiros.add(goleiro);
	}
	
	public ArrayList<Goleiro> getGoleiros(){
		return goleiros;
	}
}
