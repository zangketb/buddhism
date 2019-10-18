package com.example.tih;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button jiazhuo;
	private Button duoxiu;
	private Button duo;
	private Button zhuoma;
	private Button bajie;
	private ScrollView gongdong;
	private Button gadanlajiema;
	private Button lamaqueba;
	private Button badansasong;
	private Button gasanba;
	private Button lanzuonan;
	private Button danzhedb;
	private Button jienante;
	private Button lanrenduidong;
	private Button yundan;
	private Button duojuedexie;
	private Button badanyuncuoma;
	private Button kuanianma;
	private Button xiexiakuayang;
	private Button nandegangri;
	private Button sangjuemolan;
	private Button xianbamolan;
	private Button juejiumolan;
	private Button tuotamolan;
	private Button dewajianmolan;
	private Button duoge;
	private Button zhuogaduoba;
	private Button lezhima;
	private Button yangjianma;
	private Button jiahuacanjue;
	private Button manladuoque;
	private Button genremolan;
	private Button sangdumolan;
	private Button dequemolan;
	private Button jiuxiemolan;
	private Button duikaomolan;
	private Button lanrenmolan;
	private Button sangemolan;
	private Button xiangbala;
	private Button danbaima;
	private Button gedanluosang;
	private Button guadui;
	private Button sanbalunzhi;
	private Button sanbaji;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gongdong = (ScrollView) findViewById(R.id.gongdong);
		gongdong.setFillViewport(true);
		// activity_main.setBackgroudCorol(Corol.BLUE);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/himalaya.ttf");
		jiazhuo = (Button) findViewById(R.id.jiazhuo);
		jiazhuo.setText("སྐྱབས་འགྲོ།");
		jiazhuo.setTypeface(face);
		TextPaint tp = jiazhuo.getPaint();
		tp.setFakeBoldText(true);
		// jiazhuo.setBackgroundColor(Color.BLUE);
		jiazhuo.setOnClickListener(new jiazhuoListener());
		duoxiu = (Button) findViewById(R.id.duoxiu);
		duoxiu.setText(" ལྟུང་བཤགས།");
		duoxiu.setTypeface(face);
		TextPaint tp1 = duoxiu.getPaint();
		tp1.setFakeBoldText(true);
		duoxiu.setOnClickListener(new duoxiuListener());

		zhuoma = (Button) findViewById(R.id.zhuoma);
		zhuoma.setText("སྒྲོལ་མ།");
		zhuoma.setTypeface(face);
		TextPaint tp3 = zhuoma.getPaint();
		tp3.setFakeBoldText(true);
		zhuoma.setOnClickListener(new zhuomaListener());
		bajie = (Button) findViewById(R.id.bajie);
		bajie.setText("བར་ཆད་ལམ་སེལ།");
		bajie.setTypeface(face);
		TextPaint tp4 = bajie.getPaint();
		tp4.setFakeBoldText(true);
		bajie.setOnClickListener(new bajieListener());
		gadanlajiema = (Button) findViewById(R.id.gadanlajiema);
		gadanlajiema.setText("དགའ་ལྡན་ལྷ་བརྒྱ་མ།");
		gadanlajiema.setTypeface(face);
		TextPaint tp5 = gadanlajiema.getPaint();
		tp5.setFakeBoldText(true);
		gadanlajiema.setOnClickListener(new gadanlajiemaListener());
		lamaqueba = (Button) findViewById(R.id.lamaqueba);
		lamaqueba.setText("བླ་མ་མཆོད་པ།");
		lamaqueba.setTypeface(face);
		TextPaint tp6 = lamaqueba.getPaint();
		tp6.setFakeBoldText(true);
		lamaqueba.setOnClickListener(new lamaquebaListener());
		badansasong = (Button) findViewById(R.id.badansasong);
		badansasong.setText("དཔལ་ལྡན་ས་གསུམ་མ།");
		badansasong.setTypeface(face);
		TextPaint tp7 = badansasong.getPaint();
		tp7.setFakeBoldText(true);
		badansasong.setOnClickListener(new badansasongListener());
		gasanba = (Button) findViewById(R.id.gasanba);
		gasanba.setText("སྐབས་གསུམ་པ།");
		gasanba.setTypeface(face);
		TextPaint tp8 = gasanba.getPaint();
		tp8.setFakeBoldText(true);
		gasanba.setOnClickListener(new gasanbaListener());
		lanzuonan = (Button) findViewById(R.id.lanzuonan);
		lanzuonan.setText("ལམ་གཙོ་རྣམ་གསུམ། ");
		lanzuonan.setTypeface(face);
		TextPaint tp9 = lanzuonan.getPaint();
		tp9.setFakeBoldText(true);
		lanzuonan.setOnClickListener(new lanzuonanListener());

		danzhedb = (Button) findViewById(R.id.danzhedb);
		danzhedb.setText("རྟེན་འབྲེལ་བསྟོད་པ།");
		danzhedb.setTypeface(face);
		TextPaint tp10 = danzhedb.getPaint();
		tp10.setFakeBoldText(true);
		danzhedb.setOnClickListener(new danzhedbListener());
		jienante = (Button) findViewById(R.id.jienante);
		jienante.setTypeface(face);
		jienante.setText("རྗེའི་གསང་བའི་རྣམ་ཐར།");
		TextPaint tp11 = jienante.getPaint();
		tp11.setFakeBoldText(true);
		jienante.setOnClickListener(new jienanteListener());
		lanrenduidong = (Button) findViewById(R.id.lanrenduidong);
		lanrenduidong.setTypeface(face);
		lanrenduidong.setText("ལམ་རིམ་བསྡུས་དོན།");
		TextPaint tp12 = lanrenduidong.getPaint();
		tp12.setFakeBoldText(true);
		lanrenduidong.setOnClickListener(new lanrenduidongListener());
		yundan = (Button) findViewById(R.id.yundan);
		yundan.setText("ཡོན་ཏན་གཞིར་གྱུར་མ།");
		yundan.setTypeface(face);
		TextPaint tp13 = yundan.getPaint();
		tp13.setFakeBoldText(true);
		yundan.setOnClickListener(new yundanListener());
		duojuedexie = (Button) findViewById(R.id.duojuedexie);
		duojuedexie.setTypeface(face);
		duojuedexie.setText("རྟོགས་བརྗོད་འདུན་ལེགས་མ།");
		TextPaint tp14 = duojuedexie.getPaint();
		tp14.setFakeBoldText(true);
		duojuedexie.setOnClickListener(new duojuedexieListener());
		badanyuncuoma = (Button) findViewById(R.id.badanyuncuoma);
		badanyuncuoma.setTypeface(face);
		badanyuncuoma.setText("དཔལ་ལྡན་ཡོན་ཚོགས་མ།");
		TextPaint tp15 = badanyuncuoma.getPaint();
		tp15.setFakeBoldText(true);
		badanyuncuoma.setOnClickListener(new badanyuncuomaListener());
		kuanianma = (Button) findViewById(R.id.kuanianma);
		kuanianma.setTypeface(face);
		kuanianma.setText("མཁའ་མཉམ་མ།");
		TextPaint tp16 = kuanianma.getPaint();
		tp16.setFakeBoldText(true);
		kuanianma.setOnClickListener(new kuanianmaListener());
		xiexiakuayang = (Button) findViewById(R.id.xiexiakuayang);
		xiexiakuayang.setTypeface(face);
		xiexiakuayang.setText("ཤེས་བྱའི་མཁའ་དབྱིངས་མ།");
		TextPaint tp17 = xiexiakuayang.getPaint();
		tp17.setFakeBoldText(true);
		xiexiakuayang.setOnClickListener(new xiexiakuayangListener());
		nandegangri = (Button) findViewById(R.id.nandegangri);
		nandegangri.setTypeface(face);
		nandegangri.setText("རྣམ་དག་གངས་རི་མ།");
		TextPaint tp18 = nandegangri.getPaint();
		tp18.setFakeBoldText(true);
		nandegangri.setOnClickListener(new nandegangriListener());
		sangjuemolan = (Button) findViewById(R.id.sangjuemolan);
		sangjuemolan.setText("བཟང་སྤྱོད་སྨོན་ལམ།");
		sangjuemolan.setTypeface(face);
		TextPaint tp20 = sangjuemolan.getPaint();
		tp20.setFakeBoldText(true);
		sangjuemolan.setOnClickListener(new sangjuemolanListener());
		xianbamolan = (Button) findViewById(R.id.xianbamolan);
		xianbamolan.setTypeface(face);
		xianbamolan.setText("བྱམས་པའི་སྨོན་ལམ།");
		TextPaint tp21 = xianbamolan.getPaint();
		tp21.setFakeBoldText(true);
		xianbamolan.setOnClickListener(new xianbamolanListener());
		juejiumolan = (Button) findViewById(R.id.juejiumolan);
		juejiumolan.setTypeface(face);
		juejiumolan.setText("སྤྱོད་འཇུག་སྨོན་ལམ།");
		TextPaint tp22 = juejiumolan.getPaint();
		tp22.setFakeBoldText(true);
		juejiumolan.setOnClickListener(new juejiumolanListener());
		tuotamolan = (Button) findViewById(R.id.tuotamolan);
		tuotamolan.setTypeface(face);
		tuotamolan.setText("ཐོག་མཐའ་བར་གྱི་སྨོན་ལམ།");
		TextPaint tp23 = tuotamolan.getPaint();
		tp23.setFakeBoldText(true);
		tuotamolan.setOnClickListener(new tuotamolanListener());
		dewajianmolan = (Button) findViewById(R.id.dewajianmolan);
		dewajianmolan.setTypeface(face);
		dewajianmolan.setText("བདེ་བ་ཅན་དུ་སྐྱེ་བའི་སྨོན་ལམ།");
		TextPaint tp24 = dewajianmolan.getPaint();
		tp24.setFakeBoldText(true);
		dewajianmolan.setOnClickListener(new dewajianmolanListener());
		duo = (Button) findViewById(R.id.duo);
		duo.setText("མདོ།");
		duo.setTypeface(face);
		TextPaint tp2 = duo.getPaint();
		tp2.setFakeBoldText(true);
		duo.setOnClickListener(new duoListener());
		duoge = (Button) findViewById(R.id.duoge);
		duoge.setTypeface(face);
		duoge.setText("གདུགས་དཀར།");
		TextPaint tp25 = duoge.getPaint();
		tp25.setFakeBoldText(true);
		duoge.setOnClickListener(new duogeListener());
		zhuogaduoba = (Button) findViewById(R.id.zhuogaduoba);
		zhuogaduoba.setTypeface(face);
		zhuogaduoba.setText("སྒྲོལ་དཀར་བསྟོད་པ།");
		TextPaint tp26 = zhuogaduoba.getPaint();
		tp26.setFakeBoldText(true);
		zhuogaduoba.setOnClickListener(new zhuogaduobaListener());
		lezhima = (Button) findViewById(R.id.lezhima);
		lezhima.setTypeface(face);
		lezhima.setText("ལེགས་བྲིས་མ།");
		TextPaint tp27 = lezhima.getPaint();
		tp27.setFakeBoldText(true);
		lezhima.setOnClickListener(new lezhimaListener());
		yangjianma = (Button) findViewById(R.id.yangjianma);
		yangjianma.setTypeface(face);
		yangjianma.setText("དབྱངས་ཅན་མའི་བསྟོད་པ།");
		TextPaint tp28 = yangjianma.getPaint();
		tp28.setFakeBoldText(true);
		yangjianma.setOnClickListener(new yangjianmaListener());
		jiahuacanjue = (Button) findViewById(R.id.jiahuacanjue);
		jiahuacanjue.setTypeface(face);
		jiahuacanjue.setText("འཇམ་དཔལ་མཚན་བརྗོད།");
		TextPaint tp29 = jiahuacanjue.getPaint();
		tp29.setFakeBoldText(true);
		jiahuacanjue.setOnClickListener(new jiahuacanjueListener());
		manladuoque = (Button) findViewById(R.id.manladuoque);
		manladuoque.setTypeface(face);
		manladuoque.setText("སྨན་བླའི་མདོ་ཆོག།");
		TextPaint tp30 = manladuoque.getPaint();
		tp30.setFakeBoldText(true);
		manladuoque.setOnClickListener(new manladuoqueListener());
		genremolan = (Button) findViewById(R.id.genremolan);
		genremolan.setTypeface(face);
		genremolan.setText("ཀུན་རིག་སྨོན་ལམ།");
		TextPaint tp31 = genremolan.getPaint();
		tp31.setFakeBoldText(true);
		genremolan.setOnClickListener(new genremolanListener());
		sangdumolan = (Button) findViewById(R.id.sangdumolan);
		sangdumolan.setTypeface(face);
		sangdumolan.setText("གསང་འདུས་སྨོན་ལམ།");
		TextPaint tp32 = sangdumolan.getPaint();
		tp32.setFakeBoldText(true);
		sangdumolan.setOnClickListener(new sangdumolanListener());
		dequemolan = (Button) findViewById(R.id.dequemolan);
		dequemolan.setTypeface(face);
		dequemolan.setText("བདེ་མཆོག་སྨོན་ལམ།");
		TextPaint tp33 = dequemolan.getPaint();
		tp33.setFakeBoldText(true);
		dequemolan.setOnClickListener(new dequemolanListener());
		jiuxiemolan = (Button) findViewById(R.id.jiuxiemolan);
		jiuxiemolan.setTypeface(face);
		jiuxiemolan.setText("འཇིགས་བྱེད་སྨོན་ལམ།");
		TextPaint tp34 = jiuxiemolan.getPaint();
		tp34.setFakeBoldText(true);
		jiuxiemolan.setOnClickListener(new jiuxiemolanListener());
		duikaomolan = (Button) findViewById(R.id.duikaomolan);
		duikaomolan.setTypeface(face);
		duikaomolan.setText("དུས་འཁོར་སྨོན་ལམ༎");
		TextPaint tp35 = duikaomolan.getPaint();
		tp35.setFakeBoldText(true);
		duikaomolan.setOnClickListener(new duikaomolanListener());
		lanrenmolan = (Button) findViewById(R.id.lanrenmolan);
		lanrenmolan.setTypeface(face);
		lanrenmolan.setText("ལམ་རིམ་སྨོན་ལམ།");
		TextPaint tp36 = lanrenmolan.getPaint();
		tp36.setFakeBoldText(true);
		lanrenmolan.setOnClickListener(new lanrenmolanListener());
		sangemolan = (Button) findViewById(R.id.sangemolan);
		sangemolan.setTypeface(face);
		sangemolan.setText("སྔགས་རིམ་གྱི་སྨོན་ལམ།");
		TextPaint tp37 = sangemolan.getPaint();
		tp37.setFakeBoldText(true);
		sangemolan.setOnClickListener(new sangemolanListener());
		xiangbala = (Button) findViewById(R.id.xiangbala);
		xiangbala.setTypeface(face);
		xiangbala.setText(" བྱང་ཤམྦྷ་ལར་སྐྱེ་བའི་སྨོན་ལམ།");
		TextPaint tp38 = xiangbala.getPaint();
		tp38.setFakeBoldText(true);
		xiangbala.setOnClickListener(new xiangbalaListener());
		danbaima = (Button) findViewById(R.id.danbaima);
		danbaima.setTypeface(face);
		danbaima.setText("བསྟན་འབར་མ།");
		TextPaint tp39 = danbaima.getPaint();
		tp39.setFakeBoldText(true);
		danbaima.setOnClickListener(new danbaimaListener());
		gedanluosang = (Button) findViewById(R.id.gedanluosang);
		gedanluosang.setTypeface(face);
		gedanluosang.setText("དགེ་ལྡན་ལུགས་བཟང་རྒྱས་པའི་སྨོན་ལམ།");
		TextPaint tp40 = gedanluosang.getPaint();
		tp40.setFakeBoldText(true);
		gedanluosang.setOnClickListener(new gedanluosangListener());
		guadui = (Button) findViewById(R.id.guadui);
		guadui.setTypeface(face);
		guadui.setText("ཨོ་རྒྱན་པདྨས་མཛད་པའི་བཀའ་བསྡུས།");
		TextPaint tp41 = guadui.getPaint();
		tp41.setFakeBoldText(true);
		guadui.setOnClickListener(new guaduiListener());
		sanbalunzhi = (Button) findViewById(R.id.sanbalunzhi);
		sanbalunzhi.setTypeface(face);
		sanbalunzhi.setText("བསམ་པ་ལྷུན་གྲུབ་མ།");
		TextPaint tp42 = sanbalunzhi.getPaint();
		tp42.setFakeBoldText(true);
		sanbalunzhi.setOnClickListener(new sanbalunzhiListener());
		sanbaji = (Button) findViewById(R.id.sanbaji);
		sanbaji.setTypeface(face);
		sanbaji.setText("བསམ་པ་མྱུར་གྲུབ་མ།");
		TextPaint tp43 = sanbaji.getPaint();
		tp43.setFakeBoldText(true);
		sanbaji.setOnClickListener(new sanbajiListener());
	}

	/*
	 * public boolean onOptionsItemSelected(MenuItem item) { switch
	 * (item.getItemId()) { case R.id.about: doAbout(); break; default: break; }
	 * return super.onOptionsItemSelected(item); }
	 * 
	 * //弹出关于框 private void doAbout() { Dialog dialog = new
	 * AlertDialog.Builder(MainActivity.this).setTitle(
	 * R.string.aboutTitle).setMessage(R.string.aboutInfo)
	 * .setPositiveButton(R.string.aboutOK, new
	 * DialogInterface.OnClickListener() { public void onClick( DialogInterface
	 * dialoginterface, int i) { // 按钮事件 } }).create(); dialog.show(); }
	 */

	class jiazhuoListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, jiazhuoActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class duoxiuListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, duoxiuActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class duoListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, duoActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class zhuomaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, zhuomaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class bajieListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, bajieActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class gadanlajiemaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, gadanlajiemaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class lamaquebaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, lamaquebaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class badansasongListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, badansasongActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class gasanbaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, gasanbaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class lanzuonanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, lanzuonanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class danzhedbListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, danzhedbActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class jienanteListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, jienanteActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class lanrenduidongListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, lanrenduidongActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class yundanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, yundanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class duojuedexieListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, duojuedexieActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class badanyuncuomaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, badanyuncuomaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class kuanianmaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, kuanianmaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class xiexiakuayangListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, xiexiakuayangActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class nandegangriListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, nandegangriActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class sangjuemolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, sangjuemolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class xianbamolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, xianbamolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class juejiumolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, juejiumolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class tuotamolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, tuotamolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class dewajianmolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, dewajianmolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class duogeListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, duogeActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class zhuogaduobaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, zhuogaduobaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class lezhimaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, lezhimaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class yangjianmaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, yangjianmaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class jiahuacanjueListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, jiahuacanjueActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class manladuoqueListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, manladuoqueActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class genremolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, genremolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class sangdumolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, sangdumolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class dequemolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, dequemolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class jiuxiemolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, jiuxiemolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class duikaomolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, duikaomolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class lanrenmolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, lanrenmolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class sangemolanListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, sangemolanActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class xiangbalaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, xiangbalaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class danbaimaListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, danbaimaActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class gedanluosangListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, gedanluosangActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class guaduiListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, guaduiActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class sanbalunzhiListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, sanbalunzhiActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	class sanbajiListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, sanbajiActivity.class);
			MainActivity.this.startActivity(intent);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// menu.add(Menu.NONE, Menu.FIRST + 1, 0, "About");
		// .setIcon( android.R.drawable.ic_menu_more);
		MenuItem menuItem = menu.add(1001, 100, 1, "系统菜单");
		menuItem.setTitle("关于");
		MenuItem menuItem1 = menu.add(1001, 101, 2, "用户菜单");
		menuItem1.setTitle("更多");
		return true;

	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case 100:
			Toast.makeText(this, "   作者： Zangke\n QQ/微信:335012274", 1).show();
			break;
		case 101:
			Intent intent = new Intent(MainActivity.this, helpActivity.class);
			item.setIntent(intent);
		}
		return false;
	}
}