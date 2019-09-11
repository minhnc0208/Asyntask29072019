package com.example.asyntask29072019;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView mtxtExcuteAsyntask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtxtExcuteAsyntask = findViewById(R.id.textview);
        mtxtExcuteAsyntask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Mỗi chuỗi sẽ cách nhau ra 1s;
//                Bắt đầu cv;
//                cv1
//                        cv2
//                        cv3
//                                ket thuc qua trinh
            }
        });
    }

    //    params: giá trị truyền vào cho phần xử lý logic
    //    ,progress: giá trị khi xử lý logic,
    //    result;
    class xuLyDaTienTrinh extends AsyncTask<String, String, Character> {
        // Đây là 1 lượng bên ngoài để xử lý logic


        @Override
        protected Character doInBackground(String... strings) {
            String kytu = strings[0].substring(0, 1);
            publishProgress(kytu);
            return null;

        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Character character) {
            super.onPostExecute(character);
        }
    }
}
