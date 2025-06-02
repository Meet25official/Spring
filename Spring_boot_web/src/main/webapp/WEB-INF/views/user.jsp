<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>User Form</title>
  </head>
  <body>
    <h1 class="title">User Form</h1>
    <form action="users" method="post">
      <label for="name">Name: </label>
      <input type="text" name="name" id="name" /><br />

      <label for="email">Email: </label>
      <input type="email" name="email" id="email" /><br />

      <label for="password">Password: </label>
      <input type="password" name="password" id="password" /><br />

      <input type="submit" value="Send Data" />
    </form>
  </body>
</html>