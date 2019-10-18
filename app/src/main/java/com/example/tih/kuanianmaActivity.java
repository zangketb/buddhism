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

public class kuanianmaActivity extends Activity{
private TextView kuanianmal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kuanianmamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		kuanianmal = (TextView)findViewById(R.id.kuanianmal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		kuanianmal.setTypeface (face);
		kuanianmal.setBackgroundColor(Color.BLACK);
		kuanianmal.setTextColor(Color.WHITE);
		kuanianmal.setMovementMethod(ScrollingMovementMethod.getInstance());
		kuanianmal.setText("༄༅། །མཁའ་མཉམ་འགྲོ་ལ་མཁྱེན་བརྩེས་རབ་དགོངས་ནས། །གྲངས་མེད་གསུམ་དུ་ཚོགས་གཉིས་རབ་རྫོགས་ཏེ། །སྟོང་གསུམ་མི་མཇེད་ཞིང་གི་དཔལ་གྱུར་པ། །འདྲེན་མཆོག་ཤཱཀྱའི་ཏོག་ལ་ཕྱག་འཚལ་ལོ། །ཤེས་རབ་ཆེན་པོས་དེ་ཉིད་ལེགས་རྟོགས་ནས། །བརྩོན་པ་ཆེན་པོས་གོ་འཕང་མཆོག་བརྙེས་པ། །བསྟན་པ་འདི་ལ་སྟོན་པ་གཉིས་པར་གྲགས། །འཕགས་མཆོག་ཀླུ་སྒྲུབ་ཞབས་ལ་ཕྱག་འཚལ་ལོ། །དེ་སྲས་ཐུ་བོ་དགེ་ལེགས་དཔལ་ཡོན་ཅན། །ལོག་སྨྲ་ཚར་གཅོད་སྐལ་ལྡན་རྗེས་སུ་འཛིན། །ཐར་འདོད་རྣམས་ལ་ཐར་པའི་ལམ་སྟོན་པ། །ཨཱརྱ་དེ་ཝའི་ཞབས་ལ་ཕྱག་འཚལ་ལོ། །མཁྱེན་པའི་དཀྱིལ་འཁོར་ལེགས་བཤད་འོད་སྟོང་ཅན། །རབ་འབྱམས་ཤེས་བྱའི་མཁའ་ལ་རབ་འཕགས་ཤིང་། །བདེ་གཤེགས་གསུང་རབ་ཉིན་མོར་བྱེད་པའི་དཔལ། །འཕགས་པ་ཐོགས་མེད་ཞབས་ལ་ཕྱག་འཚལ་ལོ། །དགུ་བཅུ་གོ་དགུ་འབུམ་སྡེའི་གཞུང་རྣམས་ཀྱིས། །གང་གི་བློ་གྲོས་མགུལ་བ་རབ་བརྒྱན་ཅིང་། །འཛམ་གླིང་འདི་ན་ཀུན་མཁྱེན་གཉིས་པར་གྲགས། །མཁས་མཆོག་དབྱིག་གཉེན་ཞབས་ལ་ཕྱག་འཚལ་ལོ། །ཕུལ་དུ་བྱུང་བའི་བློ་གྲོས་སྟོབས་ཀྱིས་བཙུན། །རྨད་དུ་བྱུང་བའི་ཡོན་ཏན་ཁུར་གྱིས་བརྗིད། །ལོག་སྨྲ་འདམ་བུའི་ཚལ་རབ་འཇོམས་མཛད་པའི། །ཕྱོགས་ཀྱི་གླང་བོའི་ཞབས་ལ་ཕྱག་ཚལ་ལོ། །ཆོས་ཀྱི་རིགས་པས་ཆོས་མིན་ཕམ་མཛད་ཅིང་། །གྲགས་པའི་སྒྲ་ཆེན་འཇིག་རྟེན་གསུམ་ན་གྲགས། །སྨྲ་ངན་མུན་འཇོམས་སྨྲ་བའི་ཉི་མ་མཆོག །ཆོས་ཀྱི་གྲགས་པའི་ཞབས་ལ་ཕྱག་འཚལ་ལོ། །ཚུལ་ཁྲིམས་རྒྱ་མཚོའི་དབུས་ན་གནས་བཅས་ཤིང་། །འབུམ་ཕྲག་འདུལ་བའི་གཞུང་གི་གདེངས་ཀས་བརྗིད། །རྣམ་གྲོལ་ཐར་པའི་ནོར་བུས་གཙུག་ན་མཛེས། །མཆོག་གཉིས་ཀླུ་ཡི་དབང་པོ་ལ་ཕྱག་འཚལ། །ཐུབ་པའི་བསྟན་ལ་ཤིང་རྟའི་སྲོལ་བཏོད་ནས། །སྐྱེ་རྒུ་རྣམས་ལ་ལེགས་པའི་ལམ་སྟོན་པ། །འཛམ་གླིང་མཛེས་བྱེད་རྒྱན་དྲུག་མཆོག་གཉིས་ལ། །རྟག་ཏུ་གུས་པའི་ཡིད་ཀྱིས་ཕྱག་འཚལ་ལོ། །ཞེས་པ་འདི་ནི་རྗེ་རེད་མདའ་བ་གཞོན་ནུ་བློ་གྲོས་ཀྱིས་མཛད་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			kuanianmal.setTextSize(35);
			break;
		case R.id.zhun:
			kuanianmal.setTextSize(25);
			break;
		case R.id.xiao:
			kuanianmal.setTextSize(18);
			break;
		case R.id.muzhi:
			kuanianmal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			kuanianmal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			kuanianmal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			kuanianmal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			kuanianmal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			kuanianmal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			kuanianmal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			kuanianmal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			kuanianmal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			kuanianmal.setTextColor(Color.BLUE);
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
