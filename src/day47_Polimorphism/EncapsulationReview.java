package day47_Polimorphism;

public class EncapsulationReview {
    private  String bookTitle;
    private final  String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        this.bookTitle = bookTitle;
        this.publishedDate = publishedDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle==null||bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }



}
