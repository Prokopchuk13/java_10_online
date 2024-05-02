package ua.com.alevel;

class Row {
    private String word;
    private long count;
    private long percentage;
    private long rating;

    public Row(String word, long count, long percentage) {
        this.word = word;
        this.count = count;
        this.percentage = percentage;
    }

    public String getWord() {
        return word;
    }

    public long getCount() {
        return count;
    }

    public double getPercentage() {
        return percentage;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }
}