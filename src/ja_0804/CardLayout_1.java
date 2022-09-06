package ja_0804;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout_1 extends Frame{ 
	
//	CardLayout
//	카드 레이아웃은 한개의 카드 컴포넌트를 한개의 컴포넌트로 표현하는
//	방법입니다. 여러개의 컴포넌트를 여러개의 카드에 배치하는 경우에
//	각카드에 이름을 붙여 사용합니다. 해당 카드를 출력할때 , 해당 
//	카드의 이름을 show() 메서드로 출력하거나 , first(), last() , nest() 등의
//	메서드를 이용해 화면을 바꿔가며 출력할 수 있습니다.
//	
//	카드 레이아웃을 사용하는 과정 
//	setLayout() 메서드를 이용해 카드레이아웃 등록 
//	카드레이아웃에 등록할 Panel을 만든다.
//	add() 매서드를 이용해 패널을 컨테이너에 추가한다.
//	원하는 카드를 보여주기 위해서 show() ,next() , first(), last() 메서드를 사용한다.
	
	CardLayout card = new CardLayout();
	Panel[] panel = new Panel[5];
	Color[] color = {Color.red ,Color.blue , Color.yellow , Color.green ,Color.cyan};
	
	int x,y;
	
	public CardLayout_1(String str) {
		super(str);
		setLayout(card);
		
		MouseHandle mouse = new MouseHandle();
		
		for(int i =0;i<5;i++) {
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			panel[i].addMouseListener(mouse);
			
			add((new Integer(i)).toString(), panel[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
	public class MouseHandle extends MouseAdapter	//마우스 이벤트 처리   MouseAdapter 를 쓰면 Mouse 메서드  한개만 가져와서 써도된다.
	{
		public void mouseCliked(MouseEvent e) {		//마우스가 클릭될때
			card.next(CardLayout_1.this);
			System.out.println(e.toString()+"\n");
		}
	}
	public static void main(String[] args) {
		
		new CardLayout_1("CardLayout 예제");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
