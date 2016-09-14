package id.sch.smktelkom_mlg.tugas01.xiirpl1035.hotelreservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class reservation extends AppCompatActivity {

    RadioButton rbMR, rbMRS;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        hasil = (TextView) findViewById(R.id.tvHasil);
        rbMR = (RadioButton) findViewById(R.id.radioButtonMR);
        rbMRS = (RadioButton) findViewById(R.id.radioButtonMRS);

        findViewById(R.id.buttonBN).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                doClick();
            }

            private void doClick() {
                String hasil_rb = "";
                if (rbMR.isChecked()) {
                    hasil_rb = rbMR.getText().toString();
                } else if (rbMRS.isChecked()) {
                    hasil_rb = rbMRS.getText().toString();
                }

                hasil.setText(hasil_rb);
            }
        });
    }
}
