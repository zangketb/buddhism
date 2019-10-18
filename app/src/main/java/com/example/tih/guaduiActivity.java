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

public class guaduiActivity extends Activity{
private TextView guaduil;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guaduimain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		guaduil = (TextView)findViewById(R.id.guaduil);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		guaduil.setTypeface (face);
		guaduil.setBackgroundColor(Color.BLACK);
		guaduil.setTextColor(Color.WHITE);
		guaduil.setMovementMethod(ScrollingMovementMethod.getInstance());
		guaduil.setText("༄༅༔ ༔ ཨྱོཾན་སྐད་དུ༔  བུདྡྷ་དྷརྨ་སཾ་གྷ་ཡ༔ བོད་སྐད་དུ༔ སངས་རྒྱས་ཆོས་དང་དགེ་འདུན་ལ༔ རྟག་ཏུ་གུས་པས་ཕྱག་འཚལ་ལོ༔ འདྲེན་པའི་སྐྱེས་བུ་པདྨ་འབྱུང་གནས་ཀྱི༔ གདུལ་བྱའི་དོན་དུ་འཁྲུངས་རབས་འདི་བསྟན་པས༔ སྐལ་ལྡན་དོན་དུ་ཤེས་ལྡན་དད་པས་སྐྱོབ༔ ཨེ་མ་ཧོ༔ དེ་ནས་རྒྱལ་སྲས་མུ་ཁྲི་བཙན་པོ་ཡིས༔ དབུ་རྩེ་རིགས་གསུམ་སློབ་དཔོན་སྤྱན་དྲངས་ནས༔ ཟ་འོག་དགུ་བརྩེགས་ཁྲི་ལ་སློབ་དཔོན་བཞུགས༔ ཟ་འོག་ལྔ་བརྩེགས་ཁྲི་ལ་མཁན་པོ་བཞུགས༔ གཡས་གྲལ་གཡོན་གྲལ་གཡོན་གྲལ་གབ་རྩེའི་གདན་སྟེང་ནས༔ བེེ་རོས་གཙོ་བྱས་ལོ་ཙཱ་རྣམ་གསུམ་བཞུགས༔ ནོར་སྣ་ཁྱད་འཕགས་མང་པོ་ཕུལ་ནས་སུ༔ ཕྱག་སྟེ་མང་དུ་བཙལ་ནས་ཞུས་པ་ནི༔ ཨེ་མ་ཧོ༔ དུས་གསུམ་མཁྱེན་པའི་རྒྱལ་སྲས་ཆེན་པོ་ལགས༔ ཡབ་རྗེ་ཁྲི་སྲོང་ལྡེའུ་བཙན་དགུང་དུ་གཤེགས༔ བསྟན་པའི་སྒྲོན་མེ་སྲིན་པོའི་ཡུལ་དུ་གཤེགས༔ བོད་ཀྱི་མི་རྣམས་ཚེ་ཐུང་གཡེང་བས་ཁེངས༔ འདི་ནས་བཟུང་སྟེ་བསྐལ་བ་ཐ་མའི་བར༔ སྐལ་ལྡན་དོན་དུ་དམ་ཆོས་དོན་འདུས་པ༔ གུ་རུ་ཉིད་ལ་གསོལ་བ་འདེབས་ནུས་པའི༔ ཁྱེད་ཀྱིས་རྣམ་ཐར་མདོར་བསྡུས་གསུང་བར་ཞུ༔ དེ་སྐད་ཞུས་པས་གུ་རུས་བཀའ་བསྩལ་པ༔ ལེགས་པར་ཉོན་ཅིག་མུ་ཁྲི་བཙན་པོ་ཁྱོད༔ མ་འོངས་དོན་དུ་བདག་གིས་མདོར་བསྡུས་བསྟན༔ ཨེ་མ་ཧོ༔ སྐྱེས་པའི་ཡབ་བརྒྱད་བལྟམས་པའི་ཡུམ་བརྒྱད་དང་༔ སྤྲུལ་བའི་སྲས་བརྒྱད་བྱོན་པའི་ཡུལ་བརྒྱད་དང་༔ བཞུགས་པའི་གནས་བརྒྱད་བསྟེན་པའི་བླ་མ་བརྒྱད༔ ཞལ་གཟིགས་ཡི་དམ་མཐར་ཕྱིན་གྲུབ་རྟགས་བརྒྱད༔ དུར་ཁྲོད་ཆས་བརྒྱད་ཆོས་བརྒྱུད་སློབ་མ་བརྒྱད༔ དབེན་གནས་བརྒྱད་དང་ཐུགས་བྱོན་ཇོ་མོ་བརྒྱད༔ མཛད་འཕྲིན་བརྒྱད་དང་སྦས་པའི་གཏེར་ཁ་བརྒྱད༔ ཉམས་ལེན་ཟབ་ཆོས་བརྒྱད་དང་ཆོས་བདག་གླིང་པ་བརྒྱད་རྣམས་ཡོད༔ ཨེ་མ་ཧོ༔ དང་པོ་གུ་རུ་མཚན་བརྒྱད་བྱོན་ཚུལ་ནི༔ ཁམས་གསུམ་སེམས་ཅན་བདེ་ལ་བཀོད༔ གུ་རུ་པདྨ་འབྱུང་གནས་ཡིན༔ བསྟན་པའི་མངའ་བདག་ཆོས་ཀྱི་རྗེ༔ གུ་རུ་པདྨ་སཾ་བྷ་ཡིན༔ སྐྱོན་གྱིས་མ་གོས་སྡེ་སྣོད་འཛིན༔ གུ་རུ་པདྨ་རྒྱལ་པོ་ཡིན༔ བདེ་བ་ཐམས་ཅད་སྐུ་ལ་རྫོགས༔ གུ་རུ་རྡོ་རྗེ་གྲོ་ལོད་ཡིན༔ ཐེག་ཀུན་མཉམ་ཉིད་ནམ་མཁར་བརྡལ༔ གུ་རུ་ཉི་མ་འོད་ཟེར་ཡིན༔ སྐུ་ལུས་གཅིག་ལ་བཀོད་པ་བརྒྱད༔ གུ་རུ་ཤཱཀྱ་སེངྒེ་ཡིན༔ རིགས་དྲུག་ཀུན་ལ་ཆོས་སྒྲ་སྒྲོག༔ གུ་རུ་སེངྒེ་སྒྲ་སྒྲོགས་ཡིན༔ ཤེས་བྱ་ཐམས་ཅད་མཁྱེན་མཛད་པའི༔ གུ་རུ་བློ་ལྡན་མཆོག་སྲེད་ཡིན༔ གུ་རུ་མཚན་བརྒྱད་ཀྱི་ལེའུ་སྟེ་དང་པོའོ༔ ཨེ་མ་ཧོ༔ གཉིས་པ་སྐྱེས་པའི་ཡབ་བརྒྱད་བསྟན་པ་ནི༔ དབྱིངས་རིག་རྣམ་པར་ཤེས་པའི་ཡབ༔ ཆོས་སྐུ་ཀུན་ཏུ་བཟང་པོ་ཡིན༔ སྐྱེ་འཆི་གཏན་ནས་སྤངས་པའི་ཡབ༔ མགོན་པོ་ཚེ་དཔག་མེད་པ་ཡིན༔ རིགས་དྲུག་འཕགས་པ་ཀུན་གྱིས་ཡབ༔ སངས་རྒྱས་སྣང་བ་མཐའ་ཡས་ཡིན༔ ཆོས་ཀྱི་རྩ་བ་བྱང་སེམས་ཡབ༔ ལོངས་སྐུ་ཐུགས་རྗེ་ཆེན་པོ་ཡིན༔ བསྟན་པའི་གཞི་མ་དགེ་འདུན་ཡབ༔ སྤྲུལ་སྐུ་ཤཱཀྱ་ཐུབ་པ་ཡིན༔ རུས་པ་ཆེ་བ་རྒྱལ་པོའི་ཡབ༔ རྒྱལ་པོ་ཨིནྡྲ་བོ་དྷི་ཡིན༔ མཇལ་བ་སྔ་བ་མི་ཡི་ཡབ༔ ཆོས་བློན་ཏྲི་ན་འཛིན་པ་ཡིན༔ བརྩེ་བས་གྲོས་བཏབ་གྲོགས་ཀྱིས་ཡབ༔ གྲོགས་པོ་གསེར་འོད་དམ་པ་ཡིན༔ སྐྱེས་པའི་ཡབ་བརྒྱད་ཀྱི་ལེའུ་སྟེ་གཉིས་པའོ༔ ཨེ་མ་ཧོ༔ གསུམ་པ་གཏམས་པའི་ཡུམ་བརྒྱད་བསྟན་པ་ནི༔ དྷ་ན་ཀོ་ཤ་རྒྱ་མཚོའི་ཡུམ༔ པདྨ་གེ་སར་སྡོང་བོ་ཡིན༔ ཅིར་ཡང་མ་གྲུབ་བདེ་ཆེན་ཡུམ༔ ཟག་མེད་ཀུན་ཏུ་བཟང་མོ་ཡིན༔ སྤྲུལ་བའི་སྐུ་ལ་བསྟོད་པའི་ཡུམ༔ རྡོ་རྗེ་རྣལ་འབྱོར་མ་ཉིད་ཡིན༔ བདག་འཛིན་སྲི་ཞུ་བཙན་པའི་ཡུམ༔ བཙུན་མོ་འོད་འཆང་ལྷ་མོ་ཡིན༔ དུར་ཁྲོད་བརྟུལ་ཞུགས་མཛད་པའི་ཡུམ༔ དཔལ་ལྡན་རྡོ་རྗེ་ཕག་མོ་ཡིན༔ དབང་བཞི་རྫོགས་པར་བསྐུར་བའི་ཡུམ༔ དགེ་སློང་ཀུན་དགའ་སྨོན་ལམ་ཡིན༔ བཀའ་ཡི་གཉེར་བྱེད་གཏད་པའི་ཡུམ༔ མཁའ་འགྲོ་ལས་ཀྱི་དབང་མོ་ཡིན༔ བསྟན་པའི་སྲོག་ཤིང་བཙུགས་པའི་ཡུམ༔ རྗེ་བཙུན་འཕགས་མ་སྒྲོལ་མ་ཡིན༔ བལྟམས་པའི་ཡུམ་བརྒྱད་ཀྱི་ལེའུ་སྟེ་གསུམ་པའོ༔ ཨེ་མ་ཧོ༔ བཞི་བ་སྤྲུལ་བའི་སྲས་བརྒྱད་བསྟན་པ་ནི༔ བོད་ཡུལ་དམ་ཆོས་ཆགས་པའི་སྲས༔ ཆོས་རྒྱལ་སྲོང་བཙན་སྒམ་པོ་ཡིན༔ དམ་ཆོས་དར་རྒྱས་འབྱུང་བའི་སྲས༔ ཆོས་རྒྱལ་ཁྲི་སྲོང་ལྡེའུ་བཙན་ཡིན༔ དམ་ཆོས་མི་ནུབ་བརྟན་པའི་སྲས༔ རྒྱལ་སྲས་མུ་ཁྲི་བཙན་པོ་ཡིན༔ བསྟན་པ་ཚུལ་བཞིན་འཛིན་པའི་སྲས༔ འཁོར་འབངས་ཀླུ་ཡི་དབང་པོ་ཡིན༔ དྲག་པོ་ཞི་བར་བྱེད་པའི་སྲས༔ རྒྱ་གར་ཨ་ཙར་ནག་པོ་ཡིན༔ བསྟན་པ་འཕེལ་འགྲིབ་གསོ་བའི་སྲས༔ སྙིགས་མའི་སྐྱབས་མགོན་ཇོ་བོ་རྗེ༔ གདུལ་བྱ་གང་མོས་འདུལ་བའི་སྲས༔ ཏེ་ལོ་པྲཛྙཱ་པཱ་ར་ཡིན༔ བསྒོམ་ཆེན་བསྟན་པ་འཛིན་པའི་སྲས༔ ལྷ་རྗེ་ཙནྡྲ་གོ་མི་ཡིན༔ སྤྲུལ་བའི་སྲས་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཞི་པའོ༔ ཨེ་མ་ཧོ༔ ལྔ་བ་བྱོན་པའི་ཡུལ་བརྒྱད་བསྟན་པ་ནི༔ རྒྱ་མཚོར་སྐུ་འཁྲུངས་ཨོ་རྒྱན་ཡུལ་དུ་བྱོན༔ རྒྱལ་པོའི་སྲས་མཛད་ཟ་ཧོར་ཡུལ་དུ་བྱོན༔ བདུད་བཞི་བཅོམ་མཛད་མུ་སྟེགས་ཡུལ་དུ་བྱོན༔ རྫུ་འཕྲུལ་ལྡན་པས་ཡངས་པ་ཅན་དུ་བྱོན༔ ཐོས་བསམ་ལྡན་པས་ཁ་ཆེའི་ཡུལ་དུ་བྱོན༔ གཞན་དོན་མཛད་པས་ལི་ཡི་ཡུལ་དུ་བྱོན༔ རྩོད་མེད་ཡོངས་གྲགས་བལ་བོའི་ཡུལ་དུ་བྱོན༔ སྨོན་ལམ་སྟོབས་ཀྱིས་བོད་ཀྱི་ཡུལ་དུ་བྱོན༔ བྱོན་པའི་ཡུལ་བརྒྱད་ཀྱི་ལེའུ་སྟེ་ལྔའོ༔ ཨེ་མ་ཧོ༔ དྲུག་པ་བཞུགས་པའི་གནས་བརྒྱད་བསྟན་པ་ནི༔ སྡེ་སྣོད་གསུམ་བཙུགས་མ་གྷ་དྷ་རུ་བཞུགས༔ འདུལ་ཁྲིམས་ལྡན་པའི་རྡོ་རྗེ་གདན་དུ་བཞུགས༔ སྙན་གྲགས་ཕྱོགས་བཅུར་དགའ་བའི་ཚལ་དུ་བཞུགས༔ ཕྱོགས་ལྷུང་མེད་པ་སོ་སོའི་གླིང་དུ་བཞུགས༔ བྱང་སེམས་འབྱོངས་བས་སེངྒ་ལ་རུ་བཞུགས༔ བདག་འཛིན་བློས་བཏང་ལྕང་ར་སྨུག་པོ་བཞུགས༔ ཁམས་གསུམ་དབང་བསྡུས་ཡང་ལེ་ཤོད་དུ་བཞུགས༔ རྒྱལ་པོས་གདན་དྲངས་བསམ་ཡས་དབུ་རྩེར་བཞུགས༔ བཞུགས་པའི་གནས་བརྒྱད་ཀྱི་ལེའུ་སྟེ་དྲུག་པའོ༔ ཨེ་མ་ཧོ༔ བདུན་པ་བསྟེན་པའི་བླ་མ་བརྒྱད་བསྟན་པ་ནི༔ གུ་རུ་ཆེན་པོ་ཤྲཱི་སེང་ཧ་བསྟེན༔ རྫོགས་པ་ཆེན་པོའི་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ རྒྱ་གར་མཁན་པོ་པྲ་བྷ་ཧ་སྟི་བསྟེན༔ རབ་བྱུང་བསྒྲུབས་ནས་དགེ་སློང་ཆ་ལུགས་མཛད༔ མཁའ་འགྲོའི་གཙོ་མོ་ལས་ཀྱི་དབང་མོ་བསྟེན༔ ཞི་ཁྲོ་བཀའ་བརྒྱད་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ རིགས་ལྡན་རྒྱལ་པོ་པདྨ་དཀར་པོ་བསྟེན༔ དུས་ཀྱི་འཁོར་ལོའི་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ ཁ་ཆེའི་ཡུལ་དུ་བི་མ་མི་ཏྲ་བསྟེན༔ བདུད་རྩི་ཞི་ཁྲོའི་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ སིངྒ་ལ་རུ་འཇམ་དཔལ་བཤེས་གཉེན་བསྟེན༔ འཇམ་དཔལ་ཞི་ཁྲོའི་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ ཟ་ཧོར་ཡུལ་དུ་ཀླུ་སྒྲུབ་སྙིང་པོ་བསྟེན༔ པདྨ་ཞི་ཁྲོའི་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ ན་ལེནྡྲ་རུ་དྷ་ན་སཾ་ཏྲི་བསྟེན༔ མ་མོ་ཞི་ཁྲོའི་ཆོས་རྣམས་རྫོགས་པར་ཞུས༔ བླ་མ་བརྒྱད་བསྟེན་པའི་ལེའུ་སྟེ་བདུན་པའོ༔ ཨེ་མ་ཧོ༔ བརྒྱད་པ་ཡི་དམ་ལྷ་ཡི་ཞལ་གཟིགས་བསྟན་པ་ནི༔ སྒྲུབ་པ་བཀའ་བརྒྱད་དཀྱིལ་འཁོར་ཞལ་ཕྱེས་ནས༔ བཀའ་རེ་ལ་ནི་གྲུབ་ཆེན་རེ་རེ་ཐོབ༔ འཇིགས་སུ་རུང་བའི་དུར་ཁྲོད་བརྒྱད་དུ་ནི༔ བསིལ་བའི་ཚལ་དུ་བདུད་རྩིའི་སྒྲུབ་པ་མཛད༔ བདུད་རྩི་ཡོན་ཏན་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ ཧཱུཾ་ཆེན་བྲག་ཏུ་ཡང་དག་སྒྲུབ་པ་མཛད༔ ཡང་དག་ཐུགས་ཀྱིས་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ འཇིགས་བྱེད་ཚལ་དུ་གཤིན་རྗེའི་སྒྲུབ་པ་མཛད༔  འཇམ་དཔལ་སྐུ་ཡི་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔  པདྨ་བརྩེགས་སུ་རྟ་མཆོག་སྒྲུབ་པ་མཛད༔ པདྨ་གསུང་གི་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ རོལ་གླིང་ཚལ་དུ་ཕུར་བའི་སྒྲུབ་པའི་མཛད༔ ཕུར་བ་འཕྲིན་ལས་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ ལྷུན་གྲུབ་བརྩེགས་པར་མ་མོའི་སྒྲུབ་པ་མཛད༔ མ་མོ་རྦོད་གཏོང་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ བདེ་ཆེན་བརྡལ་དུ་འཇིག་རྟེན་སྒྲུབ་པ་མཛད༔ འཇིག་རྟེན་མཆོད་བསྟོད་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ ལོ་ཀ་བརྩེགས་སུ་དྲགས་སྔགས་སྒྲུབ་པ་མཛད༔ དམོད་པ་དྲག་སྔགས་ལྷ་ཚོགས་ཞལ་གཟིགས་ཐོབ༔ དུར་ཁྲོད་བརྒྱད་དུ་སྒྲུབ་པ་མཛད་པའི་ལེའུ་སྟེ་བརྒྱད་པའོ༔ ཨེ་མ་ཧོ༔ དགུ་པ་མཐར་ཕྱིན་པའི་གྲུབ་རྟགས་བརྒྱད་བསྟན་པ་ནི༔ ཨོ་རྒྱན་རྒྱལ་པོས་མཐའ་ལ་སྤྱུགས་པའི་ཚེ༔ མཁའ་འགྲོ་དབང་དུ་བསྡུས་པའི་སྒྲུབ་རྟགས་བསྟན༔ རྒྱ་གར་རྒྱལ་པོས་གསལ་ཤིང་རྩེ་ལ་བསྐྱོན༔ ཡན་ལག་སྐྱོན་གྱིས་མ་གོས་སྒྲུབ་རྟགས་བསྟན༔ མུ་སྟེགས་རྒྱལ་པོས་ཆུ་ལ་སྐྱུར་བའི་ཚེ༔ འབྱུང་བ་ཆུ་ཡིས་མ་ཁྱེར་སྒྲུབ་རྟགས་བསྟན༔ ཟ་ཧོར་རྒྱལ་པོས་གསོན་སྲེག་མཛད་པའི་ཚེ༔ འབྱུང་བ་མེ་ཡིས་མ་ཚིག་སྒྲུབ་རྟགས་བསྟན༔ བསམ་ཡས་རྒྱལ་པོའི་མཆོད་གནས་མཛད་པའི་ཚེ༔ སྡེ་བརྒྱད་དབང་དུ་བསྡུས་པའི་སྒྲུབ་རྟགས་བསྟན། །མངའ་བདག་རྒྱལ་པོའི་ཕྱག་ལ་རྒྱོང་པའི་ཚེ༔ སྤྲུལ་བའི་མེ་ཡིས་རྒྱལ་པོས་གོས་ཚིག་ནས༔ ང་ཆེ་ང་བཙན་གསུངས་པའི་སྒྲུབ་རྟགས་བསྟན༔ བདུད་བློན་རྣམས་ཀྱིས་དབྱེན་དབྱེན་ཧས་ཧས་བྱས༔ ཞང་ཞིང་རེངས་དང་གུམ་པའི་སྒྲུབ་རྟགས་བསྟན༔ ལྷོ་ནུབ་སྲིན་པོའི་ཁ་གནོན་མཛད་པའི་ཚེ༔ སྲིན་པོ་ཆོས་ལ་བཀོད་པའི་སྒྲུབ་རྟགས་བསྟན༔ སྒྲུབ་རྟགས་བརྒྱད་བསྟན་པའི་ལེའུ་སྟེ་དགུའོ༔ ཨེ་མ་ཧོ༔ བཅུ་བ་ཆོས་རྒྱུད་འཛིན་པའི་སློབ་མ་བརྒྱད་བསྟན་པ་ནི༔ ནམ་མཁའི་སྙིང་པོ་ཉི་མའི་ཟེར་ལ་ཆིབས༔ སངས་རྒྱས་ཡེ་ཤེས་བྲག་ལ་ཕུར་བ་འདེབས༔ ངན་ལམ་རྒྱལ་མཆོག་རྟ་སྐད་དབྱངས་སུ་ལེན༔ ཡེ་ཤེས་མཚོ་རྒྱལ་བསད་པའི་མི་རོ་སློང་༔ འབྲོག་མི་དཔལ་གྱིས་མ་མོ་བྲན་དུ་ཁོལ༔ གླང་ཆེན་སེང་གེ་དྲེགས་པ་དབང་དུ་བསྡུས༔ བེེ་རོ་ཙཱ་ན་ཨོ་རྒྱན་དངོས་དང་མཉམ༔ མངའ་བདག་རྒྱལ་པོས་སྤྲུལ་པ་འགྱེད་པར་ནུས༔ སློབ་མ་བརྒྱད་ཀྱི་སྤྲུལ་བ་འགྱེད་པའི་ལེའུ་སྟེ་བཅུ་པའོ༔ ཨེ་མ་ཧོ༔ བཅུ་གཅིག་པ་ལུང་བསྟན་དབེན་པའི་གནས་བརྒྱད་བསྟན་པ་ནི༔ བསམ་ཡས་མཆིམས་ཕུ་ལྷོ་བྲག་མཁར་ཆུ་དང་༔ སྒྲགས་ཀྱི་ཡང་རྫོང་ཡར་ལུང་ཤེལ་གྱི་ཕུག༔ བྲག་དམར་གཡའ་མ་མོན་ཁ་ཤྲཱི་རྫོང༔ སེངྒེ་རྫོང་དང་སྤ་གྲོ་སྟག་ཚང་ཕུག༔ དབེན་གནས་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཅུ་གཅིག་པའོ༔ ཨེ་མ་ཧོ༔ བཅུ་གཉིས་པ་ཐུགས་སུ་ཆུད་པའི་ཇོ་མོ་བརྒྱད་བསྟན་པ་ནི༔ རྒྱ་གར་ལྷ་ལྕམ་མནྡྷར་བ་ཡིན༔ སྣོད་ལྡན་བུད་མེད་ཡེ་ཤེས་མཚོ་རྒྱལ་ཡིན༔ ཞབས་ཏོག་ཕུལ་ཕྱིན་ལྕོག་རོ་བཟའ་སྒྲོན་ཡིན༔ དད་པ་ཕུལ་ཕྱིན་དམར་རྒྱན་བཟའ་འཚོ་ཡིན༔ མངོན་རྟོགས་ཕུལ་ཕྱིན་ཤེལ་དཀར་ཚེ་སྒྲོན་ཡིན༔ རྒྱལ་པོའི་སྲས་མོ་ལྷ་ལྕམ་མཆེད་བཞི་ཡིན༔ རྙེད་ནས་ཕུལ་ཕྱིན་ལྷ་ལྕམ་ཁྲོམ་རྒྱན་ཡིན༔ རྒྱལ་པོའི་ཐུགས་བརྩེས་ལྷ་ལྕམ་པདྨ་སྲས༔ བཙུན་མོའི་ཐུགས་བརྩེ་ནུས་སྦྱིན་ས་ལེ་ཡིན༔ ཇོ་མོ་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཅུ་གཉིས་པའོ༔ ཨེ་མ་ཧོ༔ བཅུ་གསུམ་པ་མཛད་པའི་འཕྲིན་ལས་བརྒྱད་བསྟན་པ་ནི༔ འཁོར་བ་མ་ཆགས་རོལ་རྩེད་སྣ་ཚོགས་མཛད༔ སངས་རྒྱས་ཀུན་མཉམ་རྫུ་འཕྲུལ་སྣ་ཚོགས་མཛད༔ བརྟུལ་ཞུགས་སྤྱོད་པས་བམ་རོའི་སྒྲུབ་པ་མཛད༔ འགྲོ་ལ་ཆོས་སྟོན་ཕ་མ་ལྟ་བུ་མཛད༔ བདུད་དཔུང་བཅོམ་ནས་སངས་རྒྱས་བྱང་སེམས་མཛད༔ ཆོས་འཁོར་བསྐོར་ནས་བོད་ཡུལ་ཞབས་བཅགས་མཛད༔ བསྟན་པ་དར་རྒྱས་རིན་ཆེན་གཏེར་སྦས་མཛད༔ སྲིན་པོའི་ཁ་གནོན་འཛམ་གླིང་བདེ་ལ་བཀོད༔ མཛད་པའི་འཕྲིན་ལས་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཅུ་གསུམ་པའོ༔ ཨེ་མ་ཧོ༔ བཅུ་བཞི་པ་སྦས་པའི་གཏེར་ཁ་བརྒྱད་བསྟན་པ་ནི༔ དུས་ཚིགས་དགོངས་ཏེ་དགོངས་གཏེར་སྦས༔ མཐོང་ཐོས་ངེས་སྐྱེས་གསང་གཏེར་སྦས༔ བརྡ་ཡིག་ཤོག་གསེར་ཟབ་གཏེར་སྦས༔ ངོ་མཚར་རྨད་བྱུང་ཡང་གཏེར་སྦས༔ དབུལ་འཕོང་སྐྱོབ་ཕྱིར་ནོར་གཏེར་སྦས༔ སྣ་ཚོགས་འགྲོ་འདུལ་གཏེར་ཕྲན་སྦས༔ ཚུལ་གཅིག་མ་ངེས་གཏེར་གཉིས་སྦས༔ རིན་ཆེན་སྐྱོང་ཕྱིར་ཐུགས་གཏེར་སྦས༔ སྦས་པའི་གཏེར་ཁ་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཅུ་བཞི་པའོ༔ ཨེ་མ་ཧོ༔ བཅོ་ལྔ་པ་ཉམས་སུ་བླངས་པའི་ཆོས་བརྒྱད་བསྟན་པ་ནི། །འདུས་པ་བཞི་དང་ཟུར་པ་བཞི༔ དང་པོ་འདུས་པ་བཞི་པོ་ནི༔ བླ་མ་བཀའ་བརྒྱད་འདུས་པ་དང་། །ཡི་དམ་བཀའ་བརྒྱད་འདུས་པ་དང་༔ མཁའ་འགྲོ་བཀའ་བརྒྱད་འདུས་པ་དང་༔ ཆོས་སྐྱོང་བཀའ་བརྒྱད་འདུས་པ་དང༔ དེ་ནས་ཟུར་པ་བཞི་པོ་ནི༔ རྫོགས་པ་ཆེན་པོའི་ཉི་མ་ཡོད༔ གསང་སྔགས་སྤྱོད་འཇུག་ལམ་རིམ་ཡོད༔ གུ་རུ་དྲག་པོའི་རིགས་སྔགས་ཡོད༔ འཕགས་མ་ཁྲོས་མ་ནག་མོ་ཡོད༔ ཉམས་ལེན་ཟབ་ཆོས་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཅོ་ལྔ་པའོ༔ ཨེ་མ་ཧོ༔ བཅུ་དྲུག་པ་ཆོས་བདག་གླིང་པ་བརྒྱད་བསྟན་པ་ནི༔ སེམས་དཔའ་ཆེན་པོ་བརྒྱད་ཀྱིས་སྤྲུལ་པ་སྟེ༔ དབུས་ན་ཨོ་རྒྱན་གླིང་པ་ཡོད༔ ཤར་ན་རྡོ་རྗེ་གླིང་པ་ཡོད༔ ལྷོ་ན་རིན་ཆེན་གླིང་པ་ཡོད༔ ནུབ་ན་པདྨ་གླིང་པ་ཡོད༔ བྱང་ན་ཀརྨ་གླིང་པ་ཡོད༔ བསམ་གཏན་གླིང་དང་ཉི་ཟླ་གླིང་༔ཞིག་པོ་གླིང་དང་གཏེར་བདག་གླིང་༔ གཏེར་སྟོན་ཆེན་པོ་གླིང་པ་བརྒྱད་བྱུང་ཞིང༔ ཨོ་རྒྱན་ང་ཡི་སྤྲུལ་པ་ཡིན་པར་ངེས༔ ཆོས་བདག་གླིང་པ་བརྒྱད་ཀྱི་ལེའུ་སྟེ་བཅུ་དྲུག་པའོ༔ ཨེ་མ་ཧོ༔ རྒྱལ་པོ་ཆེན་པོ་ལེགས་པར་ཉོན༔ བདག་འདྲ་པདྨ་འབྱུང་གནས་ངས༔ ཐུན་མོང་མངོན་པར་ཤེས་པར་ལྔ༔ མ་འོངས་མངོན་པར་ཤེས་པར་ལྔ༔ འདས་པའི་མངོན་པར་ཤེས་པ་ལྔ༔ ད་ལྟའི་མངོན་པར་ཤེས་པར་ལྔ༔ ཚད་མེད་མངོན་པར་ཤེས་པར་ལྔ༔ མངོན་ཤེས་ལྔ་བོ་ང་ཡིས་ཤེས༔ སྔོན་ཚེ་སྣང་བ་མཐའ་ཡས་འོད་དཔག་མེད༔ རི་བོ་ཏ་ལར་མགོན་པོ་སྤྱན་རས་གཟིགས༔ དྷ་ན་ཀོ་ཤར་པདྨ་འབྱུང་གནས་ང༔ མཚོན་ཚུལ་ཙམ་ལ་སྐུ་གསུམ་སྣང་གྱུར་ཀྱང་༔ དོན་ལ་དབྱེར་མེད་སོ་སོར་ཐ་མི་དད༔ ཆོས་དབྱིངས་གནས་སུ་ཀུན་ཏུ་བཟང་པོ་དང་༔ སྟུག་པོ་བཀོད་ཏུ་རྡོ་རྗེ་འཆང་ཆེན་པོ༔ རྡོ་རྗེ་གདན་དུ་ཐུབ་པ་ཆེན་པོ་ཉིད༔ གཉིས་མེད་པདྨ་ང་རུ་ལྷུན་གྱིས་གྲུབ༔ དེ་བཞིན་ང་ལ་གསོལ་བ་རྒྱུན་དུ་ཐོབ༔ རྒྱལ་པོའི་གདུང་རབས་བརྒྱད་དང་བཅུ་གསུམ་ནས༔ སེ་ཆེན་རྒྱལ་པོས་བོད་ལ་དམག་དྲངས་ནས༔ བོད་འབངས་ཐམས་ཅད་འཕུང་པའི་གཞི་རུ་འགྲོ༔ ང་ཡི་ལྷ་ཁང་རྣམས་ཀྱང་འཇིག་པར་བྱེད་༔ དེ་དུས་ང་སྤྲུལ་ས་སྐྱ་ཞེས་སུ་གྲགས༔ སྟོད་ཀྱི་ཕྱོགས་ནས་ཡབ་མིང་འཇམ་དཔལ་དང་༔ ཡུམ་མིང་སྒྲོལ་མ་ཞེས་བྱའི་སྲས་སུ་འཁྲུངས༔ འགྲོ་མགོན་འཕགས་པ་ཀུན་དགའ་རྒྱལ་མཚན་ཞེས༔ ང་ཡི་ལྷ་ཁང་རྣམས་ལ་ཞིག་གསོ་བྱེད༔ གསང་སྔགས་བསྟན་པ་དར་ཞིང་རྒྱས་པར་འགྱུར༔ བོད་འབངས་སེམས་ཅན་བདེ་ཞིང་སྐྱིད་པར་འབྱུང་༔ དེ་ནས་བོད་ཀྱི་རྒྱལ་པོ་ཧམ་ཐོབ་བྱེད༔ རེས་འགའ་ཆོས་རྒྱལ་རེས་འགའ་བདུད་རྒྱལ་རེ༔ ཆོས་རྒྱལ་དེ་ཡིས་ཆོས་ཁྲིམས་ཚུགས་པར་བྱེད༔ བདུད་རྒྱལ་དེ་ཡིས་ཆོས་ཁྲིམས་བཤིག་པར་བྱེད༔ དེ་དུས་མི་ལ་དར་རྒུད་སྣ་ཚོགས་འོང་༔ ཐུབ་པའི་ལུང་བསྟན་མདོ་ཁམས་སྒང་ཞིག་ཏུ༔ ཨ་ཏི་ཤ་ཡི་སྤྲུལ་པ་བློ་བཟང་གྲགས༔ སྐྱེས་བུ་དེ་བྱོན་བོད་ལ་བདེ་སྐྱིད་འཆར༔ དེ་དུས་དཀར་ཕྱོགས་རྣམས་ཀྱང་སྤོབས་པ་ཐོབ༔ མྱང་སྨད་ཉི་མ་མདོ་རུ་རྫོང་ཞིག་ཆགས༔ ལྷ་ས་དམར་པོ་རི་ལ་ལྷ་ཁང་འབྱུང་༔ ང་ཡི་སྤྲུལ་པ་ཨོ་རྒྱན་གླིང་པ་བྱོན༔ གཏེར་ཁ་ཉི་ཤུ་རྩ་ལྔ་དེ་དུས་འབྱེད༔ དེ་སྐད་གསུངས་པས་རྒྱལ་པོ་སྤྱན་ཆབ་ཤོར༔ ཡང་ཅིག་ཕྱག་འཚལ་མཎཌལ་ཕུལ་ནས་སུ༔ འདྲེན་པའི་སྐྱེས་བུ་སློབ་དཔོན་ཆེན་པོ་ལགས༔ བདག་གི་གདུང་བརྒྱུད་འདི་ནས་ག་ཙམ་ཆགས༔ བོད་འབངས་སེམས་ཅན་བདེ་སྐྱིད་ག་ཙམ་ཆགས་༔ མ་ཧཱ་གུ་རུ་ཆེན་པོའི་གསུང་བར་ཞུ༔ ཞེས་ཞུས་ཕྱག་ནི་དབུ་ཐོད་བུད་བུད་འཚལ༔ དེ་ནས་གུ་རུ་ཆེན་པོའི་བཀའ་སྩལ་པ༔ རྒྱལ་ཁྱོད་ཀྱི་རྒྱལ་རྒྱུད་འདི་ནས་བཟུང་༔ སྟོད་ཀྱི་ཕྱོགས་ནས་མེ་ལོང་ཧ་བཏབ་ཡལ༔ དེ་རྗེས་བོད་ཀྱི་རྒྱལ་པོ་རེས་མོས་བྱེད༔ ཁྱད་པར་བྱང་ཆུབ་སེམས་དཔའི་སྤྲུལ་པ་ཞིག༔ མདོ་སྡེ་སྐལ་བ་བཟང་པོའི་མཚན་ཅན་འབྱུང༔ གདོང་སྨེ་ཅན་གྱིས་བོད་ཀྱི་རྒྱལ་ས་འཛིན༔ སྐྱིད་པའི་ཉི་མ་རྒྱ་མཐོངས་གྲིབ་མ་ཙམ༔ རྟ་ལུག་སྤྲེལ་གསུམ་ལོ་ལ་རྒྱ་དམག་འོང༔ ཆུ་ཕོ་སྤྲེལ་ལ་ཡར་ལུང་དམག་སྒར་འཆའ༔ མཐའ་མ་བོད་འདི་རྒྱ་ཡི་འོག་ཏུ་འཇུག༔ ཕ་སྤུན་ནང་འཁྲུག་རྟ་སྒོ་སྒང་དུ་འཁྲུག༔ བུམ་ཐང་ཕྱོགས་ནས་ཁྲི་ཡི་ཟུར་ཆ་གནོན༔ རྒྱལ་སྲིད་ཆོས་ཁྲིམས་སྐྱོང་བའི་ང་སྤྲུལ་འབྱོན༔ བལ་ཡུལ་རྒྱ་རྫོང་རྣམས་སུ་འཁྲུག་པར་བྱེད༔ བོད་ལ་སྐྱིད་པའི་ཉི་མ་ཅུང་ཟད་འཆར༔ སྤྱོད་ངན་རང་གིས་བྱས་ནས་དུས་ངན་ཟེར༔ དུས་ནི་མི་འགྱུར་མི་རྣམས་འགྱུར་བ་ཡིན༔ དེ་དུས་མི་ལ་བསོད་ནམས་སྙན་གྲགས་མེད༔ པདྨ་བདག་ལ་གསོལ་བ་རྒྱུན་དུ་ཐོབ༔ ཉིན་མོ་བྱུང་དུས་ཐུགས་རྗེ་ཆེན་པོ་སྒོམས༔ སེམས་ཅན་དོན་དུ་སྙིང་པོ་མ་ཎི་དྲོངས༔ ཕ་མ་རིགས་དྲུག་དྲིན་ལན་ཁྱེར་ཏེ་འོང་༔ མཚན་མོ་བྱུང་དུས་པད་འབྱུང་ང་ཉིད་སྒོམས༔ རང་གི་དོན་དུ་བཛྲ་གུ་རུ་དྲོངས༔ སྙིགས་མའི་སེམས་ཅན་ཐམས་ཅད་ང་ཡིས་སྐྱོབ༔ དུས་གསུམ་རྒྱུན་ཆད་མེད་པར་ང་ཡིས་གཟིགས༔ ངན་སོང་གསུམ་དུ་སྐྱེས་ཀྱང་བསླུ་རུ་འོང་༔ བོད་ལ་དྲིན་ཆེར་བྱས་ཀྱང་དྲིན་མི་གོ༔ ང་ལ་རྒྱུན་དུ་གསོལ་བ་འདེབས་ནུས་ན༔ དུས་ངན་ཚེ་ལོ་བཅུ་པ་བཟློག་ཐབས་ཡོད༔ བྱམས་པའི་སྤྲུལ་པ་ཁྲི་བདུན་ཞེས་པ་འབྱུང༔ སྐལ་ངན་ཚེ་ལོ་བཅུ་པའི་སྡུག་བསྔལ་གྲོལ༔ ཡང་ཞིག་བསྐལ་པ་ཡར་འཕེལ་བདེ་བར་འགྱུར༔ སངས་རྒྱས་ཞལ་གཟིགས་ཡང་ཡང་འབྱུང་བར་འགྱུར༔ ནང་རེ་དགོང་རེ་བོད་ཀྱི་དོན་ལ་འོང་༔ དད་པ་ཅན་ལ་པད་འབྱུང་སྒོ་ཉལ་ཡོད༔ ང་ཡི་སྐུ་ལ་འདས་འཁྲུངས་ཡོད་མ་མཆིས༔ རྒྱལ་སྲས་མུ་ཁྲི་བཙན་པོ་ཞེས་བྱ་ཁྱོད༔ འདི་ནས་སྐྱེ་བ་བཅུ་བདུན་འགྲོ་དོན་མཛད༔ དེ་ནས་ཨོ་རྒྱན་མཁའ་འགྲོའི་གླིང་དུ་བྱོན༔ ལོ་ཙཱ་ཆེན་པོ་བེ་རོ་ཙཱ་ན་ཁྱོད༔ པདྨ་ང་ཡི་དམ་ཆོས་ཟབ་མོ་འདི༔ དཔལ་གྱི་བསམ་ཡས་དབུ་རྩེར་གཏེར་དུ་སྦོས༔ མ་འོངས་ལས་འཕྲོ་ཅན་ལ་སྤྲོད་ཅིག་གསུངས༔ ང་ནི་མི་སྡོད་སྲིན་པོ་འདུལ་དུ་འགྲོ༔ སྲིན་པོ་ཐམས་ཅད་ཆོས་ལ་འཇུག་ཏུ་འགྲོ༔ བོད་འབངས་སེམས་ཅན་བདེ་ལ་བཀོད་ནས་འགྲོ །ཞེས་གསུངས་ནས་ཞལ་ལྷོ་ནུབ་ཏུ་་གཟིགས་སོ༔ ཨྠིཾ༔ ས་མ་ཡ༔ རྒྱ་རྒྱ་རྒྱ༔ གཏེར་སྟོན་ཨོ་རྒྱན་གླིང་པས་བསམ་ཡས་མཆིམས་ཕུ་ནས་གཏེར་ནས་སྤྱན་དྲངས་པའོ༔  གུ་རུ་པདྨའི་རྣམ་ཐར་ཟབ་གཏེར་འདི༔ སྐལ་ལྡན་ལས་འཕྲོ་ཅན་གྱི་སྙིང་ལ་ཆོངས༔ གསལ་དག་སྙན་གསུམ་ཚར་གཅིག་ཀློག་པ་ནི༔ བཀའ་ཐང་ཚར་གཅིག་ཀློག་དང་མཉམ་པར་འགྱུར༔ སྙིགས་མའི་སེམས་ཅན་ཚེ་ཐུང་ནད་མང་ལ༔ གཟའ་དང་ཀླུ་དང་རྒྱལ་པོའི་ནད་ཡམས་ཀྱིས༔ སྲོག་སོགས་བླངས་ཤིང་བར་དུ་གཅོད་པའི་དུས༔ གཡེང་བའི་དབང་སོང་ལྷ་ཡི་རྒྱབ་བརྟེན་ཡལ༔ རྣམ་ཐར་འདི་ལ་ཡི་དམ་བྱས་གྱུར་ན༔ བརྒྱ་ཚར་སྟོང་གི་བསྙེན་པ་འཁྱོལ་བ་ན༔ ནག་ཕྱོགས་ཕམ་ཞིང་དཀར་ཕྱོགས་རྒྱལ་བར་འགྱུར༔ གློ་བུར་གདོན་བགེགས་བར་ཆད་ཀུན་ཞི་ནས༔ ལུས་སྲོག་ལྕགས་ཀྱི་རྡོ་རྗེ་འགྲུབ་པ་དང་༔ ཚེ་འདིར་འགལ་རྐྱེན་བར་ཆད་ཞི་བ་དང་༔ ཕྱི་མ་པདྨ་འོད་དུ་སྐྱེ་བར་ཤོག༔ ཨྱོན་ཆེན་པོ་པདྨ་འབྱུང་གནས་ཀྱི། །རྣམ་ཐར་མདོར་བསྡུས་གསུང་གི་ཉིང་ཁུ་འདི། །བདག་གཞན་འགྲོ་བ་རྣམས་ལ་ཕན་ཕྱིར་དུ། །མོས་གུས་ལྡན་པས་པར་དུ་བསྒྲུབས་པའི་དགེ །སྐྱེས་ཆེན་ཞབས་བརྟན་རྒྱལ་ཁམས་བདེ་བའི་འཚོ། །ཕ་མའི་ཐོག་དྲངས་མར་གྱུར་སེམས་ཅན་ཀུན། །སྒྲུབ་སྦྱངས་ཚོགས་རྫོགས་བླ་མེད་མྱུར་ཐོབ་ནས། །ཞིང་མཆོག་པདྨ་འོད་དུ་སྐྱེ་བར་ཤོག། །།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			guaduil.setTextSize(35);
			break;
		case R.id.zhun:
			guaduil.setTextSize(25);
			break;
		case R.id.xiao:
			guaduil.setTextSize(18);
			break;
		case R.id.muzhi:
			guaduil.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			guaduil.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			guaduil.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			guaduil.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			guaduil.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			guaduil.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			guaduil.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			guaduil.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			guaduil.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			guaduil.setTextColor(Color.BLUE);
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
