package com.ug11.channelsahamukdw;

public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode){
        super();

        switch (errorCode){
            case 1:
                this.errorMessage = "Login gagal! email tidak terdaftar di ukdw";
                break;
            case 2:
                this.errorMessage = "Login gagal! email ukdw tidak valid";
        }

    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
