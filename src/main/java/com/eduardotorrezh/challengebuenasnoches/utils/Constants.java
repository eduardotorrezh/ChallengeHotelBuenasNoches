package com.eduardotorrezh.challengebuenasnoches.utils;

public class Constants {
    public static String BLANK_SPACE= " ";
    public static String DELETED_SUCCESSFULLY = "Deleted Successfully";
    public static String USER_NOT_EXIST = "User not exist!";
    public static String ROOM_NOT_EXIST = "Room not exist!";


    public enum ResponseConstant{
        SUCCESS("SUCCESS"),
        FAILURE("FAILURE");

        private String description;

        ResponseConstant(final String description){
            this.description = description;
        }

        public String getDescription(){
            return this.description;
        }
    }


}
