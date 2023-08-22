package Lesson1;

import java.util.Objects;

public class Book {
    private String title;
   private Author author;
    private int publishingYear;


    public Book(String title, Author author, int publishingYear) {
        this.title=title;
        this.author=author;
        this.publishingYear=publishingYear;
    }
    public String getTitle() {
        return this.title;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }
   public String toString() {
        return "Название - " +getTitle()+ ", автор - " +getAuthor() + ", год издания - " + getPublishingYear();
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }


}
