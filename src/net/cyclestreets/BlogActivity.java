package net.cyclestreets;

import net.cyclestreets.api.Blog;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class BlogActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
    final WebView htmlView = (WebView)findViewById(R.id.html_view);
    htmlView.loadData(Blog.load().toHtml(),
                      "text/html; charset=UTF-8", 
                      null);
	} // onCreate
} // HtmlActivity
