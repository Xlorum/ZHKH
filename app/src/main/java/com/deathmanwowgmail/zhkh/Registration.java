package com.deathmanwowgmail.zhkh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;


public class Registration extends AppCompatActivity implements View.OnClickListener {

    private AutoCompleteTextView area;
    private AutoCompleteTextView street;
    private EditText serialPass;
    private EditText numbPass;
    private EditText dateBirth;
    private EditText house;
    private EditText hesHouse;
    private EditText flat;
    private Button registrationBtn;
    String[] areaArr = {"Центральный район", "Фрунзенский район", "Пушкинский район", "Приморский район", "Петродворцовый район", "Петроградский район", "Невский район", "Московский район", "Курортный район", "Кронштадтcкий район", "Красносельский район", "Красногвардейский район", "Колпинский район", "Кировский район", "Калининский район", "Выборгский район", "Василеостровский район", "Адмиралтейский район"};
    String[] streetArr = {"Автогенная улица","Проспект Александровской Фермы","Улица Антонова-Овсеенко","Улица Бабушкина","Улица Бадаева","Белевский переулок","Белевский проспект","Улица Белышева","Улица Бехтерева","Проспект Большевиков","Вагонный проезд","Улица Ванеева","Варфоломеевская улица","Улица Веры Фигнер","Воркутинская улица","Улица Ворошилова","Глазурная улица","Глиняная улица","Глухоозёрское шоссе","Улица Грибакиных","Дальневосточный проспект","Улица Джона Рида","Улица Дмитрия Устинова","Улица Дудко","Улица Дыбенко","Улица Евдокима Огнева","Проспект Елизарова","Улица Еремеева","Железнодорожный проспект","Запорожская улица","Зеркальный переулок","Зольная улица","Зубковская улица","Ивановская улица","Искровский проспект","Караваевская улица","Караваевский переулок","Улица Кибальчича","Клочков переулок","Улица Книпович","Улица Коллонтай","Бульвар Красных Зорь","Улица Кржижановского","Улица Крупской","Улица Крыленко","Кудровский проезд","Улица Латышских Стрелков","Леснозаводская улица","Улица Лопатина","Улица 2-й Луч","Переулок Матюшенко","Мельничная улица","Мурзинская улица","Набережная Обводного канала","Народная улица","Улица Невзоровой","Нерчинская улица","Ново-Александровская улица","Улица Новосёлов","Переулок Ногина","Проспект Обуховской Обороны","Общественный переулок","Набережная реки Оккервиль","Октябрьская набережная","Улица Ольги Берггольц","Улица Ольминского","Перевозная набережная","Дорога на Петро-Славянку","Улица Пинегина","Улица Подвойского","Улица Полярников","Преображенский переулок","Прибрежная","Прогонная","Улица Профессора Качалова","Прямой проспект","Проспект Пятилеток","Рабфаковская","1-й Рабфаковский переулок","2-й Рабфаковский переулок","3-й Рабфаковский переулок","Российский проспект","1-й Рыбацкий проезд","2-й Рыбацкий проезд","3-й Рыбацкий проезд","4-й Рыбацкий проезд","5-й Рыбацкий проезд","6-й Рыбацкий проезд","8-й Рыбацкий проезд","Рыбацкий проспект","Улица Седова","Складская улица","Переулок Слепушкина","Слободская улица","Большой Смоленский проспект","Проспект Солидарности","Сомов переулок","Сортировочная-Московская","Союзный проспект","Старопутиловский вал","Стеклянная","Улица Тельмана","Тепловозная","Тихая улица","Улица Ткачей","Товарищеский проспект","Уездный проспект","Фарфоровская улица","Фаянсовая улица","Хрустальная улица","Улица Цимбалина","Переулок Челиева","Улица Чернова","Улица Чудновского","Улица Шелгунова","Шлиссельбургский проспект","Улица Шотмана","Улица Юннатов","Большая Яблоновка"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        registrationBtn = (Button) findViewById(R.id.registration);
        area = (AutoCompleteTextView) findViewById(R.id.area);
        street = (AutoCompleteTextView) findViewById(R.id.streets);
        serialPass = (EditText) findViewById(R.id.serialPass);
        numbPass = (EditText) findViewById(R.id.numbPass);
        dateBirth = (EditText) findViewById(R.id.dateBirth);
        house = (EditText) findViewById(R.id.house);
        hesHouse = (EditText) findViewById(R.id.hesHouse);
        flat = (EditText) findViewById(R.id.flat);

        registrationBtn.setOnClickListener(this);

        ArrayAdapter<String> areaAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, areaArr);
        area.setAdapter(areaAdapter);

        ArrayAdapter<String> streetAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, streetArr);
        street.setAdapter(streetAdapter);
    }

    /*private boolean pro = false;
    public void  SetPro (boolean p){
        pro = p;
    }
    public boolean GetPro(){
        return pro;
    }
    public boolean EQVAS (String[] mas, String value){
        for (int i = 0; i < mas.length; ++i) {
            if (mas[i].indexOf(value) != -1) {
                SetPro(true);
            }
        }
        return GetPro();
    }*/

    @Override
    public void onClick(View v) {

        Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
        //Activ.Check(serialPass.getText().toString(), numbPass.getText().toString(), dateBirth.getText().toString(), area.getText().toString(), street.getText().toString(), house.getText().toString(),hesHouse.getText().toString(), flat.getText().toString());

        //---------------------------------------------
        /*String j = street.getText().toString();

        if (EQVAS(streetArr, street.getText().toString().trim())) {
            Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
        }
        pro = false;*/

    }
}
