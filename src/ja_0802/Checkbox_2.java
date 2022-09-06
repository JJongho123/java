package ja_0802;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_2 extends Frame {
	Checkbox cbx1, cbx2, cbx3, cbx4;
	Checkbox cbx11, cbx22, cbx33, cbx44;
	Checkbox cbx111, cbx222, cbx333, cbx444;
	CheckboxGroup cbg, cbg2 , cbg3;

	public Checkbox_2(String str) {
		super(str);
		setLayout(new FlowLayout());

		Label lbl = new Label(" 좋아하는 계절은 ", Label.CENTER);
		lbl.setBackground(new Color(128, 255, 255));
		lbl.setForeground(new Color(255,125,255));
		add(lbl);

		cbg = new CheckboxGroup();
//		라디오 버튼을 만들기 위해서는 체크박스를 체크박스그룹으로 묶어야 하기때문에
//		체크박스 그룹 클래스 객체를 생성해서 사용한다.
//		체크 매개변수로
//		체크박스그룹 클래스 객체사용

		cbx1 = new Checkbox("봄", cbg, false);
		cbx2 = new Checkbox("여름", cbg, true);
		cbx3 = new Checkbox("가을", cbg, true);
		cbx4 = new Checkbox("겨울", cbg, true);

		add(cbx1);
		add(cbx2);
		add(cbx3);
		add(cbx4);

		Label lbl2 = new Label("좋아하는 산이름 ", Label.CENTER);	//센터를 쓰면 레이블이 가운데로오고 안쓰면 왼쪽으로 붙어서 출력된다.
		lbl2.setBackground(new Color(255, 125, 255));
		lbl2.setForeground(new Color(25,125,255));
		add(lbl2);

		cbg2 = new CheckboxGroup();

		cbx11 = new Checkbox("지리산", cbg2, false);
		cbx22 = new Checkbox("무등산", cbg2, true);
		cbx33 = new Checkbox("한라산", cbg2, true);
		cbx44 = new Checkbox("북한산", cbg2, true);

		add(cbx11);
		add(cbx22);
		add(cbx33);
		add(cbx44);
		
		Label lbl3 = new Label("좋아하는 꽃이름 ", Label.CENTER);	//센터를 쓰면 레이블이 가운데로오고 안쓰면 왼쪽으로 붙어서 출력된다.
		lbl3.setBackground(new Color(55, 125, 55));
		add(lbl3);

		cbg3 = new CheckboxGroup();

		cbx111 = new Checkbox("국화꽃", cbg3, false);
		cbx222 = new Checkbox("나팔꽃", cbg3, true);
		cbx333 = new Checkbox("꽃꽃꽃", cbg3, true);
		cbx444 = new Checkbox("해바라기", cbg3, true);

		add(cbx111);
		add(cbx222);
		add(cbx333);
		add(cbx444);

		setSize(250, 200);
		setVisible(true);

	}public static void main(String[] args) {
		
	
	new Checkbox_2("라디오 버튼 테스트~~~");
	}

}
