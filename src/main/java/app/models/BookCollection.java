package app.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private static BookCollection instance = new BookCollection();

    private List<Book> collection;

    public static BookCollection getInstance() {
        return instance;
    }

    private BookCollection() {
        collection = new ArrayList<>();
    }

    public void addModel(Book book) {
        collection.add(book);
    }

    public List<Book> getModels() {
        return collection;
    }

    public void deleteModel(String id) {
        Iterator itr = collection.iterator();

        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            if (book.getId().equals(id)) {
                itr.remove();
            }
        }
    }
}
