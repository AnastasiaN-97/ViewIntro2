package net.intervyaz.viewintro

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat


class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.settings_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val notificationSwitch: SwitchCompat = view.findViewById(R.id.notificationSwitch)
        val locationSwitch: SwitchCompat = view.findViewById(R.id.locationSwitch)
        val updatesSwitch: SwitchCompat = view.findViewById(R.id.updatesSwitch)

        notificationSwitch.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                val toast = Toast.makeText(requireActivity(), "Уведомления включены", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }else{
                val toast = Toast.makeText(requireActivity(), "Уведомления отключены", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        }

        locationSwitch.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                val toast = Toast.makeText(requireActivity(), "Местоположение отслеживается", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }else{
                val toast = Toast.makeText(requireActivity(), "Местоположение не отслеживается", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        }

        updatesSwitch.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                val toast = Toast.makeText(requireActivity(), "Автообновление включено", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }else{
                val toast = Toast.makeText(requireActivity(), "Автообновление отключено", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        }
    }
}

