package com.example.smallnote.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.domain.models.Note
import com.example.smallnote.R
import com.example.smallnote.app.App
import com.example.smallnote.databinding.ActivityMainBinding
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    //private var _binding: ActivityMainBinding? = null

    private lateinit var binding: ActivityMainBinding
    //private val binding get() = _binding!!
    @Inject
    lateinit var vmFactory: NoteViewFactory
    private lateinit var vm: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (applicationContext as App).appComponent.inject(this)

        Log.e("MainActivity", "Activity created!")

        vm = ViewModelProvider(this, vmFactory).get(NoteViewModel::class.java)

        val testNote =  Note(
            id = "1",
            title = "e",
            content = "2"
        )
        val t =  vm.saveNote(testNote)


        val test = vm.getNote()
        Log.e("!", "${test}")

        Log.e("NoteViewModel", "NoteViewModel created!")



        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
    }

    override fun onDestroy() {
        super.onDestroy()
        //binding = null
    }
}