public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Дэниэл", "Киз");
        Author author2 = new Author("Олдос", "Хаксли");

        Book book1 = new Book("Цветы для Элджернона", author1, 2018);
        System.out.println("Название - " + book1.getTitle() + ", автор - " + author1.getName() + " "+ author1.getSurname() + ", год издания - " + book1.getPublishingYear());

        Book book2 = new Book("О дивный новый мир", author2, 2021);
        book2.setPublishingYear(2010);
        System.out.println("Название - " + book2.getTitle() + ", автор - " + author2.getName() + " "+ author2.getSurname() + ", год издания - " + book2.getPublishingYear());
    }
}
