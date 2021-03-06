package com.abhishek.collegebuddy.loginsignup

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abhishek.collegebuddy.R
import com.abhishek.collegebuddy.dashboard
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import android.app.AlertDialog
import com.google.firebase.auth.GoogleAuthProvider
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.activity_login.*


class login : AppCompatActivity() , GoogleApiClient.OnConnectionFailedListener{


    companion object {
        private val PERMISSION_CODE = 9999
    }

    lateinit var mGoogleApiClient: GoogleApiClient
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var alertdialog: AlertDialog

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PERMISSION_CODE) {
            val result = Auth.GoogleSignInApi.getSignInResultFromIntent(data)
            if (result.isSuccess) {
                val account = result.signInAccount
                val idToken = account!!.idToken
                val credential = GoogleAuthProvider.getCredential(idToken, null)
                firebaseAuthWithGoogle(credential)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

            } else {
                Log.d("LOGIN_ERROR", "Login Unsuccessful")
                Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_SHORT).show()

            }
        }
    }

    private fun firebaseAuthWithGoogle(credential: AuthCredential) {

        firebaseAuth!!.signInWithCredential(credential!!)
            .addOnSuccessListener { authResult ->
                val logged_email: String? = authResult.user?.email

                // added Toast For Login info
                Toast.makeText(this, "logged: $logged_email", Toast.LENGTH_SHORT).show()

                val logged_activity = Intent(this@login, dashboard::class.java)

                alertdialog= SpotsDialog.Builder()
                    .setContext(this)
                    .setTheme(R.style.Custom1)
                    .build()
                    .apply {show() }

                startActivity(logged_activity)
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "" + e.message, Toast.LENGTH_SHORT).show()
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        configureGoogleClient()

        firebaseAuth = FirebaseAuth.getInstance()

        google_sign_in.setOnClickListener {
            SignIn()

        }

        fb_sign_in.setOnClickListener {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()
        }
    }

    private fun SignIn() {
        val intent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient)
        startActivityForResult(
            intent,
            PERMISSION_CODE
        )

    }

    private fun configureGoogleClient() {
        val options = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        mGoogleApiClient = GoogleApiClient.Builder(this)
            .enableAutoManage(this, this)
            .addApi(Auth.GOOGLE_SIGN_IN_API, options)
            .build()
        mGoogleApiClient.connect()
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
        Toast.makeText(this, "" + p0.errorMessage, Toast.LENGTH_SHORT).show()
    }
}
