package id.sch.smktelkom_mlg.tugas01.xiirpl1035.hotelreservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class reservation extends AppCompatActivity {

    RadioButton rbMR, rbMRS;
    TextView hasil;
    Spinner tipeKamar;
    EditText nama;
    CheckBox cbBF, cbSH;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);


        cbBF = (CheckBox) findViewById(R.id.checkBoxBF);
        cbSH = (CheckBox) findViewById(R.id.checkBoxSH);
        tipeKamar = (Spinner) findViewById(R.id.spKamar);
        hasil = (TextView) findViewById(R.id.tvHasil);
        rbMR = (RadioButton) findViewById(R.id.radioButtonMR);
        rbMRS = (RadioButton) findViewById(R.id.radioButtonMRS);
        nama = (EditText) findViewById(R.id.editTextName);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.tipe_kamar_arr, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipeKamar.setAdapter(adapter);


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

                String hslcb;
                if (cbBF.isChecked()) {
                    hslcb = cbBF.getText().toString();
                } else if (cbSH.isChecked()) {
                    hslcb = cbSH.getText().toString();
                } else {
                    hslcb = "Tanpa Tambahan";
                }

                if (cbBF.isChecked() & cbSH.isChecked()) {
                    hslcb = cbBF.getText() + " & " + cbSH.getText();
                }

                hasil.setText("PROFIL PEMESAN :\n\n Nama : " + hasil_rb + ". " + nama.getText() + "\n Tipe Kamar : " + tipeKamar.getSelectedItem() + "\n Tambahan Services : " + hslcb);
            }
        });
    }
}
