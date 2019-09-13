package com.example.asyntask29072019;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
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
    class xuLyTienTrinh extends AsyncTask<Void, String, String> {
        // Đây là 1 lượng bên ngoài để xử lý logic

        @Override
        protected void onPreExecute() {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    mtxtExcuteAsyntask.setText("Bắt đầu thực thi \n");

                }
            }, 2000);

            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            for (int i = 1; i < 3; i++) {
                String congviec = "Thực thi công việc" + i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Thực thi kết thúc";


        }

        @Override
        protected void onProgressUpdate(String... values) {
            mtxtExcuteAsyntask.append(values[0] + "\n");
            super.onProgressUpdate(values);

        }

        @Override
        protected void onPostExecute(String s) {
            mtxtExcuteAsyntask.append(s + "\n");
            mtxtExcuteAsyntask.append("Kết thúc phần xử lý");
            super.onPostExecute(s);
        }
    }

}
