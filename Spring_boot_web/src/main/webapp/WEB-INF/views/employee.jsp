<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Employee Form</title>
  </head>
  <body>
    <h1 class="title">Employee Form</h1>
    <form action="employees" method="post">
      <label for="name">Full Name: </label>
      <input type="text" name="name" id="name" /><br />

      <label for="dept">Department: </label>
      <input type="text" name="dept" id="dept" /><br />

      <label for="salary">Salary: </label>
      <input type="number" step="0.01" name="salary" id="salary" /><br />

      <label for="exp">Experience (Years): </label>
      <input type="number" name="exp" id="exp" /><br />

      <label for="joinDate">Join Date: </label>
      <input type="date" name="joinDate" id="joinDate" /><br />

      <label for="dob">Date of Birth: </label>
      <input type="date" name="dob" id="dob" /><br />

      <label for="address">Address: </label>
      <input type="text" name="address" id="address" /><br />

      <label for="city">City: </label>
      <input type="text" name="city" id="city" /><br />

      <label for="state">State: </label>
      <input type="text" name="state" id="state" /><br />

      <label for="country">Country: </label>
      <input type="text" name="country" id="country" /><br />

      <label for="zipcode">Zipcode: </label>
      <input type="text" name="zipcode" id="zipcode" /><br />

      <input type="submit" value="Send Data" />
    </form>
  </body>
</html>