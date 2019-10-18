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

public class gedanluosangActivity extends Activity{
private TextView gedanluosangl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gedanluosangmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		gedanluosangl = (TextView)findViewById(R.id.gedanluosangl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		gedanluosangl.setTypeface (face);
		gedanluosangl.setBackgroundColor(Color.BLACK);
		gedanluosangl.setTextColor(Color.WHITE);
		gedanluosangl.setMovementMethod(ScrollingMovementMethod.getInstance());
		gedanluosangl.setText("༄༅། །རྒྱལ་བ་མ་ལུས་སྐྱེད་པའི་ཡབ་གྱུར་ཀྱང་། །རྒྱལ་སྲས་ཚུལ་གྱིས་ཞིང་ཁམས་རབ་འབྱམས་སུ། །རྒྱལ་བའི་ཆོས་འཛིན་ཐུགས་བསྐྱེད་བདེན་པའི་མཐུས།   །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག །སྔོན་ཚེ་དབང་བོའི་ཏོག་གི་སྤྱན་སྔ་རུ། །དམ་བཅས་ཚེ་ན་སྙིང་སྟོབས་ཆེན་པོ་ཞེས། །སྲས་བཅས་རྒྱལ་བས་བསྔགས་བརྗོད་བདེན་པའི་མཐུས། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག  །ལྟ་སྤྱོད་གཙང་མའི་བརྒྱུད་པ་སྤེལ་བའི་ཕྱིར། །ཐུབ་པའི་དྲུང་དུ་ཤེལ་དཀར་འཕྲེང་བ་ཕུལ། །ཆོས་དུང་གནང་ཞིང་ལུང་བསྟན་བདེན་པའི་མཐུས། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག །ལྟ་བ་རྣམ་དག་རྟག་ཆད་མཐའ་ལས་གྲོལ། །སྒོམ་པ་རྣམ་དག་བྱིང་རྨུགས་མུན་པ་སངས། །སྤྱོད་པ་རྣམ་དག་རྒྱལ་བའི་བཀའ་བཞིན་བསྒྲུབས། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག  །མང་དུ་ཐོས་པ་རྒྱ་ཆེར་བཙལ་བས་མཁས།    །ཐོས་དོན་ཇི་བཞིན་རྒྱུད་ལ་སྦྱར་བས་བཙུན། །ཀུན་ཀྱང་བསྟན་འགྲོའི་དོན་དུ་བསྔོ་བས་བཟང་། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག  །དྲང་ངེས་གསུང་རབ་མ་ལུས་འགལ་མེད་དུ། །གང་ཟག་གཅིག་གི་ཉམས་ལེན་གདམས་པ་རུ། །ངེས་པ་རྙེད་པས་ཉེས་སྤྱོད་མཐའ་དག་འགགས། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག  །ལུང་ཆོས་སྡེ་སྣོད་གསུམ་གྱི་འཆད་ཉན་དང་། །རྟོགས་པའི་བསྟན་པ་བསླབ་གསུམ་ཉམས་ལེན་ཏེ། །མཁས་ཤིང་གྲུབ་པའི་རྣམ་ཐར་རྨད་དུ་བྱུང་། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག  །ཕྱི་རུ་ཉན་ཐོས་སྤྱོད་པས་ཞི་ཞིང་དུལ། །ནང་དུ་རིམ་གཉིས་རྣལ་འབྱོར་གདེང་དང་ལྡན། །མདོ་སྔགས་ལམ་བཟང་འགལ་མེད་གྲོགས་སུ་ཁྱེར། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག །རྒྱུ་ཡི་ཐེག་པར་བཤད་པའི་སྟོང་བ་ཉིད། །འབྲས་བུའི་ཐབས་ཀྱིས་སྒྲུབ་པའི་བདེ་ཆེན་དང་། །མཉམ་སྦྱོར་ཆོས་ཕུང་བརྒྱད་ཁྲིའི་སྙིང་བོའི་བཅུད། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག །སྐྱེས་བུ་གསུམ་གྱི་ལམ་གྱི་སྲུང་མའི་གཙོ། །མྱུར་མཛད་མགོན་དང་རྣམ་སྲས་ལས་གཤིན་སོགས། །བསྟན་སྲུང་དམ་ཅན་རྒྱ་མཚོའི་མཐུ་སྟོབས་ཀྱིས། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག །མདོར་ན་དཔལ་ལྡན་བླ་མའི་སྐུ་ཚེ་བརྟན། །མཁས་བཙུན་བསྟན་འཛིན་དམ་པས་ས་སྟེང་གང་། །བསྟན་པའི་སྦྱིན་བདག་མངའ་ཐང་དར་བ་ཡིས། །བློ་བཟང་རྒྱལ་བའི་བསྟན་པ་རྒྱས་གྱུར་ཅིག། །།ཅེས་པ་འདི་ནི་གུང་ཐང་བསྟན་པའི་སྒྲོན་མེས་མཛད་པའོ།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			gedanluosangl.setTextSize(35);
			break;
		case R.id.zhun:
			gedanluosangl.setTextSize(25);
			break;
		case R.id.xiao:
			gedanluosangl.setTextSize(18);
			break;
		case R.id.muzhi:
			gedanluosangl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			gedanluosangl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			gedanluosangl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			gedanluosangl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			gedanluosangl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			gedanluosangl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			gedanluosangl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			gedanluosangl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			gedanluosangl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			gedanluosangl.setTextColor(Color.BLUE);
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
