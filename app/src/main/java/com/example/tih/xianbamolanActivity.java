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

public class xianbamolanActivity extends Activity {
	private TextView xianbamolanl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xianbamolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		xianbamolanl = (TextView) findViewById(R.id.xianbamolanl);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/himalaya.ttf");
		xianbamolanl.setTypeface(face);
		xianbamolanl.setBackgroundColor(Color.BLACK);
		xianbamolanl.setTextColor(Color.WHITE);
		xianbamolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		xianbamolanl.setText("༄༅། །རྒྱ་གར་སྐད་དུ། ཨཱརྻ་མེེཏྲི་པྲ་ཎི་དྷཱ་ན་རཱ་ཛཱ། བོད་སྐད་དུ། འཕགས་པ་བྱམས་པའི་སྨོན་ལམ་གྱི་རྒྱལ་པོ། །སངས་རྒྱས་དང་བྱང་ཆུབ་སེམས་དཔའ་ཐམས་ཅད་ལ་ཕྱག་འཚལ་ལོ། །སངས་རྒྱས་ཀུན་ལ་ཕྱག་འཚལ་ལོ། །དྲང་སྲོང་ལྷ་མིག་ལྡན་པ་ཡི། །བྱང་ཆུབ་སེམས་དཔའ་རྣམས་དང་ཡང་། །ཉན་ཐོས་རྣམས་ལ་ཕྱག་འཚལ་ལོ། །ངན་འགྲོའི་ལམ་ནི་བཟློག་བགྱིད་ཅིང་། །མཐོ་རིས་ལམ་ནི་རབ་སྟོན་ལ། །རྒ་ཤི་མེད་པར་འདྲེན་བགྱིད་པའི། །བྱང་ཆུབ་སེམས་ལ་ཕྱག་འཚལ་ལོ། །སེམས་ཀྱི་དབང་དུ་གྱུར་པས་ན། །བདག་གིས་སྡིག་པ་ཅི་བགྱིས་པ། །སངས་རྒྱས་སྤྱན་སྔར་མཆིས་ནས་སུ། །བདག་གིས་དེ་དག་བཤགས་པར་བགྱི། །བདག་ལས་རྣམ་པ་གསུམ་གང་གིས། །བསོད་ནམས་ཚོགས་ནི་བསྐྱེད་པ་དེ། །བདག་གི་ཀུན་མཁྱེན་ས་བོན་ཏེ། །བདག་ལ་བྱང་ཆུབ་མི་ཟད་ཤོག །ཕྱོགས་བཅུ་དག་གི་ཞིང་རྣམས་སུ། །སངས་རྒྱས་མཆོད་པ་གང་བྱུང་བ། །སངས་རྒྱས་མཁྱེན་པ་ཡི་རང་བ། །དེ་ལ་བདག་ནི་ཡི་རང་ངོ་། །སྡིག་པ་ཐམས་ཅད་བཤགས་པར་བགྱི། །བསོད་ནམས་ཀུན་ལ་ཡི་རང་ངོ་། །སངས་རྒྱས་ཀུན་ལ་ཕྱག་འཚལ་ལོ། །བདག་ནི་ཡེ་ཤེས་མཆོག་ཐོབ་ཤོག །ཕྱོགས་བཅུ་དག་གི་ཕྱོགས་རྣམས་སུ། །ས་བཅུ་དག་ལ་གནས་པ་ཡི། །བྱང་ཆུབ་སེམས་དཔའ་བྱང་ཆུབ་མཆོག །འཚང་རྒྱ་བགྱིད་པར་བསྐུལ་མ་འདེབས། །བྱང་ཆུབ་དམ་པར་སངས་རྒྱས་ཤིང་། །སྡེ་དང་བཅས་པའི་བདུད་བཏུལ་ནས། །སྲོག་ཆགས་ཀུན་ལ་སྨན་སླད་དུ། །ཆོས་ཀྱི་འཁོར་ལོ་བསྐོར་གྱུར་ཅིག །ཆོས་རྔ་ཆེན་པོའི་སྒྲ་ཡིས་ནི། །སེམས་ཅན་སྡུག་བསྔལ་མཐར་བགྱིད་ཤོག །བསྐལ་པ་བྱེ་བ་བསམ་ཡས་སུ། །ཆོས་སྟོན་མཛད་ཅིང་བཞུགས་གྱུར་ཅིག །འདོད་པའི་འདམ་དུ་བྱིང་གྱུར་ཅིང་། །སྲེད་པའི་སྲད་བུས་དམ་བཅིངས་པ། །འཆིང་བ་ཀུན་གྱིས་བཅིངས་དག་ལ། །རྐང་གཉིས་མཆོག་རྣམས་གཟིགས་སུ་གསོལ། །སེམས་ཀྱི་དྲི་མར་གྱུར་པ་ལ། །སངས་རྒྱས་རྣམས་ནི་སྨོད་མི་མཛད། །སེམས་ཅན་རྣམས་ལ་བྱམས་ཐུགས་ལྡན། །སྲིད་པའི་མཚོ་ལས་སྒྲོལ་བར་ཤོག །རྫོགས་པའི་སངས་རྒྱས་གང་བཞུགས་དང་། །གང་དག་འདས་དང་མ་བྱོན་པ། །དེ་དག་རྗེས་སུ་བདག་སློབ་ཅིང་། །བྱང་ཆུབ་སྤྱད་པ་སྤྱོད་གྱུར་ཅིག །ཕ་རོལ་ཕྱིན་དྲུག་རྫོགས་བགྱིས་ནས། །འགྲོ་དྲུག་སེམས་ཅན་ཐར་བགྱིད་ཤོག །མངོན་ཤེས་དྲུག་པོ་མངོན་བགྱིས་ནས། །བླ་མེད་བྱང་ཆུབ་རེག་གྱུར་ཅིག །མ་སྐྱེས་པ་དང་མི་འབྱུང་དང་། །རང་བཞིན་མ་མཆིས་གནས་མ་མཆིས། །རྣམ་རིག་མ་མཆིས་དངོས་མ་མཆིས། །སྟོང་བའི་ཆོས་ནི་རྟོགས་པར་ཤོག །སངས་རྒྱས་དྲང་སྲོང་ཆེན་པོ་ལྟར། །སེམས་ཅན་མ་མཆིས་སྲོག་མ་མཆིས། །གང་ཟག་མ་མཆིས་གསོ་མ་མཆིས། །བདག་མ་མཆིས་པའི་ཆོས་རྟོགས་ཤོག །བདག་འཛིན་བདག་གིར་འཛིན་པ་ཡི། །དངོས་པོ་ཀུན་ལ་མི་གནས་པར། །སེམས་ཅན་ཀུན་ལ་སྨན་སླད་དུ། །སེར་སྣ་མ་མཆིས་སྦྱིན་གཏོང་ཤོག །དངོས་པོ་དངོས་པོ་མ་མཆིས་པས། །བདག་གི་ལོངས་སྤྱོད་ལྷུན་འགྲུབ་ཤོག །དངོས་པོ་ཐམས་ཅད་རྣམ་འཇིག་པས། །སྦྱིན་པའི་ཕ་རོལ་ཕྱིན་རྫོགས་ཤོག །ཁྲིམས་ཀྱི་ཚུལ་ཁྲིམས་སྐྱོན་མེད་ཅིང་། །ཚུལ་ཁྲིམས་རྣམ་པར་དག་དང་ལྡན། །རློམ་སེམས་མེད་པའི་ཚུལ་ཁྲིམས་ཀྱིས། །ཚུལ་ཁྲིམས་ཕ་རོལ་ཕྱིན་རྫོགས་ཤོག །ས་འམ་ཡང་ན་ཆུ་འམ་མེ། །རླུང་གི་ཁམས་ལྟར་མི་གནས་ཤིང་། །བཟོད་པའམ་ཁྲོ་བ་མ་མཆིས་པས། ། བཟོད་པའི་ཕ་རོལ་ཕྱིན་རྫོགས་ཤོག །བརྩོན་འགྲུས་བརྩམས་པའི་བརྩོན་འགྲུས་ཀྱིས། །བརྟན་སྤྲོ་ལེ་ལོ་མ་མཆིས་ཤིང་། །སྟོབས་དང་ལྡན་པའི་ལུས་སེམས་ཀྱིས། །བརྩོན་འགྲུས་ཕ་རོལ་ཕྱིན་རྫོགས་ཤོག །སྒྱུ་མ་ལྟ་བུའི་ཏིང་འཛིན་དང་། །དཔའ་བར་འགྲོ་བའི་ཏིང་འཛིན་དང་། །རྡོ་རྗེ་ལྟ་བུའི་ཏིང་འཛིན་གྱིས། །བསམ་གཏན་ཕ་རོལ་ཕྱིན་རྫོགས་ཤོག །རྣམ་པར་ཐར་པའི་སྒོ་གསུམ་དང་། །དུས་གསུམམཉམ་པ་ཉིད་དང་ནི། །རིག་གསུམ་མངོན་སུམ་བགྱིས་པ་ཡིས། །ཤེས་རབ་ཕ་རོལ་ཕྱིན་རྫོགས་ཤོག །སངས་རྒྱས་ཀུན་གྱིས་བསྔགས་པ་དང་། །འོད་དང་གཟི་བརྗིད་འབར་བ་དང་། །བྱང་ཆུབ་སེམས་དཔའི་བརྩོན་འགྲུས་ཀྱིས། །བདག་གཞན་བསམ་པ་རྫོགས་གྱུར་ཅིག །དེ་ལྟར་སྤྱད་པ་སྤྱོད་བྱེད་ཅིང་། །བྱམས་པ་གྲགས་དང་ལྡན་པ་ཡིས། །ཕ་རོལ་ཕྱིན་དྲུག་རྫོགས་བགྱིས་ནས། །ས་བཅུའི་སྤོ་ལ་རབ་ཏུ་གནས། ། ན་མོ་རཏྣ་ཏྲ་ཡཱ་ཡ།  ན་མོ་བྷ་ག་ཝ་ཏེ།  ཤཱཀྱ་མུ་ན་ཡེ།  ཏ་ཐཱ་ག་ཏཱ་ཡ།  ཨརྷ་ཏེ་སམྱཀ་སཾབུ་དྡྷ་ཡ།  ཏདྱ་ཐཱ།  ཨོཾ་ཨ་ཛི་ཏེ།  ཨ་ཛི་ཏེ།  ཨ་བ་རཱ་ཛི་ཏེ།  ཨ་ཛི་ཏེ་ཛ་ཡ།  ཧ་ར་ཧ་ར།  མེེ་ཏྲི་ཨ་ཝ་ལོ་ཀི་ཏེ།  ཀ་ར་ཀ་ར།  མ་ཧཱ་ས་མ་ཡ་སིདྡྷི་བྷ་ར་བྷ་ར།  མ་ཧཱ་བོ་ངྷི་མཎ་བཱི་ཛེ།  སྨ་ར་སྨ་ར།  ཨསྨ་ཀཾ་ས་ཡ།  བོ་ངྷི་བོ་ངྷི། མ་ཧ་བོ་ངྷི་སྭཱ་ཧཱ། ཨོཾ་མོ་ཧི་མོ་ཧི་མོ་ཧཱ་མོ་ཧི་སྭཱ་ཧཱ། ཨོཾ་མུ་ནི་མུ་ནི་སྨ་ར་སྭཱ་ཧཱ། འདི་ཡི་དགེ་བས་བདག་གཞན་འགྲོ་བ་ཀུན། །ཤི་འཕོས་གྱུར་པའི་མོད་ལ་དགའ་ལྡན་དུ། །ཆོས་ཀྱིས་མཐོ་བའི་ཁང་བཟང་དེར་སྐྱེས་ནས། །མི་ཕམ་ཆོས་རྗེའི་སྲས་ཀྱི་ཐུ་བོར་ཤོག །ས་བཅུའི་དབང་ཕྱུག་རྒྱལ་ཚབ་འཛམ་གླིང་དུ། །སྟོབས་བཅུ་མངའ་བའི་གོ་འཕང་བརྙེས་པའི་ཚེ། །གསུང་གི་བདུད་རྩིའི་ཐོག་མ་རབ་མྱངས་ནས། ། རྒྱལ་བའི་མཛད་པ་མ་ལུས་མཐར་ཕྱིན་ཤོག །འདི་ནས་ཤི་འཕོས་གྱུར་མ་ཐག །དགའ་ལྡན་སྐྱེ་གནས་ཡིད་དགའ་བར། ། མྱུར་དུ་བྱམས་མགོན་མཉེས་བྱས་ནས། ། བྱང་ཆུབ་ལུང་བསྟན་ཐོབ་པར་ཤོག །འཕགས་པ་བྱམས་པའི་སྨོན་ལམ་གྱི་རྒྱལ་པོ་རྫོགས་སོ། ། ");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			xianbamolanl.setTextSize(35);
			break;
		case R.id.zhun:
			xianbamolanl.setTextSize(25);
			break;
		case R.id.xiao:
			xianbamolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			xianbamolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			xianbamolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			xianbamolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			xianbamolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			xianbamolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			xianbamolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			xianbamolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			xianbamolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			xianbamolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			xianbamolanl.setTextColor(Color.BLUE);
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
