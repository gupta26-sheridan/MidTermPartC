/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author ramgu
 */
public class TestUserprofile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your USER ID: ");
        String userID = sc.nextLine();
        System.out.println("Enter your favorite genre");
        String userGenre = sc.nextLine();
        UserProfile userA = new UserProfile(userID, userGenre);
        System.out.println("Your user profile was successfully created");
    }
}
