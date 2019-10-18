package com.example.tih;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class helpActivity extends Activity {
	private TextView help;
	private TextView share;
	private Button fenxiangl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		help = (TextView) this.findViewById(R.id.help);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/himalaya.ttf");
		help.setTypeface(face);
		TextPaint tp = help.getPaint();
		tp.setFakeBoldText(true);
		help.setTextColor(Color.BLUE);
		help.setText("\nགངས་རི་ར་བས་སྐོར་བའི་ཞིང་ཁམས་སུ།། \n\nཕན་དང་བདེ་བ་མ་ལུས་འབྱུང་བའི་གནས།། \n\nསྤྱན་རས་གཟིགས་དབང་བསྟན་འཛིན་རྒྱ་མཚོ་ཡི།།\n\nཞབས་པད་སྲིད་མཐའི་བར་དུ་བརྟན་གྱུར་ཅིག །");
		share = (TextView) this.findViewById(R.id.share);
		share.setTypeface(face);
		TextPaint tp1 = share.getPaint();
		tp1.setFakeBoldText(true);
		share.setGravity(Gravity.CENTER);
		String html = "<big><a href='http://user.qzone.qq.com/335012274/main'>   ངའི་བསམ་ཚུལ་འགོད་རྒྱུ།</a></big>";
		CharSequence charSequence = Html.fromHtml(html);
		share.setText(charSequence);
		share.setMovementMethod(LinkMovementMethod.getInstance());
		// string text =
		// "ངའི་བསམ་ཚུལ་འགོད་རྒྱུ།\n http://user.qzone.qq.com/335012274/main";
		fenxiangl = (Button)this. findViewById(R.id.fenxiangl);
		fenxiangl.setTypeface(face);
		TextPaint tp2 = fenxiangl.getPaint();
		tp2.setFakeBoldText(true);
		fenxiangl.setText("གྲོགས་པོ་དང་ཉམས་སྤྱོད་བྱ་རྒྱུ།");
		fenxiangl.setOnClickListener(new fenxianglListener());
	}

	class fenxianglListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			/*
			 * Intent intent = new Intent();
			 * intent.setClass(MainActivity.this,sanbajiActivity.class );
			 * MainActivity.this.startActivity(intent);
			 */
			Uri uri = Uri.parse("smsto:");
			Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
			intent.putExtra("sms_body",
					"如果你也每天念经，就试试这个<颂辞汇编>软件吧，很不错的哦。 无需ROOT，即使手机没有藏文也不误每天念的经，有什么不懂可以微信他。微信号：335012274");
			startActivity(intent);
		}
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	    {
	        // TODO Auto-generated method stub
	        if(item.getItemId() == android.R.id.home)
	        {
	            finish();
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }
}
