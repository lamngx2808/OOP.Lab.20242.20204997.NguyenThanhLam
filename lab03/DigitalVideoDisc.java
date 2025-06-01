package Project;

public class DigitalVideoDisc extends Disc{
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.director=director;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category, String director,int length, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.director=director;
		this.length=length;
		this.cost=cost;
	}
	private static int nbDigitalVideoDiscs = 0;
	@Override
    public boolean equals(Object obj){
        DigitalVideoDisc disc = (DigitalVideoDisc)obj;
        return this.title.equals(disc.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length
                && this.cost == disc.cost;
    
	}
}
