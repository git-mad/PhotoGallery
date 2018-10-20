package gt.hack.photogallery;


public class Person {
    private String name;
    private String joinDate;
    private int photos;

    public Person(String name, String joinDate, int photos) {
        this.name = name;
        this.joinDate = joinDate;
        this.photos = photos;
    }

    public String getName() {
        return this.name;
    }

    public String getJoinDate() {
        return this.joinDate;
    }

    public int getPhotos() {
        return this.photos;
    }

}
