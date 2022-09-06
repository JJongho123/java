package book;

import java.util.ArrayList;

public interface BookMgr {
	
	void add(Book nBook);
	ArrayList<Book> getAllbook();
	Book searchBookByIsbn(String isbn);
	ArrayList<Book> searchBookByTitle(String title);
	ArrayList<Book> onlySearchBook();
	ArrayList<Book> onlySearchMagazine();
	ArrayList<Book> magazineOfThisYearInfo(int year);
	ArrayList<Book> searchBookByPublisher(String publisher);
	ArrayList<Book> searchBookByPrice(int price);
	int getTotalPrice();
	int getAvgPrice();

}
