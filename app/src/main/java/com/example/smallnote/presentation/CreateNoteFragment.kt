package com.example.smallnote.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.domain.models.Note
import com.example.smallnote.R
import com.example.smallnote.databinding.FragmentCreateNoteBinding

class CreateNoteFragment : Fragment() {

    //private var viewModel: NoteViewModel? = null
    private val viewModel: NoteViewModel by activityViewModels()

    private var _binding: FragmentCreateNoteBinding? = null
    private val binding get() = _binding!!
    // private val viewModel by viewModels<NoteViewModel>()
    //private val viewModel: NoteViewModel by viewModels()

    /*
        // TODO: Rename and change types of parameters
        private var param1: String? = null
        private var param2: String? = null*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
/*            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)*/
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCreateNoteBinding.bind(view)

        binding.saveButton.setOnClickListener {
            val title = binding.titleEditText.text.toString()
            val content = binding.contentEditText.text.toString()
            val note = Note(
                id = "0", title = title, content = content
            )
            viewModel.saveNote(note)
            view.findNavController().navigate(R.id.action_CNFrg_to_VNFrg)

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_note, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CreateNoteFragment()
    }
    /*    companion object {
            */
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreateNoteFragment.
     *//*
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CreateNoteFragment().apply {
                arguments = Bundle().apply {

*//*                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)*//*
                }
            }
    }*/
}