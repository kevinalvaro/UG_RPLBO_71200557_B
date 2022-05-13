package org.UG10;

public class LoginException extends Exception {
    private String errorMessage;
    public LoginException(int errorCode) {
        super();
        switch (errorCode){
            case 1:
                this.errorMessage = "Username tidak boleh kosong";
                break;
            case 2:
                this.errorMessage = "Password tidak boleh kosong";
                break;
            case 3:
                this.errorMessage = "Maaf, username atau password salah! Silahkan coba lagi!";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
