package org.UG10;

public class UsernameException extends Exception {
    private String errorMessage;
    public UsernameException(int errorCode) {
        super();
        switch (errorCode){
            case 1:
                this.errorMessage = "Username tidak boleh kosong";
                break;
            case 2:
                this.errorMessage = "Username minimal harus terdiri dari 6 karakter";
                break;
            case 3:
                this.errorMessage = "Username hanya boleh terdiri dari huruf, angka, dan _ (underscore)";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
