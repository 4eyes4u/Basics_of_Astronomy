package trn.basicsofastronomy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Puzzle extends Activity {

	ImageButton Puzzle;

	int puzzleidx = -1;
	Random r = new Random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_puzzle);
		puzzleidx = r.nextInt(5);
		shuffle();
	}

	Integer ids[][] = {
			{ R.drawable.slika1_01, R.drawable.slika1_02, R.drawable.slika1_03,
					R.drawable.slika1_04, R.drawable.slika1_05,
					R.drawable.slika1_06, R.drawable.slika1_07,
					R.drawable.slika1_08, R.drawable.slika1_09 },
			{ R.drawable.slika2_01, R.drawable.slika2_02, R.drawable.slika2_03,
					R.drawable.slika2_04, R.drawable.slika2_05,
					R.drawable.slika2_06, R.drawable.slika2_07,
					R.drawable.slika2_08, R.drawable.slika2_09 },
			{ R.drawable.slika3_01, R.drawable.slika3_02, R.drawable.slika3_03,
					R.drawable.slika3_04, R.drawable.slika3_05,
					R.drawable.slika3_06, R.drawable.slika3_07,
					R.drawable.slika3_08, R.drawable.slika3_09 },
			{ R.drawable.slika4_01, R.drawable.slika4_02, R.drawable.slika4_03,
					R.drawable.slika4_04, R.drawable.slika4_05,
					R.drawable.slika4_06, R.drawable.slika4_07,
					R.drawable.slika4_08, R.drawable.slika4_09 },
			{ R.drawable.slika5_01, R.drawable.slika5_02, R.drawable.slika5_03,
					R.drawable.slika5_04, R.drawable.slika5_05,
					R.drawable.slika5_06, R.drawable.slika5_07,
					R.drawable.slika5_08, R.drawable.slika5_09 } };

	ArrayList<Integer> idx;
	int pictures[] = new int[] { R.id.imageView1, R.id.imageView2,
			R.id.imageView3, R.id.imageView4, R.id.imageView5, R.id.imageView6,
			R.id.imageView7, R.id.imageView8, R.id.imageView9 };

	private void shuffle() {
		idx = new ArrayList<Integer>(Arrays.asList(ids[puzzleidx]));
		Random r = new Random();
		Collections.shuffle(idx, r);
		for (int i = 0; i < 9; i++) {
			ImageView img = (ImageView) findViewById(pictures[i]);
			img.setImageResource(idx.get(i));
			img.setTag(idx.get(i));
		}
	}

	private boolean check() {
		for (int i = 0; i < 9; i++) {
			ImageView img = (ImageView) findViewById(pictures[i]);
			Object x = img.getTag();
			int xx = Integer.parseInt(x.toString());
			if (xx != ids[puzzleidx][i])
				return false;
		}
		return true;
	}

	private int toswap = -1;

	private void swap(int x, int y) {
		ImageView img1 = (ImageView) findViewById(x);
		ImageView img2 = (ImageView) findViewById(y);
		Object tmp = img1.getTag();
		img1.setTag(img2.getTag());
		img2.setTag(tmp);
		img1.setImageResource(Integer.parseInt(img1.getTag().toString()));
		img2.setImageResource(Integer.parseInt(img2.getTag().toString()));
	}

	public void tap(View v) {
		v.playSoundEffect(android.view.SoundEffectConstants.CLICK);
		if (toswap == -1) {
			toswap = v.getId();
		} else {
			swap(v.getId(), toswap);
			toswap = -1;
			if (check() == true) {
				Toast.makeText(getApplicationContext(),
						"Složili ste slagalicu! Probajte sada ovu",
						Toast.LENGTH_SHORT).show();
				int nextpuzzle = r.nextInt(5);
				if (puzzleidx == nextpuzzle) {
					puzzleidx++;
					puzzleidx %= 5;
				} else
					puzzleidx = nextpuzzle;
				shuffle();
			}
		}

	}
}
