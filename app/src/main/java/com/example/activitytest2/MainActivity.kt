package com.example.activitytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		val intent = Intent(this, SubActivity::class.java)

		intent.putExtra("from1", "Hello Kotlin")
		intent.putExtra("from2", "Goodbye Java")
		// name : key로 가져갈 데이터의 이름 지정
		// value : 가져갈 데이터로 모든 종류의 데이터를 가져갈 수 있음(putExtra()가 오버로딩되어 있음)

		binding.btnstart.setOnClickListener { startActivity(intent) }
	}
}