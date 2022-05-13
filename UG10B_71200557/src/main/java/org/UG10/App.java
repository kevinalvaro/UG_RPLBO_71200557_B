package org.UG10;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String validUsername;
    public static String validPassword;

    public static void main( String[] args ) throws UsernameException, TweetException, BioException, LoginException {
        User user = new User("71200557n", "71200557p");
        login(user);
        username();
        Bio();
        tweet();


    }
        public static void login (User user) throws LoginException {
        boolean valid = false;

        while(!valid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Username : ");
            String usernameLogin = inp.nextLine();
            System.out.print("Password : ");
            String passwordLogin = inp.nextLine();
            try {
                if (usernameLogin.isEmpty()) {
                    throw new LoginException(1);
                } else if (passwordLogin.isEmpty()) {
                    throw new LoginException(2);
                } else if (!usernameLogin.equals(user.getUsername()) && !passwordLogin.equals(user.getPassword())) {
                    throw new LoginException(3);
                }
                valid = true;
                System.out.println("Selamat datang di Twitter, " + user.getUsername());
                System.out.println("Kamu diminta untuk mengganti username, silahkan masukan username kamu");
            } catch (LoginException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }
    }

    public static String username() throws UsernameException {
        System.out.println("masuk 2");
        boolean valid = false;
        String username = "";
        while (!valid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Username\t:");
            username = inp.nextLine();
            try {
                if (username.isEmpty()) {
                    throw new UsernameException(1);
                } else if (username.length() <= 6) {
                    throw new UsernameException(2);
                } else {
                    boolean check = false;
                    for(int i=0;i< username.length();i++){
                        char c = username.charAt(i);
                        if(Character.isDigit(c)) {
                        }
                        else if(Character.isAlphabetic(c)) {
                        }
                        else if(c == '_') {
                        }
                        else{
                            //tidak menganduk char/alphabet/ _
                            check = true;
                        }
                    }
                    if (check == true){
                        throw new UsernameException(3);
                    }
                }
               valid = true;
            } catch (UsernameException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }
        System.out.println("Username kamu berhasil diperbarui," );
        System.out.println("Maaf, kamu juga diminta untuk mengisi bio, silahkan masukan bio kamu" );
        return username;
    }

    public static String Bio() throws BioException{
        boolean valid = false;
        String Bio = "";

        while(!valid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Bio\t: ");
            Bio = inp.nextLine();

            String regex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(Bio);
            boolean isValidPattern = matcher.matches();

            try {
                if (Bio.isEmpty()) {
                    throw new BioException(1);
                } else if (Bio.length() >= 5 && Bio.length() <= 30) {
                    throw new BioException(2);
                } else{
                    boolean check = false;
                    for(int i=0;i< Bio.length();i++){
                        char c = Bio.charAt(i);
                        if(c == ' ') {
                        }
                        else if(c == '_') {
                        }
                        else{
                            check = true;
                        }
                    }
                    if (check == true){
                        throw new BioException(3);
                    }
                }
                    valid = true;

            } catch (BioException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }
        return Bio;
    }

    public static String tweet() throws TweetException{
        boolean valid = false;
        String tweet = "";

        while (!valid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Tweet\t:");
            tweet = inp.nextLine();
            try {
                if (tweet.isEmpty()) {
                    throw new TweetException(1);
                } else if (tweet.length() >= 8 && tweet.length() <= 140) {
                    throw new TweetException(2);
                }
                valid = true;
            } catch (TweetException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }
        System.out.println("PrakRPL-BO teroke!");

        System.out.println("Username: ");
        System.out.println("Password: ");
        System.out.println("Bio: ");
        return tweet;
    }


}


