package book;

import java.util.ArrayList;

import book_2.Book;
import book_2.Magazine;

public class BookMgrlmpl implements BookMgr{
	private ArrayList<Book> bList;
	
	private static BookMgrlmpl mgr = new BookMgrlmpl();
	
	private BookMgrlmpl() {
		bList = new ArrayList<>();
	}
	//1. 데이터 입력기능
	public void add(Book nBook) {
		boolean find = true;
		for(Book b : bList) {
			if(b.getIsbn().equals(nBook.getIsbn())) {
				System.out.println("도서명 : "+nBook.getTitle()+", 이미 소장하고 있는 책입니다.");
				find = false;
				break;
			}
		}
		if(find == true) {
			bList.add(nBook);
			System.out.println("도서명 : "+nBook.getTitle()+" , 성공적으로 추가되었습니다.");
		}
		
	}
	
	//2. 데이터 전체 검색 기능
	public ArrayList<Book> getAllbook() {
		return bList;
	}

	//3. isbn 으로 정보를 검색하는 기능
	public Book searchBookByIsbn(String isbn) {
		Book temp = new Book();
		for(Book b : bList) {
			if(b.getIsbn().equals(isbn)) temp = b;
		}
		return temp;
	}

	//4. title로 정보를 검색하는 기능
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		return temp;
	}
	//5. Book 만 검색하는 기능
	public ArrayList<Book> onlySearchBook(){
		ArrayList<Book> temp = new ArrayList<>();
		for(Book b : blist) {
			if(b instanceof Magazine) continue;
			else temp.add(b);
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAvgPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
