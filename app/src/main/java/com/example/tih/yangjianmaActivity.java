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

public class yangjianmaActivity extends Activity{
private TextView yangjianmal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yangjianmamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		yangjianmal = (TextView)findViewById(R.id.yangjianmal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		yangjianmal.setTypeface (face);
		yangjianmal.setBackgroundColor(Color.BLACK);
		yangjianmal.setTextColor(Color.WHITE);
		yangjianmal.setMovementMethod(ScrollingMovementMethod.getInstance());
		yangjianmal.setText("༄༅། །ཨོཾ་བདེ་ལེགས་སུ་གྱུར་ཅིག ཆུ་འཛིན་དཀར་པོའི་གློག་ཕྲེང་དྲ་བ་ཅན། །མཁའ་ཡི་མཛེས་བྱེད་འདྲ་བའི་ཡིད་འཕྲོག་མ། །དྲི་ཟའི་ན་ཆུང་དབུས་ན་འཇོ་སྒེག་མཁན། །རིང་ནས་བརྩེ་བའི་ལྷ་མོ་ད་ཚུར་བྱོན། །པདྨའི་བཞིན་ལ་གཡོ་ལྡན་བུང་བའི་མིག །མཐོན་མཐིང་རལ་པའི་རྩེ་ན་འོད་དཀར་ཅན། །རོལ་སྒེག་གར་གྱིས་འགྱིང་བའི་དབྱངས་ཅན་མ། །ད་དུང་བདག་ལ་ངག་གི་དབང་ཕྱུག་སྩོལ། །རོལ་རྩེད་གར་གྱི་ཉམས་ལྡན་རི་དྭགས་མིག །མིག་གིས་ལྟ་བས་མི་ངོམས་ཡིད་འཕྲོག་མ། །མ་ལྟར་བརྩེ་བ་ཁྱོད་ཀྱིས་བདག་གི་ངག །ངག་དབང་ལྷ་མོ་ཉིད་དང་མཚུངས་པར་མཛོད། །སྟོན་ཟླ་རྒྱས་པའི་དཔལ་ལས་ལྷག་པར་མཛེས། །ཚངས་དབྱངས་སྙན་པའི་གདངས་ཀྱང་ཟིལ་གྱིས་གནོན། །ཟབ་ཡངས་རྒྱ་མཚོའི་འཇིང་ལྟར་དཔག་དཀའ་བ། །དབྱངས་ཅན་ལྷ་མོའི་སྐུ་གསུང་ཐུགས་ལ་འདུད། །ཅེས་སྒྲ་དབྱངས་ལྷ་མོ་སྤྱན་དྲངས་ནས་བསྟོད་ཅིང་གསོལ་བ་གདབ་པ་ཡུལ་བྱང་ཕྱོགས་ཀྱི་སྙན་དངགས་མཁན་བློ་བཟང་གྲགས་པའི་དཔལ་གྱིས་སྦྱར་བའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			yangjianmal.setTextSize(35);
			break;
		case R.id.zhun:
			yangjianmal.setTextSize(25);
			break;
		case R.id.xiao:
			yangjianmal.setTextSize(18);
			break;
		case R.id.muzhi:
			yangjianmal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			yangjianmal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			yangjianmal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			yangjianmal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			yangjianmal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			yangjianmal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			yangjianmal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			yangjianmal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			yangjianmal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			yangjianmal.setTextColor(Color.BLUE);
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
