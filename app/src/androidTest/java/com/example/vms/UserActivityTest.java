package com.example.vms;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserActivityTest {
    @Rule
    public ActivityTestRule<UserActivity> userActivityActivityTestRule = new ActivityTestRule<UserActivity>(UserActivity.class);

    public UserActivity userActivity = null;

    @Before
    public void setUp() throws Exception {
        userActivity = userActivityActivityTestRule.getActivity();
    }

    @Test
    public void testButtonSelectClient()
    {
        Button button = userActivity.findViewById(R.id.buttonSelectVisitorClient);
        assertNotNull(button);
    }

    @Test
    public void testButtonSelectVendor()
    {
        Button button = userActivity.findViewById(R.id.buttonSelectVisitorVendor);
        assertNotNull(button);
    }

    @Test
    public void testButtonSelectContractor()
    {
        Button button = userActivity.findViewById(R.id.buttonSelectVisitorContractor);
        assertNotNull(button);
    }

    @Test
    public void testButtonSelectMarketing()
    {
        Button button = userActivity.findViewById(R.id.buttonSelectVisitorMarketing);
        assertNotNull(button);
    }

    @Test
    public void testButtonSelectCandidate()
    {
        Button button = userActivity.findViewById(R.id.buttonSelectVisitorCandidate);
        assertNotNull(button);
    }

    @Test
    public void testButtonSelectOther()
    {
        Button button = userActivity.findViewById(R.id.buttonSelectVisitorOther);
        assertNotNull(button);
    }

    @After
    public void tearDown() throws Exception {
        userActivity = null;
    }
}