package lxh.bitmap;

import android.app.Activity;
import android.os.Bundle;

public class BitMapActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PathView(this));

    }
    

}