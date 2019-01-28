package com.example.josh.college_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FamilyMemberFragment extends android.support.v4.app.Fragment{

@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup view, Bundle bundle) {
    super.onCreateView(inflater, view, bundle);
    rootView = new View(R.layout.fragment_family_member, view, false);
}
}
