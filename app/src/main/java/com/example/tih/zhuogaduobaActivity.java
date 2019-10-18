package com.example.tih;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class zhuogaduobaActivity extends Activity{
private TextView zhuogaduobal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhuogaduobamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		zhuogaduobal = (TextView)findViewById(R.id.zhuogaduobal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		zhuogaduobal.setTypeface (face);
		zhuogaduobal.setBackgroundColor(Color.BLACK);
		zhuogaduobal.setTextColor(Color.WHITE);
		zhuogaduobal.setMovementMethod(ScrollingMovementMethod.getInstance());
		zhuogaduobal.setText(" ༄༅། །ཨོཾ་འཁོར་བ་ལས་སྒྲོལ་ཏཱ་རེ་མ། །ཏུཏྟཱ་རེ་ཡིས་འཇིགས་བརྒྱད་སྒྲོལ། །ཏུ་རེ་ན་བ་རྣམས་ལས་སྒྲོལ། །སྒྲོལ་མ་ཡུམ་ལ་ཕྱག་འཚལ་ལོ། །པདྨ་དཀར་པོའི་དབུས་གནས་པ། །ཟླ་བའི་གཟུགས་ཀྱི་གདན་སྟེང་དུ། །རྡོ་རྗེའི་སྐྱིལ་ཀྲུང་བཅས་མཛད་མ། །མཆོག་སྦྱིན་མ་ལ་ཕྱག་འཚལ་ལོ། །སྟོན་ཀའི་ཟླ་བའི་མདོག་འདྲ་ཞིང་། །ཟླ་བ་ལ་ནི་རྒྱབ་བརྟེན་མ། །རྒྱན་རྣམས་ཐམས་ཅད་ཡོངས་སུ་རྫོགས། །ཨུཏྤལ་བསྣམས་ལ་ཕྱག་འཚལ་ལོ། །བཅུ་དྲུག་ལོན་པའི་ལུས་དང་ལྡན། །རྫོགས་སངས་རྒྱས་ཀུན་དེ་ཡི་སྲས། །འདོད་སྦྱིན་སྐུ་ནི་འཆང་བའི་ཡུམ། །སྒྲོལ་མ་ཁྱོད་ལ་ཕྱག་འཚལ་ལོ། །འཁོར་ལོ་དཀར་པོའི་འོད་ཟེར་དཀར། །རྩིབས་བརྒྱད་ལ་ནི་ཡི་གེ་བརྒྱད། །ཡོངས་སུ་བསྐོར་བའི་རྣམ་པ་ཅན། །འཁོར་ལོ་ཅན་ལ་ཕྱག་འཚལ་ལོ། །འཕགས་མ་སྒྲོལ་མ་སྒྲོལ་མཛད་ཡུམ། །ཡིད་བཞིན་འཁོར་ལོ་ཚེ་འཕེལ་མ། །ལྷ་མོ་ཁྱོད་ལ་གསོལ་བ་ནི། །ཚེ་ཡི་བར་ཆད་ཞི་བ་དང་། །ནད་དང་སྡུག་བསྔལ་ཐམས་ཅད་ལས། །ནུས་ལྡན་ཁྱོད་ཀྱིས་བསྐྱབ་ཏུ་གསོལ། །མཆོག་དང་ཐུན་མོངས་དངོས་གྲུབ་ཀུན། །མ་ལུས་བདག་ལ་གནང་བར་མཛོད། །འཕགས་མ་ཁྱོད་ལ་དད་བྱེད་པ། །དེ་ལ་རྟག་ཏུ་བུ་བཞིན་དགོངས། །བདག་ཀྱང་ཁྱེད་ལ་གསོལ་འདེབས་ཀྱིས། །ཐུགས་རྗེའི་ལྕགས་ཀྱུས་གཟུང་དུ་གསོལ། །ལྷ་མོའི་སྐུ་མདོག་ཟླ་འདྲའི་མདོག  །སྒེག་ཅིང་དུལ་བའི་ཆ་བྱད་ཅན། །གཟུགས་མཛེས་རིན་ཆེན་རྒྱན་གྱིས་སྤྲས། །མཛེས་པ་དར་གྱི་སྨད་གཡོགས་ཅན། །པདྨ་ཟླ་བའི་དབུས་གནས་པ། །ཞབས་གཉིས་རྡོ་རྗེའི་སྐྱིལ་ཀྲུང་མཛད། །ཞལ་གཅིག་ཕྱག་གཉིས་འཛུམ་བག་ཅན། །དུས་གསུམ་སངས་རྒྱས་སྐྱེད་པའི་ཡུམ། །ལྷ་མོ་ཁྱོད་ལ་རྟག་ཏུ་འདུད། །བདག་གཙུག་ཡིད་བཞིན་ནོར་གྱུར་ཅིག  །ཁྱོད་ལ་ཆ་ཙམ་བསྟོད་པས་ནི། །བདག་ཅག་བྱང་ཆུབ་སྒྲུབ་པ་ལ། །དུས་འདི་ནས་བཟུང་བྱང་ཆུབ་བར། །མི་མཐུན་རྐྱེན་རྣམས་ཞི་བ་དང་། །མཐུན་རྐྱེན་ཕུན་སུམ་ཚོགས་གྱུར་ཅིག  ། ཨོ་ཏཱ་རེ་ཏུཏྟཱ་རེ་ཏུ་རེ་མ་མ་ཨཱ་ཡཿཛྙཱ་ན་བུ་ཎྱ་བུཥྚི་གུ་རུ་སྭཱ་ཧཱ།། །།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			zhuogaduobal.setTextSize(35);
			break;
		case R.id.zhun:
			zhuogaduobal.setTextSize(25);
			break;
		case R.id.xiao:
			zhuogaduobal.setTextSize(18);
			break;
		case R.id.muzhi:
			zhuogaduobal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			zhuogaduobal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			zhuogaduobal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			zhuogaduobal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			zhuogaduobal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			zhuogaduobal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			zhuogaduobal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			zhuogaduobal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			zhuogaduobal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			zhuogaduobal.setTextColor(Color.BLUE);
			break;
	    }
	        // TODO Auto-generated method stub
	        if(item.getItemId() == android.R.id.home)
	        {
	            finish();
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }
}
