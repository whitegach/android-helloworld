package com.github.pffy.android.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends Activity {

  private TextView tvHelloWorld;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    /**
     * First, see how this activity uses a specific layout. Do you see how "R.layout.hello" matches
     * "res/layout/hello.xml" ?
     */

    // this method is from android.app.Activity
    this.setContentView(R.layout.hello);

    /**
     * Now, look at how the TextView in the layout is found then modified by this activity. Do you
     * see how "R.id.textView1 matches the TextView widget labeled "textView1" in the layout?
     */

    // findViewById() method is also from android.app.Activity
    this.tvHelloWorld = (TextView) findViewById(R.id.textView1);

    /**
     * Once the widget is found, modifying it is simple.
     */
    
    // the setText() method is from 'android.widget.TextView'
    this.tvHelloWorld.setText("Hello World!!!!");
  }
}
