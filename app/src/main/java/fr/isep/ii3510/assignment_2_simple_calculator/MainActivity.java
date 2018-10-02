package fr.isep.ii3510.assignment_2_simple_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    String str ="";
    Character op = 'a';
    int num;
    int i;
    int c;
    EditText Result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = (EditText)findViewById(R.id.Show);

    }
    public void B1Clicked(View v){insert(1); }

    public void B0Clicked(View v){insert(0); }

    public void B2Clicked(View v){insert(2); }

    public void B3Clicked(View v){insert(3); }

    public void B4Clicked(View v){insert(4); }

    public void B5Clicked(View v){insert(5); }

    public void B6Clicked(View v){insert(6); }

    public void B7Clicked(View v){insert(7); }

    public void B8Clicked(View v){insert(8); }

    public void B9Clicked(View v){insert(9); }

    public void PlusClicked(View v){
        trans();
        op = '+';
    }

    public void MinusClicked(View v){
        trans();
        op = '-';
    }

    public void DivideClicked(View v){
        trans();
        op = '/';
    }

    public void MultiClicked(View v){
        trans();
        op = '*';
    }

    public void PercentClicked(View v){
        trans();
        op = '%';
    }

    public void EqualClicked(View v){
        calcule();
    }

    public void ClearClicked(View v){
        reset();
    }

    private void reset() {
        str ="";
        op ='a';
        num = 0;
        c = 0;
        Result.setText("");
    }

    private void insert(int j) {
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        Result.setText(str);
    }

    private void trans() {
        str = "";
        c = num;
    }

    private void calcule() {
        if(op == '+')
            num = c+num;
        else if(op == '-')
            num = c-num;
        else if(op == '/')
            num = c/num;
        else if(op == '%')
            num = c/100*10;
        else if(op == '*')
            num = c*num;
        Result.setText(" "+num);
    }

}
