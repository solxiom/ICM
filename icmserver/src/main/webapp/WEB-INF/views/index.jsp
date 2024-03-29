<%-- 
    Document   : index
    Created on : Dec 15, 2013, 10:29:53 PM
    Author     : kavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ICM development</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/loader.js" type="text/javascript"></script>
        <link rel="stylesheet" href="/icm/resources/style/standard_style.css" type="text/css">
    </head>
    <body>
        <div id="main" > 
            <div id="left_div">
                <img src="/icm/resources/img/talk_world2.jpg" id="interpreter2" alt="interpreter"/>
                <span id="registration_slogan">Talk to the World!</span>
            
                <div id="leftBottom"> 
                    <img src="/icm/resources/img/iconMedical.png"  alt="icon"/>
                <img src="/icm/resources/img/sign.jpg"  alt="icon"/>
                </div>
            </div>

            <form id="registration_form">
                <h2>Customer registration </h2>
                <span> First name: <input name ="name" type="text" /></span>
                <span>Last name: <input name ="last_name" type="text" /></span>
                <span>Social security number:  <input name ="socialsecurity" type="text" /></span>
                <span>Email:  <input name ="mail" type="email" /></span>
                <span>Phone number:  <input name ="phone" type="text" /></span>
                <span>Password: <input name ="password" type="password" /></span>
                <span>Confirm password: <input name ="passconfirm" type="password" /></span>

                <h3>Organization</h3>                    
                <span>Organization name: <input name ="org_name" type="text" /></span>
                <span>Business identity code: <input name ="business_id" type="text" /></span>
                <span>Job title: <input name ="job_title" type="text" /></span>

                <h3> Billing address </h3>
                <span>Street: <input name ="street" type="text" /></span>
                <span>Postal code: <input name ="postCode" type="text" /></span>
                <span>city: <input name ="City" type="text" /></span>
                <button type="submit"  >Register</button>



            </form>
        </div>       
    </body>
</html>
