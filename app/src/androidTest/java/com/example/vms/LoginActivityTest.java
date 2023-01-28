package com.example.vms;

import android.widget.Button;
import android.widget.EditText;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginActivityTest {
    @Rule
    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    public LoginActivity loginActivity = null;

    @Before
    public void setUp() throws Exception {
        loginActivity = loginActivityActivityTestRule.getActivity();
    }

    @Test
    public void testEditTestUsername()
    {
        EditText editText = loginActivity.findViewById(R.id.editTextTextUsername);
        assertNotNull(editText);
    }

    @Test
    public void testEditTestPassword()
    {
        EditText editText = loginActivity.findViewById(R.id.editTextTextPassword);
        assertNotNull(editText);
    }

    @Test
    public void testButtonLogin()
    {
        Button button = loginActivity.findViewById(R.id.buttonLogin);
        assertNotNull(button);
    }

    @Test
    public void testButtonRegister()
    {
        Button button = loginActivity.findViewById(R.id.buttonRegister);
        assertNotNull(button);
    }

    @After
    public void tearDown() throws Exception {
        loginActivity = null;
    }
}