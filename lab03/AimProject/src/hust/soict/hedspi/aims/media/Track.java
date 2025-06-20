package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        if (length <= 0) {
            System.out.println("Track \"" + title + "\" cannot be played. Invalid length.");
        } else {
            System.out.println("Playing Track: " + title);
            System.out.println("Track length: " + length);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return this.title.equals(other.title) && this.length == other.length;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
