import java.util.Date;

public class Shape {

    protected String color = "white";
    protected boolean filled;
    protected Date dateCreated;

    public Shape() {

    }


    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date(); // initialize date object with current date
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated(Date dateCreated) {
        return dateCreated;

    }

    public String toString() {
        return "Color: " + color + ", Date created: " + dateCreated;
    }





}
