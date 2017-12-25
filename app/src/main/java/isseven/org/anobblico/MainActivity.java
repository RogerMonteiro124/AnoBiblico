package isseven.org.anobblico;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);

        Calendar calendar1 = Calendar.getInstance();
        calendarView.setMinDate(calendar1.getTimeInMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2018,11,31,23,59,59);
        calendarView.setMaxDate(calendar2.getTimeInMillis());


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                //Toast.makeText(getApplicationContext(), "" + dayOfMonth, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                String diaSelecionado = String.valueOf(dayOfMonth);
                String mesSelecionado = String.valueOf(month+1);
                String anoSelecionado = String.valueOf(year);

                Intent intent = new Intent(MainActivity.this, estudoDiario.class);
                intent.putExtra("diaSelecionado",diaSelecionado);
                intent.putExtra("mesSelecionado",mesSelecionado);
                intent.putExtra("anoSelecionado",anoSelecionado);
                startActivity(intent);

            }
        });
    }
}
