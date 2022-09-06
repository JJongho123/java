package ja_0812;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Progress_1 extends JFrame {
	JProgressBar progress;
	JLabel lbl_info;

	public Progress_1(String str) {
		super(str);

		progress = new JProgressBar();
		progress.setMinimum(0);
		progress.setMaximum(100);	
		progress.setValue(0);		//시작값

		lbl_info = new JLabel("");

		this.getContentPane().add(progress, "North");
		getContentPane().add(new JLabel("JProgress Test"), "Center");
		getContentPane().add(lbl_info, "South");

		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(400, 300);
		setVisible(true);
		progress_start();

	}

	private void progress_start() {
		int i;

		try {
			for (i = 0; i <= 100; i += 5) {
				progress.setValue(i);
				Thread.sleep(200);
				lbl_info.setText("   " + i + "   %  가 진행중~~~");

				if (i == 300) {
					throw new Exception();
				}
				if (i == 100) {
					lbl_info.setText("  다운 완료 !!! ");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			lbl_info.setText("문제 발생 @@ ");
		}

	}

	public static void main(String[] args) {
		new Progress_1("Progress_1");

	}
}
