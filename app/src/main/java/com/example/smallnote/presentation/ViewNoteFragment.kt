package com.example.smallnote.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.smallnote.R
import com.example.smallnote.databinding.FragmentViewNoteBinding


class ViewNoteFragment : Fragment() {
    private val viewModel: NoteViewModel by activityViewModels()

    private var _binding: FragmentViewNoteBinding? = null
    private val binding get() = _binding!!
    //private val viewModel: NoteViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
/*            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)*/
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentViewNoteBinding.bind(view)

        /*        val noteId = arguments?.getInt("noteId") ?: return
                 val note = viewModel.getNote(noteId)*/
        val note = viewModel.getNote()
        note.let {
            binding.titleTextView.text = it.title
            binding.contentTextView.text = it.content
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_note, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ViewNoteFragment().apply {
                arguments = Bundle().apply {
/*                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)*/
                }
            }
    }
}