package com.example.ddd.Base;


import android.app.ProgressDialog;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {


    ProgressDialog progressDialog;

    public AlertDialog showMessage(String message, String posActionName) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message);
        builder.setPositiveButton(posActionName, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        return builder.show();
    }

    public AlertDialog showMessage(int message, int posActionName) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message);
        builder.setPositiveButton(posActionName, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        return builder.show();
    }

    public AlertDialog showMessage(String message, String posActionName,
                                   DialogInterface.OnClickListener onClickListener,
                                   boolean isCancelable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message);
        builder.setPositiveButton(posActionName, onClickListener);
        builder.setCancelable(isCancelable);
        return builder.show();
    }

    public AlertDialog showMessage(String message, String posActionName,
                                   DialogInterface.OnClickListener onPosClick,
                                   String negativeText,
                                   DialogInterface.OnClickListener onNegativeClick,
                                   boolean isCancelable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message);
        builder.setPositiveButton(posActionName, onPosClick);
        builder.setNegativeButton(negativeText, onNegativeClick);
        builder.setCancelable(isCancelable);
        return builder.show();
    }

    public AlertDialog showMessage(int message, int posActionName,
                                   DialogInterface.OnClickListener onClickListener,
                                   boolean isCancelable
    ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message);
        builder.setPositiveButton(posActionName, onClickListener);
        builder.setCancelable(isCancelable);
        return builder.show();
    }

    public AlertDialog showMessage(int message, int posActionName,
                                   DialogInterface.OnClickListener onPosClick,
                                   int negativeText,
                                   DialogInterface.OnClickListener onNegativeClick,
                                   boolean isCancelable
    ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message);
        builder.setPositiveButton(posActionName, onPosClick);
        builder.setNegativeButton(negativeText, onNegativeClick);
        builder.setCancelable(isCancelable);
        return builder.show();
    }

    public void showProgressDialog(String massage) {
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage(massage);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }


}

