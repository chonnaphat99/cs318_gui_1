/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package myapp;

/**
 *
 * @author chonn
 */
public interface LoginFormCallback {
    void login(LoginForm form, String username, String password);
    void closeForm();
}
