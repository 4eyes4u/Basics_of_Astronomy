package trn.basicsofastronomy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	ImageButton Suncev;

	ImageButton Merkur, Venera, Zemlja, Mars, Jupiter, Saturn, Uran, Neptun;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Merkur = (ImageButton) findViewById(R.id.imgMerkur);
		Venera = (ImageButton) findViewById(R.id.imgVenera);
		Zemlja = (ImageButton) findViewById(R.id.imgZemlja);
		Mars = (ImageButton) findViewById(R.id.imgMars);
		Jupiter = (ImageButton) findViewById(R.id.imgJupiter);
		Saturn = (ImageButton) findViewById(R.id.imgSaturn);
		Uran = (ImageButton) findViewById(R.id.imgUran);
		Neptun = (ImageButton) findViewById(R.id.imgNeptun);

		final Context context = this;

		Merkur.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Merkur.class);
				startActivity(intent);
			}
		});

		Venera.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Venera.class);
				startActivity(intent);
			}
		});

		Zemlja.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Zemlja.class);
				startActivity(intent);
			}
		});

		Mars.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Mars.class);
				startActivity(intent);
			}
		});

		Jupiter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Jupiter.class);
				startActivity(intent);
			}
		});

		Saturn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Saturn.class);
				startActivity(intent);
			}
		});

		Uran.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Uran.class);
				startActivity(intent);
			}
		});

		Neptun.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Neptun.class);
				startActivity(intent);
			}
		});
	}

	
}
