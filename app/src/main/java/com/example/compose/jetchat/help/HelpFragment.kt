package com.example.compose.jetchat.help

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.compose.jetchat.R
import com.example.compose.jetchat.databinding.FragmentHelpBinding

class HelpFragment : Fragment() {

    private var _binding: FragmentHelpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViews()
    }

    private fun setViews() {
        with(binding.mfklHeaderView) {
            setTitle(getString(R.string.help_title))
            setSubtitle(getString(R.string.help_subitle))
            setBackButtonListener {
                findNavController().navigateUp()
            }
            setCloseButtonListener {
                findNavController().navigateUp()
            }
        }

        with(binding.mfklBodyView) {
            setImageResource(R.drawable.ic_stackspot_ai)
            setText(getString(R.string.help_body_text))
        }

        with(binding.mfklFooterView) {
            setLeftButtonText(getString(R.string.help_left_icon_label))
            setLeftButtonListener {
                Toast.makeText(context, getString(R.string.help_left_message), Toast.LENGTH_LONG).show()
            }

            setRightButtonText(getString(R.string.help_right_icon_label))
            setRightButtonListener {
                Toast.makeText(context, getString(R.string.help_right_message), Toast.LENGTH_LONG).show()
            }
        }
    }
}
