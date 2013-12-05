package com.teamteam.customComponent;

import com.teamteam.witherest.ActivityLogin;
import com.teamteam.witherest.R;
import com.teamteam.witherest.ActivitySignup;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public  class LoginGuideDialogFragment extends DialogFragment {
    public static LoginGuideDialogFragment newInstance() {
    	LoginGuideDialogFragment frag = new LoginGuideDialogFragment();
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setStyle(DialogFragment.STYLE_NO_FRAME, 0);
    }
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    	Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.login_guide);
        builder.setIcon(android.R.drawable.ic_dialog_info);
        builder.setMessage(R.string.login_join_message);
        builder.setPositiveButton(R.string.login, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dismiss();
				Intent i = new Intent(getActivity(),ActivityLogin.class);
				startActivity(i);
				
			}
		});
        builder.setNegativeButton(R.string.join, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {	
				dismiss();
				Intent i = new Intent(getActivity(),ActivitySignup.class);
				startActivity(i);
			}
		});
        
        builder.setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			}
		});
        
        
        return builder.create();

    }
}
