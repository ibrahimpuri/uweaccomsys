/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uwe_accommodation_system_g10.model;

/**
 *
 * @author User
 */
public enum CleaningStatus {
    CLEAN    {
        @Override
        public String toString(){
            return "Clean";
        }
    },
    DIRTY    {
        @Override
        public String toString(){
            return "Requires Cleaning";
        }
    },
    OFFLINE {
        @Override
        public String toString(){
            return "Offline";
        }
    };
}
