package com.neptune.pluto.mapsearch;
import java.util.ArrayList;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.android.AndroidAuthSession;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.Session.AccessType;
import com.dropbox.client2.session.TokenPair;

public class DropboxActivity extends Activity implements OnClickListener {
    private DropboxAPI<AndroidAuthSession> dropbox;
    private final static String FILE_DIR = "/DropboxSample/";
    private final static String DROPBOX_NAME = "dropbox_prefs";
    private final static String ACCESS_KEY = "p0nnnu6tptvls95";
    private final static String ACCESS_SECRET = "v5tjqjn4yestd1d";
    private boolean isLoggedIn;
    private Button logIn;
    private Button uploadFile;
    private Button listFiles;
    private LinearLayout container;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropbox);


    }


}