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

public class sanbalunzhiActivity extends Activity{
private TextView sanbalunzhil;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sanbalunzhimain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		sanbalunzhil = (TextView)findViewById(R.id.sanbalunzhil);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		sanbalunzhil.setTypeface (face);
		sanbalunzhil.setBackgroundColor(Color.BLACK);
		sanbalunzhil.setTextColor(Color.WHITE);
		sanbalunzhil.setMovementMethod(ScrollingMovementMethod.getInstance());
		sanbalunzhil.setText("༄༅༔ ༔ཨེ་མ་ཧོ༔ ནུབ་ཕྱོགས་བདེ་བ་ཅན་གྱི་ཞིང་ཁམས་སུ༔ སྣང་བ་མཐའ་ཡས་ཐུགས་རྗེའི་བྱིན་རླབས་གཡོས༔ སྤྲུལ་སྐུ་པདྨ་འབྱུང་གནས་བྱིན་བརླབས་ཏེ༔ འཛམ་བུའི་གླིང་དུ་འགྲོ་བའི་དོན་ལ་བྱོན༔ འགྲོ་དོན་རྒྱུན་ཆད་མེད་པའི་ཐུགས་རྗེ་ཅན༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ རྒྱལ་པོ་ཁྲི་སྲོང་ལྡེའུ་བཙན་མན་ཆད་ནས༔ ཆོས་རྒྱལ་གདུང་བརྒྱུད་མཐའ་ནས་མ་སྟོངས་པར༔ དུས་གསུམ་རྒྱུན་ཆད་མེད་པར་བྱིན་གྱིས་རློབས༔ བོད་ཀྱི་ཆོས་སྐྱོང་རྒྱལ་པོའི་གཉེན་གཅིག་པུ༔ རྒྱལ་པོ་ཆོས་སྤྱོད་སྐྱོང་བའི་ཐུགས་རྗེ་ཅན༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ སྐུ་ནི་ལྷོ་ནུབ་སྲིན་པོའི་ཁ་གནོན་མཛད༔ ཐུགས་རྗེས་བོད་ཀྱི་སེམས་ཅན་དོན་ལ་དགོངས༔ མ་རིག་ལོག་པའི་སེམས་ཅན་འདྲེན་པའི་དཔལ༔ ཉོན་མོངས་གདུལ་དཀའི་སེམས་ཅན་ཐབས་ཀྱིས་འདུལ༔ བརྩེ་གདུང་རྒྱུན་ཆད་མེད་པའི་ཐུགས་རྗེ་ཅན༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ དུས་ངན་སྙིགས་མའི་མཐའ་ལ་ཐུག་པའི་ཚེ༔ ནངས་རེ་དགོང་རེ་བོད་ཀྱི་དོན་ལ་འབྱོན༔ ཉི་ཟེར་འཆར་སྡུད་མདངས་ལ་ཆིབས་ཏེ་འབྱོན༔ ཡར་ངོ་ཚེས་བཅུའི་དུས་སུ་དངོས་སུ་འབྱོན༔ འགྲོ་དོན་སྟོབས་ཆེན་མཛད་པའི་ཐུགས་རྗེ་ཅན༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ལྔ་བརྒྱའི་ཐ་མ་རྩོད་དུས་སྙིགས་མ་ལ༔ སེམས་ཅན་ཐམས་ཅད་ཉོན་མོངས་དུག་ལྔ་རགས༔ ཉོན་མོངས་འབྱོལ་ཉོག་དུག་ལྔ་རང་རྒྱུད་སྤྱོད༔ དེ་འདྲའི་དུས་ན་བདག་གིས་ཐུགས་རྗེ་བསྐྱེད༔ དད་ལྡན་མཐོ་རིས་འདྲེན་པའི་ཐུགས་རྗེ་ཅན༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ཧོར་སོག་འཇིགས་པའི་དམག་གིས་མཐའ་བསྐོར་ནས༔ ཆོས་འཁོར་གཉེན་པོ་འཇིག་ལ་ཐུག་པའི་ཚེ༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་ལྷ་སྲིན་སྡེ་བརྒྱད་འཁོར་དང་བཅས༔ དམག་དཔུང་ཧུར་ཐུལ་བཟློག་པར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ སེམས་ཅན་སྒྱུ་ལུས་འཇིག་པའི་ནད་བྱུང་ནས༔ མི་བཟོད་སྡུག་བསྔལ་ཆེན་པོས་ནོན་པའི་ཚེ༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་འདེབས༔ ང་ཉིད་སྨན་གྱི་བླ་དང་དབྱེར་མེད་པས༔ ཚེ་ཟད་མ་ཡིན་བར་ཆད་ངེས་པར་སེལ༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ འབྱུང་བ་དགྲར་ལངས་ས་བཅུད་ཉམས་པའི་ཚེ༔ སེམས་ཅན་མུ་གེའི་ནད་ཀྱིས་ཉེན་པ་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་མཁའ་འགྲོ་ནོར་ལྷའི་ཚོགས་དང་བཅས༔ དབུལ་ཕོངས་བཀྲེས་སྐོམ་སེལ་བར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ལས་ཅན་འགྲོ་བའི་དོན་དུ་གཏེར་འདོན་ན༔ དམ་ཚིག་ཟོལ་ཟོག་མེད་པའི་དཔའ་གདེང་གིས༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་ཡི་དམ་ལྷ་དང་དབྱེར་མེད་པས༔ ཕ་ནོར་བུ་ཡིས་ལོན་པར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ སྦས་ཡུལ་ནགས་རོང་དབེན་ས་སྙོགས་པའི་ཚེ༔ ཁ་ཆར་བུ་ཡུག་འཚུབས་ཤིང་ལམ་འགགས་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་གཞི་བདག་གཉེན་པོའི་འཁོར་དང་བཅས༔ ཆོས་མཛད་ལམ་སྣ་འདྲེན་པར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ སྟག་གཟིག་དོམ་དྲེད་དུག་སྦྲུལ་མཆེ་བ་ཅན༔ འབྲོག་ཆེན་འཇིགས་པའི་འཕྲང་ལ་འགྲིམས་པའི་ཚེ༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་དཔའ་བོ་གིང་དང་སྲུང་མར་བཅས༔ གདུག་པའི་སེམས་ཅན་སྐྲོད་པར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ས་ཆུ་མེ་རླུང་འབྱུང་བའི་བར་ཆད་ཀྱིས༔ སྒྱུ་ལུས་གཡར་པོ་འཇིག་ལ་ཐུག་པའི་ཚེ༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་དཔའ་བོ་གྱད་དང་ལྡན་པ་ཡིས༔ འབྱུང་བ་རང་སར་ཞི་བར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ལམ་སྲང་འཇིགས་པའི་འཕྲང་ལ་འགྲིམས་པའི་ཚེ༔ བསད་ཁྱེར་ཇག་པ་ཆོམ་པོས་ཉེན་པ་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་ཕྱག་རྒྱ་བཞི་ཡི་དགོངས་པར་ལྡན༔ ཙཽ་ར་མི་རྒོད་རྔམ་སེམས་བརླག་པར་བྱེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ གང་ཞིག་གཤེད་མའི་དམག་གིས་མཐའ་བསྐོར་ནས༔ མཚོན་ཆ་རྣོན་པོས་འདེབས་ཤིང་ཉེན་པ་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་་ཐོབས༔ ང་ཉིད་རྡོ་རྗེའི་གུར་དང་ལྡན་པ་ཡིས༔ གཤེད་མ་བྲེད་ཅིང་མཚོན་ཆ་འཐོར་བར་འགྱུར༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ནམ་ཞིག་ཚེ་ཟད་འཆི་བའི་དུས་བྱུང་ཚེ༔ གནད་གཅོད་སྡུག་བསྔལ་འདུ་འཕྲོད་ཉེན་པ་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་སྣང་བ་མཐའ་ཡས་སྤྲུལ་པ་སྟེ༔ བདེ་བ་ཅན་གྱི་ཞིང་དུ་ངེས་པར་སྐྱེ༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ སྒྱུ་ལུས་གཡར་པོ་ཞིག་པའི་བར་དོ་རུ༔ འཁྲུལ་སྣང་ཉིང་འཁྲུལཆེན་པོས་ཉེན་པ་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་དུས་གསུམ་མཁྱེན་པའི་ཐུགས་རྗེ་ཡིས༔ འཁྲུལ་སྣང་རང་སར་གྲོལ་བར་ཐེ་ཚོམ་མེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ གཞན་ཡང་ལས་དང་རྐྱེན་གྱི་དབང་གྱུར་ཏེ༔ འཁྲུལ་སྣང་དངོས་པོར་ཞེན་ཅིང་སྡུག་བསྔལ་ན༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་གསོལ་བ་ཐོབས༔ ང་ཉིད་བདེ་ཆེན་རྒྱལ་པོའི་ངོ་བོ་སྟེ༔ སྡུག་བསྔལ་འཁྲུལ་སྣང་རྩད་ནས་བཤིག་པར་བྱེད༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ འགྲོ་དྲུག་སྡུག་བསྔལ་ཆེན་པོས་ཉེན་པ་དང༔ ཁྱད་པར་བོད་ཀྱི་རྗེ་འབངས་སྡུག་བསྔལ་ན༔ དད་གུས་མོས་པའི་གདུང་ཤུགས་དྲག་པོ་ཡིས༔ ཡིད་གཉིས་ཐེ་ཚོམ་མེད་པར་་གསོལ་བ་ཐོབས༔ ང་ཉིད་་ཐུགས་རྗེས་འཕོ་འགྱུར་མེད་པར་གཟིགས༔ ཨོ་རྒྱན་པདྨ་འབྱུང་གནས་ལ་གསོལ་བ་འདེབས༔ བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས༔ ཞེས་གསུངས་ནས༔ ལྷ་སྲས་ལ་ཐུགས་བརྩེ་བར་དགོངས་ཏེ་ཡིད་བཞིན་ནོར་བུ་ལྟ་བུའི་མན་ངག་བཅུ་གསུམ་གནང་ངོ༔༔ དེ་ནས་ལྷ་སྲས་ཀྱི་གུས་པས་ཕྱག་དང་བསྐོར་བ་བྱས༔ གུ་རུ་ཨོ་རྒྱན་གྱི་ཡུལ་དུ་ཞལ་གཟིགས་ནས་ཉི་ཟེར་ལ་ཆིབས་ནས་བཞུད་དོ༔ ལྷ་སྲས་མུ་ཁྲི་བཙན་པོས་ཉོན་མོངས་རང་གྲོལ་གྱི་མན་ངག་དང༔ ཡིད་བཞིན་ནོར་བུ་ལྟ་བུའི་མན་ངག་བཅུ་གསུམ་ཞལ་ཆེམས་དང་བཅས་པ་མང་ཡུལ་གྱི་བྲག་རིན་ཆེན་སྤུངས་པ་འདྲ་བ་ལ་གཏེར་དུ་སྦས༔ གཏེར་བདག་སའི་ལྷ་མོ་མཆེད་བཞི་ལ་བཅོལ་ལོ༔ ནམ་ཞིག་དུས་ཀྱི་མཐའ་མ་ལ༔ ང་ཡི་གདུང་རྒྱུད་སྡུག་པའི་དུས༔ རི་བོ་བཀྲ་བཟང་ཤར་འདབས་ནས༔ ལས་ཅན་སྐྱེས་བུ་བྱུང་བའི་ཚེ༔ དེ་ཚེ་དེ་ཡིས་རྙེད་གྱུར་ནས༔ བདག་གི་གདུང་རྒྱུད་སྐྱོབ་པར་ཤོག༔ ཅེས་གསུངས་སོ༔ ༔སཱ་སཱརྒ༔");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			sanbalunzhil.setTextSize(35);
			break;
		case R.id.zhun:
			sanbalunzhil.setTextSize(25);
			break;
		case R.id.xiao:
			sanbalunzhil.setTextSize(18);
			break;
		case R.id.muzhi:
			sanbalunzhil.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			sanbalunzhil.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			sanbalunzhil.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			sanbalunzhil.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			sanbalunzhil.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			sanbalunzhil.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			sanbalunzhil.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			sanbalunzhil.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			sanbalunzhil.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			sanbalunzhil.setTextColor(Color.BLUE);
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
