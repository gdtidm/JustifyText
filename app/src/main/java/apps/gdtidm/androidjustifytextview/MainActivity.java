package apps.gdtidm.androidjustifytextview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (InitApp.getInstance().isNightModeEnabled()) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.contentJustifyText);

        String teks = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non diam sed mauris bibendum porta. Aenean convallis ipsum non ante venenatis venenatis non sed nisi. Integer eu pretium mauris, et aliquam nibh.\n" +
                "Integer dapibus pretium viverra. Sed luctus magna mauris, ut placerat sem convallis at. Morbi ultricies aliquam tortor, ut finibus diam imperdiet nec. Mauris gravida dictum mauris non faucibus.\n" +
                "Phasellus tempor tortor a nisl sodales, id iaculis tellus cursus. Sed viverra elit in tellus gravida, non aliquam lorem laoreet. Cras et rhoncus magna. Etiam vitae dignissim dolor, vitae feugiat erat.\n" +
                "Vivamus enim nisi, gravida a lacus quis, laoreet sagittis libero. Nulla cursus sapien eu enim eleifend congue id ac augue. Aenean tempus, mi eget aliquet viverra, elit lacus vestibulum nulla, nec ullamcorper nisi metus sed orci.\n" +
                "Curabitur tellus ante, sodales eget elit eu, ornare facilisis magna.";

        webView.loadData("<p style =\"text-align: justify\">" + teks + "</p>", "text/html", "UTF-8");
        WebSettings settings = webView.getSettings();
        settings.setDefaultFontSize(13);
    }
}