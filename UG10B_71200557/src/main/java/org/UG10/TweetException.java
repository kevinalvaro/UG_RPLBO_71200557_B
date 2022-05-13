package org.UG10;

public class TweetException extends Exception {
    private String errorMessage;
    public TweetException(int errorCode) {
        super();
        switch (errorCode){
            case 1:
                this.errorMessage = "Tweet tidak boleh kosong";
                break;
            case 2:
                this.errorMessage = "Tweet minimal ada 8 karakter dan maksimal 140 karakter";
                break;
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
