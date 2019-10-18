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

public class yundanActivity extends Activity{
private TextView yundanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yundanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		yundanl = (TextView)findViewById(R.id.yundanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		yundanl.setTypeface (face);
		yundanl.setBackgroundColor(Color.BLACK);
		yundanl.setTextColor(Color.WHITE);
		yundanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		yundanl.setText("༄༅། །ཡོན་ཏན་ཀུན་གྱི་གཞིར་གྱུར་དྲིན་ཅན་རྗེ། །ཚུལ་བཞིན་བསྟེན་པ་ལམ་གྱི་རྩ་བ་རུ། །ལེགས་པར་མཐོང་ནས་འབད་པ་དུ་མ་ཡིས། །གུས་པ་ཆེན་པོས་བསྟེན་པར་བྱིན་གྱིས་རློབས། །ལན་ཅིག་རྙེད་པའི་དལ་བའི་རྟེན་བཟང་འདི། །ཤིན་ཏུ་རྙེད་དཀའ་དོན་ཆེ་ཤེས་གྱུར་ནས། །ཉིན་མཚན་ཀུན་ཏུ་སྙིང་བོ་ལེན་པའི་བློ། །རྒྱུན་ཆད་མེད་པར་སྐྱེ་བར་བྱིན་གྱིས་རློབས། །ལུས་སྲོག་གཡོ་བ་ཆུ་ཡི་ཆུ་བུར་བཞིན། །མྱུར་དུ་འཇིག་པས་འཆི་བ་དྲན་པ་དང་། །ཤི་བའི་རྗེས་སུ་ལུས་དང་གྲིབ་མ་བཞིན། །དཀར་ནག་ལས་འབྲས་ཕྱི་བཞིན་འབྲང་བ་ལ། །ངེས་པ་བརྟན་པོ་རྙེད་ནས་ཉེས་པའི་ཚོགས། །ཕྲ་ཞིང་ཕྲ་བ་རྣམས་ཀྱང་སྤོང་བ་དང་། །དགེ་ཚོགས་མཐའ་དག་སྒྲུབ་པར་བྱེད་པ་ལ། །རྟག་ཏུ་བག་དང་ལྡན་པར་བྱིན་གྱིས་རློབས། །སྤྱད་པས་མི་ངོམས་སྡུག་བསྔལ་ཀུན་གྱི་སྒོ། །ཡིད་བརྟན་མི་རུང་སྲིད་པའི་ཕུན་ཚོགས་ཀྱི། །ཉེས་དམིགས་རིག་ནས་ཐར་པའི་བདེ་བ་ལ། །དོན་གཉེར་ཆེན་པོ་སྐྱེ་བར་བྱིན་གྱིས་རློབས། །རྣམ་དག་བསམ་པ་དེ་ཡིས་དྲངས་པ་ཡི། །དྲན་དང་ཤེས་བཞིན་བག་ཡོད་ཆེན་པོ་ཡིས། །བསྟན་པའི་རྩ་བ་སོ་སོར་ཐར་པ་ལ། །སྒྲུབ་པ་སྙིང་བོར་བྱེད་པར་བྱིན་གྱིས་རློབས། །རང་ཉིད་སྲིད་མཚོར་ལྷུང་བ་ཇི་བཞིན་དུ། །མར་གྱུར་འགྲོ་བ་ཀུན་ཀྱང་དེ་འདྲ་བར། །མཐོང་ནས་འགྲོ་བ་སྒྲོལ་བའི་ཁུར་འཁྱེར་བའི། །བྱང་ཆུབ་སེམས་མཆོག་འབྱོངས་པར་བྱིན་གྱིས་རློབས། །སེམས་ཙམ་བསྐྱེད་ཀྱང་ཚུལ་ཁྲིམས་རྣམ་གསུམ་ལ། །གོམས་པ་མེད་ན་བྱང་ཆུབ་མི་འགྲུབ་པར། །ལེགས་པར་མཐོང་ནས་རྒྱལ་སྲས་སྡོམ་པ་ལ། །བརྩོན་པ་དྲག་པོས་སློབ་པར་བྱིན་གྱིས་རློབས། །ལོག་པའི་ཡུལ་ལ་གཡེང་བ་ཞི་བྱེད་ཅིང་། །ཡང་དག་དོན་ལ་ཚུལ་བཞིན་དཔྱོད་པ་ཡིས། །ཞི་གནས་ལྷག་མཐོང་ཟུང་དུ་འབྲེལ་བའི་ལམ། །མྱུར་དུ་རྒྱུད་ལ་སྐྱེ་བར་བྱིན་གྱིས་རློབས། །ཐུན་མོང་ལམ་སྦྱང་སྣོད་དུ་གྱུར་པ་ན། །ཐེག་པ་ཀུན་གྱི་མཆོག་གྱུར་རྡོ་རྗེ་ཐེག ། སྐལ་བཟང་སྐྱེ་བོའི་འཇུག་ངོགས་དམ་པ་དེར། །བདེ་བླག་ཉིད་དུ་འཇུག་པར་བྱིན་གྱིས་རློབས། །དེ་ཚེ་དངོས་གྲུབ་རྣམ་གཉིས་འགྲུབ་པའི་གཞི། །རྣམ་དག་དམ་ཚིག་སྡོམ་པར་གསུངས་པ་ལ། །བཅོས་མ་མིན་པའི་ངེས་པ་རྙེད་གྱུར་ནས། །སྲོག་དང་བསྡོས་ཏེ་སྲུང་བར་བྱིན་གྱིས་རློབས། །དེ་ནས་རྒྱུད་སྡེའི་སྙིང་བོ་རིམ་གཉིས་ཀྱི། །གནད་རྣམས་ཇི་བཞིན་རྟོགས་ནས་བརྩོན་པ་ཡིས། །ཐུན་བཞིའི་རྣལ་འབྱོར་སྤྱོད་ལས་མི་གཡེལ་བར། །དམ་པའི་གསུང་བཞིན་སྒྲུབ་པར་བྱིན་གྱིས་རློབས། །དེ་ལྟར་ལམ་བཟང་སྟོན་པའི་བཤེས་གཉེན་དང་། །ཚུལ་ཁྲིམས་སྒྲུབ་པའི་གྲོགས་རྣམས་ཞབས་བརྟན་ཅིང་། །ཕྱི་དང་ནང་གི་བར་དུ་གཅོད་པའི་ཚོགས། །ཉེ་བར་ཞི་བར་བྱིན་གྱིས་བརླབ་ཏུ་གསོལ། །  ། །ཞེས་པ་འདི་ནི་རྗེ་ཙོང་ཁ་པ་བློ་བཟང་གྲགས་པས་མཛད་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			yundanl.setTextSize(35);
			break;
		case R.id.zhun:
			yundanl.setTextSize(25);
			break;
		case R.id.xiao:
			yundanl.setTextSize(18);
			break;
		case R.id.muzhi:
			yundanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			yundanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			yundanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			yundanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			yundanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			yundanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			yundanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			yundanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			yundanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			yundanl.setTextColor(Color.BLUE);
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
