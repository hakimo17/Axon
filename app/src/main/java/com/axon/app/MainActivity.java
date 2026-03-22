package com.axon.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout chatLayout;
    private EditText messageInput;
    private Button btnTerminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatLayout = findViewById(R.id.chatLayout);
        messageInput = findViewById(R.id.messageInput);
        btnTerminal = findViewById(R.id.btnTerminal);

        // وظيفة زر الترمينال (مبدئياً سيظهر رسالة)
        btnTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMessage("نظام Axon: جاري فتح الترمينال المدمج...");
                // هنا سنضيف لاحقاً كود استدعاء Shell أو Termux
            }
        });
    }

    private void addMessage(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextColor(0xFFFFFFFF); // لون أبيض
        textView.setPadding(0, 10, 0, 10);
        chatLayout.addView(textView);
    }
}

