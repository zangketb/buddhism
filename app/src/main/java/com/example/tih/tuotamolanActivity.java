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

public class tuotamolanActivity extends Activity{
private TextView tuotamolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tuotamolanmian);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		tuotamolanl = (TextView)findViewById(R.id.tuotamolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		tuotamolanl.setTypeface (face);
		tuotamolanl.setBackgroundColor(Color.BLACK);
		tuotamolanl.setTextColor(Color.WHITE);
		tuotamolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		tuotamolanl.setText("༄༅། །ཕྱོགས་བཅུའི་རྒྱལ་བ་སྲས་དང་བཅས་པ་ཐམས་ཅད་ལ་ཕྱག་འཚལ་ལོ། །མཐའ་ཡས་འགྲོ་བ་སྲིད་ལས་བསྒྲལ་བྱའི་ཕྱིར། །མཐའ་མེད་སྨོན་ལམ་ལྷག་བསམ་དག་པས་གདབ། །བསླུ་མེད་དཀོན་མཆོག་གསུམ་དང་མཐུ་སྟོབས་ཅན། །དྲང་སྲོང་མཐུ་ཡིས་བདེན་ཚིག་འགྲུབ་གྱུར་ཅིག །བདག་ནི་སྐྱེ་ཞིང་སྐྱེ་བ་ཐམས་ཅད་དུ། །ངན་སོང་ངན་འགྲོ་ལོག་པར་ལྟུང་བ་ཡི། །སྐྱེས་གནས་རྣམས་སུ་ནམ་ཡང་མི་སྐྱེས་ཞིང་། །དལ་འབྱོར་ཚང་བའི་མི་ལུས་ཐོབ་པར་ཤོག །སྐྱེས་མ་ཐག་ནས་སྲིད་པའི་བདེ་བ་ལ། །ནམ་ཡང་མ་ཆགས་ཐར་པ་ཐོབ་པའི་ཕྱིར། །ངེས་འབྱུང་བསམ་པས་ཚངས་སྤྱོད་ཚོལ་བ་ལ། །བརྩོན་འགྲུས་ལྷོད་པ་མེད་པར་འཇུག་པར་ཤོག །བདག་ནི་རབ་ཏུ་འབྱུང་བར་བྱེད་པ་ལ། །འཁོར་དང་ཉེ་དུ་ལོངས་སྤྱོད་གང་གིས་ཀྱང་། །གེགས་བྱེད་མེད་པར་མཐུན་པའི་རྐྱེན་རྣམས་ཀུན། །ཇི་ལྟར་བསམས་པ་ཇི་བཞིན་འགྲུབ་པར་ཤོག །རབ་ཏུ་བྱུང་ནས་ཇི་སྲིད་འཚོ་ཡི་བར། །མཁན་སློབ་སྤྱན་སྔར་ཇི་ལྟར་ཁས་བླངས་བཞིན། །བཅས་དང་རང་བཞིན་ཁ་ན་མ་ཐོ་བའི། །ཉེས་པས་ནམ་ཡང་གོས་པར་མ་གྱུར་ཅིག །ཚངས་སྤྱོད་རྟེན་ལ་ཐེག་པ་ཆེན་པོ་ཡི། །ཟབ་ཅིང་རྒྱ་ཆེའི་ཆོས་རྣམས་ཇི་སྙེད་པ། །མ་རྣམས་དོན་དུ་དཀའ་བ་དུ་མ་ཡིས། །བསྐལ་པ་དཔག་ཏུ་མེད་པར་སྒྲུབ་པར་ཤོག །ལུང་རྟོགས་ཡོན་ཏན་དུ་མས་རྒྱུད་གཏམས་ཤིང། །དབང་བོ་ཞི་ཞིང་རབ་དུལ་སྙིང་བརྩེར་བཅས། །གཞན་དོན་སྐྱོ་མེད་སྒྲུབ་པའི་སྙིང་སྟོབས་ཅན། །བཤེས་གཉེན་དམ་པས་རྗེས་སུ་འཛིན་པར་ཤོག །རྟག་ཏུ་ངུ་ཡིས་ཆོས་འཕགས་བསྟེན་པ་ལྟར། །ལུས་སྲོག་ལོངས་སྤྱོད་ཀུན་གྱིས་གཡོ་མེད་པར། །བཤེས་གཉེན་དམ་པ་ལེགས་པར་མཉེས་བྱས་ནས། །མི་མཉེས་སྐད་ཅིག་ཙམ་ཡང་མི་བྱེད་ཤོག །ཟབ་ཞི་སྤྲོས་དང་བྲལ་བའི་ཤེར་ཕྱིན་དོན། །ལོག་རྟོག་དྲི་མའི་ཆུ་ཡིས་མ་བསླད་པར། །ཇི་ལྟར་རྟག་ཏུ་ངུ་ལ་བསྙད་པ་ལྟར། །དེ་ལྟར་བདག་ལ་རྟག་ཏུ་འདོམས་པར་ཤོག །ཐུབ་པའི་དགོངས་པའི་དོན་ལས་ཕྱིར་ཕྱོགས་པའི། །རྟག་ཆད་ལྟ་བ་སྟོན་པར་བྱེད་པ་པོ། །མི་དགེའི་བཤེས་གཉེན་སྡིག་པའི་གྲོགས་རྣམས་ཀྱི། །དབང་དུ་ནམ་ཡང་འགྲོ་བར་མ་གྱུར་ཅིག །ལྷག་བསམ་རྣམ་པར་དག་པའི་དར་ཆེན་ཕྱར། །བརྩོན་འགྲུས་ལྷོད་པ་མེད་པའི་རླུང་གིས་བསྐྱོད། །ཐོས་བསམ་སྒོམ་པའི་གྲུ་གཟིངས་ལེགས་བསྡམས་ནས། །ལུས་ཅན་འཁོར་བའི་མཚོ་ལས་སྒྲོལ་བར་ཤོག །ཇི་ཙམ་མང་དུ་ཐོས་དང་ལྷག་པར་གཏོང། །རྣམ་དག་ཚུལ་ཁྲིམས་རྣམ་དཔྱོད་ཤེས་རབ་ཀྱིས། །བདག་རྒྱུད་ལྷག་པར་གྱུར་པ་དེ་ཙམ་དུ། །ཕྱི་ཕྱིར་ཁེངས་པ་ཀུན་དང་བྲལ་བར་ཤོག །རྣམ་དག་རིགས་པའི་སྟོབས་ཀྱིས་གསུང་རབ་དོན། །ཇི་བཞིན་འབྱེད་ལ་གཞན་དྲིང་མི་འཇོག་པའི། །མཁས་པའི་གམ་དུ་མཐའ་ཡས་གསུང་རབ་ལ། །ངོམས་པ་མེད་པའི་ཐོས་བ་བྱེད་པར་ཤོག །ཇི་ལྟར་ཐོས་པའི་དོན་ལ་རིགས་པ་བཞིས། །ཉིན་དང་མཚན་དུ་ཚུལ་བཞིན་རབ་བརྟགས་ནས། །བསམ་བྱའི་གནས་ལ་བསམ་ལས་བྱུང་བ་ཡི། །རྣམ་དཔྱོད་བློ་ཡིས་ཐེ་ཚོམ་ཆོད་པར་ཤོག །གང་ཚེ་ཤིན་ཏུ་ཟབ་པའི་ཆོས་ཚུལ་ལ། །བསམ་བྱུང་བློ་ཡིས་ངེས་ཤེས་རྙེད་པའི་ཚེ། །ཚེ་འདིའི་འཁྲི་བ་ཆོད་པའི་བརྩོན་འགྲུས་ཀྱིས། །དབེན་པ་བསྟེན་ནས་ཚུལ་བཞིན་སྒྲུབ་པར་ཤོག །དེ་ལྟར་ཐོས་བསམ་སྒོམ་པས་རྒྱལ་བ་ཡི། །དགོངས་པའི་གནད་རྣམས་རྒྱུད་ལ་བསྐྲུན་པའི་ཚེ། །སྲིད་ལ་བརྐམ་པའི་ཚེ་འདིའི་སྣང་བ་དང་། །རང་བདེ་འདོད་པའི་བློ་རྣམས་མི་འབྱུང་ཤོག །བདག་གིས་བདོག་པའི་དངོས་པོ་ཐམས་ཅད་ལ། །མ་ཆགས་བློ་ཡིས་སེར་སྣ་བཅོམ་བྱས་ཏེ། །ཐོག་མར་ཟང་ཟིང་སྦྱིན་པས་སེམས་ཅན་རྣམས། །འཁོར་དུ་བསྡུས་ནས་ཆོས་ཀྱིས་ཚིམ་བྱེད་ཤོག །ཇི་ལྟར་ནོད་པའི་བསླབ་པ་ཕྲ་བ་ཡང་། །ངེས་འབྱུང་བསམ་པས་བྱང་ཆུབ་ཐོབ་ཀྱི་བར། །སྲོག་གི་ཕྱིར་ཡང་གཏོང་བར་མི་བྱེད་པའི། །ཐར་བའི་རྒྱལ་མཚན་རྟག་ཏུ་འཛིན་པར་ཤོག །བདག་ལ་བརྡེག་འཚོག་མཚང་འབྲུའི་སེམས་ཅན་རྣམས། །མཐོང་ངམ་ཐོས་སམ་ཡིད་ལ་དྲན་པའི་ཚེ། །ཁོང་ཁྲོ་བྲལ་ཞིང་སླར་ཡང་དེ་དག་གི ། ཡོན་ཏན་བརྗོད་ཅིང་བཟོད་པ་སྒོམ་པར་ཤོག །དཀར་པོའི་ཆོས་རྣམས་མ་ཐོབ་ཐོབ་པ་དང་། །ཐོབ་རྣམས་གོང་ནས་གོང་དུ་འཕེལ་བ་ལས། །ཉམས་པར་བྱེད་པའི་ལེ་ལོ་རྣམ་པ་གསུམ། །ཀུན་ནས་སྤངས་ཏེ་བརྩོན་འགྲུས་རྩོམ་པར་ཤོག །སྲིད་མཐའ་གནོན་པའི་ལྷག་མཐོང་སྟོབས་དང་བྲལ། །ཞི་མཐའ་གནོན་པའི་སྙིང་རྗེའི་རླན་གྱིས་དབེན། །ཕལ་ཆེར་སྲིད་པར་འཕེན་པར་བྱེད་པ་ཡི། །ཞི་གནས་སྤངས་ཏེ་ཟུང་འབྲེལ་སྒོམ་པར་ཤོག །གནས་ལུགས་ཟབ་མོའི་དོན་ལ་སྐྲག་གྱུར་ནས། །བློས་བྱས་ཉི་ཚེའི་སྟོང་བ་མཆོག་འཛིན་པའི། །ལོག་པའི་ལྟ་ངན་མཐའ་དག་རབ་སྤངས་ཏེ། །ཆོས་ཀུན་གདོད་ནས་སྟོང་བར་རྟོགས་པར་ཤོག །རྣམ་དག་བསླབ་པ་ཁྲེལ་མེད་སེམས་ཀྱིས་དྲལ། །དམ་པས་སྨད་པའི་ལས་ལ་འཇིགས་མི་བྱེད། །ཁྲིམས་འཆལ་དགེ་སྦྱོང་ཤ་ཚུགས་ཅན་རྣམས་ཀྱང་། །བདག་གིས་སྐྱོན་མེད་ཁྲིམས་ལ་སྦྱོར་བར་ཤོག །ཡང་དག་ལམ་དོར་ལོག་པའི་ལམ་ངན་ཞུགས། །མི་དགེའི་བཤེས་གཉེན་སྡིག་གྲོགས་དབང་དུ་སོང་། །གང་ཡིན་དེ་ཡང་བདག་གིས་བདེ་བླག་ཏུ། །རྒྱལ་བས་བསྔགས་པའི་ལམ་ལ་འགོད་པར་ཤོག །བདག་གིས་འཆད་རྩོད་རྩོམ་པ་སེང་གེའི་སྒྲས། །ལོག་སྨྲའི་ཝ་ཚོགས་སྤོབས་པ་ཕྲོགས་བྱས་ནས། །གང་གིས་འདུལ་བའི་ཐབས་ཀྱིས་རྗེས་བཟུང་སྟེ། །མི་ནུབ་བསྟན་པའི་རྒྱལ་མཚན་འཛིན་པར་ཤོག །བདག་ནི་གང་དུ་སྐྱེས་ནས་ཐུབ་པ་ཡི། །གསུང་གི་བདུད་རྩི་འཐུང་བ་དེ་ཡི་ཚེ། །རིགས་གཟུགས་འབྱོར་དང་དབང་ཕྱུག་ཤེས་རབ་དང་། །ཚེ་རིང་ནད་མེད་བདེ་དང་ལྡན་པར་ཤོག །བདག་གི་ལུས་དང་སྲོག་དང་ལོངས་སྤྱོད་ལ། །རྒྱུན་དུ་འཚེ་བའི་བསམ་པ་དང་ལྡན་ཞིང་། །བདག་ལ་མི་སྙན་བརྗོད་པ་དེ་དག་ལའང་། །བདག་ནི་ལྷག་པར་མ་བཞིན་བྱམས་གྱུར་ཅིག །བདག་གིས་དེ་དག་རིང་བོར་མི་ཐོགས་པར་། །བདག་པས་གཞན་གཅེས་སྒོམ་པའི་བྱང་ཆུབ་སེམས། །ལྷག་བསམ་དག་པ་རྒྱུད་ལ་བསྐྱེད་བྱས་ནས། །བླ་མེད་བྱང་ཆུབ་གོ་འཕང་སྟེར་བར་ཤོག །སྨོན་ལམ་འདི་དག་གང་གིས་མཐོང་ངམ་ཐོས། །ཡིད་ལ་དྲན་པར་བྱེད་པ་དེ་དག་ཀྱང་། །རྒྱལ་སྲས་རྣམས་ཀྱི་སྨོན་ལམ་རླབས་པོ་ཆེ། །མ་ལུས་སྒྲུབ་ལ་ཞུམ་པ་མེད་པར་ཤོག །ལྷག་བསམ་དག་པའི་སྟོབས་ཀྱིས་ལེགས་བསྒྲུབས་པའི། །རྒྱ་ཆེན་སྨོན་ལམ་བཏབ་པ་འདི་ཡི་མཐུས། །སྨོན་ལམ་ཕ་རོལ་ཕྱིན་པ་ཡོངས་རྫོགས་ནས། ། ལུས་ཅན་ཀུན་གྱི་རེ་བ་སྐོང་བར་ཤོག །།ཅེས་པ་འདི་ནི་རྗེ་ཙོང་ཁ་པ་བློ་བཟང་གྲགས་པས་མཛད་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			tuotamolanl.setTextSize(35);
			break;
		case R.id.zhun:
			tuotamolanl.setTextSize(25);
			break;
		case R.id.xiao:
			tuotamolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			tuotamolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			tuotamolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			tuotamolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			tuotamolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			tuotamolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			tuotamolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			tuotamolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			tuotamolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			tuotamolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			tuotamolanl.setTextColor(Color.BLUE);
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
