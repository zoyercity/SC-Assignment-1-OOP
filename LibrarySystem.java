class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

class Member {
    String name;
    int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMemberInfo() {
        System.out.println("Member: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Member member1 = new Member("Ali", 101);

        member1.displayMemberInfo();

        book1.borrowBook();
        book1.returnBook();
    }
}