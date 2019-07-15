package Observer1;

public interface Observable {

    void bookService(Customer c);
    void bookCancel(Customer c);
    void bookUpdate();
}