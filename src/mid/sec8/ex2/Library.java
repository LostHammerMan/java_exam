package mid.sec8.ex2;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size){
        books = new Book[size];
        bookCount = 0;
    }

    private static class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }


    public void addBook(String title, String author){
        if (bookCount < books.length){
            books[bookCount++] = new Book(title, author);
        }else {
            System.out.println("도서관 저장 공간 부족");
        }

    }

    public void showBooks(){
        System.out.println("=== 책 목록 출력 ====");
        for (Book book : books){
            System.out.println("도서제목 : " + book.title + ", 저자 : " + book.author);
        }
    }
}
