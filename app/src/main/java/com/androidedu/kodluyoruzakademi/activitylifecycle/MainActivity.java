package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

/**
 * Created by halil on 21.07.2017.
 */

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Error";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        Log.e(TAG, "onCreate");
    }


    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(TAG, "onContentChanged");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState");

        //onCreate metoduyla bilgileri yeniden yüklemek yerine onRestoreInstanceState() metoduyla durum
        // bilgileri getirilebilir. Sistem onStart metodu sonrası otomatik
        // olarak bu metodu çağırdığı için Bundle'ın null olup olmadığını kontrol etme zorunluluğu ortadan kalkmış olur.
        //Fakat bu activity de yeniden bilgi yüklenme durumu yoktur. Bu metot çalışmaz.
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.e(TAG, "onPostCreate");
        //onStart () ve onRestoreInstanceState (Bundle) çağrıldıktan sonra çağrılır.
        //Bu Activity de onRestoreInstanceState (Bundle) çalışmadığından dolayı bu metot çalışmaz.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "onAttachedToWindow");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Log.e(TAG, "onCreateOptionsMenu");

        return false;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Log.e(TAG, "onPrepareOptionsMenu");
        return false;
        //Varsayılan uygulama, sistem menüsü öğelerini etkinliğin durumuna göre güncelleştirir.
        //Default sistem menü öğelerini tanımlar.
        //Bu activity de menu tanımalaması kullanımı yoktur. Bu metot çalışmaz.
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
        // Etkinliği düzenleyen herhangi bir ısrarcı durumu kaydetmek için, kullanıcıya bir "yerinde düzenleme"
        // modeli sunmak ve yeni etkinliği ilk önce öldürmek için yeterli kaynak olmadığında hiçbir şeyin
        // kaybolmadığından emin olmak için kullanılır. Bu Activity de öldürme olmadığı için metot çalışmaz.
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e(TAG, "onSaveInstanceState");
        //Bu yöntem, bir etkinliğin öldürülmesi öncesinde çağrılır;
        // böylece gelecekte geri döndüğünde kaldığı durumuna geri dönebilir.

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
        //Arka plana atıldığında çağırılır. Bu noktada iki seçenek vardır;
        // ya kullanıcı yeni ekrandaki işini bitirip geri gelir ya da Activity tamamen kapatılır.
        //Herhangi bir arka plana atılma yapılmadığı için metot çalışmaz.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
        //Activity'e ait bütün kaynaklar yok edilir. Activity bu noktada yaşam döngüsünü tamamlamıştır.
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(TAG, "onUserInteraction");
        //Etkinliklerin durum çubuğu bildirimlerini akıllıca yönetmesine yardımcı olmak için tasarlanmıştır; Özellikle,
        // bir notasyonun iptal edilmesi için uygun zamanı belirleyen faaliyetlere yardımcı olmak için çağırılır.
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(TAG, "onUserLeaveHint");

        //Bir etkinlik, kullanıcı seçimi sonucunda arka plana geçmek üzereyken
        // etkinlik yaşam döngüsünün bir parçası olarak adlandırılır.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult");
        //Bu çağrı, etkinliğiniz yeniden başladığında onResume () 'dan hemen önce alınır.
        //Yeniden çağırılan bir Activity olmadığı için bu metot çalışmaz.
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
        //Kullanıcı geri geldiği takdirde onRestart metoduna geçilir ve döngü onStart metodundan tekrar başlar.
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TAG, "onAttachFragment");
        //Activity bir fragment ile ilişkilendirildiğinde bu metot çağırılır. Bizim Activity miz içinde fragment yapısı
        //kullanılmadığı için bu metot çalışmaz.
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged");
        //Bu işlev çağrıldığında, kaynaklar yeni yapılandırmayla
        // eşleşen kaynak değerlerini döndürmek üzere güncellenecektir.
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(TAG, "onBackPressed");
        //Etkinlik kullanıcının geri tuşa basmasını tespit ettiğinde çağrılır.
        // Varsayılan uygulama yalnızca geçerli etkinliği tamamlar, ancak bu istenildiği taktirde geçersiz kılınabilir.
    }

}

