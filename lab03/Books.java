package Project;
import java.util.ArrayList;

public class Books extends Media{
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	private ArrayList<String> authors = new ArrayList<String>();
public Books() {
}
public static void main(String[] args) {
	ArrayList<String> authors = new ArrayList<String>();
	authors.add("Nguyen Cao");
	authors.add("Nguyen Tuan");
	authors.add("Ho Xuan Huong");
	authors.add("Tran Tien");
	System.out.println(authors);
	authors.remove(1);
	authors.remove(1);
	System.out.println(authors);
}

}

