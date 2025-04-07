public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ян", "Зайцев", 4);

        Book book = new Book("Дуновение ветра", 2000, author, 600);

        System.out.println("Является ли книга большой? Ответ: " + book.isBig());
        System.out.println("Содержится ли в книге слово: Ян? Ответ: " + book.matches("Ян"));
        System.out.println("Содержится ли в книге слово: Круг? Ответ: " + book.matches("Круг"));
        if (book.estimatePrise() > 0) {
            System.out.println("Цена киги: " + book.estimatePrise() + " рублей.");
        } else {
            System.out.println("Книга бесплатная!");
        }
    }
}
