package com.example.tih;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.Camera.Face;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class duoxiuActivity extends Activity {
	private TextView duoxiu01;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duoxiemain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		duoxiu01 = (TextView) findViewById(R.id.duoxiuo1);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/himalaya.ttf");
		duoxiu01.setTypeface(face);
		duoxiu01.setTextColor(Color.WHITE);
		duoxiu01.setBackgroundColor(Color.BLACK);
		duoxiu01.setMovementMethod(ScrollingMovementMethod.getInstance());
		duoxiu01.setText(" ༄༅། ། ན་མོ། བྱང་ཆུབ་སེམས་དཔའི་ལྟུང་བ་བཤགས་པ། བདག་མིང་འདི་ཞེས་བགྱི་བ། བླ་མ་ལ་སྐྱབས་སུ་མཆིའོ། །སངས་རྒྱས་ལ་སྐྱབས་སུ་མཆིའོ། །ཆོས་ལ་སྐྱབས་སུ་མཆིའོ། །དགེ་འདུན་ལ་སྐྱབས་སུ་མཆིའོ། །དེ་བཞིན་གཤེགས་པ་དགྲ་བཅོམ་པ་ཡང་དག་པར་རྫོགས་པའི་སངས་རྒྱས་ཤཱཀྱ་ཐུབ་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རྡོ་རྗེའི་སྙིང་བོ་རབ་ཏུ་འཇོམས་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རིན་ཆེན་འོད་འཕྲོ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཀླུ་དབང་གི་རྒྱལ་པོ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དཔའ་བོའི་སྡེ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དཔལ་དགྱེས་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རིན་ཆེན་མེ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རིན་ཆེན་ཟླ་འོད་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་མཐོང་བ་ལ་དོན་ཡོད་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རིན་ཆེན་ཟླ་བ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དྲི་མ་མེད་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དཔལ་སྦྱིན་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཚངས་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཚངས་པས་བྱིན་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཆུ་ལྷ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཆུ་ལྷའི་ལྷ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དཔལ་བཟང་ལ་ཕྱག་འཚལ་ལོ།    །དེ་བཞིན་གཤེགས་པ་ཙན་དན་དཔལ་ལ་ཕྱག་འཚལ་ལོ།    །དེ་བཞིན་གཤེགས་པ་གཟི་བརྗིད་མཐའ་ཡས་ལ་ཕྱག་འཚལ་ལོ།    །དེ་བཞིན་གཤེགས་པ་འོད་དཔལ་ལ་ཕྱག་འཚལ་ལོ།    །དེ་བཞིན་གཤེགས་པ་མྱ་ངན་མེད་པའི་དཔལ་ལ་ཕྱག་འཚལ་ལོ།    །དེ་བཞིན་གཤེགས་པ་སྲེད་མེད་ཀྱི་བུ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་མེ་ཏོག་དཔལ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཚངས་པའི་འོད་ཟེར་རྣམ་པར་རོལ་བས་མངོན་པར་མཁྱེན་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་པདྨའི་འོད་ཟེར་རྣམ་པར་རོལ་བས་མངོན་པར་མཁྱེན་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ནོར་དཔལ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དྲན་པའི་དཔལ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་མཚན་དཔལ་ཤིན་ཏུ་ཡོངས་གྲགས་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དབང་བོའི་ཏོག་གི་རྒྱལ་མཚན་གྱི་རྒྱལ་པོ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཤིན་ཏུ་རྣམ་པར་གནོན་པའི་དཔལ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་གཡུལ་ལས་ཤིན་ཏུ་རྣམ་པར་རྒྱལ་བ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རྣམ་པར་གནོན་པས་གཤེགས་པའི་དཔལ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་ཀུན་ནས་སྣང་བ་བཀོད་པའི་དཔལ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་རིན་ཆེན་པདྨོས་རྣམ་པར་གནོན་པ་ལ་ཕྱག་འཚལ་ལོ། །དེ་བཞིན་གཤེགས་པ་དགྲ་བཅོམ་པ་ཡང་དག་པར་རྫོགས་པའི་སངས་རྒྱས་རིན་པོ་ཆེ་དང་པདྨ་ལ་རབ་ཏུ་བཞུགས་པ་རི་དབང་གི་རྒྱལ་པོ་ལ་ཕྱག་འཚལ་ལོ། །དེ་དག་ལ་སོགས་པ་ཕྱོགས་བཅུའི་འཇིག་རྟེན་གྱི་ཁམས་ཐམས་ཅད་ན་དེ་བཞིན་གཤེགས་པ་དགྲ་བཅོམ་པ་ཡང་དག་པར་རྫོགས་པའི་སངས་རྒྱས་བཅོམ་ལྡན་འདས་གང་ཇི་སྙེད་ཅིག་བཞུགས་ཏེ་འཚོ་ཞིང་གཞེས་པའི་སངས་རྒྱས་བཅོམ་ལྡན་འདས་དེ་དག་ཐམས་ཅད་བདག་ལ་དགོངས་སུ་གསོལ། བདག་གིས་སྐྱེ་བ་འདི་དང་། སྐྱེ་བ་ཐོག་མའི་ཐ་མ་མ་མཆིས་པ་ནས་འཁོར་བ་ན་འཁོར་བའི་སྐྱེ་གནས་ཐམས་ཅད་དུ་སྡིག་པའི་ལས་བགྱིས་པ་དང་། བགྱིད་དུ་བསྩལ་པ་དང་། བགྱིད་པ་ལ་རྗེས་སུ་ཡི་རང་བའམ། མཆོད་རྟེན་གྱི་དཀོར་རམ། དགེ་འདུན་གྱི་དཀོར་རམ། ཕྱོགས་བཅུའི་དགེ་འདུན་གྱི་དཀོར་ཕྲོགས་པ་དང་། འཕྲོག་ཏུ་བཅུག་པ་དང་། ཕྲོགས་པ་ལ་རྗེས་སུ་ཡི་རང་བའམ། མཚམས་མ་མཆིས་པ་ལྔའི་ལས་བགྱིས་པ་དང་། བགྱིད་དུ་བསྩལ་པ་དང་།  བགྱིད་པ་ལ་རྗེས་སུ་ཡི་རང་བའམ། མི་དགེ་བ་བཅུའི་ལས་ཀྱི་ལམ་ཡང་དག་པར་བླང་བ་ལ་ཞུགས་པ་དང་། འཇུག་ཏུ་བསྩལ་བ་དང་། འཇུག་པ་ལ་རྗེས་སུ་ཡི་རང་བའམ། ལས་ཀྱི་སྒྲིབ་པ་གང་གིས་བསྒྲིབས་ནས་བདག་སེམས་ཅན་དམྱལ་བར་མཆི་བའམ། དུད་འགྲོའི་སྐྱེ་གནས་སུ་མཆི་བའམ། ཡི་དྭགས་ཀྱི་ཡུལ་དུ་མཆི་བའམ། ཡུལ་མཐའ་འཁོབ་ཏུ་སྐྱེ་བའམ། ཀླ་ཀློར་སྐྱེ་བའམ། ལྷ་ཚེ་རིང་བོ་རྣམས་སུ་སྐྱེ་བའམ། དབང་བོ་མ་ཚང་བར་འགྱུར་བའམ།  ལྟ་བ་ལོག་པར་འཛིན་པར་འགྱུར་བའམ། །སངས་རྒྱས་འབྱུང་བ་ལ་མཉེས་པར་མི་བགྱིད་པར་འགྱུར་བའི་ལས་ཀྱི་སྒྲིབ་པ་གང་ལགས་པ་དེ་དག་ཐམས་ཅད་སངས་རྒྱས་བཅོམ་ལྡན་འདས་ཡེ་ཤེས་སུ་གྱུར་པ། སྤྱན་དུ་གྱུར་པ། དཔང་དུ་གྱུར་པ། ཚད་མར་གྱུར་པ། མཁྱེན་པས་གཟིགས་པ་དེ་དག་གི་སྤྱན་སྔར་མཐོལ་ལོ། །འཆགས་སོ། །མི་འཆབ་པོ། །མི་སྦེད་དོ། །སླན་ཆད་ཀྱང་གཅོད་ཅིང་སྡོམ་པར་བགྱིད་ལགས་སོ། །སངས་རྒྱས་བཅོམ་ལྡན་འདས་དེ་དག་ཐམས་ཅད་བདག་ལ་དགོངས་སུ་གསོལ། བདག་གིས་སྐྱེ་བ་འདི་དང་། སྐྱེ་བ་ཐོག་མའི་ཐ་མ་མ་མཆིས་པ་ནས་འཁོར་བ་ན་འཁོར་བའི་སྐྱེ་གནས་གཞན་དག་ཏུ་སྦྱིན་པ། ཐ་ན་དུད་འགྲོའི་སྐྱེ་གནས་སུ་སྐྱེས་པ་ལ་ཟས་ཁམ་གཅིག་ཙམ་བསྩལ་པའི་དགེ་བའི་རྩ་བ་གང་ལགས་པ་དང་། བདག་གིས་ཚུལ་ཁྲིམས་བསྲུངས་པའི་དགེ་བའི་རྩ་བ་གང་ལགས་པ་དང་། བདག་གིས་ཚངས་པར་སྤྱད་པའི་དགེ་བའི་རྩ་བ་གང་ལགས་པ་དང་། བདག་གིས་སེམས་ཅན་ཡོངས་སུ་སྨིན་པར་བགྱིས་པའི་དགེ་བའི་རྩ་བ་གང་ལགས་པ་དང་། བདག་གིས་བྱང་ཆུབ་མཆོག་ཏུ་སེམས་བསྐྱེད་པའི་དགེ་བའི་རྩ་བ་གང་ལགས་པ་དང་། བདག་གིས་བླ་ན་མེད་པའི་ཡེ་ཤེས་ཀྱི་དགེ་བའི་རྩ་བ་གང་ལགས་པ་དེ་དག་ཐམས་ཅད་གཅིག་ཏུ་བསྡུས་ཤིང་བཟླུམས་ཏེ་བསྡོམས་ནས་བླ་ན་མ་མཆིས་པ་དང་། གོང་ན་མ་མཆིས་པ་དང་། གོང་མའི་ཡང་གོང་མ། བླ་མའི་ཡང་བླ་མར་ཡོངས་སུ་བསྔོ་བས་བླ་ན་མེད་པ་ཡང་དག་པར་རྫོགས་པའི་བྱང་ཆུབ་ཏུ་ཡོངས་སུ་བསྔོ་བར་བགྱིའོ། །ཇི་ལྟར་འདས་པའི་སངས་རྒྱས་བཅོམ་ལྡན་འདས་རྣམས་ཀྱིས་ཡོངས་སུ་བསྔོས་པ་དང་། ཇི་ལྟར་མ་བྱོན་པའི་སངས་རྒྱས་བཅོམ་ལྡན་འདས་རྣམས་ཀྱིས་ཡོངས་སུ་བསྔོ་བར་འགྱུར་བ་དང་། ཇི་ལྟར་ད་ལྟར་བཞུགས་པའི་སངས་རྒྱས་བཅོམ་ལྡན་འདས་རྣམས་ཀྱིས་ཡོངས་སུ་བསྔོ་བར་མཛད་པ་དེ་བཞིན་དུ་བདག་གིས་ཀྱང་ཡོངས་སུ་བསྔོ་བར་བགྱིའོ། །སྡིག་པ་ཐམས་ཅད་ནི་སོ་སོར་བཤགས་སོ། །བསོད་ནམས་ཐམས་ཅད་ལ་ནི་རྗེས་སུ་ཡི་རང་ངོ་། །སངས་རྒྱས་ཐམས་ཅད་ལ་ནི་བསྐུལ་ཞིང་གསོལ་བ་འདེབས་སོ། །བདག་གིས་བླ་ན་མེད་པའི་ཡེ་ཤེས་ཀྱི་མཆོག་དམ་པ་ཐོབ་པར་གྱུར་ཅིག །མི་མཆོག་རྒྱལ་བ་གང་དག་ད་ལྟར་བཞུགས་པ་དང་། གང་དག་འདས་པ་དག་དང་དེ་བཞིན་གང་མ་བྱོན། །ཡོན་ཏན་བསྔགས་པ་མཐའ་ཡས་རྒྱ་མཚོ་འདྲ་ཀུན་ལ། །ཐལ་མོ་སྦྱར་བར་བགྱིས་ཏེ་སྐྱབས་སུ་ཉེ་བར་མཆིའོ། ། འཕགས་པ་ཕུང་བོ་གསུམ་པ་ཞེས་བྱ་བ་ཐེག་པ་ཆེན་པོའི་མདོ་རྫོགས་སོ། ། །།  \nཨུ་ཧུ་ལགས། བླ་མ་རྡོ་རྗེ་འཛིན་པ་ཆེན་པོ་ལ་སོགས་པ་ཕྱོགས་བཅུ་ན་བཞུགས་པའི་སངས་རྒྱས་དང་བྱང་ཆུབ་སེམས་དཔའ་ཐམས་ཅད་དང་། དགེ་འདུན་བཙུན་པ་རྣམས་བདག་ལ་དགོངས་སུ་གསོལ། བདག་མིང་འདི་ཞེས་བགྱི་བས། ཚེ་རབས་འཁོར་བ་ཐོག་མ་མ་མཆིས་པ་ནས་ད་ལྟ་ལ་ཐུག་གི་བར་དུ། ཉོན་མོངས་པ་འདོད་ཆགས་དང་ཞེ་སྡང་དང་གཏི་མུག་གི་དབང་གིས་ལུས་ངག་ཡིད་གསུམ་གྱི་སྒོ་ནས་སྡིག་པ་མི་དགེ་བ་བཅུ་བགྱིས་པ་དང་། མཚམས་མ་མཆིས་པ་ལྔ་བགྱིས་པ་དང་། དེ་དང་ཉེ་བ་ལྔ་བགྱིས་པ་དང་། སོ་སོར་ཐར་པའི་སྡོམ་པ་དང་འགལ་བ་དང་། བྱང་ཆུབ་སེམས་དཔའི་བསླབ་པ་དང་འགལ་བ་དང་། གསང་སྔགས་ཀྱི་དམ་ཚིག་དང་འགལ་བ་དང་། ཕ་དང་མ་ལ་མ་གུས་པ་དང་། མཁན་པོ་དང་སློབ་དཔོན་ལ་མ་གུས་པ་དང་། གྲོགས་ཚངས་པ་མཚུངས་པར་སྤྱོད་པ་རྣམས་ལ་མ་གུས་པ་དང་། དཀོན་མཆོག་གསུམ་ལ་གནོད་པའི་ལས་བགྱིས་པ་དང་། དམ་པའི་ཆོས་སྤངས་པ་དང་། འཕགས་པའི་དགེ་འདུན་ལ་སྐུར་བ་བཏབ་པ་དང་། སེམས་ཅན་ལ་གནོད་པའི་ལས་བགྱིས་པ་ལ་སོགས་པ་སྡིག་པ་མི་དགེ་བའི་ཚོགས་བདག་གིས་བགྱིས་པ་དང་། བགྱིད་དུ་བསྩལ་པ་དང་། གཞན་གྱིས་བགྱིས་པ་ལ་རྗེས་སུ་ཡི་རང་བ་ལ་སོགས་པ་མདོར་ན་མཐོ་རིས་དང་ཐར་བའི་གེགས་སུ་གྱུར་ཅིང་འཁོར་བ་དང་ངན་སོང་གི་རྒྱུར་གྱུར་པའི་ཉེས་ལྟུང་གི་ཚོགས་ཅི་མཆིས་པ་ཐམས་ཅད་བླ་མ་རྡོ་རྗེ་འཛིན་པ་ཆེན་པོ་ལ་སོགས་པ་ཕྱོགས་བཅུ་ན་བཞུགས་པའི་སངས་རྒྱས་དང་བྱང་ཆུབ་སེམས་དཔའ་ཐམས་ཅད་དང་། དགེ་འདུན་བཙུན་པ་རྣམས་ཀྱི་སྤྱན་སྔར་མཐོལ་ལོ། འཆགས་སོ། །མི་འཆབ་པོ། །ཕྱིན་ཆད་སྡོམ་པར་བགྱི་ལགས་སོ། །མཐོལ་ཞིང་བཤགས་ན་བདག་བདེ་བ་ལ་རེག་པར་གནས་པར་འགྱུར་གྱི། མ་མཐོལ་མ་བཤགས་ན་ནི་མི་འགྱུར་རོ། །ཞེས་ལན་གསུམ་བརྗོད། ལུས་ཀྱི་ལས་ནི་རྣམ་པ་གསུམ། །ངག་གི་རྣམ་པ་བཞི་དང་ནི། །གང་ཡང་ཡིད་ཀྱི་རྣམ་གསུམ་པོ། །མི་དགེ་བཅུ་བོ་སོ་སོར་བཤགས། །ཐོག་མ་མེད་ནས་ད་ལྟའི་བར། །མི་དགེ་བཅུ་དང་མཚམས་མེད་ལྔ། །སེམས་ནི་ཉོན་མོངས་དབང་གྱུར་པས། །སྡིག་པ་ཐམས་ཅད་བཤགས་པར་བགྱི། །འདོད་ཆགས་ཞེ་སྡང་གཏི་མུག་དབང་གིས་ནི། །ལུས་དང་ངག་དང་དེ་བཞིན་ཡིད་ཀྱིས་ཀྱང་། །སྡིག་པ་བདག་གིས་བགྱིས་པ་ཅི་མཆིས་པ། །དེ་དག་ཐམས་ཅད་བདག་གིས་སོ་སོར་བཤགས། །ཕྱག་འཚལ་བ་དང་མཆོད་ཅིང་བཤགས་པ་དང་། །རྗེས་སུ་ཡི་རང་བསྐུལ་ཅིང་གསོལ་བ་ཡི། །དགེ་བ་ཅུང་ཟད་བདག་གིས་ཅི་བསགས་པ། །ཐམས་ཅད་རྫོགས་པའི་བྱང་ཆུབ་ཆེན་པོར་བསྔོ། །  ");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) 
		{switch (item.getItemId()) {
		case R.id.da:
			duoxiu01.setTextSize(35);
			break;
		case R.id.zhun:
			duoxiu01.setTextSize(25);
			break;
		case R.id.xiao:
			duoxiu01.setTextSize(18);
			break;
		case R.id.muzhi:
			duoxiu01.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			duoxiu01.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			duoxiu01.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			duoxiu01.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			duoxiu01.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			duoxiu01.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			duoxiu01.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			duoxiu01.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			duoxiu01.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			duoxiu01.setTextColor(Color.BLUE);
			break;
	    }
		if (item.getItemId() == android.R.id.home) {
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}