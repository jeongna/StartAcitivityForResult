package kr.tjeit.startacitivityforresult;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditUserInfoActivity extends BaseActivity {

    private Button okBtn;
    private android.widget.EditText nameEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_info);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);
    }
}
