package com.eru.homework_8.ui.user

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.eru.homework_8.databinding.FragmentUserBinding

class FragmentUser : Fragment() {

    private var _binding: FragmentUserBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivKotlin.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Внимание!")
            builder.setMessage("Вы действительно нажали на картинку?")

            builder.setPositiveButton("Да") { _, _ ->
                Toast.makeText(requireContext(),
                    "Зря нажали", Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton("Нет") { _, _ ->
                Toast.makeText(requireContext(),
                    "Аа, ну ладно", Toast.LENGTH_SHORT).show()
            }

            builder.show()
        }
    }
}