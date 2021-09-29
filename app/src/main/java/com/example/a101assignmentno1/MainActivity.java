package com.example.a101assignmentno1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private TextView mTextViewResultSmallest,mTextViewResultLargest;
    private Button mButtonResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mEditText3 = findViewById(R.id.edittext_number_3);
        mTextViewResultSmallest = findViewById(R.id.textview_result);
        mTextViewResultLargest = findViewById(R.id.textview_result2);
        mButtonResult = findViewById(R.id.button_add);
        mButtonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }
                if (mEditText3.getText().toString().length() == 0) {
                    mEditText3.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int num3 = Integer.parseInt(mEditText3.getText().toString());


                int smallestNum = smallestNumber(num1,num2,num3);
                mTextViewResultSmallest.setText(String.valueOf(smallestNum));
                int largestNum = largestNumber(num1,num2,num3);
                mTextViewResultLargest.setText(String.valueOf(largestNum));
            }
            public int largestNumber(int num1, int num2, int num3)
            {
                int tempLargestNum = num1;
                if(num2 > tempLargestNum)
                {
                    tempLargestNum = num2;
                }
                if(num3 > tempLargestNum)
                {
                    tempLargestNum = num3;
                }
                return tempLargestNum;
            }
            public int smallestNumber(int num1, int num2, int num3)
            {
                int tempSmallest = num1;
                if(num2 < tempSmallest)
                {
                    tempSmallest = num2;
                }
                if(num3 < tempSmallest)
                {
                    tempSmallest = num3;
                }
                return tempSmallest;
            }
        });
    }
}