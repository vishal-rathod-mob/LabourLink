package com.procore.hackathon.labourlink

import android.R
import android.content.Context
import android.content.DialogInterface
import android.content.DialogInterface.OnCancelListener
import android.content.DialogInterface.OnMultiChoiceClickListener
import android.util.AttributeSet
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog


class MultiSpinner : androidx.appcompat.widget.AppCompatSpinner, OnMultiChoiceClickListener,
    OnCancelListener {
    private var items: List<String>? = null
    private var selected: BooleanArray? = null
    private var defaultText: String? = null
    private var listener: MultiSpinnerListener? = null

    constructor(context: Context) : super(context)

    constructor(arg0: Context, arg1: AttributeSet?) : super(arg0, arg1)

    constructor(arg0: Context, arg1: AttributeSet?, arg2: Int) : super(arg0, arg1, arg2)

    override fun onClick(dialog: DialogInterface, which: Int, isChecked: Boolean) {
        if (isChecked) selected?.set(which, true)
        else selected?.set(which, false)
    }

    override fun onCancel(dialog: DialogInterface?) {
        // refresh text on spinner
        val spinnerBuffer = StringBuffer()
        for (i in items!!.indices) {
            if (selected?.get(i) == true) {
                spinnerBuffer.append(items!![i])
                spinnerBuffer.append(", ")
            }
        }
        var spinnerText: String? = defaultText
        val adapter = ArrayAdapter(
            context,
            R.layout.simple_spinner_item,
            arrayOf(spinnerText)
        )
        setAdapter(adapter)
        listener!!.onItemsSelected(selected)
    }

    override fun performClick(): Boolean {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setMultiChoiceItems(
            items?.toTypedArray(), selected, this
        )
        builder.setPositiveButton(
            R.string.ok
        ) { dialog, _ -> dialog.cancel() }
        builder.setOnCancelListener(this)
        builder.show()
        return true
    }

    fun setItems(
        items: List<String>, allText: String?,
        listener: MultiSpinnerListener?,
        selections: List<String>
    ) {
        this.items = items
        this.defaultText = allText
        this.listener = listener

        // all selected by default
        selected = BooleanArray(items.size)
        for (i in selected!!.indices) {
            selected!![i] = items[i] in selections
        }

        // all text on the spinner
        val adapter = ArrayAdapter(
            context,
            R.layout.simple_spinner_item, arrayOf(allText)
        )
        setAdapter(adapter)
    }

    interface MultiSpinnerListener {
        fun onItemsSelected(selected: BooleanArray?)
    }
}