package com.mlt.ets.rider.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mlt.ets.rider.MainActivity;
import com.mlt.ets.rider.R;
import com.mlt.ets.rider.network.ApiService;
import com.mlt.ets.rider.network.RetrofitClient;
import com.mlt.ets.rider.utills.MyEditText; // Make sure you have this custom EditText class
import com.mlt.ets.rider.viewModel.SignUpResponse;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    // Declare views
    private ImageView btnLogin;
    private View txtSignUp;
    private MyEditText etEmail, etPassword; // Add EditText for email and password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        btnLogin = findViewById(R.id.btnLogin);
        txtSignUp = findViewById(R.id.txtSignUp);
        etEmail = findViewById(R.id.etEmail); // Initialize email EditText
        etPassword = findViewById(R.id.etPassword); // Initialize password EditText

        // Handle login button click
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                handleLogin(); // Call the method to handle login

                Intent intent = new Intent(LoginActivity.this, MainActivity.class); // Replace HomeActivity with your main activity
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); // Clear the activity stack
                startActivity(intent);
                finish(); // Optionally finish the current activity


            }
        });

        // Handle registration click
        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Signup Activity
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void handleLogin() {
//        String email = etEmail.getText().toString().trim();
//        String password = etPassword.getText().toString().trim();
//
//        // Validate inputs
//        if (email.isEmpty()) {
//            etEmail.setError("Email cannot be empty");
//            etEmail.requestFocus();
//            return;
//        }
//
//        if (password.isEmpty()) {
//            etPassword.setError("Password cannot be empty");
//            etPassword.requestFocus();
//            return;
//        }
//
//        // Create JSON object for the request
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("email", email);
//            jsonObject.put("password", password);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        // Convert JSONObject to RequestBody
//        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), jsonObject.toString());
//
//        // Send data to backend using Retrofit
//        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
//        Call<SignUpResponse> call = apiService.loginUser(requestBody); // Use the RequestBody here
//        call.enqueue(new Callback<SignUpResponse>() {
//            @Override
//            public void onResponse(Call<SignUpResponse> call, Response<SignUpResponse> response) {
//                if (response.isSuccessful() && response.body() != null) {
//                    // Handle successful response
//                    SignUpResponse signUpResponse = response.body();
//                    Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
//
//                    navigateToHome();
//                } else {
//                    // Handle error response
//                    Toast.makeText(LoginActivity.this, "Login Failed! " + response.message(), Toast.LENGTH_SHORT).show();
//                }
//            }
//
//
//            @Override
//            public void onFailure(Call<SignUpResponse> call, Throwable t) {
//                Log.e("LoginActivity", "Error: " + t.getMessage());
//                Toast.makeText(LoginActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private void navigateToHome() {
//        Intent intent = new Intent(LoginActivity.this, ProfileActivity.class); // Replace HomeActivity with your main activity
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); // Clear the activity stack
//        startActivity(intent);
//        finish(); // Optionally finish the current activity
//    }

}
