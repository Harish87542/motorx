package com.example.login1.utils;

public class User {//this is very simple class and it only contains the user attributes, a constructor and the getters
    // you can easily do this by right click -> generate -> constructor and getters


        private int user_id;
        private String first_name, last_name,username,email,user_role_id,designation,phone,
                company_name,company_id,office_id,login_url,profile_img,incharge_name,incharge_id,incharge_phone_number,emp_id;

        public User(int user_id, String first_name, String last_name,
                          String username, String email,
                          String user_role_id, String designation, String phone, String company_name,
                          String company_id, String office_id, String login_url, String profile_img, String incharge_name,
                          String incharge_id, String incharge_phone_number, String emp_id)
        {
            this.user_id = user_id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.username = username;
            this.email = email;
            this.user_role_id = user_role_id;
            this.designation = designation;
            this.phone = phone;
            this.company_name = company_name;
            this.company_id = company_id;
            this.office_id = office_id;
            this.login_url = login_url;
            this.profile_img = profile_img;
            this.incharge_name = incharge_name;
            this.incharge_id = incharge_id;
            this.incharge_phone_number = incharge_phone_number;
            this.emp_id = emp_id;
        }

        public int getuser_id() {
            return user_id;
        }

        public String getfirst_name() {
            return first_name;
        }

        public String getlast_name() {
            return last_name;
        }


        public String getusername()
        {
            return username;
        }

        public String getemail()
        {
            return email;
        }

        public String getuser_role_id()
        {
            return user_role_id;
        }
        public String getdesignation()
        {
            return designation;
        }
        public String getphone()
        {
            return phone;
        }
        public String getcompany_name()
        {
            return company_name;
        }
        public String getcompany_id()
        {
            return company_id;
        }
        public String getoffice_id()
        {
            return office_id;
        }
        public String getlogin_url()
        {
            return login_url;
        }
        public String getprofile_img()
        {
            return profile_img;
        }
        public String getincharge_name()
        {
            return incharge_name;
        }
        public String getincharge_id()
        {
            return incharge_id;
        }
        public String getincharge_phone_number()
        {
            return incharge_phone_number;
        }

        public String getemp_id()
        {
            return emp_id;
        }


    }

