public class landlord {
    private String location;
    private String room;
    private  String price;

    public landlord (String location, String room, String price){
        this.location = location;
        this.room = room;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public String getRoom() {
        return room;
    }

    public String getPrice() {
        return price;
    }
}
