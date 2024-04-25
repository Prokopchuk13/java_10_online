package ua.com.alevel;
public class Row {
    public String row;
    public int rating;
    public int count;
    public int percentage;

    public Row (String row, int rating, int count, int percentage) {
        this.row = row;
        this.rating = rating;
        this.count = count;
        this.percentage = percentage;
    }

    public String getRow() {
        return row;
    }
    public void setRow (String row) {
        this.row = row;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getPercentage() {
        return percentage;
    }
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public  String toString() {
        return "Row{" +
                "row='" + row + '\'' +
                ", rating=" + rating +
                ", count=" + count +
                ", percentage=" + percentage +
                '}';
    }
}