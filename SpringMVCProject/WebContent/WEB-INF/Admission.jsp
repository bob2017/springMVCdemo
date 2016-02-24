<html>
<body>
	<h1> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h1>

	<form action="/SpringMVCProject/submitAdmissionForm" method="post">
		<html>
<table>
	<tr>
		<td> USERNAME: </td> <td><input type="text" name="username"></td>
	</tr>

    <tr>
		<td> Address: </td> <td><input type="text" name="address"></td>
	</tr>

    <tr>
		<td> Date of Birth: </td> <td><input type="text" name="dateOfBirth"></td>
	</tr>

   <tr>
		<td> Social security number : </td> <td><input type="text" name="socialSecurity"></td>
	</tr>

  <tr>
		<td> Select skills : </td> <td> 
		                                <select name="studentInfo" multiple >
		                                <option value="javacore"> java core </option>
		                                <option value="springmvc"> Spring mvc </option>
		                                <option value="servlets"> java servlets </option>
		                                <option value="angularjs"> Angular JS</option>
		                                </select>
	                                <td>
 </tr>
  
</table> 

<input type="submit" value="Submit this form by clicking here" />
	</form>
 
</body>
</html>

