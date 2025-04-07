public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrise() {
        int prise = (int) Math.floor((pages * 3) * Math.sqrt(author.rating));
        if (prise > 250) {
            return prise;
        } else {
            return 0;
        }
    }

    public Book(String title, int releaseYear, Author author, int pages) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }
}
