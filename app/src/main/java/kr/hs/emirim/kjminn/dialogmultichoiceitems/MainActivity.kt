package kr.hs.emirim.kjminn.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            var idolArray = arrayOf("아이브", "뉴진스", "BTS")
            var checkArray = booleanArrayOf(false, true, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 아이돌은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(idolArray, checkArray){
                dialog, index, isChecked ->
                btn.text = idolArray[index]
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }
}