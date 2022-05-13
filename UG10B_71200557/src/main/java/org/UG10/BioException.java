package org.UG10;

public class BioException extends Exception{
    private String errorMessage;
    public BioException(int errorCode) {
        super();
        switch (errorCode){
            case 1:
                this.errorMessage = "Bio tidak boleh kosong";
                break;
            case 2:
                this.errorMessage = "Bio minimal 5 karakter dan maksimal 30 karakter";
                break;
            case 3:
                this.errorMessage = "Bio tidak boleh menganduk karakter spesial selain titik,";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
