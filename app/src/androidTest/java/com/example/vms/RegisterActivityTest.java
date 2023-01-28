package com.example.vms;

import android.widget.Button;
import android.widget.EditText;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterActivityTest {
    @Rule
    public ActivityTestRule<RegisterActivity> registerActivityActivityTestRule = new ActivityTestRule<RegisterActivity>(RegisterActivity.class);

    public RegisterActivity registerActivity = null;

    @Before
    public void setUp() throws Exception {
        registerActivity = registerActivityActivityTestRule.getActivity();
    }

    @Test
    public void testEditTestUsername()
    {
        EditText editText = registerActivity.findViewById(R.id.editTextTextUsername);
        assertNotNull(editText);
    }

    @Test
    public void testEditTestPassword()
    {
        EditText editText = registerActivity.findViewById(R.id.editTextTextPassword);
        assertNotNull(editText);
    }

    @Test
    public void testEditTestEmailAddress()
    {
        EditText editText = registerActivity.findViewById(R.id.editTextTextEmailAddress);
        assertNotNull(editText);
    }

    @Test
    public void testEditTestPhone()
    {
        EditText editText = registerActivity.findViewById(R.id.editTextTextPhone);
        assertNotNull(editText);
    }

    @Test
    public void testButtonRegister()
    {
        Button button = registerActivity.findViewById(R.id.buttonRegister);
        assertNotNull(button);
    }

    @After
    public void tearDown() throws Exception {
        registerActivity = null;
    }
}