<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>
  <div class="container" style="text-center">
<form class="form-horizontal" action='${pageContext.request.contextPath}/registrationForm' method="POST">
  <fieldset>
    <div id="container" style="text-center">
      <legend  style="text-center"> Update User </legend>
    </div>
    
   
    
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="username">Username</label>
      <div class="controls">
        <input type="text" id="username" name="username" placeholder="" class="input-xlarge" value="${register.username} ">
        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
      </div>
    </div>
    
    <div class="control-group" style="display: none">
     
      <div class="controls">
        <input type="text" id="userID" name="userID" placeholder="" class="input-xlarge" value="${register.userID}">
      
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="email">E-mail</label>
      <div class="controls">
        <input type="text" id="email" name="email" placeholder="" class="input-xlarge" value="${register.email}">
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <input type="password" id="password" name="password" placeholder="" class="input-xlarge" value="${register.password}">
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="password_confirm">Password (Confirm)</label>
      <div class="controls">
        <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge" value="${register.password_confirm}">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-warning" type="submit">Update</button>
      </div>
    </div>
  </fieldset>
</form>
</div>
</body>
</html>