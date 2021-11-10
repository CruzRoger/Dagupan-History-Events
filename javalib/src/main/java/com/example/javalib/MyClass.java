package com.example.javalib;


class account {
    //private data member
    private long acc_no;
    private java.lang.String name, email;
    private float amount;

    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
    }

    public java.lang.String getEmail(){
        return email;
    }

    public void setEmail(java.lang.String email) {
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){

    }

    //TestAccount.java
    //A java class to test the encapsulated class account. {
    static class TestEncapsulation {
        public static void main(String[] args) {
            // creating instance of account class
            account acc;
            acc = new account();
            acc.setAcc_no(756050400L);
            acc.setName("juan dela cruz");
            acc.setEmail("jdc@gmail.com");
            acc.setAmount(500000f);
            System.out.println(acc.getAcc_no() + "" + acc.getName() + "" + acc.getEmail() + "" + acc.getAmount());


        }


    }
}
