package com.example.smallnote.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.smallnote.R
import com.example.smallnote.app.App
import com.example.smallnote.databinding.ActivityMainBinding
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

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


        /*
                val testNote =  Note(
                    id = "1",
                    title = "e",
                    content = "2"
                )
                val t =  vm.saveNote(testNote)


                val test = vm.getNote()
                Log.e("!", "${test}")

                Log.e("NoteViewModel", "NoteViewModel created!")
        */


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        //navController.navigate(R.id.action_CNFrg_to_VNFrg)


        // navController.navigate(route = ViewNoteFragment)
    }


    override fun onDestroy() {
        super.onDestroy()
        //binding = null
    }
}