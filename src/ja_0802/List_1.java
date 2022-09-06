package ja_0802;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_1 extends Frame{
	
	public List_1(String str) {
		super(str);
		
		setLayout(new FlowLayout());
		
		List list = new List(3,false);	// List 객체생성 4는 화면에 출력될 항목의 갯수
										// false 는 다중 선택 불가 true 는 다중선택가능
//		
//		List(리스트)
//		
//		:선택 버튼은 한개의 아이템만 선택할수 있는 반면.
//		리스트는 한개이상 항목을 선택 할수 있습니다.
//		기본적인 사용 방법은 선택버튼과 비슷하다.
		
		Label lbl = new Label("List Test ~~~~");
		add(lbl);
		
		list.add("386DX");
		list.add("486DX");
		list.add("486DX66");
		list.add("펜티엄");
		list.add("펜티엄4");
		list.add("애슬론");
		list.add("인텔 듀얼코어");
		
		add((Component)list);
		setSize(200,200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new List_1("list test~~~~");
	}

}









