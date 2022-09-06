package ja_0802;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame{
	
	public Choice_1(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl = new Label("국가를 선택 하세요");
		Choice choice = new Choice();
		
		choice.add("대한민국");
		choice.add("미국");
		choice.add("프랑스");
		choice.add("중국");
		choice.add("영국");
		choice.add("독일");
		choice.add("러시아");
		
//		Choice(선택 버튼)
//		
//		:선택버튼은 여러개의 항목을 선택할 수 있는 컴포넌트 입니다.
//		선택 버튼을 구성하는 아이템은 문자열로 되어 있으며 Choice에 여러개를 
//		붙일수 있습니다. Choice 는 윈도우 에서 일반적으로 콤보 버튼이라고 합니다.
		
		
		add(lbl);
		add(choice);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice_1("Choice 예제 ");
	}
	

}





















