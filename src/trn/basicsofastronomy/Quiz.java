package trn.basicsofastronomy;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.view.View.OnClickListener;

public class Quiz extends Activity {
	
	ImageButton Quiz;

	RadioGroup rgp1, rgp2, rgp3, rgp4, rgp5, rgp6, rgp7, rgp8, rgp9, rgp10;
	boolean p1 = false, p2 = false, p3 = false, p4 = false, p5 = false,
			p6 = false, p7 = false, p8 = false, p9 = false, p10 = false;
	Button btnProveri;
	int ans = 0, n = 10;
	int[] provera = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz);

		String[] pitanja = { "Koja je treća planeta Sunčevog sistema?",
				"Prirodni Zemljin satelit se naziva: ",
				"Ko je oktrio teleskop? ",
				"Gledano sa Zemlje, koja zvezda je najsjanija? ",
				"Zvezda Danica je: ", "Zvezde padalice ili ",
				"Koja je planeta najveća u Sunčevom sistemu? ",
				"Planeta koja nema ni jedan satelit je: ",
				"Planeta poznata po prstenovima je:",
				"Čestice hipotetički brže od svetlosti su: ", };

		final int[] tacni = { 1, 3, 2, 1, 1, 3, 2, 1, 2, 2 };

		String[] rb_prvi = { "Zemlja", "Triton", "Kepler", "Sirijus", "Venera",
				"Komete", "Mars", "Merkur", "Neptun", "Fotoni", };

		String[] rb_drugi = { "Neptun", "Fobos", "Galilej", "Kapela", "Uran",
				"Asteroidi", "Jupiter", "Zemlja", "Saturn", "Tahioni", };

		String[] rb_treci = { "Jupiter", "Mesec", "Habl", "Denebola", "Mars",
				"Meteori", "Neptun", "Uran", "Venera", "Kvarkovi", };

		izmesaj(tacni, pitanja, rb_prvi, rb_drugi, rb_treci);

		TextView tv1 = (TextView) findViewById(R.id.textView1);
		tv1.setText("1. " + pitanja[0]);
		TextView tv2 = (TextView) findViewById(R.id.textView2);
		tv2.setText("\n 2. " + pitanja[1]);
		TextView tv3 = (TextView) findViewById(R.id.textView3);
		tv3.setText("\n 3. " + pitanja[2]);
		TextView tv4 = (TextView) findViewById(R.id.textView4);
		tv4.setText("\n 4. " + pitanja[3]);
		TextView tv5 = (TextView) findViewById(R.id.textView5);
		tv5.setText("\n 5. " + pitanja[4]);
		TextView tv6 = (TextView) findViewById(R.id.textView6);
		tv6.setText("\n 6. " + pitanja[5]);
		TextView tv7 = (TextView) findViewById(R.id.textView7);
		tv7.setText("\n 7. " + pitanja[6]);
		TextView tv8 = (TextView) findViewById(R.id.textView8);
		tv8.setText("\n 8. " + pitanja[7]);
		TextView tv9 = (TextView) findViewById(R.id.textView9);
		tv9.setText("\n 9. " + pitanja[8]);
		TextView tv10 = (TextView) findViewById(R.id.textView10);
		tv10.setText("\n 10. " + pitanja[9]);

		RadioButton p1rb1 = (RadioButton) findViewById(R.id.p1rb1);
		RadioButton p1rb2 = (RadioButton) findViewById(R.id.p1rb2);
		RadioButton p1rb3 = (RadioButton) findViewById(R.id.p1rb3);
		p1rb1.setText(rb_prvi[0]);
		p1rb2.setText(rb_drugi[0]);
		p1rb3.setText(rb_treci[0]);

		RadioButton p2rb1 = (RadioButton) findViewById(R.id.p2rb1);
		RadioButton p2rb2 = (RadioButton) findViewById(R.id.p2rb2);
		RadioButton p2rb3 = (RadioButton) findViewById(R.id.p2rb3);
		p2rb1.setText(rb_prvi[1]);
		p2rb2.setText(rb_drugi[1]);
		p2rb3.setText(rb_treci[1]);

		RadioButton p3rb1 = (RadioButton) findViewById(R.id.p3rb1);
		RadioButton p3rb2 = (RadioButton) findViewById(R.id.p3rb2);
		RadioButton p3rb3 = (RadioButton) findViewById(R.id.p3rb3);
		p3rb1.setText(rb_prvi[2]);
		p3rb2.setText(rb_drugi[2]);
		p3rb3.setText(rb_treci[2]);

		RadioButton p4rb1 = (RadioButton) findViewById(R.id.p4rb1);
		RadioButton p4rb2 = (RadioButton) findViewById(R.id.p4rb2);
		RadioButton p4rb3 = (RadioButton) findViewById(R.id.p4rb3);
		p4rb1.setText(rb_prvi[3]);
		p4rb2.setText(rb_drugi[3]);
		p4rb3.setText(rb_treci[3]);

		RadioButton p5rb1 = (RadioButton) findViewById(R.id.p5rb1);
		RadioButton p5rb2 = (RadioButton) findViewById(R.id.p5rb2);
		RadioButton p5rb3 = (RadioButton) findViewById(R.id.p5rb3);
		p5rb1.setText(rb_prvi[4]);
		p5rb2.setText(rb_drugi[4]);
		p5rb3.setText(rb_treci[4]);

		RadioButton p6rb1 = (RadioButton) findViewById(R.id.p6rb1);
		RadioButton p6rb2 = (RadioButton) findViewById(R.id.p6rb2);
		RadioButton p6rb3 = (RadioButton) findViewById(R.id.p6rb3);
		p6rb1.setText(rb_prvi[5]);
		p6rb2.setText(rb_drugi[5]);
		p6rb3.setText(rb_treci[5]);

		RadioButton p7rb1 = (RadioButton) findViewById(R.id.p7rb1);
		RadioButton p7rb2 = (RadioButton) findViewById(R.id.p7rb2);
		RadioButton p7rb3 = (RadioButton) findViewById(R.id.p7rb3);
		p7rb1.setText(rb_prvi[6]);
		p7rb2.setText(rb_drugi[6]);
		p7rb3.setText(rb_treci[6]);

		RadioButton p8rb1 = (RadioButton) findViewById(R.id.p8rb1);
		RadioButton p8rb2 = (RadioButton) findViewById(R.id.p8rb2);
		RadioButton p8rb3 = (RadioButton) findViewById(R.id.p8rb3);
		p8rb1.setText(rb_prvi[7]);
		p8rb2.setText(rb_drugi[7]);
		p8rb3.setText(rb_treci[7]);

		RadioButton p9rb1 = (RadioButton) findViewById(R.id.p9rb1);
		RadioButton p9rb2 = (RadioButton) findViewById(R.id.p9rb2);
		RadioButton p9rb3 = (RadioButton) findViewById(R.id.p9rb3);
		p9rb1.setText(rb_prvi[8]);
		p9rb2.setText(rb_drugi[8]);
		p9rb3.setText(rb_treci[8]);

		RadioButton p10rb1 = (RadioButton) findViewById(R.id.p10rb1);
		RadioButton p10rb2 = (RadioButton) findViewById(R.id.p10rb2);
		RadioButton p10rb3 = (RadioButton) findViewById(R.id.p10rb3);
		p10rb1.setText(rb_prvi[9]);
		p10rb2.setText(rb_drugi[9]);
		p10rb3.setText(rb_treci[9]);

		rgp1 = (RadioGroup) findViewById(R.id.rgp1);
		rgp2 = (RadioGroup) findViewById(R.id.rgp2);
		rgp3 = (RadioGroup) findViewById(R.id.rgp3);
		rgp4 = (RadioGroup) findViewById(R.id.rgp4);
		rgp5 = (RadioGroup) findViewById(R.id.rgp5);
		rgp6 = (RadioGroup) findViewById(R.id.rgp6);
		rgp7 = (RadioGroup) findViewById(R.id.rgp7);
		rgp8 = (RadioGroup) findViewById(R.id.rgp8);
		rgp9 = (RadioGroup) findViewById(R.id.rgp9);
		rgp10 = (RadioGroup) findViewById(R.id.rgp10);

		btnProveri = (Button) findViewById(R.id.btnProveri);

		rgp1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[0] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p1rb1);

					if (r1.isChecked() && !p1) {
						provera[0] = 1;
						ans++;
						p1 = true;
					} else if (p1) {
						provera[0] = 0;
						p1 = false;
						ans--;
					}
				} else if (tacni[0] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p1rb2);

					if (r1.isChecked() && !p1) {
						provera[0] = 2;
						ans++;
						p1 = true;
					} else if (p1) {
						provera[0] = 0;
						p1 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p1rb3);

					if (r1.isChecked() && !p1) {
						provera[0] = 3;
						ans++;
						p1 = true;
					} else if (p1) {
						provera[0] = 0;
						p1 = false;
						ans--;
					}
				}

			}
		});

		rgp2.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[1] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p2rb1);

					if (r1.isChecked() && !p2) {
						provera[1] = 1;
						ans++;
						p2 = true;
					} else if (p2) {
						provera[1] = 0;
						p2 = false;
						ans--;
					}
				} else if (tacni[1] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p2rb2);

					if (r1.isChecked() && !p2) {
						provera[1] = 2;
						ans++;
						p2 = true;
					} else if (p1) {
						provera[1] = 0;
						p2 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p2rb3);

					if (r1.isChecked() && !p2) {
						provera[1] = 3;
						ans++;
						p2 = true;
					} else if (p2) {
						provera[1] = 0;
						p2 = false;
						ans--;
					}
				}
			}
		});

		rgp3.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[2] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p3rb1);

					if (r1.isChecked() && !p3) {
						provera[2] = 1;
						ans++;
						p3 = true;
					} else if (p3) {
						provera[2] = 0;
						p3 = false;
						ans--;
					}
				} else if (tacni[2] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p3rb2);

					if (r1.isChecked() && !p3) {
						provera[2] = 2;
						ans++;
						p3 = true;
					} else if (p3) {
						provera[2] = 0;
						p3 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p3rb3);

					if (r1.isChecked() && !p3) {
						provera[2] = 3;
						ans++;
						p3 = true;
					} else if (p3) {
						provera[2] = 0;
						p3 = false;
						ans--;
					}
				}
			}
		});

		rgp4.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[3] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p4rb1);

					if (r1.isChecked() && !p4) {
						provera[3] = 1;
						ans++;
						p4 = true;
					} else if (p4) {
						provera[3] = 0;
						p4 = false;
						ans--;
					}
				} else if (tacni[3] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p4rb2);

					if (r1.isChecked() && !p4) {
						provera[3] = 2;
						ans++;
						p4 = true;
					} else if (p4) {
						provera[3] = 0;
						p4 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p4rb3);

					if (r1.isChecked() && !p4) {
						provera[3] = 3;
						ans++;
						p4 = true;
					} else if (p4) {
						provera[3] = 0;
						p4 = false;
						ans--;
					}
				}
			}
		});

		rgp5.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[4] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p5rb1);

					if (r1.isChecked() && !p5) {
						provera[4] = 1;
						ans++;
						p5 = true;
					} else if (p1) {
						provera[4] = 0;
						p5 = false;
						ans--;
					}
				} else if (tacni[4] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p5rb2);

					if (r1.isChecked() && !p5) {
						provera[4] = 2;
						ans++;
						p5 = true;
					} else if (p5) {
						provera[4] = 0;
						p5 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p5rb3);

					if (r1.isChecked() && !p5) {
						provera[4] = 3;
						ans++;
						p5 = true;
					} else if (p5) {
						provera[4] = 0;
						p5 = false;
						ans--;
					}
				}
			}
		});

		rgp6.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[5] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p6rb1);

					if (r1.isChecked() && !p6) {
						provera[5] = 1;
						ans++;
						p6 = true;
					} else if (p6) {
						provera[5] = 0;
						p6 = false;
						ans--;
					}
				} else if (tacni[5] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p6rb2);

					if (r1.isChecked() && !p6) {
						provera[5] = 2;
						ans++;
						p6 = true;
					} else if (p6) {
						provera[5] = 0;
						p6 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p6rb3);

					if (r1.isChecked() && !p6) {
						provera[5] = 3;
						ans++;
						p6 = true;
					} else if (p6) {
						provera[5] = 0;
						p6 = false;
						ans--;
					}
				}
			}
		});

		rgp7.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[6] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p7rb1);

					if (r1.isChecked() && !p7) {
						provera[6] = 1;
						ans++;
						p7 = true;
					} else if (p7) {
						provera[6] = 0;
						p7 = false;
						ans--;
					}
				} else if (tacni[6] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p7rb2);

					if (r1.isChecked() && !p7) {
						provera[6] = 2;
						ans++;
						p7 = true;
					} else if (p7) {
						provera[6] = 0;
						p7 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p7rb3);

					if (r1.isChecked() && !p7) {
						provera[6] = 3;
						ans++;
						p7 = true;
					} else if (p7) {
						provera[6] = 0;
						p7 = false;
						ans--;
					}
				}
			}
		});

		rgp8.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[7] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p8rb1);

					if (r1.isChecked() && !p8) {
						provera[7] = 1;
						ans++;
						p8 = true;
					} else if (p8) {
						provera[7] = 0;
						p8 = false;
						ans--;
					}
				} else if (tacni[7] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p8rb2);

					if (r1.isChecked() && !p8) {
						provera[7] = 2;
						ans++;
						p8 = true;
					} else if (p8) {
						provera[7] = 0;
						p8 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p8rb3);

					if (r1.isChecked() && !p8) {
						provera[7] = 3;
						ans++;
						p8 = true;
					} else if (p8) {
						provera[7] = 0;
						p8 = false;
						ans--;
					}
				}
			}
		});

		rgp9.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[8] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p9rb1);

					if (r1.isChecked() && !p9) {
						provera[8] = 1;
						ans++;
						p9 = true;
					} else if (p9) {
						provera[8] = 0;
						p9 = false;
						ans--;
					}
				} else if (tacni[8] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p9rb2);

					if (r1.isChecked() && !p9) {
						provera[8] = 2;
						ans++;
						p9 = true;
					} else if (p9) {
						provera[8] = 0;
						p9 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p9rb3);

					if (r1.isChecked() && !p9) {
						provera[8] = 3;
						ans++;
						p9 = true;
					} else if (p9) {
						provera[8] = 0;
						p9 = false;
						ans--;
					}
				}
			}
		});

		rgp10.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				if (tacni[9] == 1) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p10rb1);

					if (r1.isChecked() && !p10) {
						provera[9] = 1;
						ans++;
						p10 = true;
					} else if (p10) {
						provera[9] = 0;
						p10 = false;
						ans--;
					}
				} else if (tacni[9] == 2) {
					RadioButton r1 = (RadioButton) findViewById(R.id.p10rb2);

					if (r1.isChecked() && !p10) {
						provera[9] = 2;
						ans++;
						p10 = true;
					} else if (p10) {
						provera[9] = 0;
						p10 = false;
						ans--;
					}
				} else {
					RadioButton r1 = (RadioButton) findViewById(R.id.p10rb3);

					if (r1.isChecked() && !p10) {
						provera[9] = 3;
						ans++;
						p10 = true;
					} else if (p10) {
						provera[9] = 0;
						p10 = false;
						ans--;
					}
				}
			}
		});

		btnProveri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				for (int i = 0; i < 10; i++) {
					if (tacni[i] != provera[i]) {
						RadioButton rb_prov1, rb_prov2, rb_prov3;
						TextView tv_prob;

						if (i == 0) {
							rb_prov1 = (RadioButton) findViewById(R.id.p1rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p1rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p1rb3);
							tv_prob = (TextView) findViewById(R.id.textView1);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 1) {
							rb_prov1 = (RadioButton) findViewById(R.id.p2rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p2rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p2rb3);
							tv_prob = (TextView) findViewById(R.id.textView2);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 2) {
							rb_prov1 = (RadioButton) findViewById(R.id.p3rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p3rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p3rb3);
							tv_prob = (TextView) findViewById(R.id.textView3);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 3) {
							rb_prov1 = (RadioButton) findViewById(R.id.p4rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p4rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p4rb3);
							tv_prob = (TextView) findViewById(R.id.textView4);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 4) {
							rb_prov1 = (RadioButton) findViewById(R.id.p5rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p5rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p5rb3);
							tv_prob = (TextView) findViewById(R.id.textView5);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 5) {
							rb_prov1 = (RadioButton) findViewById(R.id.p6rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p6rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p6rb3);
							tv_prob = (TextView) findViewById(R.id.textView6);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 6) {
							rb_prov1 = (RadioButton) findViewById(R.id.p7rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p7rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p7rb3);
							tv_prob = (TextView) findViewById(R.id.textView7);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 7) {
							rb_prov1 = (RadioButton) findViewById(R.id.p8rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p8rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p8rb3);
							tv_prob = (TextView) findViewById(R.id.textView8);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 8) {
							rb_prov1 = (RadioButton) findViewById(R.id.p9rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p9rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p9rb3);
							tv_prob = (TextView) findViewById(R.id.textView9);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						} else if (i == 9) {
							rb_prov1 = (RadioButton) findViewById(R.id.p10rb1);
							rb_prov2 = (RadioButton) findViewById(R.id.p10rb2);
							rb_prov3 = (RadioButton) findViewById(R.id.p10rb3);
							tv_prob = (TextView) findViewById(R.id.textView10);

							rb_prov1.setChecked(false);
							rb_prov2.setChecked(false);
							rb_prov3.setChecked(false);
							tv_prob.setTextColor(Color.parseColor("#ff0000"));
						}
					} else {
						TextView tv_prob;

						if (i == 0) {
							tv_prob = (TextView) findViewById(R.id.textView1);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 1) {
							tv_prob = (TextView) findViewById(R.id.textView2);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 2) {
							tv_prob = (TextView) findViewById(R.id.textView3);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 3) {
							tv_prob = (TextView) findViewById(R.id.textView4);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 4) {
							tv_prob = (TextView) findViewById(R.id.textView5);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 5) {
							tv_prob = (TextView) findViewById(R.id.textView6);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 6) {
							tv_prob = (TextView) findViewById(R.id.textView7);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 7) {
							tv_prob = (TextView) findViewById(R.id.textView8);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 8) {
							tv_prob = (TextView) findViewById(R.id.textView9);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						} else if (i == 9) {
							tv_prob = (TextView) findViewById(R.id.textView10);
							tv_prob.setTextColor(Color.parseColor("#ffffff"));
						}
					}
				}

				if (ans == 0) {
					Toast.makeText(getBaseContext(),
							"Ni jedan odgovor nije ispravan",
							Toast.LENGTH_SHORT).show();
				} else if (ans == 1) {
					Toast.makeText(getBaseContext(),
							"Imate 1 ispravan odgovor", Toast.LENGTH_SHORT)
							.show();
				} else if (ans == 2 || ans == 3 || ans == 4) {
					Toast.makeText(getBaseContext(),
							"Imate " + ans + " ispravna odgovora",
							Toast.LENGTH_SHORT).show();
				} else if (ans == 5 || ans == 6 || ans == 7 || ans == 8
						|| ans == 9) {
					Toast.makeText(getBaseContext(),
							"Imate " + ans + " ispravnih odgovora",
							Toast.LENGTH_SHORT).show();
				} else if (ans == 10) {
					Toast.makeText(getBaseContext(),
							"Svi odgovori su ispravni, bravo!",
							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	private void izmesaj(int[] tacni, String[] pitanja, String[] rb_prvi,
			String[] rb_drugi, String[] rb_treci) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		for (int i = 9; i > 0; i--) {
			int index = rnd.nextInt(10 - i) + i;
			// Simple swap
			int a = tacni[index];
			tacni[index] = tacni[i];
			tacni[i] = a;

			String pb1 = pitanja[index];
			pitanja[index] = pitanja[i];
			pitanja[i] = pb1;

			String pb2 = rb_prvi[index];
			rb_prvi[index] = rb_prvi[i];
			rb_prvi[i] = pb2;

			String pb3 = rb_drugi[index];
			rb_drugi[index] = rb_drugi[i];
			rb_drugi[i] = pb3;

			String pb4 = rb_treci[index];
			rb_treci[index] = rb_treci[i];
			rb_treci[i] = pb4;

		}
	}

}
