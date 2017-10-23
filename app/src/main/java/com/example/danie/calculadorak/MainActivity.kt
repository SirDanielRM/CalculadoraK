package com.example.danie.calculadorak

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.*

class MainActivity : AppCompatActivity() {
    private var contsum: Boolean = false
    private var contrest: Boolean = false
    private var contmult: Boolean = false
    private var contdiv: Boolean = false
    private var cont: Boolean = false
    private var v1: Float = 0F
    private var v1b: Int = 0
    private var v1c: String = ""
    private var v2: Float = 0F
    private var memory: Float = 0F
    private var bin: Boolean = false
    private var dec: Boolean = true
    private var hex: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*A.isEnabled = false
        B.isEnabled = false
        C.isEnabled = false
        D.isEnabled = false
        E.isEnabled = false
        F.isEnabled = false*/
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle?) {
        super.onSaveInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    fun pulsarb1 (v: View){
        if(!pantalla.text.toString().equals("0"))
         pantalla.setText(pantalla.text.toString() + "1")
    }
    fun pulsarb2 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "2")
    }
    fun pulsarb3 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "3")
    }
    fun pulsarb4 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "4")
    }
    fun pulsarb5 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "5")
    }
    fun pulsarb0 (v: View){
        if(!pantalla.text.toString().equals("0")|| dec==true){
            pantalla.setText(pantalla.text.toString() + "0")
        }else{
            pantalla.setText(pantalla.text.toString() + "0")
        }
    }
    fun pulsarb6 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "6")
    }
    fun pulsarb8 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "8")
    }
    fun pulsarb9 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "9")
    }
    fun pulsarb7 (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "7")
    }
    fun pulsarpun (v: View){
        if (pantalla.text.length > 0) {
            if (!pantalla.text.toString().contains("."))
                pantalla.setText(pantalla.text.toString() + ".")
            }
        }
    fun pulsarbA (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "A")
    }
    fun pulsarbB (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "B")
    }
    fun pulsarbC (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "C")
    }
    fun pulsarbD (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "D")
    }
    fun pulsarbE (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "E")
    }
    fun pulsarbF (v: View){
        if(!pantalla.text.toString().equals("0"))
            pantalla.setText(pantalla.text.toString() + "F")
    }
    fun pulsarBorr (v: View){
        if(!pantalla.text.toString().equals("0")){
            pantalla.setText(pantalla.getText().substring(0, pantalla.text.length -1))
        }
    }

    fun sumar (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contsum = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true){
            if (!pantalla.text.isEmpty()) {
                contsum = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contsum = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }

    }
    fun resta (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contrest = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true){
            if (!pantalla.text.isEmpty()) {
                contrest = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contrest = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun division (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contdiv = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true) {
            if (!pantalla.text.isEmpty()) {
                contdiv = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contdiv = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun multiplicacion (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contmult = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true) {
            if (!pantalla.text.isEmpty()) {
                contmult = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contmult = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun igual (v:View){
        if(dec==true) {
            if (contsum.equals(true)) {
                var v2: Float = pantalla.text.toString().toFloat()
                var sol: Float = v1 + v2
                pantalla.setText(sol.toString())
                contsum = false
                cont = false
            } else if (contrest.equals(true)) {
                var v2: Float = pantalla.text.toString().toFloat()
                var sol: Float = v1 - v2
                pantalla.setText(sol.toString())
                contrest = false
                cont = false
            } else if (contdiv.equals(true)) {
                var v2: Float = pantalla.text.toString().toFloat()
                var sol: Float = v1 / v2
                pantalla.setText(sol.toString())
                contdiv = false
                cont = false
            } else if (contmult.equals(true)) {
                var v2: Float = pantalla.text.toString().toFloat()
                var sol: Float = v1 * v2
                pantalla.setText(sol.toString())
                contmult = false
                cont = false
            }
        } else if(bin==true){
            if (contsum.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 2)
                var t2: Int  = parseInt(v2, 2)
                var solb = t1 + t2
                var resultado: String = toString(solb, 2)
                pantalla.setText(resultado)
                contsum = false
                cont = false
            } else if (contrest.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 2)
                var t2: Int  = parseInt(v2, 2)
                var solb = t1 - t2
                var resultado: String = toString(solb, 2)
                pantalla.setText(resultado)
                contrest = false
                cont = false
            } else if (contdiv.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 2)
                var t2: Int  = parseInt(v2, 2)
                var solb = t1 / t2
                var resultado: String = toString(solb, 2)
                pantalla.setText(resultado)
                contdiv = false
                cont = false
            } else if (contmult.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 2)
                var t2: Int  = parseInt(v2, 2)
                var solb = t1 * t2
                var resultado: String = toString(solb, 2)
                pantalla.setText(resultado)
                contmult = false
                cont = false
            }
        }else if(hex==true){
            if (contsum.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1c, 16)
                var t2: Int  = parseInt(v2, 16)
                var solb = t1 + t2
                var resultado: String = toString(solb, 16)
                pantalla.setText(resultado)
                contsum = false
                cont = false
            } else if (contrest.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 16)
                var t2: Int  = parseInt(v2, 2)
                var solb = t1 - t2
                var resultado: String = toString(solb, 16)
                pantalla.setText(resultado)
                contrest = false
                cont = false
            } else if (contdiv.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 16)
                var t2: Int  = parseInt(v2, 2)
                var solb = t1 / t2
                var resultado: String = toString(solb, 16)
                pantalla.setText(resultado)
                contdiv = false
                cont = false
            } else if (contmult.equals(true)) {
                var v2: String = pantalla.text.toString()
                var t1: Int = parseInt(v1b.toString(), 16)
                var t2: Int  = parseInt(v2, 16)
                var solb = t1 * t2
                var resultado: String = toString(solb, 16)
                pantalla.setText(resultado)
                contmult = false
                cont = false
            }
        }
    }
    fun mSum (v: View) {

            if (!pantalla.text.isEmpty()) {
                memory = memory + pantalla.text.toString().toFloat()
                pantalla.setText("")
            }

    }
    fun mRest (v: View){
        if (!pantalla.text.isEmpty()) {
        memory= memory - pantalla.text.toString().toFloat()
        pantalla.setText("")
        }
    }
    fun mPant (v: View){
        pantalla.setText(""+ memory)
    }
    fun mBorr (v: View){
        memory = 0F
    }
    fun signo (v: View){
        //var pant: Float = pantalla.text.toString().toFloat()
        pantalla.setText(""+ pantalla.text.toString().toFloat() * -1 )


    }
    fun borrarPant (v: View){
        pantalla.setText("")
    }
    fun borrarTotal (v: View){
        pantalla.setText("")
        v1 = 0F
        v2 = 0F
        contmult = false
        cont = false
        contsum = false
        contdiv =  false
        contrest = false
    }
    fun seno (v: View){
        if(!pantalla.text.toString().isEmpty()){
        var sin = Math.sin( pantalla.text.toString().toDouble())
        pantalla.setText("" + sin)
        }
    }
    fun coseno (v: View){
        if(!pantalla.text.toString().isEmpty()){
            var cos = Math.cos( pantalla.text.toString().toDouble())
            pantalla.setText("" + cos)
        }
    }
    fun tangente (v: View){
        if(!pantalla.text.toString().isEmpty()){
            var tan = Math.tan( pantalla.text.toString().toDouble())
            pantalla.setText("" + tan)
        }
    }
    fun decimal (v: View){

        dec= true
        bin = false
        hex = false
        bpunt.isEnabled= true
        //signo.isEnabled=true
        b2.isEnabled = true
        b3.isEnabled = true
        b4.isEnabled = true
        b5.isEnabled = true
        b6.isEnabled = true
        b7.isEnabled = true
        b8.isEnabled = true
        b9.isEnabled = true
        A.isEnabled = false
        B.isEnabled = false
        C.isEnabled = false
        D.isEnabled = false
        E.isEnabled = false
        F.isEnabled = false

    }
    fun binario (v: View){

        dec= false
        bin = true
        hex = false
        bpunt.isEnabled = false
        //signo.isEnabled= false
        b2.isEnabled = false
        b3.isEnabled = false
        b4.isEnabled = false
        b5.isEnabled = false
        b6.isEnabled = false
        b7.isEnabled = false
        b8.isEnabled = false
        b9.isEnabled = false
        A.isEnabled = false
        B.isEnabled = false
        C.isEnabled = false
        D.isEnabled = false
        E.isEnabled = false
        F.isEnabled = false

    }
    fun hexadecimal (v:View){
            dec = false
            bin = false
            hex = true
            bpunt.isEnabled = false
            //signo.isEnabled = false
            b2.isEnabled = true
            b3.isEnabled = true
            b4.isEnabled = true
            b5.isEnabled = true
            b6.isEnabled = true
            b7.isEnabled = true
            b8.isEnabled = true
            b9.isEnabled = true
            A.isEnabled = true
            B.isEnabled = true
            C.isEnabled = true
            D.isEnabled = true
            E.isEnabled = true
            F.isEnabled = true

    }
}
